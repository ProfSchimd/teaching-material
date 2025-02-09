public class Person {
    private String firstName;
    private String secondName;
    private int[] birthDate; // [year, month, day]

    public Person(String first, String second, String birth) {
        this.firstName = first;
        this.secondName = second;
        this.birthDate = new int[3];
        this.setBirthDate(birth);
    }

    public void setBirthDate(String birth) {
        // Expect DD/MM/YYYY --> [yyyy, mm, gg]
        String[] parts = birth.split("/");
        // Validity of format not checked!
        birthDate[2] = Integer.parseInt(parts[0]);
        birthDate[1] = Integer.parseInt(parts[1]);
        birthDate[0] = Integer.parseInt(parts[2]);
    }

    public String getBirthDate() {
        return String.format("%02d/%02d/%04d", birthDate[2], birthDate[1], birthDate[0]);
    }

    public String toString() {
        return String.format("%s %s (%s)", firstName, secondName, getBirthDate());
    }
}
