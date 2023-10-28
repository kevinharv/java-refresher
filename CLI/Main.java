public class Main {
    
    public static void main(String args[]) {
        final int SIZE = 100000000;
        Car[] cars = new Car[SIZE];
        for (int i = 0; i < SIZE; i++) {
            cars[i] = new Car();
        }
        System.out.println(cars[0].getColor());
    }
}