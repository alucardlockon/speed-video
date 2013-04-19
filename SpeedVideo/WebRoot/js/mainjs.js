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

$(function() {
	$('#regist')
			.toggle(
					function() {
						$(this)
								.after(
										"<div id='regist_block'><form method='post' action='registAction'><table><tr><td>用户名</td></tr><td><input type='text' name='user.name' style='width:80%'></td></tr><tr><td>密码</td></tr><td><input type='text' name='user.password'  style='width:80%'></td></tr><tr><td><input type='submit' value='注册'/></td></tr></table></form></div>");
					}, function() {
						$('#regist_block').remove();
					});
});

$(function() {
	$('#login')
			.toggle(
					function() {
						$(this)
								.after(
										"<div id='login_block'><form method='post' action='loginAction'><table><tr><td>用户名</td></tr><td><input type='text' name='user.name' style='width:80%'></td></tr><tr><td>密码</td></tr><td><input type='text' name='user.password'  style='width:80%'></td></tr><tr><td><input type='submit' value='登陆'/></td></tr></table></form></div>");
					}, function() {
						$('#login_block').remove();
					});
});
