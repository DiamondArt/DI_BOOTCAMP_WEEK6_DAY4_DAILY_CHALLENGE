public class Calculator {
    private double num1;
    private double num2;

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num2 - num1;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide() {
        return num2 / num1;
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}
