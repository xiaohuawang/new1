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
  <h2>Vertical (basic) form</h2>
  <form role="form">
    <div class="form-group">
      <label for="ProductId">ProductId:</label>
      <input type="ProductId" name="ProductId" class="form-control" id="ProductId" placeholder="Enter ProductId">
    </div>
    <div class="form-group">
      <label for="quantity">Password:</label>
      <input type="quantity" name="quantity"  class="form-control" id="quantity" placeholder="Enter quantity">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body></html>
