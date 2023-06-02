package Domen;

import java.sql.Date;

public class Salary extends Employee{

    /* конструктор Salary*/
    public Salary(String name, Date dob, Double baseSalary) {
        super(name, dob, baseSalary);
    }


    /* Метод расчета чистой зарплаты */
    public Double calculateNetSalary(Salary employee) {
        Double tax = (baseSalary * 0.25);//calculate in otherway
        return (Double) (baseSalary - tax);
    }
}
