import java.util.Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            } else if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        break; // Exit the loop in case of division by zero
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println(ans);
            } else {
                System.out.println("Invalid Operation");
                break; // Exit the loop for an invalid operation
            }
        }
    }
}

