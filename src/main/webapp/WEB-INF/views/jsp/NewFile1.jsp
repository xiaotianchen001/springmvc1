<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

</head>
<body>
<table>
<tr>
<td>first name</td>
<td><input type="text" id="firstName"></td>
<td><div id=firstNameHelper></div></td>

</tr>

<tr>
<td>first name</td>
<td><input type="text" id="lastName"></td>
<td><div id=lastNameHelper></div></td>

</tr>
</table>


<script type="text/javascript">



$(document).ready(function(){
	
	
	
	
	var textbox=$('input[type="text"]');
	
	textbox.focus(function(){
		var help=$(this).attr('id')+'Helper';
		$('#'+help).load('WEB-INF/views/jsp/help.html #'+help);
	});
	
	textbox.blur(function(){
		var help=$(this).attr('id')+'Helper';
		$('#'+help).html('');
	});
	
	
});



</script>
</body>
</html>