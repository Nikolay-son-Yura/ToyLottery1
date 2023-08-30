package ToyLottery1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ToyStore implements FileName {
    private List<Toy> toys = new ArrayList<>();
    private List prizeToys=new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy randomToys() {
        RandomToy random = new RandomToy();
        return random.randomToy(toys);
    }
    public List getPrizeToys(){
        return prizeToys;
    }

    public void changeInProbability(int id, double probability) {
        for (Toy i : toys) {
            if (i.getId() == id) {
                i.setProbability(probability);
            }
        }
    }
}
