package Domen;

import java.sql.Date;

/** Класс Employee */
public class Employee {
    private String name; 
    private Date dob;
    protected Double baseSalary;
    

        /* конструктор сотрудника*/
        public Employee(String name, Date dob, Double baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }

        /* метод получения */
        public String getName() {
            return name;
        }

        /* метод присвоения */
        public void setName(String name) {
            this.name = name;
        }

        /* метод получения */
        public Date getDob() {
            return dob;
        }

        /* метод присвоения */
        public void setDob(Date dob) {
            this.dob = dob;
        }

        public Double getBaseSalary() {
            return baseSalary;
        }
    
        public void setBaseSalary(Double baseSalary) {
            this.baseSalary = baseSalary;
        }

        /* вывод информации о сотруднике */
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }

        // Функцию расчета чистой зарплаты перенесем в класс Salary
        /*
        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);//calculate in otherway
            return baseSalary - tax;
        }
        */
    
}
