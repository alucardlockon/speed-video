//判断设备UA并跳转
$(function() {
	$(document).ready(function() {
		var ua = navigator.userAgent;
		if (ua.indexOf('iPhone') > 0) {
			location = "mainAction!tomobile";
		} else if (ua.indexOf('Vita') > 0) {
			location = "mainAction!tomobile";
		} else if (ua.indexOf('Android') > 0) {
			location = "mainAction!tomobile";
		}
	})
})