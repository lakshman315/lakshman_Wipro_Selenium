package dAY6;

public class KnowledgeLevelExample {

    public enum KnowledgeLevel {
        BEGINNER,
        ADVANCED,
        PROFESSIONAL,
        MASTER;

        public static KnowledgeLevel fromScore(int score) {
            if (score >= 0 && score <= 3) {
                return BEGINNER;
            } else if (score >= 4 && score <= 6) {
                return ADVANCED;
            } else if (score >= 7 && score <= 9) {
                return PROFESSIONAL;
            } else if (score == 10) {
                return MASTER;
            } else {
                throw new IllegalArgumentException("Score must be between 0 and 10.");
            }
        }
    }

    public static void main(String[] args) {
       
        for (int score = -1; score <= 11; score++) {
            try {
                KnowledgeLevel level = KnowledgeLevel.fromScore(score);
                System.out.println("Score: " + score + " -> Level: " + level);
            } catch (IllegalArgumentException e) {
                System.out.println("Score: " + score + " -> " + e.getMessage());
            }
        }
    }
}
