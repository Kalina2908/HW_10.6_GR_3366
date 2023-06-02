package Domen;

/** Класс Bus с наследованием класса Vehicle */
public class Bus extends Vehicle{
    private int numberBus;

    /** Конструктор класса */
    public Bus(Double maxSpeed, String type, int numberBus) {
        super(maxSpeed, type);
        this.numberBus = numberBus;
    }

    /** Метод получения номера автобуса */
    public int getNumberBus() {
        return numberBus;
    }

    /** Метод присвоения значения номера автобуса */
    public void setNumberBus(int numberBus) {
        this.numberBus = numberBus;
    }
    
    /** Метод расчета скорости для класса Bus */
    public Double calculateAllowedSpeed(){
        return getMaxSpeed() * 0.6;
    }
}
