$(document).ready(function(){
bookLinks();
});

function bookLinks() {
	$('#bookLinks').dataTable(
		{
			"ajax": {
				"url": "bookLinks/getBookLinks",
				"type": 'GET',
				"datatype": "json",
				"dataSrc": ""
			},

			"columns": [
				{
					"data": "id"
				},
				{
					"data": "bookName"
				},
				{
									'mRender' : function(data, type, row, meta) {
										var id = row.links;
										return '<a href='
												+ id
												+ ' target="_blank" rel="noopener">Download Link</a>';
									}
								},
				{
					"data": "date"
				}]
		});



}