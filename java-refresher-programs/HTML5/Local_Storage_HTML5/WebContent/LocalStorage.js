/**
 * 
 */
function homeLogin() {
	document.getElementById("myDiv2").style.display = "block";
	document.getElementById("myDiv1").style.display = "none";
	document.getElementById("myDiv3").style.display = "none";

	if (typeof (Storage) !== "undefined") {
		localStorage.setItem("username", "home_username");
		document.getElementById("myInput3").value = localStorage
				.getItem("username");
	} else {
		document.getElementById("myInput3").innerHTML = "not working"
	}

}
function visitorLogin() {
	document.getElementById("myDiv1").style.display = "block";
	document.getElementById("myDiv3").style.display = "none";
	document.getElementById("myDiv2").style.display = "none";
}

function goBack() {
	document.getElementById("myDiv3").style.display = "none";
}

function validateCreditHome() {
	document.getElementById("myDiv1").style.display = "none";

	if (document.getElementById("myInput4").value == "1234") {
		document.getElementById("demo1").innerHTML = "This is your HOME account";
		document.getElementById("myDiv3").style.display = "block";
		document.getElementById("myDiv2").style.display = "none";
		
		if (typeof (Storage) !== "undefined") {
			if(localStorage.clickCount){
				localStorage.clickCount = Number(localStorage.clickCount)+1;
			}
			else{
				localStorage.clickCount = 1;
			}
			document.getElementById("demo1").innerHTML += "<br>This is your " + localStorage.clickCount + " login";
			
		} else {
			document.getElementById("myInput3").innerHTML = "not working"
		}
		
	} else {
		alert("Enter Correct Credentials!");
		document.getElementById("myDiv2").style.display = "block";
	}
}

function validateCreditGuest() {
	document.getElementById("myDiv2").style.display = "none";
	
	if((document.getElementById("myInput1").value != "")&&(document.getElementById("myInput2").value != "")){
		document.getElementById("demo1").innerHTML = "This is your GUEST account";
		document.getElementById("myDiv3").style.display = "block";
		document.getElementById("myDiv1").style.display = "none";
		
		if (typeof (Storage) !== "undefined") {
			if(sessionStorage.clickCount){
				sessionStorage.clickCount = Number(sessionStorage.clickCount)+1;
			}
			else{
				sessionStorage.clickCount = 1;
			}
			document.getElementById("demo1").innerHTML += "<br>This is your " + sessionStorage.clickCount + " login";
			
		} else {
			document.getElementById("myInput3").innerHTML = "not working"
		}
	}
	else{
		alert("Wrong Credentials!");
	}
}

