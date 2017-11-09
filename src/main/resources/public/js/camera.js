const url = "http://localhost:8081/cameras";

$(function) () {
    $.getJSON(url,
        function(response, status) {
            if (status == "success") {
                var r = "";
                $.each(response, function (i, camera) {
                    r += "No of mp" + camera + "lens:  " + " camera <br>";
                });

                $("#result").html(r);
            }
        });

}

