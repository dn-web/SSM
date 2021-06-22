<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="webjars/jquery/3.4.1/dist/jquery.js"></script>
</head>
<body>
    <form action="user/add.do">
        用户名：<input type="text" name="name" />
        年龄： <input type="text" name="age" />
        <input type="submit" value="提交" />
    </form>

    <button id="btn">查询用户列表</button>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url: "user/query.do",
                    dataType: "json",
                    success: function (arg) {
                        console.log(arg);
                    },
                    error: function () {
                        alert("1111111");
                    }
                });
            });
        });
    </script>





</body>
</html>
