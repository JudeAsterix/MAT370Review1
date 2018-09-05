
package review1;

import javax.swing.JOptionPane;

public class Employee {
    private int idNumber;
    private String title;
    private static int numberOfEmployees;
    
    public Employee()
    {
        numberOfEmployees++;
    }
    
    public Employee(int id, String title)
    {
        this.idNumber = id;
        this.title = title;
        numberOfEmployees++;
    }
    
    @Override
    public String toString()
    {
        String s = "";
        s += "ID Number: " + idNumber + "\n";
        s += "Title: " + title + "\n";
        return s;
    }
    
    public void show()
    {
        System.out.println(toString());
    }
    
    public void input()
    {
        this.idNumber = Integer.parseInt(JOptionPane.showInputDialog("Please give the new ID."));
        this.title = JOptionPane.showInputDialog("Please give the new title of employee.");
    }
    
    public static int getNumOfEmployees()
    {
        return numberOfEmployees;
    }
    
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    public void showAll()
    {
    }
}
