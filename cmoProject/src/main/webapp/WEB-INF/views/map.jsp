<!DOCTYPE html>

<html>
    <head>
        <title>3003 maps v8</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<style>
            #map{
                height: 800px;
                width:100%;
            }
			left: 25%;
		
        </style>
    </head>
    <body>
		
		
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBDiT4KVHOVMfzURpGA_hfEbN2NF7D_3v0" type = "text/javascript"></script>
        
		<div id="map"> 
		
		<script> 
            var map;
			var markers = [];
			var uniqueId =1;
			//	var iconFolder = 'image/'; 
						
			
			
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
			
         </script>
				 
		 </div>
		 
		 
		 <script> 
				google.maps.event.addDomListener(window, 'load', initMap);
				google.maps.event.addDomListener(window, 'resize', initMap);
		 </script>
     
	</body>		
</html>
