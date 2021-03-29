<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/23/2021
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
</head>
<style>
    .form-control {
        width: 400px;
        height: 40px;
    }
    .text-1 {
        color: red;
    }
</style>
<body>
<form style="margin-left: 30px" method="post" action="/customerServlet">
    <input hidden name="id" value="0">
    <div class="form-group">
        <label>Customer Type</label>
        <select class="form-control" name="type">
            <option value="1">Diamond</option>
            <option value="2">Platinum</option>
            <option value="3">Gold</option>
            <option value="4">Silver</option>
            <option value="5">Member</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleInputName">Name</label>
        <input type="text" class="form-control" id="exampleInputName" aria-describedby="emailHelp" name="name"
               value="${customer.customerName}">
    </div>
    <div class="form-group">
        <label for="exampleInputBirthday">Birthday</label>
        <input type="date" class="form-control" id="exampleInputBirthday" name="birthday" value="${customer.customerBirthday}">
    </div>
    <div class="form-group">
        <label>Gender</label>
        <select class="form-control" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Unknown">Unknown</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleInputCardId">Card Id</label>
        <input type="text" class="form-control" id="exampleInputCardId" name="cardId" value="${customer.customerIdCard}">
        <label for="exampleInputCardId" class="text-1"><c:out value="${errCustomer.get(1)}"/></label>
    </div>

    <div class="form-group">
        <label for="exampleInputPhone">Phone</label>
        <input type="text" class="form-control" id="exampleInputPhone" name="phone" value="${customer.customerPhone}">
        <label for="exampleInputPhone" class="text-1"><c:out value="${errCustomer.get(0)}"/></label>
    </div>
    <div class="form-group">
        <label for="exampleInputEmail">Email</label>
        <input type="text" class="form-control" id="exampleInputEmail" name="email" value="${customer.customerEmail}">
        <label for="exampleInputEmail" class="text-1"><c:out value="${errCustomer.get(2)}"/></label>
    </div>
    <div class="form-group">
        <label for="exampleInputAddress">Address</label>
        <input type="text" class="form-control" id="exampleInputAddress" name="address" value="${customer.customerAddress}">
    </div>
    <a class="btn btn-secondary" href="/customerServlet">Close</a>
    <button type="submit" class="btn btn-primary" name="action" value="create">Create</button>
</form>

</body>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../bootstrap413/js/popper.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../bootstrap413/js/bootstrap.min.js"></script>
<script src="../../bootstrap413/js/bootstrap.bundle.js"></script>

</html>
