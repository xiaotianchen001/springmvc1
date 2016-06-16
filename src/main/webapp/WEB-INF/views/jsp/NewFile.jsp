<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  .highlight { 
  	background:green;
  }
 </style>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
</head>
<body>
  <h1>Highlight table row record on hover - jQuery</h1>

  <table border="1">
    <tr><th>No</th><th>Name</th><th>Age</th><th>Salary</th></tr>
    <tr><td>1</td><td>Yong Mook Kim</td><td>28</td><td><div id="di">$100,000 </div>  <input type="button" value="remove" id="button"/></td> </tr>
    <tr><td>2</td><td>Low Yin Fong</td><td>29</td><td>$90,000</td></tr>
    <tr><td>3</td><td>Ah Pig</td><td>18</td><td>$50,000</td></tr>
    <tr><td>4</td><td>Ah Dog</td><td>28</td><td>$40,000</td></tr>
    <tr><td>5</td><td>Ah Cat</td><td>28</td><td>$30,000</td></tr>
  </table>

<script type="text/javascript">

	$('#button').click(function(){
		$('#di').remove();
	
	});
	
	
$("tr").not(':first').hover(
  function () {
    $(this).css("background","yellow");
  }, 
  function () {
    $(this).css("background","");
  }
);
	
</script>
</body>
</html>