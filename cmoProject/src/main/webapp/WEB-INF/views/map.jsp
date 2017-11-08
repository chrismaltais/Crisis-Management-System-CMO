<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>3003 maps v9</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
		<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <style>
            #map{
                height: 400px;
                width:100%;
            }
			
        </style>
    </head>
    <body>
		
		
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBDiT4KVHOVMfzURpGA_hfEbN2NF7D_3v0&libraries=geometry" type = "text/javascript"></script>
        <div id = "json">
			<p txt="demo.txt"></p> 
		</div>
		<div id="map"> 
		<script> //for obtaining coordinates
			var inputCoord = '{"x1":1.303233, "x2":1.290276, "x3":1.311814, "y1":103.809763, "y2":103.846070, "y3":103.857142}';
			var coordinates = JSON.parse(inputCoord);
			var p1 = new google.maps.LatLng(coordinates.x1, coordinates.y1);
			var p2 = new google.maps.LatLng(coordinates.x2, coordinates.y2);
			var p3 = new google.maps.LatLng(coordinates.x3, coordinates.y3);
			var centerX= (coordinates.x1 + coordinates.x2 + coordinates.x3)/3;
			var centerY= (coordinates.y1 + coordinates.y2 + coordinates.y3)/3;
			var centerP = new google.maps.LatLng(centerX,centerY);
		</script>
		
		
		<script> 
            var map;
			var markers = [];
			var iconFolder = "${pageContext.request.contextPath}/resources/img/";
			var clickMark;
			var isPolice;
			var isAmbulance;
			var defEvent;
			var polEvent;
			var ambEvent;
			function initMap(){// for initialization of map
			/*
			initial map: first 3 coordinates with default circle and radius
             */   //map options
                var options ={
                    zoom:12,
                    center:{lat:1.3521,lng:103.8198},
					mapTypeID: 'terrain'
                };
                map = new google.maps.Map(document.getElementById('map'),options);
				
				
               				
				//this array specify the default markers loaded when map starts
                var initialMarkers = [
                    {//1
                        coords:p1,
                         content: '<h3>Coordinate 1</h3>'
                    },
                    {//2
                        coords:p2,
						content:'<h3>Coordinate 2</h3>'    
                    },
                    {//3
                        coords:p3,
						content: '<h3>Coordinate 3</h3>'
                    }
                    ]; // this array of markers sets the default locations, can be stored in a DB
                    // can create a form to pass in the marker parameters from the database
                    // param: coords, iconImage, content
                    //loop through markers
                    for (var i=0; i<initialMarkers.length;i++){
                        //add markers
                        addMarker(initialMarkers[i]);
                    }
                
				//Global default marker listener
                //add a listener to listen for click events on map
					
				//end of listener		
				
				var centerMarker = new google.maps.Marker({
						position:centerP,
						icon:'http://maps.google.com/mapfiles/ms/icons/green-dot.png',
						map:map                   
                });
				var AOE = new google.maps.Circle(
					{
					map:map,
					radius: 5000,
					fillColor: '#0000ff'
					}
				);
				AOE.bindTo('center', centerMarker,'position');
				
				
				
			} //end of initMap
						
		//add marker function - global
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
					markers.push(marker);
					}
		 
		  //functions for hide/show markers, delete markers 
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
			function defaultMarker(){
					clickMark =1;
					isPolice=0;
					isAmbulance =0;
					if(clickMark ==1){
						defEvent = map.addListener('click',
							function(event){
									addMarker({coords:event.latLng,
												iconImage:iconFolder+'android.JPG'
												}
									
									);
								}
							);
						}
					
					}
			function addPolice(){
				isPolice =1;
				isAmbulance =0;
				if(isPolice ==1){
					polEvent = map.addListener('click',function(police){
					
					addMarker({coords:police.latLng, 
						iconImage:iconFolder+'police.jpg'});
						}
					);
				}
				if(isPolice==0){
					map.removeListener(polEvent);
				}
			}
			function addAmb(){
				isPolice=0;
				isAmbulance=1;
				if(isAmbulance==1){
					
					ambEvent = map.addListener('click',function(ambulance){
						addMarker({coords:ambulance.latLng, 
						iconImage:iconFolder+'ambulance.jpg'});
						}
					);
				}
				if(isAmbulance==0){
					map.removeListener(ambEvent);
				}
			}
			
		 
         </script>
				 
		 </div>
		 
		 
		 <script> 
				google.maps.event.addDomListener(window, 'load', initMap);
				google.maps.event.addDomListener(window, 'resize', initMap);
		 </script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		
       </body> 
		
</html>
