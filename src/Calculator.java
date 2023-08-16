import java.util.Scanner;

public class Calculator {


    public Calculator() {

    }

    public int addition() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            int num1 = scanner1.nextInt();
            int cal;
            switch (num1) {
                case 1:
                    cal = 2 + 2;
                    System.out.println(cal);
                case 2:

                    cal = 2 * 2;
                    System.out.println(cal);

                case 3:
                    cal = 10 / 2;
                    System.out.println(cal);


            }
        }

    }


}