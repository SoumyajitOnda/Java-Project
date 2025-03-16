import com.bank.manage.customer;
import com.bank.manage.operations;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean running = true;
        while (running) {
            System.out.println("* * * WELCOME TO PUNJAB NATIONAL BANK * * *");
            System.out.println("1.Create account");
            System.out.println("2.Delete account");
            System.out.println("3.Modify account");
            System.out.println("4.Deposit");
            System.out.println("5.Withdraw");
            System.out.println("6.Display accounts");
            System.out.println("7.Exit");

            System.out.println("Choose any one option :: ");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter your name :: ");
                    String name = br.readLine();
                    System.out.println("Enter your age :: ");
                    int age = s.nextInt();
                    System.out.println("Enter your mobile number :: ");
                    String ph_no = br.readLine();
                    System.out.println("Enter your address :: ");
                    String address = br.readLine();
                    System.out.println("Enter initial amount :: ");
                    double bal = s.nextDouble();
                    customer cs = new customer(name, age, ph_no, address, bal);
                    boolean operation_1 = operations.createAcc(cs);
                    if (operation_1) {
                        System.out.println("Account has been created successfully !!!");
                    } else {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 2:
                    System.out.println("Enter your account number :: ");
                    int delete_acc_no = s.nextInt();
                    boolean operation_3 = operations.delete(delete_acc_no);
                    if (operation_3) {
                        System.out.println("Account has been deleted successfully !!!");
                    } else {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 3:
                    System.out.println("Enter your account number :: ");
                    int modify_acc_no = s.nextInt();
                    System.out.println("Enter your original name :: ");
                    String modify_name = br.readLine();
                    boolean operation_2 = operations.modify(modify_name, modify_acc_no);
                    if (operation_2) {
                        System.out.println("your name is modified successfully.");
                    } else {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 4:
                    System.out.println("Enter your account number :: ");
                    int deposit_acc_no = s.nextInt();
                    System.out.println("Enter your amount to deposit :: ");
                    double deposit_amount = s.nextDouble();
                    boolean operation_4 = operations.deposit(deposit_acc_no, deposit_amount);
                    if (operation_4) {
                        System.out.println("Rs. " + deposit_amount + " has been deposited into your account successfully.");
                    } else {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 5:
                    System.out.println("Enter your account number :: ");
                    int withdraw_acc_no = s.nextInt();
                    System.out.println("Enter your amount to withdraw :: ");
                    double withdraw_amount = s.nextDouble();
                    boolean operation_5 = operations.withdraw(withdraw_acc_no, withdraw_amount);
                    if (operation_5) {
                        System.out.println("Rs. " + withdraw_amount + " has been withdrawn from your account successfully.");
                    } else {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 6:
                    operations.display();
                    break;
                case 7:
                    System.out.println("Thank you !!!");
                    System.out.println("See you again.....");
                    running = false;
                    break;
                default:
                    System.out.println("You have entered invalid option");
                    break;
            }
        }
    }
}
