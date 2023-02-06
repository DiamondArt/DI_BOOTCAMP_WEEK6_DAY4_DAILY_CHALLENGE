import java.util.Random;

public class SimpleRobot {
    private int dist = 0;

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    private void drive() {
        this.dist++;
    }

    public void forward() {
        // go forehead
        this.drive();
    }

    public void right() {
        // go to right
        this.drive();
    }

    public void left() {
        // go to left
        this.drive();
    }

    public boolean blocked() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
