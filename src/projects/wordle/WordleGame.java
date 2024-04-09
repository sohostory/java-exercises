package projects.wordle;

public class WordleGame {
    public static void main(String[] args) {
        Wordle wordle = new Wordle("toast", 5);
        wordle.play();
    }
}
