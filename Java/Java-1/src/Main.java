//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        calculateScore(false, 0, 0, 0);

        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        gameOver = true;
//        score = 800;
//        levelCompleted = 5; bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}