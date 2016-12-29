/**
 * 
 */
function getCoordinates(){
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(viewMyLocation);
		
	}
	else{
		document.getElementById("demo1").innerHTML="Not Supported";
	}
}

function viewMyLocation(position){
	document.getElementById("myDiv1").innerHTML = "Longitude: " + position.coords.longitude + " Latitude: " + position.coords.latitude;
}

function getMapLoc(){
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(viewMyMap);
	}
	else{
		document.getElementById("demo1").innerHTML = "Not Supported";
	}
}

function viewMyMap(position){
	var long = position.coords.longitude;
	var latid = position.coords.latitude;
	var map_image = "http://maps.googleapis.com/maps/api/staticmap?center=" + latid + "," + long +
					"&zoom=20&size=600x500&sensor=false";
	document.getElementById("myDiv1").innerHTML = "<img src='"+map_image+"'>";
	
}