package Homework;
import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void getCalculation() {
        boolean stopCalculator = false;
        while (!stopCalculator) {
            printInfo();
            int selectOptionInput = scanner.nextInt();
            double result;
            switch (selectOptionInput) {
                case 1:
                    result = getNumber() + getNumber();
                    getOut().println("Addition  result is: " + result);
                    break;
                case 2:
                    result = getNumber() - getNumber();
                    getOut().println("Subtraction result is: " + result);
                    break;
                case 3:
                    result = getNumber() * getNumber();
                    getOut().println("Multiplication result is: " + result);
                    break;
                case 4:
                    result = getNumber() / getNumber();
                    getOut().println("Division result is: " + result);
                    break;
                case 5:
                    result = Math.sqrt(getNumber());
                    getOut().println("Square root of given number is : " + result);
                    break;
                case 6:
                    result = Math.pow(getNumber(), 2);
                    getOut().println("Given number raised sqrt x2: " + result);
                    break;
                case 7:
                    result = Math.pow(getNumber(), 10);
                    getOut().println("Result of  - 10^(given number) is: " + result);
                    break;
                case 8:
                    result = Math.pow(getNumber(), getNumber());
                    getOut().println("Given number raised with given root: " + result);
                    break;
                case 9:
                    result = 1 / getNumber();
                    getOut().println("result of the 1/x is: " + result);
                    break;
                case 10:
                    result = Math.abs(getNumber());
                    getOut().println("Result for |x| is: " + result);
                    break;
                case 11:
                    result = Math.PI;
                    getOut().println("PI number:" + result);
                    break;
                case 12:
                    result = Math.E;
                    getOut().println("E number: " + result);
                    break;
                case 13:
                    result = Math.sin(Math.toRadians(getNumber()));
                    getOut().println("sin: " + result);
                    break;
                case 14:
                    result = Math.cos(Math.toRadians(getNumber()));
                    getOut().println("Cos: " + result);
                    break;
                case 15:
                    result = Math.log10(getNumber());
                    getOut().println("log: " + result);
                    break;
                case 16:
                    result = Math.log(getNumber());
                    getOut().println("ln: " + result);
                    break;
                case 17:
                    result = ((getNumber() * getNumber()) / 100);
                    getOut().println("%: " + result);
                    break;
                case 18:
                    //factorial ?
                    break;
                case 19:
                    stopCalculator = true;
                    System.out.println("Calculator is OFF ");
                    break;
                default:
                    getOut().println("Error");
            }
        }
    }
    public float getNumber() {
        getOut().println("Enter number: ");
        double numInput;
        if (scanner.hasNextFloat()) {
            numInput = scanner.nextDouble();
        } else {
            getOut().println("Not a number. Try again");
            scanner.next();
            numInput = getNumber();
        }
        return (float) numInput;
    }
    private PrintStream getOut() {
        return System.out;
    }
    private void printInfo() {
        getOut().println("Choose option: ");
        getOut().println("(1) = (+) ");
        getOut().println("(2) = (-) ");
        getOut().println("(3) = (*) ");
        getOut().println("(4) = (/) ");
        getOut().println("(5) = (√) ");
        getOut().println("(6) = (x2) ");
        getOut().println("(7) = (10√x)");
        getOut().println("(8) = (x√y) ");
        getOut().println("(9) = (1/x) ");
        getOut().println("(10) = (|x|) ");
        getOut().println("(11) = (PI) ");
        getOut().println("(12) = (e) ");
        getOut().println("(13) = (sin) ");
        getOut().println("(14) = (cos) ");
        getOut().println("(15) = (log) ");
        getOut().println("(16) = (ln) ");
        getOut().println("(17) = (%) ");
        getOut().println("(18) = (????)");
        getOut().println("(19) = (EXIT)");
        {

        }
    }
}
