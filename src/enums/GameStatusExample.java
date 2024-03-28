package enums;

public class GameStatusExample {
    public static void main(String[] args) {
        for (GameStatus gs : GameStatus.values()) {
            System.out.println(gs);
        }

        GameStatus paused = GameStatus.PAUSED;
    }
}
