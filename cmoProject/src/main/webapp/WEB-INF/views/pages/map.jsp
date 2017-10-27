<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>3003 maps v8</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
		<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <style>
            #map{
                height: 800px;
                width:100%;
            }
			#floating-panel {
			position: absolute;
			top: 10px;
			left: 25%;
			z-index: 5;
			background-color: #fff;
			padding: 5px;
			border: 1px solid #999;
			text-align: center;
			font-family: 'Roboto','sans-serif';
			line-height: 30px;
			padding-left: 10px;
        </style>
    </head>
    <body>
		
		
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBDiT4KVHOVMfzURpGA_hfEbN2NF7D_3v0" type = "text/javascript"></script>
        <div id = "json">
			<p txt="demo.txt"></p> 
		</div>
		<div id="map"> 
		<script> //for obtaining coordinates
			var inputCoord = '{"x1":1.303233, "x2":1.290276, "x3":1.311814, "y1":103.809763, "y2":103.846070, "y3":103.857142}';
			/*//accept input JSON file
			var inputCoord = accept();
			*/
			var coordinates = JSON.parse(inputCoord);
			
		</script>
		
		
		<script> 
            var map;
			var markers = [];
			var uniqueId =1;
			var iconFolder = 'image/';
			var content = 'Latitude: ' + marker.position.lat() + '<br />Longitude: ' + marker.position.lng();
            content += "<br /><input type = 'button' value = 'Delete' onclick = 'deleteMarker(marker.id);' value = 'Delete' />";			
			
			
			function initMap(){// for initialization of map
			  //map options
                var options ={
                    zoom:12,
                    center:{lat:1.3521,lng:103.8198}
                };
                map = new google.maps.Map(document.getElementById('map'),options);
				
				
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
					//Attach click event handler to the marker
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
					marker.id = uniqueId;
					uniqueId++;
					}
			function deleteMarker(id) {
				//Find and remove the marker from the Array
				for (var i = 0; i < markers.length; i++) {
				if (markers[i].id == id) {
					//Remove the marker from Map                  
					markers[i].setMap(null);
	 
					//Remove the marker from array.
					markers.splice(i, 1);
					return;
					}
				}
			};
			/* function calcCenter(){ //function for the center marker of all the androids
				var centerX;
				var centerY;
				
				var cPoint = new google.maps.LatLng(centerX,centerY);
				return cPoint;
			}
			var centerMarker = addMarker({
					coords:calcCenter(),
					iconImage=iconFolder+'talktohand.jpg'
				}
			);
			function calcDistance(){ // function to calculate the radius of the area affected
				var distance;
				var Fdistance = distance + 200;
				return Fdistance;
			}
			var areaAffected = new google.maps.Circle(
					{
					map:map,
					radius:calcDistance(),
					fillColor: '#0000ff'
					}
				); */
		 
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
