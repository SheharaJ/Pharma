
/**
Employee information window will let admin add new employees, view existing ones delete and add managers
*/
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class EmployeeInfo extends javax.swing.JFrame {

   
    
    public EmployeeInfo() {
        initComponents();
    }
Connection Con=null;
PreparedStatement St=null;

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        EID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pwd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hours = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showbutton = new javax.swing.JButton();
        addmanager = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Hours", "Age", "Password", "Salary"
            }
        ));
        jScrollPane1.setViewportView(etable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("ID");

        EID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDActionPerformed(evt);
            }
        });
        EID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EIDKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Number of Hours");

        hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addbtn.setText("Add Employee");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Delete Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        showbutton.setBackground(new java.awt.Color(255, 255, 255));
        showbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showbutton.setText("View Employee");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });

        addmanager.setBackground(new java.awt.Color(255, 255, 255));
        addmanager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addmanager.setText("Add Manager");
        addmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmanagerActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 255, 255));
        clearbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Employee Information");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("<Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(addbtn)
                            .addGap(18, 18, 18)
                            .addComponent(addmanager))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(clearbtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(showbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showbutton)
                            .addComponent(jButton2))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(addmanager))
                        .addGap(18, 18, 18)
                        .addComponent(clearbtn))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
      
              ValidationsEmployee v=new ValidationsEmployee(EID,hours,name,age,pwd);
              
              if(v.emptyField() != true && v.nameField()!=true && v.numberField()!=true)
        {

           
            try 
            {
                
            // v.emptyField();
            // v.nameField();
            // v.numberField();
 
               
                String path="jdbc:mysql://localhost:3306/pharmacy";
                
                Connection con = DriverManager.getConnection(path,"root",""); 
                Statement st=con.createStatement();
                SalesPerson sp=new SalesPerson(EID,hours,name,age,pwd);
                sp.calculateIncome();
                //sp.setSalary();
                
                String query = "insert into employee(ID, Name, Age, Password, Hours,Income)" + "values(" + "'"
                        + EID.getText() + "','"
                        + name.getText()+ "','"
                        + age.getText()+ "','"
                        + pwd.getText() + "','"
                        + hours.getText() +"','"
                         + sp.setSalary()+
                        "')" ;
                
                
               
                st.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Employee created succesfully");
                
                
            }
        
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            
            JOptionPane.showMessageDialog(null,"Please enter only requested data type!");
        }
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hoursActionPerformed

    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed
        // TODO add your handling code here:
        
            String path="jdbc:mysql://localhost:3306/pharmacy";
              
              
              
            try (Connection con = DriverManager.getConnection(path,"root",""))
            {
                Statement st=con.createStatement();
                
                ResultSet rst=st.executeQuery("select * from employee where ID='" + EID.getText()+"'");
                
                
                ArrayList employeelist=new ArrayList <>(); 
                
                while(rst.next())
                {
                employeelist.add(rst.getString(1));
                employeelist.add(rst.getString(2));
                employeelist.add(rst.getInt(3));
                employeelist.add(rst.getString(4));
                employeelist.add(rst.getInt(5));
                employeelist.add(rst.getInt(6));
                
                
                DefaultTableModel model=(DefaultTableModel)etable.getModel();
                Object[] row=new Object[6];
               // for(int i=0;i<employeelist.size();i++)
                //{
                    row[0]=employeelist.get(0);
                    row[1]=employeelist.get(1);
                    row[2]=employeelist.get(2);
                    row[3]=employeelist.get(3);
                    row[4]=employeelist.get(4);
                    row[5]=employeelist.get(5);
                    model.addRow(row);
                    
                }   
                    
                //}
                
                
                
                con.close();
               
            }
                 
         
       
         catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            //System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_showbuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
         
             String path="jdbc:mysql://localhost:3306/pharmacy";
             try (Connection con = DriverManager.getConnection(path,"root","")) {
                 Statement st=con.createStatement();
                 
                 //con=ConnectionConfiguration.getConnection();
                 //PreparedStatement pst= con.prepareStatement("delete from employee where"+EID.getText());
                 //pst.setInt(1,);
                 st.executeUpdate("delete from employee where ID='"+EID.getText()+"'");
                 
                 JOptionPane.showMessageDialog(null,"Employee Deleted succesfully");
                 con.close();
             }
             
         
         
        
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Please enter again");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
                             EID.setText("");
                             name.setText("");
                             age.setText("");
                            pwd.setText("");
                            hours.setText("");
        
    }//GEN-LAST:event_clearbtnActionPerformed

    private void EIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIDActionPerformed
        // TODO add your handling code here:
        
         
    }//GEN-LAST:event_EIDActionPerformed

    private void addmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmanagerActionPerformed
        // TODO add your handling code here:
         try 
            {
               ValidationsEmployee v=new ValidationsEmployee(EID,hours,name,age,pwd);
             v.emptyField();
             v.nameField();
             v.numberField();
 
               
                String path="jdbc:mysql://localhost:3306/pharmacy";
                
                Connection con = DriverManager.getConnection(path,"root",""); 
                Statement st=con.createStatement();
                
                
                Manager m=new Manager(EID,hours,name,age,pwd);
                m.calculateIncome();
                
                String query = "insert into manager(Mid, MName,Mage,Mpwd,Mhours,Msalary)" + "values(" + "'"
                        + EID.getText() + "','"
                        + name.getText()+ "','"
                        + age.getText()+ "','"
                        + pwd.getText() + "','"
                        + hours.getText() +"','"
                         + m.setSalary()+
                        "')" ;
                
                
                JOptionPane.showMessageDialog(null,"Manager created succesfully");
                st.executeUpdate(query);
                
                
                
            }
        
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            
            JOptionPane.showMessageDialog(null,"Please enter only requested data type!");
        }
        
    }//GEN-LAST:event_addmanagerActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        //this.toBack();
        Admin a=new Admin();
        a.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void EIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EIDKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_EIDKeyTyped

    private void EIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EIDKeyReleased
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_EIDKeyReleased

   
  
    
    public static void main(String args[]) 
    {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EID;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addmanager;
    private javax.swing.JTextField age;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTable etable;
    private javax.swing.JTextField hours;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pwd;
    private javax.swing.JButton showbutton;
    // End of variables declaration//GEN-END:variables

   
}
