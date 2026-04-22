async function MessageSent() {

    const input = document.getElementById('MsgInput').value;
    if(input == "") {
        alert("Enter the data")
    }

    const response = await fetch("http://localhost:5000/input", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({message: input})
    })

    const data = await response.json();
    document.getElementById('reply').innerText = data.reply;
}