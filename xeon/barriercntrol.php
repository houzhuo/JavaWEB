<?php
$con = mysql_connect('localhost', 'root', '');
if (!$con)
 {
 die('Could not connect: ' . mysql_error());
 }else{
	//while(1){
	 mysql_query("SET NAMES UTF8");
mysql_query("set character_set_client=utf8"); 
mysql_query("set character_set_results=utf8");
 
mysql_select_db("jsp_db", $con);

$sql="update tbl_web set status='1' where id ='1'";
//  WHERE id = '".$q."'"
	
$result = mysql_query($sql);
while($row = mysql_fetch_array($result))
{
	  $r['name'] = $row['name'];
	  $r['status'] = $row['status'];
	//$arr[] = $row;
	
 }
 //if($r['status']==0){
	 $jasonResult = json_encode($r);
	 echo $jasonResult;
	// exit();		
 	//}
 //}
  			
}
mysql_close($con);
?>	