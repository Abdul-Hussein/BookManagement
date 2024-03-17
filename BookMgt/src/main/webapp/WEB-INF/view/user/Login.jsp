<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<title>Login page</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
  
</head>
<body>
  
<form id="signupForm">
    <fieldset>
        <label for="signup-first-name">Enter Your Name: <input id="signup-first-name" name="first-name" type="text" required /></label>
        <label for="signup-last-name">Enter Your Last Name: <input id="signup-last-name" name="last-name" type="text" required /></label>
        <label for="signup-password">Create a Password: <input id="signup-password" name="password" type="password" pattern="[a-z0-5]{8,}" placeholder="Password should be 8 characters " required /></label>
    </fieldset>
    <button id="signup-btn" type="button">Sign Up</button>
</form>

<form id="loginForm">
    <fieldset>
        <label for="login-first-name">Enter Your Name: <input id="login-first-name" name="first-name" type="text" required /></label>
        <label for="login-password">Enter Your Password: <input id="login-password" name="password" type="password" pattern="[a-z0-5]{8,}" placeholder="Password should be 8 characters " required /></label>
    </fieldset>
    <button id="login-btn" type="button">Log In</button>
</form>

<script>
// Function to handle signup
document.getElementById("signup-btn").addEventListener("click", function() {
    const firstName = document.getElementById("signup-first-name").value;
    const lastName = document.getElementById("signup-last-name").value;
    const password = document.getElementById("signup-password").value;

    fetch('http://localhost:8082/book-mgmt/api/auth/signup', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            username: firstName,
            email: 'John@gmail.con', 
            role: ['user'],
            password: password
        })
    })
    .then(response => response.json())
    .then(data => {
        alert(data.message); // Display success message
    })
    .catch(error => {
        console.error('Error:', error);
    });
});

// Function to handle login
document.getElementById("login-btn").addEventListener("click", function() {
    const firstName = document.getElementById("login-first-name").value;
    const password = document.getElementById("login-password").value;

    fetch('http://localhost:8082/book-mgmt/api/auth/signin', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            username: firstName,
            password: password
        })
    })
    .then(response => response.json())
    .then(data => {
        // Handle login response, like storing token in localStorage, redirecting user, etc.
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
});
</script>

</body>
</html>
