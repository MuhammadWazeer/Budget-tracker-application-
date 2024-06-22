public class Transaction {
    private string type;
    private double amount;
    private string description;
    public Transaction (string type, double amount, string description )
    {
        this.type=type;
        this.amount=amount;
        this.description=description;
    }
    public string getType()
    {
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public string getDescription(){
        return description;
    }
    public string toString(){
        return type+":$"+amount+"("+description+")";
    }
}

public class BudgetTracker{
    private ArrayList<Transaction>transaction;
    public BudgetTracker(){
        this.transaction=new ArrayList<>();
    } 
    public void addTransaction(Transaction transaction){
        transaction.add(transaction );
    }
    public double getCurrentBalance
(){
    double balance=0.0;
    for(Transaction transaction: transaction){
        if(transaction.getType(). equals("income")){
            balance+=transaction.getAmount();
        }
        else if(transaction.getType(). equals("expense")){
            balance -=transaction.getAmount();
        }
    }
    return balance;
}
  public void  showsummary (){
      system.out.println("Transaction summary ");
      for(Transaction transaction: transactions){
          system.out.println(transaction );
      }
      system.out.println("current Balance:$"+getCurrentBalance());
  }
}

public class Main{
    public static void main(string []args){
        Scanner scanner=new Scanner (system.in);
        BudgetTracker budgeTracker=new BudgetTracker();
        while (true ){
          system.out.println("1.Add Income");
          system.out.println("2.Investment in Business ");
          system.out.println("3.Home Expenses ");
          system.out.println("4.Marketing");
          system.out.println("5.Office rent");
          system.out.primtln("6.Entertainment");
          system.out.primtln("7.For Food");
          system.out.println("8.Total Expenses");
          system.out.println("9.Monthly Savings");
          system.out.println("10.View Summary ");
          system.out.primtln("11.Remaining Budget ");
          system.out.println("12.Exit ");
          system.out.primtln("Choose an option ");
          int choice=scanner.nextInt();
          scanner.nextLine();
          if (choice==1){
              system.out.print("Enter amount ");
              double amount=scanner.nextDouble();
              scanner.nextLine();
              system.out.print("Enter description ");
              string description=scanner.nextLine();
 budget Tracker.addTransection(new transaction ("expenses", amount, description));
          }
          else if(choice==2){
              system.out.print("Enter amount");
              double amount=scanner.nextDouble();
              scanner.nextLine();
              system.out.print("Enter description ");
              string description=scanner.nextLine(); budgetTracker.addTrasaction(new Transaction("expense", amount, description)); 
          }
          else if (choice==3)
          {
              budgetTracker.showSummary ();
          }
          else if (choice==4)
          {
              System.out.println("existing ");
              break;
              
          }
          else{
              system.out.println("Invalid choice.please try again");
          }
        }
        scanner.close();
    }
}
