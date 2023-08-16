import com.sun.source.tree.YieldTree;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank(345, 7889, 56, "Mbank");
        Bank bank1 = new Bank(1500, 345, 90, "Kaspi");

        Notes notes = new Notes("Pink venom", "Becoming", 11);
        Notes notes1 = new Notes("Flowers", "Poor dad", 10);
        Notes notes2 = new Notes("Forever young", "Java", 9);
        Notes notes3 = new Notes("Under moonlight", "Rich dad", 8);
        Notes notes4 = new Notes("Song", "Nature", 6);
        Notes notes5 = new Notes("lalisa", "World", 3);
        Notes notes6 = new Notes("Shut Down", "About me", 4);

        Notes[] notes77 = {notes, notes1, notes2};
        Notes[] notes7 = {notes3, notes4, notes5};

        Calculator calculator = new Calculator();


        Telephone telephone1 = new Telephone(bank1, "Iphone", notes77);
        Telephone telephone = new Telephone(bank, "Samsung", notes7);




        Scanner scanner = new Scanner(System.in);
        while (true) {
            String n = scanner.next();
            if (n.contains("Menu")) {
                System.out.println("Welcome to Menu");
                System.out.println("1. notes");
                System.out.println("2. bank");
                System.out.println("3. calculator");
                System.out.println("4. exit");

            } else if (n.contains("Notes")) {
                notes.getAll(notes77);
                System.out.println(Arrays.toString(telephone.addNotes2(notes6)));
                System.out.println(telephone1.updateInfo("Poor dad", 67));

                System.out.println("-----------------------------------");
                telephone.deleteBook22("World", "World");
                telephone1.deleteBook22("Java", "Java");



            } else if (n.contains("Bank")) {
                System.out.println("Welcome to bank");
                System.out.println("Choose Yes if you have and No if you don't have account");

                Scanner scan = new Scanner(System.in);
                while (true) {

                    String num = scan.next();
                    switch (num) {

                        case "No":
                            if (num.contains("No")) {
                                System.out.println("Registration ");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.print("First and last name: ");
                                String data = scanner1.nextLine();
                                System.out.print("The email: ");
                                String data1 = scanner1.nextLine();
                                System.out.print("INN: ");
                                int data2 = scanner1.nextInt();
                                System.out.print("Age: ");
                                int age = scanner1.nextInt();
                                System.out.print("The number of phone:");
                                String phoneNmber = scanner1.next();
                                System.out.print("Login: ");
                                int password = scanner1.nextInt();
                                System.out.println("Put your login to get access to your account");
                                int password1 = scanner1.nextInt();
                                if (password1 != password) {
                                    System.out.println("Put correct password");
                                } else {

                                    System.out.println("1. Transfer");
                                    System.out.println("2. Checking balance");
                                    System.out.println("3. Getting credit");
                                    System.out.println("4. Exit");
                                }
                            }
                        case "Yes":

                            if (num.contains("Yes")) {
                                System.out.println("1. Transfer");
                                System.out.println("2. Checking balance");
                                System.out.println("3. Getting credit");
                                System.out.println("4. Exit");
                            }
                            while (true) {
                                int l = scan.nextInt();
                                switch (l) {
                                    case 1:
                                        if (l == 1) {
                                            System.out.println("Transfer");
                                            System.out.print("Put the number of user account to transfer: ");
                                            String account = scan.next();
                                            if (account.contains("12345676543")) {
                                                System.out.println("The user is detected");
                                                System.out.println("How many would you like to transfer");
                                                System.out.print("Put the sum of money to transfer: ");
                                                scan.nextInt();
                                                bank1.payment2("Kaspi", 500);
                                            }
                                        }
                                    case 2:
                                        if (l == 2) {
                                            System.out.println("Checking balance");
                                            System.out.println(bank1.getCurrentBalance());
                                        }
                                    case 3:
                                        if (l == 3) {
                                            System.out.println("Getting credit");
                                            bank1.payment("Mbank", 1000);
                                        }
                                        //break;
                                        // case 4:
                                        //System.exit(0);
                                }
                            }
                    }
                }
            }

                else if (n.contains("Calculator")){
                calculator.addition();
            }

        }
    }
}












