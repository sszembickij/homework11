/*Закончить задание с фруктами*/

package fruit;

public class Main {

    public static void main(String[] args) {

        Fruit banana = new Fruit(29.90, 196, FruitType.BANANA, Color.YELLOW);
        Fruit redApple = new Fruit(11.90, 176, FruitType.APPLE, Color.RED);
        Fruit apple = new Fruit(13.50, 202, FruitType.APPLE, Color.GREEN);
        Fruit lemon = new Fruit(26.90, 134, FruitType.LEMON, Color.YELLOW);

        Fruit[] fruits = new Fruit[4];
        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = redApple;
        fruits[3] = apple;

        CashRegister cashRegister = new CashRegister(fruits);
        cashRegister.printBill();
    }
}
