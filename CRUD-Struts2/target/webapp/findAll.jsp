<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
  <title>Report</title>
  <style>
    table, td, th {border: 1px solid black;}
    table {border-collapse: collapse;width: 60%;}
    th {height: 30px;}
    .button-update {background-color: #008CBA;color: white;}
    .button-delete {background-color: red;color: white;}
  </style>
</head>
<body>
<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
<div style="margin-top: 40px;">
  <s:if test="noData==true">
    <table>
      <thead>
      <tr style="background-color: #E0E0E1;">
        <th>Sr.No.</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Action</th>
      </tr>
      </thead>
      <s:iterator value="beanList">
        <tr>
          <td><s:property value="srNo" /></td>
          <td><s:property value="username" /></td>
          <td><s:property value="email" /></td>
          <td><s:property value="password" /></td>
          <td>
            <a href="updatedetails.action?submitType=updatedata&email=<s:property value="email"/>">
              <button class="button-update">Update</button>
            </a>
            <a href="deleterecord.action?email=<s:property value="email"/>">
              <button class="button-delete">Delete</button>
            </a>
          </td>
        </tr>
      </s:iterator>
    </table>
  </s:if>
  <s:else>
    <div style="color: red;">No Data Found.</div>
  </s:else>
</div>
</body>
</html>