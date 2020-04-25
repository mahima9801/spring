<html>
	<body>
		<h2>Delete Operation</h2>
			<pre>
				<form action="delete" method="post">
				<table>
					<tr>
						<td>Please enter trainee ID:-<input type="text" name="traineeId"/>
						 				 <input type="submit" value="delete"/></td>
					</tr>				
				</table>
				</form>
				<br><br>
				<form action="delete/${del.traineeId}"  method="post">
				<table>
					<tr><th>Trainee Id</th>
					<th>Trainee Name</th>
					<th>Trainee Location</th>
					<th>Trainee Domain</th>
					<th>Action</th>
					</tr>
					<tr>
					<td><input type="text" value="${del.traineeId}"  readonly/></td>
					<td><input type="text" value="${del.traineeName}"  readonly/></td>
					<td><input type="text" value="${del.location}"  readonly/></td>
					<td><input type="text" value="${del.domain}"  readonly/></td>
					<td><input type="submit" Value="Delete"/></td></tr>
				</table>
				
			</pre>
	</body>
</html>