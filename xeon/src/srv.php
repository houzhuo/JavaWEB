<?php 
	// while (1) {
	// 	$num = rand(0, 100);
	// 	if ($num <= 5) {
	// 		break;
	// 	}	
	// }
	
	// $r['num'] = $num;
	// $r['time'] = date("h:i:sa");
	// $result = json_encode($r);
	// echo $result
	
  	$q=$_GET["q"];
$con = mysql_connect('localhost', 'root', '');
if (!$con)
 {
 die('Could not connect: ' . mysql_error());
 }else{
	 
	 mysql_query("SET NAMES UTF8");
mysql_query("set character_set_client=utf8"); 
mysql_query("set character_set_results=utf8");
 

mysql_select_db("jsp_db", $con);

$sql="SELECT * FROM tbl_web";
//  WHERE id = '".$q."'"

$result = mysql_query($sql);

while($row = mysql_fetch_assoc($result))
{
	//  $r['name'] = $row['name'];
	//  $r['status'] = $row['status'];
	$arr[] = $row;
	
 }
  $jasonResult = json_encode($arr);
	 echo $jasonResult;	
	
}


mysql_close($con);
?>	
<!--// 	$q=$_GET["q"];

// $con = mysql_connect('localhost', 'root', '');
// if (!$con)
//  {
//  die('Could not connect: ' . mysql_error());
//  }else{
	 
// 	 mysql_query("SET NAMES UTF8");
// mysql_query("set character_set_client=utf8"); 
// mysql_query("set character_set_results=utf8");
 

// mysql_select_db("jsp_db", $con);

// $sql="SELECT * FROM tbl_web WHERE id = '".$q."'";

// $result = mysql_query($sql);
// while(1){
// while($row = mysql_fetch_array($result))
// {
// 	 $r['name'] = $row['name'];
// 	 $r['status'] = $row['status'];
// 	 $jasonResult = json_encode($r);
// 	 echo $jasonResult;	
//  }
//  if ($r['status']==0)
// 	  {	
// 	 	break;
// 	  }
// }
// }

// mysql_close($con);-->


	<!--// while (1) {
	// 	$num = rand(0, 1000000000);
	// 	if ($num <= 50) {
	// 		break;
	// 	}
	// }
	// $r['num'] = $num;
	// $r['time'] = date("h:i:sa");
	// $result = json_encode($r);
	// echo $result
	//}

// echo "<table border='1'>
// <tr>
// <th>id</th>
// <th>name</th>
// <th>password</th>
// <th>email</th>
// </tr>";

// while($row = mysql_fetch_array($result))
//  {
//  echo "<tr>";
//   echo "<td>" . $row['id'] . "</td>";
//  echo "<td>" . $row['name'] . "</td>";
//  echo "<td>" . $row['password'] . "</td>";
//  echo "<td>" . $row['email'] . "</td>";
//  echo "</tr>";
//  }
// echo "</table>";-->
