function compileCode() {
    const javaCode = document.getElementById("javaCode").value;

    // Send the Java code to the server for compilation
    fetch('/compile', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ code: javaCode }),
    })
    .then(response => response.json())
    .then(data => {
        // Display the compilation result
        document.getElementById("output").innerText = data.result;
    })
    .catch(error => {
        console.error('Error:', error);
    });
}
 
