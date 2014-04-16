$( document ).ready(function() {

    $("#deleteBtn").on("click", function(event){
        var confirmed = confirm("Are you sure you want to delete this item?");
        if (confirmed) {
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