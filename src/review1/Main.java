/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author Jandre
 */
public class Main {
    public static void main(String[] args)
    {
        Employee Bill = new Employee(123, "Programmer");
        Employee Ted = new Employee(-2, "Inferior Graphics Designer");
        
        Bill.show();
        Ted.show();
        
        System.out.println(Employee.getNumOfEmployees());
    }
}
