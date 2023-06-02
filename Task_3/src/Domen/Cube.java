package Domen;

import Service.iShapeFlat;
import Service.iShapeVolume;

/** Класс Cube с интерфейсами  iShapeFlat, iShapeVolume */
public class Cube implements iShapeFlat, iShapeVolume{

    private int edge;// сторона

    /* Конструктор */
    public Cube(int edge) {
        this.edge = edge;
    }

    /** Площадь куба */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /* Объем куба */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
    
}
