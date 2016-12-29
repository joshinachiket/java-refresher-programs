/**
 * 
 */
var cnt = 0;

function show1() {
	document.getElementById("popup1").style.display = "block";
}
function hide1() {
	document.getElementById("popup1").style.display = "none";
}
function show2() {
	document.getElementById("popup2").style.display = "block";
}
function hide2() {
	document.getElementById("popup2").style.display = "none";
}

function change_msg() {
	if (cnt % 2 == 0) {
		document.getElementById("head1").style.backgroundColor = "red";
		document.getElementById("head2").style.backgroundColor = "green";
	} else {
		document.getElementById("head1").style.backgroundColor = "green";
		document.getElementById("head2").style.backgroundColor = "red";
	}
}

function resetCounter() {
	cnt = 0;
	document.getElementById("click_count").value = cnt;
	document.getElementById("head1").style.backgroundColor = "white";
	document.getElementById("head2").style.backgroundColor = "white";
}

function count_clicks() {
	cnt += 1;
	document.getElementById("click_count").value = cnt;
	change_msg();
}