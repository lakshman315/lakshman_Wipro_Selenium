package dAY6;

enum Difficulty {
    EASY, MEDIUM, HARD
}

public class Game {
    private Difficulty d;
    private int bullets;

    public Game(Difficulty d) {
        this.d = d;
        switch (d) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
        }
        System.out.println("Difficulty: " + d+ ", Bullets: " + bullets);
    }

    public static void main(String[] args) {
        new Game(Difficulty.EASY);
        new Game(Difficulty.MEDIUM);
        new Game(Difficulty.HARD);
    }
}
