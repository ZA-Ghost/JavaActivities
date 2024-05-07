import java.util.Scanner;

public class MyFunctions {
    private int num1;
    private int num2;

    public MyFunctions(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addMethod(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The result is: " + sum);
    }

    public void subtractionMethod(int num1, int num2) {
        int sum = num1 - num2;
        System.out.println("The result is: " + sum);
    }

    public void divisionMethod(int num1, int num2) {
        int sum = num1 / num2;
        System.out.println("The result is: " + sum);
    }

    public void multiplicationMethod(int num1, int num2) {
        int sum = num1 * num2;
        System.out.println("The result is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the operator (+, -, *, /):");
        String operatorSelected =scanner.next();

        scanner.close();

        MyFunctions myFunctions = new MyFunctions(num1, num2);

        switch (operatorSelected) {
            case "+":
                myFunctions.addMethod(num1, num2);
                break;
            case "-":
                myFunctions.subtractionMethod(num1, num2);
                break;
            case "*":
                myFunctions.multiplicationMethod(num1, num2);
                break;
            case "/":
                myFunctions.divisionMethod(num1, num2);
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }    
}
