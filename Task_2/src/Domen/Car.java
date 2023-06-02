package Domen;

public class Car extends Vehicle{
    private int numberCar;// номер машины

    /** Конструктор для класса Car */
    public Car(Double maxSpeed, String type, int numberCar) {
        super(maxSpeed, type);
        this.numberCar = numberCar;
    }
    
    /** Метод получения номера машины */
    public int getNumberCar() {
    return numberCar;
    }

    /** Метод присовения номера машины */
    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    /** Метод расчета скорости для класса Car */
    public Double calculateAllowedSpeed(){
        return getMaxSpeed() * 0.8;
    }

}
