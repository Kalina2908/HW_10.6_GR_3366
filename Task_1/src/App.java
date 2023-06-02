//1) Переписать код в соответствии с Single Responsibility Principle:

import Domen.Salary;

public class App {
    public static void main(String[] args) throws Exception {
        
        Salary emp1 = new Salary("Mary", null , 3500.56);
        System.out.println(emp1.calculateNetSalary(emp1));
    }

}
