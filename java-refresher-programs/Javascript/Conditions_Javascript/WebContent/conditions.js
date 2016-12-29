/**
 * 
 */

function checkStd() {
	document.getElementById("myDiv2").style.display = "block";
}
function disMsg() {
	var message;
	var sample = parseInt(document.getElementById("myInput2").value);
	while (sample <= 24) {

		if (sample > 0 & sample <= 6) {
			message = "Welcome New Spartans!";
		} else if (sample > 6 & sample <= 12) {
			message = "Study Spartans!";
		} else if (sample > 12 & sample <= 18) {
			message = "Enjoy Spartans!";
		} else {
			message = "Work Spartans!";
		}

		document.getElementById("demo1").innerHTML += message + "<br>";
		break;
	}

}