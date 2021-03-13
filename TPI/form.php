<?php
$servername = "localhost";
$username = "username";
$password = "password";

$email = $_POST("email");
$password = $_POST("password");

try {

    $conn = new PDO("mysql:host=$servername;dbname=myDB", $username, $password);
    // set the PDO error mode to exception
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "Connected successfully";

  } catch(PDOException $e) {
    echo "Connection failed: " . $e->getMessage();

    die();
  }

    echo $email . "<br>";
    $sql = "SELECT email FROM utenti WHERE utenti.email = $email;";

    $result = $conn->query($sql);
    echo $result->num_rows;

?>