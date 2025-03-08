<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>VIP Color Prediction</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="container">
        <h1>India's Best Comedy YouTube Channel</h1>
        <h2>SAJID SENTISS</h2>
        <p>Subscribe our YouTube Channel & Play Latest Video Comedy And Funny Daily!</p>

        <div class="timer" id="countdown">00:00:00</div>

        <a href="https://youtube.com/@sajidsentiss" class="join-btn">Subscribe Channel</a>
    </div>

    <script src="script.js"></script>
</body>
</html>
  
  body {
    font-family: Arial, sans-serif;
    background: linear-gradient(45deg, #ff416c, #ff4b2b);
    color: white;
    text-align: center;
    padding: 50px;
}

.container {
    background: rgba(255, 255, 255, 0.2);
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

h1, h2 {
    margin: 10px 0;
}

.timer {
    font-size: 24px;
    font-weight: bold;
    margin: 20px 0;
}

.join-btn {
    display: inline-block;
    padding: 10px 20px;
    font-size: 20px;
    color: white;
    background: #000;
    text-decoration: none;
    border-radius: 5px;
    transition: 0.3s;
}

.join-btn:hover {
    background: #ffcc00;
    color: #000;
  }

function startCountdown() {
    let timeLeft = 60 * 60 * 24 * 3; // 3 Days Countdown

    function updateCountdown() {
        let days = Math.floor(timeLeft / (60 * 60 * 24));
        let hours = Math.floor((timeLeft % (60 * 60 * 24)) / (60 * 60));
        let minutes = Math.floor((timeLeft % (60 * 60)) / 60);
        let seconds = timeLeft % 60;

        document.getElementById("countdown").innerText =
            `${days}d ${hours}h ${minutes}m ${seconds}s`;

        if (timeLeft > 0) {
            timeLeft--;
            setTimeout(updateCountdown, 1000);
        }
    }

    updateCountdown();
}

startCountdown();

