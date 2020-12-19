<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>前台页面</title>
</head>
<body>
    <#list emps as emp>
        <h4>${emp.empno}---${emp.ename}---${emp.salary}---${emp.hiredate}</h4>

    </#list>
</body>
</html>