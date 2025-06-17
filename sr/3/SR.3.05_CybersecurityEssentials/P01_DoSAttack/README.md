# DoS attack with `SYN` Flood

## Hands-On Activity: Understanding DoS Attacks with Linux VMs 🧪

**Objective:** To simulate and observe a basic DoS attack in a controlled virtual environment, understanding its impact on a target machine.

**Estimated Time:** 45-60 minutes

**Target Audience:** Students or individuals learning about network security fundamentals.

**Prerequisites:**

* Two Linux VMs (e.g., Ubuntu, Kali Linux, or any other preferred distribution).
    * **Attacker VM:** This VM will launch the DoS attack.
    * **Victim VM:** This VM will be the target of the attack.
* Virtualization software (e.g., VirtualBox, VMware).
* Basic understanding of Linux command line and networking concepts (IP addressing, ping).
* Both VMs should be on the same **isolated virtual network** (e.g., "Host-only" or "Internal Network" in VirtualBox/VMware). **Do NOT connect them to the internet or your main network.**

---

### Activity Setup:

1.  **Prepare Your VMs:**
    * Ensure both VMs are running and have network connectivity *to each other*.
    * **Identify IP Addresses:**
        * On each VM, open a terminal and type: `ip addr show`
        * Note down the IP address of the **Victim VM**. You'll need this for the Attacker VM.
    * **(Optional but Recommended) Install a Simple Web Server on the Victim VM:** This will give you a service to test the DoS against.
        * On the **Victim VM**, install Apache or Nginx:
            * For Apache (Debian/Ubuntu): `sudo apt update && sudo apt install apache2 -y`
            * For Nginx (Debian/Ubuntu): `sudo apt update && sudo apt install nginx -y`
        * Start the web server:
            * For Apache: `sudo systemctl start apache2`
            * For Nginx: `sudo systemctl start nginx`
        * Verify it's running by opening a web browser *on the Victim VM* and navigating to `http://localhost` or its IP address. You should see a default web page.

2.  **Initial Connectivity Test:**
    * From the **Attacker VM**, try to ping the **Victim VM**:
        `ping <Victim_VM_IP_Address>`
    * You should see successful ping replies. This confirms basic network connectivity.
    * If you installed a web server on the Victim VM, try accessing it from the Attacker VM's web browser using the Victim VM's IP address (e.g., `http://<Victim_VM_IP_Address>`).

---

### Attack Simulation: Using `hping3` (A Common Tool)

`hping3` is a versatile packet crafting tool that can be used for various network testing purposes, including simulating DoS attacks.

1.  **Install `hping3` on the Attacker VM:**
    * Open a terminal on the **Attacker VM**.
    * Type: `sudo apt update && sudo apt install hping3 -y`

2.  **Understanding the `hping3` Command for a SYN Flood Attack:**
    A common type of DoS attack is a **SYN flood**. It exploits the TCP three-way handshake by sending a flood of SYN (synchronization) packets without sending the final ACK (acknowledgment) packet. This can overwhelm the server's resources as it keeps connections half-open.

    The basic `hping3` command for a SYN flood is:
    `sudo hping3 -S --flood -p <Port_Number> <Victim_VM_IP_Address>`

    * `sudo`: `hping3` often requires root privileges to send raw packets.
    * `-S`: Send SYN packets.
    * `--flood`: Send packets as fast as possible, without waiting for replies. **This is the DoS part.**
    * `-p <Port_Number>`: Specify the target port on the victim. For a web server, this is typically port `80` (HTTP) or `443` (HTTPS).
    * `<Victim_VM_IP_Address>`: The IP address of your Victim VM.

3.  **Monitoring the Victim VM:**
    * Before launching the attack, have a way to monitor the Victim VM's responsiveness.
        * **Continuous Ping:** On the **Attacker VM** (or a third, observer VM if you have one), open another terminal and start a continuous ping to the Victim VM:
            `ping <Victim_VM_IP_Address>`
        * **Web Server Access:** Try to browse the web page hosted on the Victim VM from the Attacker VM.
        * **(Optional) Resource Monitoring on Victim VM:** Open a terminal on the Victim VM and use commands like `top` or `htop` to observe CPU and network resource usage. You might also use `netstat -tn | grep SYN_RECV | wc -l` to count half-open connections (this number will likely increase significantly during a SYN flood).

4.  **Launch the Attack:**
    * On the **Attacker VM**, open a terminal and execute the `hping3` command. For example, to attack a web server on port 80:
        `sudo hping3 -S --flood -p 80 <Victim_VM_IP_Address>`
    * **Be Cautious:** `--flood` sends packets *very* quickly. Even in a VM environment, this can consume significant CPU on the Attacker VM and potentially make the Victim VM unresponsive.

5.  **Observe the Impact:**
    * **Ping Test:** Watch the continuous ping you started earlier. You should see a significant increase in ping times, or pings may start to time out altogether.
    * **Web Server Access:** Try to reload the web page on the Victim VM from the Attacker VM's browser. It will likely be very slow or fail to load.
    * **(Optional) Resource Monitoring:** Observe the output of `top` or `htop` on the Victim VM. You might see increased CPU usage or network interface activity. The `netstat` command should show a large number of connections in the `SYN_RECV` state.

6.  **Stop the Attack:**
    * Go back to the terminal on the **Attacker VM** where `hping3` is running.
    * Press `Ctrl + C` to stop the attack.

7.  **Observe Recovery:**
    * Watch the continuous ping. It should return to normal.
    * Try accessing the web server again. It should become responsive.
    * Resource usage on the Victim VM should return to normal levels.

---

### Discussion Points:

* What did you observe happening to the Victim VM during the attack?
* How did the ping response change? Why?
* Was the web server still accessible? Why or why not?
* What resources on the Victim VM do you think were being exhausted? (e.g., CPU, memory, network bandwidth, connection table limits)
* What are some other types of DoS attacks? (e.g., ICMP flood, UDP flood, Ping of Death)
* How can organizations defend against DoS attacks? (e.g., firewalls, Intrusion Detection/Prevention Systems (IDS/IPS), traffic scrubbing centers, rate limiting, blacklisting malicious IPs).
* What is the difference between a DoS and a Distributed Denial of Service (DDoS) attack?
* Discuss the ethical and legal implications of launching DoS attacks.

---

### Important Considerations and Variations:

* **Resource Allocation:** Ensure your host machine has enough resources (CPU, RAM) to run both VMs smoothly, especially during the attack simulation.
* **Alternative Tools:**
    * **Slowloris:** A tool that performs a Layer 7 DoS attack by keeping many connections to the target web server open and holding them open as long as possible by sending partial HTTP requests. This is different from a SYN flood as it operates at the application layer.
    * **LOIC (Low Orbit Ion Cannon):** While popular, it's often associated with less ethical uses. If used, extreme caution and isolation are paramount.
* **Network Configuration:** Experiment with different virtual network configurations (e.g., NAT, Bridged) if you want to understand their impact, but always ensure isolation from your main network when performing attacks. **Host-only or Internal Network is safest for this exercise.**
* **Packet Sniffing:** You can use tools like `tcpdump` or Wireshark on either VM (or a third observer VM) to capture and analyze the network traffic during the attack. This can provide deeper insight into what's happening at the packet level.
    * On the Victim VM, try: `sudo tcpdump -i <interface_name> port 80 -n` (replace `<interface_name>` with the correct network interface, e.g., `eth0`). You'll see a flood of incoming SYN packets from the Attacker's IP.
