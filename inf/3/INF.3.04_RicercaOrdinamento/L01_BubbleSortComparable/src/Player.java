public class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addScore(int s) {
        score += s;
    } 

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }

    @Override
    public int compareTo(Player other) {
        if (this.score < other.score) {
            return -1;
        }
        if (this.score > other.score) {
            return 1;
        }
        return 0;
    }
}
