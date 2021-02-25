<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
	<p>Create Tasks</p>
	<form action="/createtask" method="post">
	<!-- taskName -->
	  <div class="mb-3">
    <label class="form-label">Task Name</label>
    <input name="taskName" type="text" class="form-control" >
      </div>
      <!-- severity -->
    <div class="mb-3">
    <label class="form-label">Severity</label>
   <select name="severity" id="severity">
        <option value="high">High</option>
        <option value="medium">Medium</option>
        <option value="low">Low</option>
    </select>
      </div> 
	<!-- email  -->
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <!-- description -->
 <div class="mb-3">
		<label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
		<textarea name="description" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
	</div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</body>
</html>
