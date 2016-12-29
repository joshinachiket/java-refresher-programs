/**
 * 
 */

function playVideo() {

	if (document.getElementById("vid1").paused) {
		document.getElementById("vid1").play()
	} else {
		document.getElementById("vid1").pause()
	}
}
function minVideo() {
	document.getElementById("vid1").width = 200
}
function maxVideo() {
	document.getElementById("vid1").width = 400
}
function pauseVideo() {
	document.getElementById("vid1").pause();
}

function playAudio() {
	document.getElementById("aud").play();
}

function pauseAudio() {
	document.getElementById("aud").pause();
}