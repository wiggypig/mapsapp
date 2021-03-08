var map;
//let coords = {lat: 39.9612, lng: -82.9988};

function initMap() {
    map = new google.maps.Map(document.getElementById('map'), {
        center: coords,
        zoom: 10,
//        scrollwheel: true
    });

    let image = {
    url:'/2766276.svg',
    scaledSize: new google.maps.Size(50, 50)
    };

    let marker = new google.maps.Marker({
        position: coords,
        map: map,
        icon: image,
		animation: google.maps.Animation.BOUNCE
    });

        let contentString = '<h2>' + city + ', ' + state + ', where dreams can come true!</h2>';

        let infowindow = new google.maps.InfoWindow({
            content: contentString
        })

        google.maps.event.addListener(marker, 'click', () => infowindow.open(map, marker));
}