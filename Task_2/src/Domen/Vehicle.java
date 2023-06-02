package Domen;

/** Класс транспортных средств */
public class Vehicle {
    Double maxSpeed; // показатель максимальной скорости
    String type; // тип транспортного средства

    /** конструктор для класса */
    public Vehicle (Double maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /** метод получения максимальной скорости */
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    /** метод присвоения максимальной скорости */
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /** метод получения типа транспортного средства */
    public String getType() {
        return type;
    }

    /** метод присвоения типа транспортного средства */
    public void setType(String type) {
        this.type = type;
    }

    public Double calculateAllowedSpeed() {
        return getMaxSpeed() * 1;
    }

}
