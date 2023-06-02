package Domen;

import Service.iShapeFlat;

/** Класс Cicle с интерфейсом  iShapeFlat */
public class Circle implements iShapeFlat{

    private double radius;// радиус

    /* Конструктор класса */
    public Circle(double radius) {
        this.radius = radius;
    }

    /* Площадь круга */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
     
    
}
