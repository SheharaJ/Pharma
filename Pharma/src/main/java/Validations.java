import javax.swing.*;


/*
validate class will validate the fields of medicine information dashboard
 */


public class Validations {


   
    private final String MID;

    private final String Mname,Mprice,Mquantity,Company;
    
           
    public Validations(JTextField MID, JTextField Mname,JTextField Mprice,JTextField Mquantity,JComboBox Company)
   {
       this.MID=MID.getText();
       this.Mname=Mname.getText();
       this.Mprice=Mprice.getText();
       this.Mquantity=Mquantity.getText();
       this.Company=(String) Company.getSelectedItem();
        
    }
    
    public boolean emptyField()
    {
        if (MID.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"ID cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            
            return true;
        }
        else if (Mname.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Name cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        else if(Mprice.equals("")) {
            JOptionPane.showMessageDialog(null,"Price cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        } 
        else if(Mquantity.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Quantity cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return true;
            
        }
        else if(Company.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please select a Company","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        
        return false;
        
    }
   public boolean nameField()
    {
     if(!MID.matches("[a-zA-Z_]+"))
        {
             JOptionPane.showMessageDialog(null,"Cannot enter numbers to ID ","Error",JOptionPane.ERROR_MESSAGE);
             return true;
        }
     else if(!Mname.matches("[a-zA-Z_]+"))
        {
            JOptionPane.showMessageDialog(null,"Cannot enter numbers to Name","Error",JOptionPane.ERROR_MESSAGE);
            return true;
             }
     return false;
    }
   public boolean numberField()
   {
      
           if(!Mquantity.matches("[0-9]+"))
           {
               JOptionPane.showMessageDialog(null,"Enter only numbers to quantity","Error",JOptionPane.ERROR_MESSAGE);
               return true;
           }
      
      else if (!Mprice.matches("[0-9]+")){
           JOptionPane.showMessageDialog(null,"Enter only numbers to price","Error",JOptionPane.ERROR_MESSAGE);
           return true;
        }
           return false;
   }
    
}
