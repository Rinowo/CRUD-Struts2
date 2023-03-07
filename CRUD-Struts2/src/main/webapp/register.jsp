<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Register</title>
    <style type="text/css">
        .button-register {background-color: green;color: white;}
        .button-report {background-color: #000000;color: white;margin-left: 30%;}
    </style>
</head>
<body>
<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
<a href="findall"><button class="button-report" type="button">Report</button></a>
<s:form action="registeruser.action" method="post">
    <s:textfield label="Full Name" name="username" />
    <s:textfield label="Email" name="email" />
    <s:password label="Password" name="password" />
    <s:submit cssClass="button-register" value="Resgister" />
</s:form>
<s:if test="ctr>0">
    <span style="color: green;"><s:property value="msg" /></span>
</s:if>
<s:else>
    <span style="color: red;"><s:property value="msg" /></span>
</s:else>
</body>
</html>