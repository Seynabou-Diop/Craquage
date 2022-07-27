<?php 
if(isset($_GET["pwd"])){ 
if($_GET["pwd"]=="aziz"){
     echo"Mot de passe Trouvé!";
}
else{
    echo"Mot de passe non retrouvé";

}

?>
<?php }else { ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="GET">
    <label>Login:</label><input type="text" name="login" ><br><br>
    <label>Password:</label><input type="password" name="pwd" ><br><br>
    <input type="submit" name="Send" value="Login">
    </form>
</body>
</html>
<?php } ?>