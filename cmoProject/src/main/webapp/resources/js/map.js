//function initMap() {
//	var map = new google.maps.Map(document.getElementById("map"), {
//		zoom : 12,
//		center : {
//			lat : 1.3521,
//			lng : 103.8198
//		}
//	});
//}

var map;
var markers = [];
var iconFolder = "${pageContext.request.contextPath}/resources/img/";
var circle;
var bounds = new google.maps.LatLngBounds();

function initMap() {// for initialization of map
	/*
	 * initial map: first 3 coordinates with default circle and radius
	 */// map options
	var options = {
		zoom : 12,
		center : {
			lat : 1.3521,
			lng : 103.8198
		},
		mapTypeID : 'terrain'
	};
	map = new google.maps.Map(document.getElementById('map'), options);

	// Global default marker listener
	// add a listener to listen for click events on map
	google.maps.event.addListener(map, 'click', function(event) {
		// add marker
		addMarker({
			coords : event.latLng
		});
	});
	// end of listener

} // end of initMap

// add marker function - global
function addMarker(props) {
	// add marker
	var marker = new google.maps.Marker({
		position : props.coords,
		map : map
	});
	// check for custom icon - still under addMarker function
	if (props.iconImage) {
		// set icon image
		marker.setIcon(props.iconImage);
	}
	// check content - still under addMarker2 function
	if (props.content) {
		var infoWindow = new google.maps.InfoWindow({
			content : props.content
		// it can also be some html
		});
		// add a listener to listen to the infowindow
		// parameter- click and a function tat opens the infowindow
		marker.addListener('click', function() {
			infoWindow.open(map, marker);
		});
	}
	markers.push(marker);
	console.log("adding marker... " + markers.includes(marker));

	bounds.extend(marker.position);

	buildCircle();
}

// functions for hide/show markers, delete markers
// Sets the map on all markers in the array.
function setMapOnAll(map) {
	for (var i = 0; i < markers.length; i++) {
		markers[i].setMap(map);
	}
}

// Removes the markers from the map, but keeps them in the array.
function clearMarkers() {
	setMapOnAll(null);
}

// Shows any markers currently in the array.
function showMarkers() {
	setMapOnAll(map);
}

// Deletes all markers in the array by removing references to them.
function deleteMarkers() {
	clearMarkers();
	markers = [];
}

// Parse for LatLng
function coordParse(affectedArea) {
	var array = null;
	var lat; // obtain lat as a numerical value
	var lng; // obtain lng as a numerical value

	array = affectedArea.split("/");
	lat = array[1];
	lng = array[2];

	var coordi = new google.maps.LatLng(lat, lng);

	return coordi;
}

// Build circle encircling all markers
function buildCircle() {
	var radius = 0;

	for (var i = 0; i < markers.length; i++) {
		var testDist = google.maps.geometry.spherical.computeDistanceBetween(
				bounds.getCenter(), markers[i].getPosition());
		radius = Math.max(radius, testDist);
	}

	radius += 1000;

	if (circle) {
		circle.setOptions({
			// center : center.coords,
			center : bounds.getCenter(),
			radius : radius
		});
	} else {
		circle = new google.maps.Circle({
			map : map,
			// center : center.coords,
			center : bounds.getCenter(),
			radius : radius,
			fillColor : '#0000ff'
		});
	}

	map.setCenter(bounds.getCenter());
}

// load listener for map
google.maps.event.addDomListener(window, 'load', initMap);
google.maps.event.addDomListener(window, 'resize', initMap);
