$(document).ready(function(){
	$('.nBtn ,.table .eBtn').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		var text= $(this).text();
		if(text=='Edit'){
		$.get(href,function(user,status){
			$('.myForm #id').val(user.id);
			$('.myForm #name').val(user.name);
			$('.myForm #location').val(user.location);
		})		
		$('.myForm #exampleModal').modal(); 
	}else{
		$('.myForm #id').val('');
		$('.myForm #name').val('');
		$('.myForm #location').val('');
		$('.myForm #exampleModal').modal();
	}
	});
	
	$('.table .delBtn').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$('#myModal #delRef').attr('href',href);
		$('#myModal').modal();
	})
});