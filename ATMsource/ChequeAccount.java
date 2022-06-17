class ChequeAccount extends Account{
    private int chequelimit = 10000;
    
    public ChequeAccount( int theAccountNumber,int AccountType, int thePIN, 
      double theAvailableBalance, double theTotalBalance ,int day, int month, int year)
   {
      super(theAccountNumber, AccountType, thePIN, theAvailableBalance, theTotalBalance, day, month, year);
   }

    //override
   public int getlimit(){
    return chequelimit;
    }
}
