/**
 * 
 */
function knowDay(){
	var day = ["Sunday", "Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday"];
	var x, d;
	x = document.getElementById("myForm1");
	d = parseInt(x.elements["day"].value);
	document.getElementById("demo1").innerHTML = "The corrosponding day is: "+day[d-1]+"<br>";
}
function knowMonth(){
	var month = ["January", "February","March","April", "May", "June", "July", "August", "September", "October", "November", "December"];
	var x, m;
	x = document.getElementById("myForm2");
	m = parseInt(x.elements["mon"].value);
	document.getElementById("demo2").innerHTML = "The corrosponding month is: "+month[m-1]+"<br>";
	
}