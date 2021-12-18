import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in)  ;
      double balance = 5423.00 , deposit, withdrawal ;
      int transaction;
      System.out.println("WelCome to Our Bank");
      System.out.println("Widhdrawal cash : 1");
      System.out.println("Make a Deposit : 2");
      System.out.println("Check your balance : 3");
      System.out.println("Exit : 4");
      System.out.print("transaction number : ");
      transaction = input.nextInt();
      switch (transaction){
        case 1 :
          System.out.println("Enter Amount");
          withdrawal = input .nextDouble();
          if(withdrawal > balance)
              System.out.println("infuiant Amount");
          else{
            balance -= withdrawal;
            System.out.println("You new Balance is Rs" + balance);
          }
        break;
        case 2:
           System.out.println("enter amout of deposit");
           deposit = input.nextDouble();
           balance += deposit;
           System.out.println("You new Balance is Rs" + balance);
        break;
        case 3:
        System.out.println("You Balance is Rs" + balance);
        break;
        case 4 :
        System.out.println("Thank you See you next transaction");
        break;
        default:
        System.out.println("Invalid transaction");
      }

    }
}
