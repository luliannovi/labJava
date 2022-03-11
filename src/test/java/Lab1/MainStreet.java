package Lab1;

public class MainStreet {
    public static void main(String[] args) {
        Street s = new Street(8);
        s.insertCar(0);
        s.insertCar(0);
        s.insertCar(2);
        s.insertCar(3);
        s.insertCar(4);
        s.insertCar(7);
        System.out.println(s.getCarsByPosition(0));
        s.progress();
        System.out.println(s.getCarsByPosition(0) + s.getCarsByPosition(7));
    }
}
