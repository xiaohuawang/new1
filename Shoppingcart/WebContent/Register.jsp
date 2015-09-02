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
  <h2>register form</h2>
  <form role="form" action="Register" method="POST">
    <div class="form-group">
      <label for="userid">ID:</label>
      <input type="text" class="form-control" name="userid" id="userid" placeholder="Enter userid">
    </div>
    <div class="form-group">
      <label for="uname">Name:</label>
    
    
      <input type="text" class="form-control" id="uname" name="uname"  placeholder="Enter uname">
    </div>
    <div class="form-group">
      <label for="upassword">Password:</label>
      <input type="text" class="form-control" id="upassword" name="upassword"  placeholder="Enter upassword">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>