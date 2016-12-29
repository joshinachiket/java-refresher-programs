/**
 * 
 */
function phyClick(eve) {
	if (eve.value == "Physics") {
		document.getElementById("myDiv2").style.display = "block";
		document.getElementById("myDiv3").style.display = "none";
	} else {
		document.getElementById("myDiv3").style.display = "block";
		document.getElementById("myDiv2").style.display = "none";
	}

}
function display() {
	var sub, subType;
	if (document.getElementById("myInput1").checked) {
		sub = document.getElementById("myInput1").value;

		if (document.getElementById("myInp1").checked) {
			subType = document.getElementById("myInp1").value;
		} else {
			subType = document.getElementById("myInp2").value;
		}
		book.prototype.type = "AppliedScience";

	}
	if (document.getElementById("myInput2").checked) {
		sub = document.getElementById("myInput2").value;

		if (document.getElementById("myInp3").checked) {
			subType = document.getElementById("myInp3").value;
		} else {
			subType = document.getElementById("myInp4").value;
		}
		book.prototype.type = "PracticleScience";

	}
	var x = document.getElementById("myForm1");
	var bname = x.elements["bname"].value;
	var aname = x.elements["aname"].value;
	var b1 = new book(sub, bname, aname, subType);

	document.getElementById("demo").innerHTML += b1.concatItem() + "<br>";

}

function book(subject, name, author, stream) {
	this.subject = subject;
	this.name = name;
	this.author = author;
	this.stream = stream;
}

book.prototype.concatItem = function() {
	return this.subject + " &nbsp; &nbsp; &nbsp; &nbsp;" + this.stream + " " + this.type + " " + this.name
			+ " " + this.author;
}
