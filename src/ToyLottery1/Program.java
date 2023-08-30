package ToyLottery1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        Scanner sc = new Scanner(System.in);
        Toy toy1 = new Toy(0, "Кукла", 10, 3);
        Toy toy2 = new Toy(1, "Машинка", 10, 5);
        Toy toy3 = new Toy(2, "Робот", 10, 1);
        Toy toy4 = new Toy(3, "Матрёшка", 10, 6);
        ToyStore store = new ToyStore();

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);

        Toy prizeToy = store.randomToys();
        if (prizeToy == null) {
            System.out.println("все разыграно");
        } else {
            System.out.println("вы выиграли " + prizeToy.getName());
            List prizeToys = store.getPrizeToys();
            fileOperation.saveToysFile(prizeToys, prizeToy);
        }
    }
}
