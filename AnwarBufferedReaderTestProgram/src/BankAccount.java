public class BankAccount
{
    String Name;
    int Account;
    float Balance;
    
     
       
        BankAccount(String name, float deposit, int acc)
        {
            this.Name = name;
            this.Account = acc;
            this.Balance = deposit;
        }
    
    
     // Getter
      public String getOwner() 
      {
        return Name;
      }
      
      public int getAccountNumber()
      {
          return Account;
      }
      
      public float getBalance()
      {
          return Balance;
      }
      
   
        public String toString()
        {
            return "Account #" + Account + " with $" + Balance;
        }
}