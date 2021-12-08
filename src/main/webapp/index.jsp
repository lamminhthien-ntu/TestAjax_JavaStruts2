<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>
    <center>
        <h3>Welcome <i>${sessionScope.userName}</i>, you have logged in successfully!</h3>
        <h3><a href="./logout">Logout</a></h3>
    </center>
    <div>Danh sách sinh viên</div>
    <a href="./create" class="btn btn-primary">Thêm mới</a>
    <div class="container">
        <div>
            <form id="search-form">
                <div class="form-group">
                    <label for="">Tìm kiếm</label>
                    <input type="text" class="form-control" name="search" id="search">
                </div>
                <button type="submit" class="btn btn-primary">Tìm kiếm</button>
            </form>
        </div>
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Branch</th>
                    <th>Percentage</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th class='d-flex justify-content-center'>Chức năng</th>
                </tr>
            </thead>
            <tbody id="student-list"></tbody>
        </table>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <script src="../js/student-browser.js"></script>
</body>

</html>