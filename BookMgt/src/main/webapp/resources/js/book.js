


$(document).ready(function() {

    bookDataTable();

    var $loading = $('#loading').hide();

    $(document).ajaxStart(function() {
        $loading.show();
    }).ajaxStop(function() {
        $loading.hide();
    });

$('#refreshPage').click(function() {
		window.location.reload();
	});
	

    $('#addBookDetails').click(function() {
        $("#myForm").show();
    });

    $('#saveBookDetails').click(function() {
        var id = $("#bookid").val();
        var bookName = $("#bookname").val();
        var price = $("#bookprice").val();
        var remarks = $("#remarks").val();

        if (bookName != "" && bookName != null && price != "" && price != null && remarks != "" && remarks != null) {
            var bookDetailDto = {
                "id": id,
                "bookName": bookName,
                "bookPrice": price,
                "remarks": remarks,
            }

            if (id == "") {
                $.ajax({
                    url: "books/saveBookDetails",
                    type: "POST",
                    dataType: 'json',
                    contentType: "application/json",
                    data: JSON.stringify(bookDetailDto),
                    success: function(data) {
                        if (data == true) {
                            swal({
                                title: "",
                                text: "Saved Successfully.",
                                type: "success",
                                confirmButtonColor: '#DD6B55',
                                confirmButtonText: 'Ok',
                            }, function(isConfirm) {
                                if (isConfirm) {
                                    window.location.reload();
                                } else {}
                            });
                        } else {
                            swal({
                                title: "",
                                text: "Not Saved",
                                type: "warning",
                            });
                        }
                    }
                });
            } else {
                $.ajax({
                    url: "books/updateDetails",
                    type: "POST",
                    dataType: 'json',
                    contentType: "application/json",
                    data: JSON.stringify(bookDetailDto),
                    success: function(data) {
                        if (data == true) {
                            swal({
                                title: "",
                                text: "Saved Successfully.",
                                type: "success",
                                confirmButtonColor: '#DD6B55',
                                confirmButtonText: 'Ok',
                            }, function(isConfirm) {
                                if (isConfirm) {
                                    window.location.reload();
                                } else {}
                            });
                        } else {
                            swal({
                                title: "",
                                text: "Not Updated",
                                type: "warning",
                            });
                        }
                    }
                });
            }
        } else {
            swal({
                title: "",
                text: "Please enter mandatory fields",
                type: "warning",
            });
        }
    });

 

    function bookDataTable() {
        $('#bookdataTable').dataTable({
            "ajax": {
                "url": "books/getBookDetails",
                "type": 'GET',
                "datatype": "json",
                "dataSrc": ""
            },
            "columns": [{
                    "data": "id"
                },
                {
                    "data": "bookName"
                },
                {
                    "data": "price"
                },
                {
                    "data": "remarks"
                },
                {
                    'mRender': function(data, type, row, meta) {
                        var id = row.id;
                        return '<a href="#" type="buttonclick" class="button" onclick="getByID(' + id + ')">Edit</a>';
                    }
                }
            ],
        });
    }
});

function getByID(id) {
    $("#bookid").val(id);

    $.ajax({
        url : "books/getBookDetailsbyId",
		type :"POST",
		data :{
			'id' : id,
		},
        success: function(data) {
            $("#bookname").val(data.bookName);
            $("#bookprice").val(data.price);
            $("#remarks").val(data.remarks);
            $("#saveBookDetails").val("update");
            $("#myForm").show();
        }
    });
}
   function refreshPage() {
        window.location.reload();
    }
