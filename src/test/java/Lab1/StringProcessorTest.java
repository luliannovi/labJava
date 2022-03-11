package Lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {
    @Test
    public void findShortest() {
        String[] v1 = {"Nicola", "Marzia", "Agata", "Dharma"};
        StringProcessor sp1 = new StringProcessor(v1);
        Assertions.assertEquals(2, sp1.findShortest());
    }

    @Test
    public void search() {
        String[] v1 = {"Nicola", "Marzia", "Agata", "Dharma"};
        StringProcessor sp1 = new StringProcessor(v1);
        Assertions.assertEquals(2, sp1.search("Agata"));
    }

    @Test
    public void reverse() {
        String[] v1 = {"Nicola", "Marzia", "Agata", "Dharma"};
        StringProcessor sp1 = new StringProcessor(v1);
        sp1.reverse();
        Assertions.assertEquals(1, sp1.search("Agata"));
    }
    @Test
    public void reverse2() {
        String[] v1 = {"Nicola", "Marzia", "Agata", "Dharma","CLODIAN"};
        StringProcessor sp1 = new StringProcessor(v1);
        sp1.reverse();
        Assertions.assertEquals(0, sp1.search("CLODIAN"));
        Assertions.assertEquals(2, sp1.search("Agata"));
    }

}