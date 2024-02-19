<!DOCTYPE html>
<html>
    <body>
        <h3>connection  page</h3>
        <?php
            $selected_id = $_POST['user_id'];
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbName = "test";

            try {
                $conn = new PDO("mysql:host=$servername;dbname=$dbName", $username, $password);
                $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);    // set the PDO error mode to exception
                // echo "Connected successfully<br>";

                $sql = $conn->prepare('SELECT * FROM user WHERE user_id=?;');
                $results = $sql->execute([$selected_id]);
                $result_table = $sql->fetchAll();

                foreach ($result_table as $row) {
                    echo $row['user_id'] . " ";
                    echo $row['email'] . " ";
                }


            } catch(PDOException $e) {
                echo "Connection failed: " . $e->getMessage();
            }
        ?>
    </body>
</html>