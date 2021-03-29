<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/28/2020
  Time: 11:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
          integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
          crossorigin="anonymous"/>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<div>
    <div style="text-align: center;">
        <h3>BenhNhan List</h3>
        <h5><a href="/benhnhan?action=create" style="text-decoration: none">Add New BenhNhan</a></h5>
        <h5 style="color: green">${message}</h5>
    </div>
    <div align="center">
        <table border="1" cellpadding="5" id="tableCustomer" class="table table-striped table-bordered"
               style="width: 100%">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>NgayNhapVien</th>
                <th>NgayRaVien</th>
                <th>LyDoNhapVien</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="benhnhan" items="${listBenhNhan}">
                <tr>
                    <td><c:out value="${benhnhan.id}"/></td>
                    <td><c:out value="${benhnhan.name}"/></td>
                    <td><c:out value="${benhnhan.ngayNhap}"/></td>
                    <td><c:out value="${benhnhan.ngayRa}"/></td>
                    <td><c:out value="${benhnhan.lyDo}"/></td>
                    <td>
                        <a href="/benhvien?action=edit&id=${benhnhan.id}" style="text-decoration: none">Edit</a>
                        <a href="" data-toggle="modal" data-target="#deleteModal"
                           onclick="deleteBenhNhanId('${benhnhan.id}', '${benhnhan.name}')"
                           style="text-decoration: none; color: red">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<div class="modal fade" id="deleteModal" tabindex="-13" role="dialog"
     aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">DELETE</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p id="modelId"></p>
            </div>
            <div class="modal-footer">
                <a type="button" class="btn btn-outline-danger" onclick="submitDelete()">Delete</a>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<form id="deleteBenhNhan">
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id" id="id">
</form>
<script>
    function submitDelete() {
        document.getElementById("deleteBenhNhan").submit();
    }
    function deleteBenhNhanId(id, name) {
        document.getElementById('modelId').innerText = 'Are you sure to delete BenhNhan ' + name + ' ?';
        document.getElementById('id').value = id;
    }
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').DataTable({
            dom: 'lrtip',
            lengthChange: false,
            pageLength: 5
        });
    });
</script>
</body>
</html>