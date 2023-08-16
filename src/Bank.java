import java.util.Scanner;

public class Bank {

    private int currentBalance;

    private int accountNumber;
    private int deposit;
    Telephone[] telephones;

    private String name;

    public Bank(){

    }

    public Bank(int currentBalance, int accountNumber, int deposit, String name) {
        this.currentBalance = currentBalance;
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.name = name;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }
    public void payment(String name, int sum) {
        if (name.equals(name)) {
            System.out.println((currentBalance) + sum);
        }}

    public void payment2(String name, int sum) {
        if (name.equals(name)) {
            System.out.println((currentBalance) - sum);
        }}


    public void checkBalance(String name) {
        if (name.equals(name)) {
            System.out.println(currentBalance);
        }
    }
    @Override
    public String toString() {
        return "Bank{" +
                "currentBalance=" + currentBalance +
                ", accountNumber=" + accountNumber +
                ", deposit=" + deposit +
                '}';
    }
}




