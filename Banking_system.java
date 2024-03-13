import java.util.Scanner;

class Bank{
    Scanner sc=new Scanner(System.in);
    double balence=20000;
    public Bank(){
        System.out.println("Welcome into Bank...");
            System.out.println("Menu.");
            System.out.println("press-1-->Checking Balance.");
            System.out.println("press-2-->Deposits");
            System.out.println("press-3-->Withdraw");
            System.out.println("press-4-->Exiting");


    }

    public void checking_balance(){
        System.out.println("Total Balance: "+balence);
    }
    public void Deposits(){
        System.out.print("Enter the amount: ");
        double a=sc.nextDouble();
        balence=balence+a;
        System.out.println("Deposits successful...");
    }
    public void Withdraw(){
        System.out.print("Enter the withdrawal amount: ");
        double b=sc.nextDouble();
        if(b>balence){
            System.out.println("Amount is not available in account...");
        }else{
            balence=balence-b;
            System.out.println("Withdraw successful...");
        }

    }

}
public class Banking_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();

        while(true){
            System.out.println("*1-Checking Balance.|*2-Deposits.|*3-Withdraw|*4-Exiting");
            System.out.print("Enter(1/2/3/4): ");
            int i=sc.nextInt();
            if(i<4) {
                switch (i) {
                    case 1:
                        bank.checking_balance();
                        break;
                    case 2:
                        bank.Deposits();
                        break;
                    case 3:
                        bank.Withdraw();
                        break;
                }
                System.out.println();
            }
            else if(i==4){
                    System.out.println("thank you...");
                    break;
                }
            else{
                System.out.println("You Enter wrong Input...");
                System.out.println();
            }

        }

    }
}
