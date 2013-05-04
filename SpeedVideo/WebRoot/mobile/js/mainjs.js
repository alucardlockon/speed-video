$(function() {
	$(document).ready(function() {
		$('.style-of-subul_u1').hide();
		$('.style-of-subul_u7').hide();
		$('.style-of-subul_u13').hide();
		$('.style-of-subul_u18').hide();
		$('.style-of-subul_u20').hide();
		$('#floatdiv').hide();
	});
});
$(function() {
	$('#floatmenu').toggle(function() {
		$('#floatdiv').show('slow');
	}, function() {
		$('#floatdiv').hide('slow');
	});
});
$(function() {
	$('.subli').toggle(function() {
		$(this).siblings('.style-of-subul_' + this.id).show('slow');
	}, function() {
		$(this).siblings('.style-of-subul_' + this.id).hide('slow');
	});
});
$(function() {
	$('#serach_text').click(function() {
		$(this).val("");
	});
});
