<?php
    $name = $_POST['name'];
    $pwd = $_POST['password'];
    if($name == "houzhuo" && $pwd =="123")
        echo "Success";
    else
        echo "Failed";
?>