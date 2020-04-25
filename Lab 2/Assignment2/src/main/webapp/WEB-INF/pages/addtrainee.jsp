<html>
	<body>
		<h2>Enter Trainee Details</h2>
			<p>${msg}</p>
			<pre>
				<form action="save" method="post" modelattribute="trainee">
				Trainee Id:<input type="text" name="traineeId"/>
				<br>
				Trainee Name:<input type="text" name="traineeName"/>
				<br>
				Trainee Location:<input type="radio" id="loc" name="location" value="Chennai">
								 <label for="chennai">Chennai</label>
				 				<input type="radio" id="loc" name="location" value="Bangalore">
				 				<label for="bangalore">Bangalore</label>
				 				<input type="radio" id="loc" name="location" value="Pune">
				 				<label for="pune">Pune</label>
				 				<input type="radio" id="loc" name="location" value="Mumbai">
				 				<label for="mumbai">Mumbai</label><br>
				Trainee Domain:<select id="domain">
								<option value=".NET">.NET</option>
								<option value="Mainframe">Mainframe</option>
								</select><br>
				<input type="submit" value="Add Trainee"/>
			</form>
		</pre>
	</body>
</html>
