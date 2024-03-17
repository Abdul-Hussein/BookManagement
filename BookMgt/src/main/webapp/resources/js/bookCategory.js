

$(document).ready(function() {

	bookCategory();



	var $loading = $('#loading').hide();

	$(document).ajaxStart(function() {
		$loading.show();
	}).ajaxStop(function() {
		$loading.hide();
	});

	$('#refreshPage').click(function() {
		window.location.reload();
	});


	$('#addBookCategory').click(function() {
		$("#myForm").show();
	});


	$('#saveBookCategory').click(function() {

		var id = $("#id").val();
		var name = $("#name").val();
		var created_by = $("#created_by").val();
		var created_Date = $("#created_Date").val();
		var modified_by = $("modified_by").val();
		var modified_date = $("modified_date").val();


		if (name != "" && created_Date != null && created_by != "" && modified_by != "" && modified_date != null) {

			var bookCategoryDto = {
				"id": id,
				"name": name,
				"created_by": created_by,
				"created_Date": created_Date,
				"modified_by": modified_by,
				"modified_date": modified_date,
			};
			if (id == "") {
				$.ajax({
					url: "bookCategory/saveBookCategory",
					type: "POST",
					dataType: 'json',
					contentType: "application/json",
					data: JSON.stringify(bookCategoryDto),
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
								} else { }
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
					url: "bookCategory/updateBookCategoryDetails",
					type: "POST",
					dataType: 'json',
					contentType: "application/json",
					data: JSON.stringify(bookCategoryDto),
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
								} else { }
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



	function bookCategory() {
		$('#bookCategoryTable').dataTable({
			"ajax": {
				"url": "bookCategory/getBookCategory",
				"type": 'GET',
				"datatype": "json",
				"dataSrc": ""
			},
			"columns": [{
				"data": "id"
			},
			{
				"data": "name"
			},
			{
				"data": "created_by"
			},
			{
				"data": "created_Date"
			},
			{
				"data": "modified_date"
			},
			{
				"data": "modified_by"
			},
			{
				'mRender': function(data, type, row, meta) {
					var id = row.id;
					return '<a href="#" type="buttonclick" class="button" onclick="getByID(' + id + ')">Edit</a>';
				}
			}
			]

		});
	}


});
function getByID(id) {
	$("#id").val(id);

	$.ajax({
		url: "bookCategory/getBookCategoryById",
		type: "GET", // Change to GET method
		data: {
			'id': id,
		},
		success: function(data) {
			$("#name").val(data.name);
			$("#created_by").val(data.created_by);
			$("#created_Date").val(data.created_Date);
			$("#modified_by").val(data.modified_by); // Add # before selector
			$("#modified_date").val(data.modified_date); // Add # before selector
			$("#myForm").show();
		},

	});
}
function refreshPage() {
	window.location.reload();
}
