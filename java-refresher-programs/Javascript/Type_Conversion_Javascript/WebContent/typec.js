/**
 * 
 */
function makeSum(){
	var x = document.getElementById("myInp1").value;
	var y = document.getElementById("myInp2").value;
	var a = parseInt(document.getElementById("myInp1").value);
	var b = parseInt(document.getElementById("myInp2").value);
	
	document.getElementById("demo1").innerHTML="Integer SUM is: " + (a+b) + " The Char SUM is: " +(x+y);
}