
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ABC
 */
public class SalesPerson implements Employee {

    private String ID,name,password;
    private int salary, number_hours,age;
    private final int hourly_income=200;

    SalesPerson(JTextField EID, JTextField hours, JTextField name, JTextField age, JTextField pwd) {
         
        this.ID= EID.getText();
        this.number_hours=Integer.parseInt(hours.getText());
        this.name=name.getText();
        this.age=Integer.parseInt(age.getText());
        this.password=pwd.getText();
    
        
    }
    
    
    
    @Override
    public void calculateIncome()
    {
         salary=number_hours*hourly_income;      
         
          
    }
    

   public int setSalary()
   {
       return salary;
   }
          
   
    
}
