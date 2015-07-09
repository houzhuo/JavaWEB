<?php 
//$q=$_GET["q"];
$con = mysql_connect('172.23.253.20', 'root', 'liguodong');
if (!$con)
 {
 die('Could not connect: ' . mysql_error());
 }else{
	 mysql_query("SET NAMES UTF8");
mysql_query("set character_set_client=utf8"); 
mysql_query("set character_set_results=utf8");
 
mysql_select_db("qt", $con);
$sql="select roadgateNode from resultshow";
//  WHERE id = '".$q."'"
	
$result = mysql_query($sql);
while($row = mysql_fetch_assoc($result))
{


	$arr[] = $row;
	
 }

	 $jasonResult = json_encode($arr);
	 echo $jasonResult;

  			
}
mysql_close($con);
?>	