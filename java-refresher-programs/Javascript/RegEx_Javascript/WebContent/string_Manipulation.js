/**
 * 
 */
var str;
function replaceItems(){
	document.getElementById("myDiv2").style.display = "block";
}
function myFunction(){
	str = 'In theoretical computer science and formal' +
		'language theory, a regular expression (sometimes called a rational' +
		'expression)[1][2] is a sequence of characters that define a search' +
		'pattern, mainly for use in pattern matching with strings, or string'+
		'matching, i.e. "find and replace"-like operations. The concept arose'+
		'in the 1950s, when the American mathematician Stephen Kleene'+
		'formalized the description of a regular language, and came into common'+
		'use with the Unix text processing utilities ed, an editor, and grep, a'+
		'filter. In modern usage, "regular expressions" are often distinguished'+
		'from the derived, but fundamentally distinct concepts of'+
		'regex[pronunciation?] or regexp, which no longer describe a regular'+
		'language. See below for details. Regexes are so useful in computing'+
		'that the various systems to specify regexes have evolved to provide'+
		'both a basic and extended standard for the grammar and syntax; modern'+
		'regexes heavily augment the standard. Regex processors are found in'+
		'several search engines, search and replace dialogs of several word'+
		'processors and text editors, and in the command lines of text'+
		'processing utilities, such as sed and AWK. Many programming languages'+
		'provide regex capabilities, some built-in (for example Perl,'+
		'JavaScript, Ruby, AWK, and Tcl) and others via a standard library (for'+
		'example .NET languages, Java, Python, POSIX C, and C++ since C++11).'+
		'Most other languages offer regexes via a library.';
	
	document.getElementById("demo1").innerHTML+=str;
}

function searchItems(){
	var sample = document.getElementById("myInput1").value;
	var result = str.search(sample);
	if(result==-1){
		document.getElementById("demo2").innerHTML="Not Found";
	}
	else{
		document.getElementById("demo2").innerHTML="Found";
		document.getElementById("myDiv3").style.display = "block";
	}
}

function replaceString(){
	var new_val = document.getElementById("myInput2").value;
	var old_val = document.getElementById("myInput1").value;
	var new_string = str.replace(old_val, new_val)
	document.getElementById("demo2").innerHTML=new_string;
	document.getElementById("myDiv3").style.display = "none";
	
}