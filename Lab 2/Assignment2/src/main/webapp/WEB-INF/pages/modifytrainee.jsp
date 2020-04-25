<html>
<h2>Modify Trainee</h2>
<form action="modify" method="post"><table>
<tr><td>Please enter trainee Id: </td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="modify"/></td></tr>
</table>
</form>
<br><br>
<form action="modifytrainee"  method="post" >
<table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${val.traineeId}" name="traineeId" /></td>
<td><input type="text" value="${val.traineeName}" name="traineeName" /></td>
<td><input type="text" value="${val.location}" name="location"/></td>
<td><input type="text" value="${val.domain}" name="domain"/></td>
<td><input type="submit" Value="Modify"/></td></tr>
</table>
</form>
<h3>${msg}</h3>
</html>
