<%-- 
    Document   : StudentRegistration
    Created on : Jul 23, 2019, 7:07:43 AM
    Author     : Rishabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Student Registration</title>
    </head>
    <body>
        <div class="container">
            <h2>Student Registration</h2>
            <form action="/ExamCenter/RegisterController" method="post">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
                </div>
                
                <div class="form-group">
                    <label for="name">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email">
                </div>
                                
                <div class="form-group">
                    <label for="address">Address:</label>
                    <input type="text" class="form-control" id="address" placeholder="Enter Your Address" name="address">
                </div>
                
                <div class="form-group">
                    <label for="contact">Contact:</label>
                    <input type="number" class="form-control" id="contact" placeholder="Enter contact number" name="contact">
                </div>
                <div class="form-group">
                    <label for="fee">Fee:</label>
                    <input type="text" class="form-control" id="fee" placeholder="Enter Your Fees" name="fee">
                </div>
                
                <div class="form-group">
                    <label for="admission_date">Admission Date:</label>
                    <input type="date" class="form-control" id="admission_date" placeholder="Enter Admission Date" name="admission_date">
                </div>
                
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
                </div>
                
                
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>

    </body>
</html>
