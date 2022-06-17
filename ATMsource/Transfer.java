// Deposit.java
// Represents a deposit ATM transaction

public class Transfer extends Transaction
{
   private double amount; // amount to deposit
   private int AccountNumber;
   private int AccountType;
   private Keypad keypad; // reference to keypad
   boolean PassAccountNumber;
   boolean PassAccountType;
   private final static int CANCELED = 0; // constant for cancel option
   // Deposit constructor
   public Transfer( int userAccountNumber,int AccountType, Screen atmScreen, 
      BankDatabase atmBankDatabase, Keypad atmKeypad)
   {
      // initialize superclass variables
      super( userAccountNumber, AccountType, atmScreen, atmBankDatabase );

      // initialize references to keypad and deposit slot
      keypad = atmKeypad;
   } // end Deposit constructor

   // perform transaction
   public void execute()
   {
      boolean exitoftransfer = false;
      BankDatabase bankDatabase = getBankDatabase(); // get reference
      Screen screen = getScreen(); // get reference
      double availableBalance; // amount available for transfer
      do{
      amount = promptForDepositAmount(); // get deposit amount from user

      // check whether user entered a deposit amount or canceled
      if ( amount != CANCELED )
      {
        availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() , getAccountType());
        if ( amount <= availableBalance ){
        while(!PassAccountNumber){
            screen.displayMessage("\nPlease type an Account Number that will receive:");
            AccountNumber = keypad.getInput();
            PassAccountNumber=bankDatabase.authenticateUser(AccountNumber);
        }
        while(!PassAccountType){
            screen.displayMessageLine( "1 - Saving Account" );
            screen.displayMessageLine( "2 - Cheque Account" );
            screen.displayMessage("\nPlease choose the type of your account: ");
            AccountType = keypad.getInput();
            if((AccountType == 2) || (AccountType == 1)){
                if(AccountType == 2){
            PassAccountType = bankDatabase.authenticateType(AccountNumber, AccountType);
        }
            else{
            PassAccountType = true;
            }
        }
        }
        bankDatabase.debit(getAccountNumber(), getAccountType(), amount );
        bankDatabase.credit(AccountNumber, AccountType, amount);
        exitoftransfer = true;
    }
      } // end if 
      else // user canceled instead of entering amount
      {
         screen.displayMessageLine( "\nCanceling transaction..." );
         return;
      } // end else
    }while(!exitoftransfer);
   } // end method execute

   // prompt user to enter a deposit amount in cents 
   private double promptForDepositAmount()
   {
      Screen screen = getScreen(); // get reference to screen

      // display the prompt
      screen.displayMessage( "\nPlease enter a transfer amount in " + 
         "cents (or 0 to cancel): " );
      int input = keypad.getInput(); // receive input of deposit amount
      
      // check whether the user canceled or entered a valid amount
      if ( input == CANCELED ) 
         return CANCELED;
      else
      {
         return ( double ) input/ 100; // return dollar amount 
      } // end else
   } // end method promptForDepositAmount

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