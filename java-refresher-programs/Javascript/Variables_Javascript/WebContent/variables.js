/**
 * 
 */
function calDis() {
	var u = parseInt(document.getElementById("myInput1").value);
	var t = parseInt(document.getElementById("myInput2").value);
	var a = parseInt(document.getElementById("myInput3").value);

	var s = (u * t + a * t * t / 2);
	document.getElementById("demo1").innerHTML += "The Distance covered by vehicle in "
			+ t + " seconds is: " + s + " Units <br>";
}
function calVel() {
	var u = parseInt(document.getElementById("myInput1").value);
	var t = parseInt(document.getElementById("myInput2").value);
	var a = parseInt(document.getElementById("myInput3").value);

	var V = u * 1 + a * t;
	document.getElementById("demo1").innerHTML += "The final velocity of vehicle in "
			+ t + " seconds is: " + V + " Units<br>";
}