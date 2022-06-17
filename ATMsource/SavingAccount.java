class SavingAccount extends Account{
    private double interestrate=0.001;
public SavingAccount( int theAccountNumber,int AccountType, int thePIN, 
      double theAvailableBalance, double theTotalBalance ,int day, int month, int year)
   {
      super(theAccountNumber, AccountType, thePIN, theAvailableBalance, theTotalBalance, day, month, year);
   }
 
   public double getinterestrate(){
    return interestrate;
    }
}