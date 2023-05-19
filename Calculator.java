import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int ans = 0;

        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Select any of the following operations (+, -, *, /, %): ");
            char operation = scanner.next().trim().charAt(0);
            if(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
                System.out.println("Enter 2 numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                if(operation == '+'){
                    ans = num1 + num2;
                }
                if(operation == '-'){
                    ans = num1 - num2;
                }
                if(operation == '*'){
                    ans = num1 * num2;
                }
                if(operation == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(operation == '%'){
                    ans = num1 % num2;
                }
            }
            else if(operation == 'X' || operation == 'x'){
                break;
            }
            else {
                System.out.println("Invalid Input provided, Please enter a valid operation");
            }
            System.out.println(ans);
        }
    }
}