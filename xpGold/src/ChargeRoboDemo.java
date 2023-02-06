public class ChargeRoboDemo {
        public static void charge(SimpleRobot r, int maxDist) {
            do {
                r.forward();
            } while (r.getDist() < maxDist && !r.blocked());
            System.out.println("Total distance: "+r.getDist());
        }

        public static void main(String args[]) {
            SimpleRobot r = new SimpleRobot();
            r.forward();
            r.right();
            charge(r, 3);
        }

}
