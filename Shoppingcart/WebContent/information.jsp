<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>add credit card information</h2>
  <form role="form" action="information123" method="POST">
    <div class="form-group">
      <label for="accountid">ID:</label>
      <input type="text" class="form-control" name="accountid" id="accountid" placeholder="Enter accountid">
    </div>
    <div class="form-group">
      <label for="cardnum">card number:</label>
    
    
    
    
      <input type="text" class="form-control" id="cardnum" name="cardnum"  placeholder="Enter cardnum">
    </div>
    <div class="form-group">
      <label for="cardowner">cardowner:</label>
      <input type="text" class="form-control" id="cardowner" name="cardowner"  placeholder="Enter cardowner">
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
    <br>
    	</button>

							<a href="/Shoppingcart/search.jsp"
								class="btn btn-default">search your credit card info</a>
	  </br>							
  </form>
</div>

</body>
</html>