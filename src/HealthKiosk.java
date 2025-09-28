import java.util.Scanner;

public class HealthKiosk {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Ashesi's health kiosk!");
        Scanner input = new Scanner(System.in);
        System.out.println("P - Pharmacy \n L - Lab \n T - Triage \n C - Counselling");
        System.out.print("Enter the service code (P/L/T/C):  ");
        char serviceCode = input.nextLine().toUpperCase().charAt(0);
        switch (serviceCode) {
            case 'P':
                System.out.print("Go to: Pharmacy Desk");
                break;
            case 'L':
                System.out.print("Go to: Lab Desk ");
                break;
            case 'T':
                System.out.print("Go to: Triage Desk ");
                break;
            case 'C':
                System.out.print("Go to: Counselling Desk ");
                break;
            default:
                System.out.print("Invalid service code ");


        }



    }
}
