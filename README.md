# 🎯 Number Guessing Game - Java Console App

This is a simple console-based **Number Guessing Game** written in Java. The player tries to guess a randomly generated number between 1 and 10 within a limited number of attempts.

---

## 💡 How It Works

- The computer randomly selects a number between **1 and 10**.
- The user is given **3 attempts** to guess the correct number.
- After each guess:
  - If correct, the user wins and the game ends.
  - If incorrect, the user is prompted to try again (if attempts remain).
- If all 3 attempts are used without guessing correctly, the correct number is revealed.

---

## 🧾 Sample Output

Welcome to the number guessing game
Guess a number between 1 and 10
You have 3 attempts. Good Luck!!
Attempt 1: Enter your guess: 
> 4
X Wrong guess
Try again
Attempt 2: Enter your guess:
> 7
X Wrong guess
Try again
Attempt 3: Enter your guess:
> 9
X Wrong guess
You have used all your attempts. The correct number is 5
📦 Technologies Used
Java

Scanner (for user input)

Random (for generating the secret number)

▶️ How to Run
Open the project in Eclipse, IntelliJ, or any Java IDE.

Make sure NumberGuessingGame.java is in a package (e.g., day7).

Run the main method.

Follow the on-screen instructions in the console.

🔁 Possible Enhancements
Allow unlimited attempts or user-defined attempts.

Add difficulty levels (easy, medium, hard).

Keep track of user score or history of attempts.

Add input validation for numbers outside 1–10.

🧑‍💻 Author
Created as a beginner-friendly Java mini project to practice logic building, conditional statements, loops, and random number generation.



