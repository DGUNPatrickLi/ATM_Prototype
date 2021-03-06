import javax.swing.JFrame;

public class ATMCaseStudy
{
   // main method creates and runs the ATM
   public static void main( String[] args )
   {
      ATM atm = new ATM();
      atm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      atm.setBounds(700 ,100,500,700);
      atm.setVisible(true);
   } // end main
} // end class ATMCaseStudy 



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