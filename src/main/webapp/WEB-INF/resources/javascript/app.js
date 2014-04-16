$( document ).ready(function() {

    $("#deleteBtn").on("click", function(event){
        var answer = confirm("Are you sure you want to delete this item?");
        if (answer) {
            $.ajax({
                url: $(event.target).attr("href"),
                type: "DELETE",
                success: function(data) {
                    console.log(data);
                    window.location.replace("user/home");
                }
            });
        } else {
            return false;
        }
        event.preventDefault();
    });

});