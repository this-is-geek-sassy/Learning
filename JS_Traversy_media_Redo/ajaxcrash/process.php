<?php

// connect to a db
$conn = mysqli_connect('localhost', 'root', 'mysaswata123', 'ajax-test');

echo 'Processing...';

// check for a GET variable
if (isset($_GET['name'])) {
    echo 'GET: your name is '. $_GET['name'];
}

// check for a POST variable
if (isset($_POST['name'])) {
    $name = mysqli_real_escape_string($conn, $_POST['name']);
    echo 'POST: your name is '. $_POST['name'];

    $query = "INSERT INTO users(name) VALUES('$name')";

    if (mysqli_query($conn, $query)) {
        echo 'USER added...';
    } else {
        echo 'Error: '. mysqli_error($conn);
    }
}