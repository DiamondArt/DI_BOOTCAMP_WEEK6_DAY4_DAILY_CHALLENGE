
public class Dog {
    private int drinkTime;

    public void setDrinkTime(int time) {
        this.drinkTime = time;
    }

    public int getDrinkTime() {
        return drinkTime;
    }

    public boolean needsToGo() {
        return drinkTime > 4;
    }
}
