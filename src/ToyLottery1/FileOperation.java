package ToyLottery1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOperation implements FileName{
    public void saveToysFile(List<Toy> toys,Toy  toy) {
        String text = toy.toString();
        try (FileWriter writer = new FileWriter(FileName, true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
