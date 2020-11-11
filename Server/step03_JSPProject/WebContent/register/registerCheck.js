$(document).ready(function() {
	$('#register_id').on('click', function() {
		if ($('#sid').val() == "") {
			alert("아이디를 입력하세요");
			$('#sid').focus();
		} else if ($('#passwd').val() == "") {
			alert("암호를 입력하세요");
			$('#passwd').focus();
		} else if ($('#repasswd').val() == "") {
			alert("암호확인을 입력하세요");
			$('#repasswd').focus();
		} else if ($('#name').val() == "") {
			alert("이름을 입력하세요");
			$('#name').focus();
		} else {
			$('form[name="regForm"]').submit();
		}
	
	});
});


/*
-- > onclick="check()"
function check() {
	if (regForm.mem_id.value == "") {	// document.getElementById("sid").value == ""
		alert("ID를 입력하세요");
		regForm.mem_id,focus();				
		return;
	}
}

documeent.regForm.submit();

*/