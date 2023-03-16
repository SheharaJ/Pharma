import javax.swing.*;

/*
 * this class is used to validate fields of the employee info frame
 */



public class ValidationsEmployee {

    private final String eid,hours,name,age,pwd;
    public ValidationsEmployee(JTextField EID, JTextField hours,JTextField name,JTextField age,JTextField pwd)
    {
        this.eid=EID.getText();
        this.hours=hours.getText();
        this.name=name.getText();
        this.age=age.getText();
        this.pwd=pwd.getText();
    }
    public boolean emptyField()
    {
        if (eid.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"ID cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        else if (hours.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Hours cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        else if (name.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Name cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        else if (age.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Age cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        else if (pwd.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Password cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
       else
            return false;
    }
        
         public boolean nameField()
    {
     if(!eid.matches("[a-zA-Z_]+"))
        {
             JOptionPane.showMessageDialog(null,"Cannot enter numbers to ID ","Error",JOptionPane.ERROR_MESSAGE);
             return true;
        }
     else if(!name.matches("[a-zA-Z_]+"))
        {
            JOptionPane.showMessageDialog(null,"Cannot enter numbers to Name","Error",JOptionPane.ERROR_MESSAGE);
            return true;
             }
     else if(!pwd.matches("[a-zA-Z_]+"))
        {
            JOptionPane.showMessageDialog(null,"Cannot enter numbers to Name","Error",JOptionPane.ERROR_MESSAGE);
            return true;
             }
     return false;
     
    }
         
         public boolean numberField()
   {
      
           if(!hours.matches("[0-9]+"))
           {
               JOptionPane.showMessageDialog(null,"Enter only numbers to hours","Error",JOptionPane.ERROR_MESSAGE);
               return true;
           }
      
      else if (!age.matches("[0-9]+")){
           JOptionPane.showMessageDialog(null,"Enter only numbers to price","Error",JOptionPane.ERROR_MESSAGE);
           return true;
        }
           return false;
   }
   
}
