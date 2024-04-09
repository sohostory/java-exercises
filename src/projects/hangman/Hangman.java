package projects.hangman;

import java.util.HashSet;
import java.util.Scanner;

public class Hangman {
    private String secretWord;
    private int attempts;
    private StringBuilder guessedWord;
    private HashSet<Character> guessedLetters;

    public Hangman(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;

        this.guessedWord = new StringBuilder(secretWord.replaceAll(".", "_"));
        this.guessedLetters = new HashSet<>();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0) {
            System.out.println("Remaining attempts: " + remainingAttempts);
            System.out.print("Guess a letter: ");

            char guess = scanner.next().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You guessed that letter already!");
                continue;
            }

            guessedLetters.add(guess);

            if (secretWord.contains(guess)) {
                contine;
            }
        }
    }
}
