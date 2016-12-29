/**
 * 
 */
function parkingDecision(){
	var answer;
	var date_today = new Date();
	var day_today = date_today.getDate();
	if (day_today % 2 == 0){
		answer = "You can Park today!";
	}
	else{
		answer = "You can NOT park today!";
	}
	document.getElementById("demo").innerHTML= answer;
}