<html>
<body>
<h2>Retrieve all trainee</h2>
<table border="2 px">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.traineeId}</td>
<td>${item.traineeName}</td>
<td>${item.location}</td>
<td>${item.domain}</td></tr>
</c:forEach>
</table>

</body>
</html>