
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
public class Manager implements Employee
{
    private final int  incentive_rate=2500;
    private String Mid,Mname,Mpwd;
    private int Msalary,Mhours,Mage;
    

    public Manager(JTextField EID, JTextField hours, JTextField name, JTextField age, JTextField pwd) {
       // super(EID, hours, name, age, pwd);
        this.Mid= EID.getText();
        this.Mhours=Integer.parseInt(hours.getText());
        this.Mname=name.getText();
        this.Mage=Integer.parseInt(age.getText());
        this.Mpwd=pwd.getText();
    
    }
  

    @Override
    public void calculateIncome() {
        
       Msalary=incentive_rate*Mhours;
    }
    
    public int setSalary()
    {
        return Msalary;
    
    }
    
    
}
