import java.util.*;


class ATM{
    float balance;
    int pin = 3454;

    ATM(){
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == pin){
            menu();
        }
        else{
            System.out.println("Entered a valid Pin.");
        }

    }

    // public void checkpin() {
    //     System.out.println("Enter Your Pin: ");
    //     Scanner sc = new Scanner(System.in);
    //     int enteredpin = sc.nextInt();
    //     if(enteredpin == pin){
    //         menu();
    //     }
    //     else{
    //         System.out.println("Entered a valid Pin.");
    //     }
    // }


    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdrawn Money");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            checkBalance();
        }
        else if(choice == 2){
            withdrawnMoney();
        }
        else if(choice == 3){
            depositMoney();
        }
        else if(choice == 4){
            return;
        }
        else{
            System.out.println("Enter a Valid options");
        }
    }


    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawnMoney(){
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance - amount;
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        menu();
    }

}


public class ATM_Machine_oops1 {

    public static void main(String[] args){

        ATM atm = new ATM();
        // atm.checkpin();


    }
    
}
