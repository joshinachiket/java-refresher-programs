/**
 * 
 */
function dignose(){
	var x = document.getElementById("myInp1").value;
	var msg = document.getElementById("demo1");
	try{
		if(x==""){
			throw "A Diagnostic tray that is empty!"
		}
		else if(x.localeCompare("Fever")==0||x.localeCompare("Cough")==0||x.localeCompare("Sour Throat")==0||x.localeCompare("Ulcers")==0
				||x.localeCompare("Blood Pressure")==0||x.localeCompare("Heart Attack")==0||x.localeCompare("Cold")==0){
			throw "Thank You";
		}
		else{
			throw "A Diagnostic that we dont cater!"
			
		}
	}
	catch(err){
		msg.innerHTML = "We received: " + err;
	}
	
}

function calculate(){
	var x = document.getElementById("myInp2").value;
	var y = document.getElementById("myInp3").value;
	var msg = document.getElementById("demo2");
	try{
		if(x==0 || y==0){
			throw "Please enter non zero amounts!";
		}
		else if(isNaN(x)||isNaN(y)){
			throw "Input is not a number!";
		}
		else{
			throw "Prize per tablet is : " + (x/y) ;
		}
	}
	catch(err){
		msg.innerHTML="Please:" +err;
	}
}