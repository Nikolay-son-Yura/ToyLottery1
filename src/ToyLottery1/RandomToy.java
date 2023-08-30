package ToyLottery1;

import java.util.List;
import java.util.Random;

public class RandomToy {
    private Random rd = new Random();
    public Toy randomToy(List<Toy> toys) {
        double completeWeight = 0;
        for (Toy i : toys)
            completeWeight += i.getProbability();
        double r = rd.nextDouble() * completeWeight;
        double countWeight = 0;
        for (Toy j : toys) {
            countWeight += j.getProbability();
            if (countWeight >= r) {
                j.setQuantity(j.getQuantity() - 1);
                return j;
            }
        }
        return null;
    }
}
