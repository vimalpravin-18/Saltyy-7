const express = require("express");
const cors = require("cors");

const app = express();

app.use(cors());
app.use(express.json());

app.post('/input', (req, res) => {
    const UserMessage = req.body.message

    res.json({
        reply : "Server Received : " + UserMessage
    });
});

app.listen(5000, () => {
    console.log("Server Running");
})