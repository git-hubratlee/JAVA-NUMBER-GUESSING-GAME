# Java Number Guesser

A simple, console-based number guessing game built in Java. The program picks a random number between 1 and 100, and the player guesses until they hit the right number. 

## How It Works
* **Random Target:** Uses java.util.Random to generate a secret number between 1 and 100.
* **Higher/Lower Hints:** Tells the player if their guess is too high or too low after every turn.
* **Play Again Loop:** Uses nested for (;;) loops so the player can restart the game or exit cleanly without closing the console window.

## Tech Stack and Concepts
* **Language:** Java
* **Infinite Control Loops:** Built using for (;;) structures to manage the game state and replay options.
* **Core APIs:** Scanner (for reading player input) and Random (for generating the secret number).
