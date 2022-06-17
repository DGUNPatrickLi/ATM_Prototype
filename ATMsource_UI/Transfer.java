import java.util.regex.Pattern;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
    
// Deposit.java
// Represents a deposit ATM transaction
    
public class Transfer extends Transaction
{
    private int AccountNumber;
    private int AccountType;
    private BankDatabase bankDatabase;
    private static final Pattern PATTERN = Pattern.compile("^(([1-9]{1}\\d*)|(0{1}))(\\.\\d{1,2})?$");
       
    private JFrame ftransfer;
    private JPanel Main;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private CardLayout c3;
    private JTextArea a1;
    private JTextArea a2;
    private JTextArea a3;
    private JTextField t1;
    private JTextField t2;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bCancel1, bClear1, bEnter1, bnull1, bnull2, bnull3;
    private JButton savingbutton, chequebutton;
    private JButton bzero, bone, btwo, bthree, bfour, bfive, bsix, bseven, beight, bnine, bCancel2, bClear2, bEnter2, bnull4, bnull5, bpoint;
    private String Message1;
    private String Message2;
    private String Message3;
       
        // Deposit constructor
    public Transfer( int userAccountNumber,int AccountType, BankDatabase atmBankDatabase )
    {
        // initialize superclass variables
        super( userAccountNumber, AccountType, atmBankDatabase );
    } // end Deposit constructor
    
       // perform transaction
    public void execute()
    {
        BankDatabase bankDatabase = getBankDatabase(); // get reference
        
        ftransfer = new JFrame("Transfer");
        ftransfer.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ftransfer.setBounds(700 ,100,500,700);
        ftransfer.setVisible(true);
          
        c3 = new CardLayout();
          
        Main = new JPanel();
        ftransfer.add(Main);
          
        Main.setLayout(c3);
          
        p1 = new JPanel();
        Main.add(p1,"1");
          
        p2 = new JPanel();
        Main.add(p2,"2");
          
        p3 = new JPanel();
        Main.add(p3,"3");
          
        c3.show(Main,"1");
          
        Message1 = "Please type an Account Number that will receive: \n" + "Click the \"CANCEL\" button will back to the Main Menu.";
        a1 = new JTextArea(Message1, 22 , 55);
        a1.setEditable(false);
          
        t1 = new JTextField(50);
        t1.setEditable(false);
          
        b0 = new JButton("0"); 
        b0.setPreferredSize(new Dimension(90,50));
        b0.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "0";
                t1.setText(EnterNumber);
            }
        }
        );
            
        b1 = new JButton("1"); 
        b1.setPreferredSize(new Dimension(90,50));
        b1.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "1";
                t1.setText(EnterNumber);
            }
        }   
        );
        
        b2 = new JButton("2"); 
        b2.setPreferredSize(new Dimension(90,50));
        b2.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "2";
                t1.setText(EnterNumber);
            }
        }
        );
      
        b3 = new JButton("3"); 
        b3.setPreferredSize(new Dimension(90,50));
        b3.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "3";
                t1.setText(EnterNumber);
            }
        }
        );
        
        b4 = new JButton("4");
        b4.setPreferredSize(new Dimension(90,50));
        b4.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "4";
                t1.setText(EnterNumber);
            }
        }
        );
        
        b5 = new JButton("5"); 
        b5.setPreferredSize(new Dimension(90,50));
        b5.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "5";
                t1.setText(EnterNumber);
            }
        }
        );
        
        b6 = new JButton("6"); 
        b6.setPreferredSize(new Dimension(90,50));
        b6.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "6";
                t1.setText(EnterNumber);
            }
        }
        );
        
        b7 = new JButton("7"); 
        b7.setPreferredSize(new Dimension(90,50));
        b7.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "7";
                t1.setText(EnterNumber);
            }
        }
        );
        
        b8 = new JButton("8"); 
        b8.setPreferredSize(new Dimension(90,50));
        b8.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "8";
                t1.setText(EnterNumber);
            }
        }
        );
        
        b9 = new JButton("9"); 
        b9.setPreferredSize(new Dimension(90,50));
        b9.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t1.getText() + "9";
                t1.setText(EnterNumber);
            }
        }
        );
        
        bCancel1 = new JButton("CANCEL");
        bCancel1.setBackground(Color.RED);
        bCancel1.setPreferredSize(new Dimension(170,50));
        bCancel1.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                ftransfer.setVisible(false);
            }
        }
        );
        
        bClear1 = new JButton("CLEAR"); 
        bClear1.setBackground(Color.YELLOW);
        bClear1.setPreferredSize(new Dimension(170,50));
        bClear1.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                t1.setText("");
            }
        }
        );
        
        bEnter1 = new JButton("ENTER");
        bEnter1.setBackground(Color.GREEN);
        bEnter1.setPreferredSize(new Dimension(170,50));
        bEnter1.addActionListener( new ActionListener()
        {
            public void actionPerformed ( ActionEvent event ) 
            {                
                AccountNumber = Integer.parseInt(t1.getText());
                if ( bankDatabase.authenticateUser( AccountNumber ) )
                {
                    c3.show( Main, "2" );
                }
                else
                {
                    JOptionPane.showMessageDialog(ftransfer, "Ivalid input.\n" + "Please try again." );
                    t1.setText( "" );
                }
            }
        }
        );
        
        bnull1 = new JButton(" ");
        bnull1.setPreferredSize(new Dimension(90,50));
        
        bnull2 = new JButton(" ");
        bnull2.setPreferredSize(new Dimension(90,50));
      
        bnull3 = new JButton(" ");
        bnull3.setPreferredSize(new Dimension(170,50));
      
        p1.add(a1); 
        p1.add(t1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(bCancel1);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(bClear1);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(bEnter1);
        p1.add(bnull1);
        p1.add(b0);
        p1.add(bnull2);
        p1.add(bnull3);
      
        Message2 = "Account Type\n" + "1 - Saving Account\n" + "2 - Cheque Account\n" + "Which account you want to transfer";
        a2 = new JTextArea(Message2,22,55);
        a2.setEditable(false);
      
        savingbutton = new JButton("Saving Account");
        savingbutton.setPreferredSize(new Dimension(220, 70));
        savingbutton.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                AccountType = 1;
                AccountNumber = Integer.parseInt(t1.getText());
                if ( AccountNumber == getAccountNumber() && AccountType == getAccountType() )
                {
                    JOptionPane.showMessageDialog( ftransfer, "You can not transfer to the current account." );
                }
                else if ( bankDatabase.getAvailableBalance( getAccountNumber(), getAccountType() ) <= 0 )
                {
                    JOptionPane.showMessageDialog( ftransfer, "Insufficient balance." );
                }
                else
                {
                    JOptionPane.showMessageDialog(ftransfer,"You have choosed Saving Account.");
                    if(JOptionPane.showConfirmDialog(ftransfer, "Confirm the account to transfer?","ABC Bank", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
                    {
                        c3.show(Main,"3");
                    }
                }
            }
        }
        );
      
        chequebutton = new JButton("Cheque Account");
        chequebutton.setPreferredSize(new Dimension(220, 70));
        chequebutton.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                AccountType = 2;
                AccountNumber = Integer.parseInt(t1.getText());
                if ( AccountNumber == getAccountNumber() && AccountType == getAccountType() )
                {
                    JOptionPane.showMessageDialog(ftransfer,"You can not transfer to the current account.");
                }
                else if ( bankDatabase.getAvailableBalance( getAccountNumber(), getAccountType() ) <= 0 )
                {
                    JOptionPane.showMessageDialog(ftransfer,"Insufficient balance.");
                }
                else
                {
                    if ( bankDatabase.authenticateType( AccountNumber, AccountType ) )
                    {
                        JOptionPane.showMessageDialog(ftransfer,"You have choosed the Cheque Account.");
                        if(JOptionPane.showConfirmDialog(ftransfer, "Confirm the account to transfer?","ABC Bank", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
                        {
                            c3.show(Main,"3");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(ftransfer,"You do not have the cheque account.");
                    }
                }
            }
        }
        );
      
        p2.add(a2);
        p2.add(savingbutton);
        p2.add(chequebutton);

        Message3 = "Please type a transfer HKD amount: \n" + "Click the \"CANCEL\" button will back to the Main Menu.";
        a3 = new JTextArea(Message3,22,55);
        a3.setEditable(false);
      
        t2 = new JTextField(50);
        t2.setEditable(false);
      
        bzero = new JButton("0"); 
        bzero.setPreferredSize(new Dimension(90,50));
        bzero.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "0";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bone = new JButton("1"); 
        bone.setPreferredSize(new Dimension(90,50));
        bone.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "1";
                t2.setText(EnterNumber);
            }
        }
        );
        
        btwo = new JButton("2"); 
        btwo.setPreferredSize(new Dimension(90,50));
        btwo.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "2";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bthree = new JButton("3"); 
        bthree.setPreferredSize(new Dimension(90,50));
        bthree.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "3";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bfour = new JButton("4");
        bfour.setPreferredSize(new Dimension(90,50));
        bfour.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "4";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bfive = new JButton("5"); 
        bfive.setPreferredSize(new Dimension(90,50));
        bfive.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "5";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bsix = new JButton("6"); 
        bsix.setPreferredSize(new Dimension(90,50));
        bsix.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "6";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bseven = new JButton("7"); 
        bseven.setPreferredSize(new Dimension(90,50));
        bseven.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "7";
                t2.setText(EnterNumber);
            }
        }
        );
        
        beight = new JButton("8"); 
        beight.setPreferredSize(new Dimension(90,50));
        beight.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "8";
                t2.setText(EnterNumber);
            }
        }
        );
        
        bnine = new JButton("9"); 
        bnine.setPreferredSize(new Dimension(90,50));
        bnine.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + "9";
                t2.setText(EnterNumber);
            }
        }
        );
      
        bCancel2 = new JButton("CANCEL");
        bCancel2.setBackground(Color.RED);
        bCancel2.setPreferredSize(new Dimension(170,50));
        bCancel2.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                ftransfer.setVisible(false);
            }
        }
        );
        
        bClear2 = new JButton("CLEAR"); 
        bClear2.setBackground(Color.YELLOW);
        bClear2.setPreferredSize(new Dimension(170,50));
        bClear2.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                t2.setText("");
            }
        }
        );
        
        bEnter2 = new JButton("ENTER");
        bEnter2.setBackground(Color.GREEN);
        bEnter2.setPreferredSize(new Dimension(170,50));
        bEnter2.addActionListener( new ActionListener()
        {
            public void actionPerformed ( ActionEvent event ) 
            {
                AccountNumber = Integer.parseInt(t1.getText());
                String amount = t2.getText();
                if ( PATTERN.matcher(amount).matches() ) 
                {   
                    double i = Double.parseDouble(t2.getText());
                    if ( i > bankDatabase.getAvailableBalance( getAccountNumber(), getAccountType() ) )
                    {
                        JOptionPane.showMessageDialog( ftransfer,"Insufficient balance" );
                        t2.setText("");
                    }
                    else if ( i > bankDatabase.getlimit( getAccountNumber(), getAccountType() ) && getAccountType() == 2 )
                    {
                        JOptionPane.showMessageDialog( ftransfer,"Over cheque limit" );
                        t2.setText("");
                    }
                    else
                    {
                        bankDatabase.debit( getAccountNumber(), getAccountType(), i );
                        bankDatabase.credit( AccountNumber, AccountType, i );
                        JOptionPane.showMessageDialog( ftransfer,"Transfer sucessful" );
                        t1.setText( "" );
                        t2.setText( "" );
                        ftransfer.setVisible( false );
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog( ftransfer, "Ivalid input.\n" + "Please try again." );
                    t2.setText( "" );
                }      
            }
        }
        );
      
        bnull4 = new JButton(" ");
        bnull4.setPreferredSize(new Dimension(90,50));
        
        bpoint = new JButton(".");
        bpoint.setPreferredSize(new Dimension(90,50));
        bpoint.addActionListener( new ActionListener()
        {
            public void actionPerformed (ActionEvent event)
            {
                String EnterNumber = t2.getText() + ".";
                t2.setText(EnterNumber);
            }
        }
        );
      
        bnull5 = new JButton(" ");
        bnull5.setPreferredSize(new Dimension(170,50));
                       
        p3.add(a3);
        p3.add(t2);
        p3.add(bone);
        p3.add(btwo);
        p3.add(bthree);
        p3.add(bCancel2);
        p3.add(bfour);
        p3.add(bfive);
        p3.add(bsix);
        p3.add(bClear2);
        p3.add(bseven);
        p3.add(beight);
        p3.add(bnine);
        p3.add(bEnter2);
        p3.add(bnull4);
        p3.add(bzero);
        p3.add(bpoint);
        p3.add(bnull5);
    } // end method execute
} // end class Deposit




/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/