function sub(event) {
    event.preventDefault(); // Prevent form submission

    document.getElementById("name").innerHTML=""
    document.getElementById("age").innerHTML=""
    document.getElementById("gender").innerHTML=""
    var email=document.getElementById("mail")
    var number=document.getElementById("number").innerHTML=""
    var password=document.getElementById("password").innerHTML=""
    var confirmPassword=document.getElementById("conpass").innerHTML=""
    // Email validation
    if (!email.includes("@gmail.com")) {
        alert("Please enter a valid email that contains '@gmail.com'.");
        return;
    }

    // Number validation
    if (number.length !== 10 || !/^\d{10}$/.test(number)) {
        alert("Please enter a valid 10-digit phone number.");
        return;
    }

    // Password validation
    if (password.length < 8 || !/^(?=.*[a-zA-Z])(?=.*[0-9])/.test(password)) {
        alert("Password must be at least 8 characters long and alphanumeric.");
        return;
    }

    // Confirm password validation
    if (password !== confirmPassword) {
        alert("Password and confirm password do not match.");
        return;
    }

    // If all validations pass, submit the form
    alert("Form submitted successfully!");
    document.getElementById('loginform').submit();
};
