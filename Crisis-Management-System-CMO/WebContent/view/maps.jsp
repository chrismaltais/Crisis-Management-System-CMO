<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
   <head>
        <title>3003 maps v5</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
		<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <style>
            #map{
                height: 800px;
                width:100%;
            }
        </style>
    </head>
    <body>
		<button>police </button>
		<button> ambulance</button>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBDiT4KVHOVMfzURpGA_hfEbN2NF7D_3v0" type = "text/javascript"></script>
        <div id = "json">
			<p txt="demo.txt"></p> 
		</div>
		<div id="map"> </div>
		<script> //for obtaining coordinates
			var inputCoord = '{"x1":1.303233, "x2":1.290276, "x3":1.311814, "y1":103.809763, "y2":103.846070, "y3":103.857142}';
			/*//accept input JSON file
			var inputCoord = accept();
			*/
			var coordinates = JSON.parse(inputCoord);
			var centerX= (coordinates.x1 + coordinates.x2 + coordinates.x3)/3;
			var centerY= (coordinates.y1 + coordinates.y2 + coordinates.y3)/3;
		</script>
		
		
		<script> // for initialization of map
            function initMap(){
                //map options
                var options ={
                    zoom:12,
                    center:{lat:1.3521,lng:103.8198}
                };
                var map = new google.maps.Map(document.getElementById('map'),options);
				
				
               				
				//cleaner iteration 3 - array of markers
                var markers = [
                 //this array specify the default markers loaded when map starts
                    {//1
                        coords: {lat:coordinates.x1,lng:coordinates.y1},
                        //iconImage: 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png',
                        content: '<h3>Coordinate 1</h3>'
                    },
                    {//2
                        coords:{lat:coordinates.x2,lng:coordinates.y2},
						content:'<h3>Coordinate 2</h3>'    
                    },
                    {//3
                        coords:{lat:coordinates.x3,lng:coordinates.y3},
                        content: '<h3>Coordinate 3</h3>'
                    }
                    ]; // this array of markers sets the default locations, can be stored in a DB
                    // can create a form to pass in the marker parameters from the database
                    // param: coords, iconImage, content
                    //loop through markers
                    for (var i=0; i<markers.length;i++){
                        //add markers
                        addMarker(markers[i]);
                    }
                //iteration 4 - click on anywhere on the map will set a marker
                //add a listener to listen for click events on map
                    google.maps.event.addListener(map, 'click',
                        function(event){
                            //add marker
                            addMarker({coords:event.latLng});
                        }
                    );
                function addMarker(props){
                    //add marker
                    var marker = new google.maps.Marker({
                    position:props.coords,
                    map:map
                   });
                //check for custom icon - still under addMarker function
                if(props.iconImage){
                    //set icon image
                    marker.setIcon(props.iconImage);
                    }
                //check content - still under addMarker2 function
                if (props.content){
                    var infoWindow = new google.maps.InfoWindow({
                                content: props.content
                               //it can also be some html
                            });
                    //add a listener to listen to the infowindow
                    //parameter- click and a function tat opens the infowindow
                        marker.addListener('click', function(){
                                  infoWindow.open(map,marker);      
                                     });
                    }
                }
				
				var centerMarker = new google.maps.Marker({
						position:{lat:centerX,lng:centerY},
						icon: 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png',
						map:map                   
                });
				var AOE = new google.maps.Circle(
					{
					map:map,
					radius: 4500,
					fillColor: '#0000ff'
					}
				);
				AOE.bindTo('center', centerMarker,'position');
        }
		 
         </script>
		 <script> 
				google.maps.event.addDomListener(window, 'load', initMap);
				google.maps.event.addDomListener(window, 'resize', initMap);
		 </script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		
        

</html>
<!--
other functions
            optional var for marker - icon
             include under var options
                 ,icon: 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png'
                 
     //basics 1 - add marker
                var marker = new google.maps.Marker({
                    position:{lat:1.350491,lng:103.682087},
                    map:map                   
                });
               
                 
    //basics 2- infoWindow - changes the popup when the marker is clicked
                var infoWindow = new google.maps.InfoWindow({
                    content:'<h1>Some shit </h1>'
                   //it can also be some html
                });
                //add a listener to listen to the infowindow
                //parameter- click and a function tat opens the infowindow
                    marker.addListener('click', function(){
                              infoWindow.open(map,marker);      
                                 });

    //to dynamically create markers, need to create a function called addMarkers
    //position also needs to be dynamic
    
    //cleaner iteration 1 - add marker function
    function addMarker(coords){
            var marker = new google.maps.Marker({
                    position:coords,
                    map:map
}
    addMarker({lat:1.350491,lng:103.682087});
    addMarker({lat:1.423868,lng:103.860874});
    
    //iteration 2 - add marker with different icons
        function addMarker2(props){
             var marker = new google.maps.Marker({
                        position:props.coords,
                        map:map}
                       );
      
            //check for custom icon - still under addMarker2 function
            if(props.iconImage){
                //set icon image
                marker.setIcon(props.iconImage);
            }
            //check content - still under addMarker2 function
            if (props.content){
                var infoWindow = new google.maps.InfoWindow({
                            content: props.content
                           //it can also be some html
                        });
                        //add a listener to listen to the infowindow
                        //parameter- click and a function tat opens the infowindow
                            marker.addListener('click', function(){
                                      infoWindow.open(map,marker);      
                                         });
                }
    
            }
    addMarker2({
        coords: {lat:1.350491,lng:103.682087},
        iconImage: 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png',
        content: '<h1>NTU</h1>'
    });
    addMarker2({
        coords:{lat:1.423868,lng:103.860874},
        content:'<h1>Yishun Dam </h1>'    
    });


    //cleaner iteration 3 - array of markers
    var markers = [
    {
        coords: {lat:1.350491,lng:103.682087},
        iconImage: 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png',
        content: '<h1>NTU</h1>'
    },
    {
        coords:{lat:1.423868,lng:103.860874},
        content:'<h1>Yishun Dam </h1>'    
    }
    ]; // this array of markers sets the default locations, can be stored in a DB
    // can create a form to pass in the marker parameters from the database
    // param: coords, iconImage, content
    //loop through markers
    for (var i=0; i<markers.length;i++){
        //add markers
        addMarker2(markers[i]);
    }

    //iteration 4 - click on anywhere on the map will set a marker 
    //add a listener to listen for click events on map
    google.maps.event.addListener(map, 'click',
        function(event){
            //add marker
            addMarker({coords:event.latLng});
        }
    );
*/
-->