/**
 * 
 */
function useStrict(){
	"use strict";
	try{
		y=3.14;
		document.getElementById("demo1").innerHTML="The Value of Pi: "+y;
	}
	catch(err){
		document.getElementById("demo1").innerHTML="Exception Cought because of Strict Mode: Y not declared";
	}
}

function noStrict(){
	y=3.14;
	document.getElementById("demo1").innerHTML="Y is not declared but The Value of Pi: "+y;
}