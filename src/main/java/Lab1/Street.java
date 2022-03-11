package Lab1;

public class Street {
    int[] cars;
    public Street(int km){
        cars = new int[km];
    }

    public int[] getCars() {
        return cars;
    }

    public void setCars(int[] cars) {
        this.cars = cars;
    }

    public void insertCar(int km){
        cars[km] +=1;
    }
    public int getCarsByPosition(int km){
        return cars[km];
    }
    public void progress() {
        if(cars.length==0)
            return;
        for (int i = cars.length-1; i > 0; i--) {
            cars[i] = cars[i-1];
        }
        cars[0]=0;
    }
}
