<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Update</title>
</head>
<body>
<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
<form action=updatedetails method="post">
		<pre>
<b>Name:         </b><input type="text" name="username" value='<s:property value="username"/>'>


<b>Email:        </b><input type="email"  name="email" value='<s:property value="email"/>'>
		            <input type="hidden" name="emailhidden" value='<s:property value="email"/>'>

<b>Password:     </b><input type="password" name="password" value='<s:property value="password"/>'>
		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
</form>
<s:if test="ctr>0">
	<span style="color: red;"><s:property value="msg" /></span>
</s:if>
<s:else>
	<span style="color: red;"><s:property value="msg" /></span>
</s:else>
</body>
</html>