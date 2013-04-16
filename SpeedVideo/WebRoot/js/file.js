//检查是否有信息，有则返回
$(function() {
	$(document).ready(function() {
		var message = $('#hidden_message').val();
		if (message!='') {
			alert(message);
			}
	});
});

//判断文件上传的文件类型

