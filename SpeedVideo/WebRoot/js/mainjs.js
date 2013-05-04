$(function() {
	$('.subli').toggle(function() {
		$(this).siblings('.style-of-subul_' + this.id).hide('slow');
	}, function() {
		$(this).siblings('.style-of-subul_' + this.id).show('slow');
	});
});

$(function() {
	$('#serach_text').click(function() {
		$(this).val("");
	});
});


