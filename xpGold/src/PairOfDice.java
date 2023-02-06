import java.util.Random;

public class PairOfDice {
    private int die1 = 0;
    private int die2 = 0;

    public int getDie1() {
        if(die1 == 0)
            setDie1();
        return die1;
    }

    public void setDie1() {
        Random rand = new Random();
        this.die1 = rand.nextInt(1, 7);
    }

    public int getDie2() {
        if(die2 == 0)
            setDie2();
        return die2;
    }

    public void setDie2() {
        Random rand = new Random();
        this.die2 = rand.nextInt(1, 7);
    }

    public static void main(String[] args) {
        int times = 0;
        int total1 = 0;
        int total2 = 0;
        PairOfDice pod = new PairOfDice();
        do {
            pod.setDie1();
            pod.setDie2();
            total1 += pod.getDie1();
            total2 += pod.getDie2();
            times++;
            System.out.println();
            System.out.println("Round "+times);
            System.out.println("D1: "+ pod.die1 +"\tT1: " + total1);
            System.out.println("D2: "+pod.die2+"\tT2: " + total2);
            System.out.println("==================================");
        } while(total1 != 0 && total1 != total2);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Done after "+times+" times");
        System.out.println("Total: "+total1);
    }
}