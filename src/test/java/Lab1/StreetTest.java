package Lab1;

import org.junit.jupiter.api.Test;

public class StreetTest {
    @Test
    public void insertCar() {
        Street s = new Street(10);
        s.insertCar(3);

    }

    @Test
    public void getCarsByPosition() {
        Street s = new Street(10);
        s.insertCar(3);

    }

    @Test
    public void progress() {
        Street s = new Street(10);
        s.insertCar(3);
        s.progress();

    }

}