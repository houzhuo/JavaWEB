<?php 
//$q=$_GET["q"];
$con = mysql_connect('localhost', 'root', '');
if (!$con)
 {
 die('Could not connect: ' . mysql_error());
 }else{
	while(1){
	 mysql_query("SET NAMES UTF8");
mysql_query("set character_set_client=utf8"); 
mysql_query("set character_set_results=utf8");
 

mysql_select_db("jsp_db", $con);

$sql="SELECT * FROM tbl_web ";
//  WHERE id = '".$q."'"
	
$result = mysql_query($sql);

while($row = mysql_fetch_array($result))
{
	  $r['name'] = $row['name'];
	  $r['status'] = $row['status'];
	//$arr[] = $row;
	
 }
 if($r['status']==0){
	 break;	 
 	}
 }
  $jasonResult = json_encode($r);
	 echo $jasonResult;			
}


mysql_close($con);
?>	
