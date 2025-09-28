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
                System.out.println("Go to: Pharmacy Desk");
                break;
            case 'L':
                System.out.println("Go to: Lab Desk ");
                break;
            case 'T':
                System.out.println("Go to: Triage Desk ");
                break;
            case 'C':
                System.out.println("Go to: Counselling Desk ");
                break;
            default:
                System.out.println("Invalid service code");
        }
        if (serviceCode == 'T') {
            System.out.println("1 - BMI \n 2 - Dosage round - up \n 3 - Simple Trig Helper");
            System.out.print("Enter the health metric (1 to 3):");
            byte healthMetric = input.nextByte();
            switch (healthMetric) {
                case 1:
                    System.out.print("Enter your weight(Kg): ");
                    double weight = input.nextDouble();
                    System.out.print("Enter your height(m): ");
                    double height = input.nextDouble();
                    double BMI = weight / Math.pow(height, 2.0);
                    System.out.println("BMI:" + Math.round(BMI * 10) / 10.0);
                    if (weight >= 30) {
                        System.out.println("Category: Obese");
                    } else if (weight >= 25.0 && weight <= 29.9) {
                        System.out.println("Category: Overweight");
                    } else if (weight >= 18.5 && weight <= 24.9) {
                        System.out.println("Category: Normal");
                    } else {
                        System.out.println("Category: Underweight");
                    }
                    break;
                case 2:
                    System.out.print("Enter the required dosage(mg): ");
                    double dosage = input.nextDouble();
                    final int TABLETS = 250;
                    int numOfTablets = (int) Math.ceil(dosage) / TABLETS;
                    System.out.println("Number of tablets dispensed: " + numOfTablets);
                    break;
                case 3:
                    System.out.print("Enter an angle in degrees: ");
                    double angle = input.nextDouble();
                    double sinOfAngle = Math.sin(angle);
                    double cosOfAngle = Math.cos(angle);
                    System.out.println("The sin of the angle is " + (Math.round(sinOfAngle * 1000) / 1000.0) + " and the cos of the angle is " + (Math.round(cosOfAngle * 1000) / 1000.0));
                    break;
            }
        }
        char randomChar = (char)('A'+(int)(Math.random()*26));
        int randomNum1 = ( 3 + (int)(Math.random()*7));
        int randomNum2 = ( 3 + (int)(Math.random()*7));
        int randomNum3 = ( 3 + (int)(Math.random()*7));
        int randomNum4 = ( 3 + (int)(Math.random()*7));
        String ID = (""+ randomChar+randomNum1+randomNum2+randomNum3+randomNum4);
        System.out.println("This is your new ID: " +ID);
        System.out.print("Enter your new ID: ");
        String shortID = input.nextLine();
        if (shortID.length()==5 && Character.isAlphabetic(shortID.charAt(0))&&(ID.charAt(0))==(shortID.charAt(0))){
            if (Character.isDigit(shortID.charAt(1))&&Character.isDigit(shortID.charAt(2))&&Character.isDigit(shortID.charAt(3))&&Character.isDigit(shortID.charAt(4))) {
                if((ID.charAt(1))==(shortID.charAt(1))&&(ID.charAt(2))==(shortID.charAt(2))&&(ID.charAt(3))==(shortID.charAt(3))&&(ID.charAt(4))==(shortID.charAt(4))){
                    System.out.println("Valid ID");
                }
            }
        }
        else if (shortID.length()!=5) {
            System.out.println("Invalid ID length");
        }
        else{
            System.out.println("Invalid: Last characters");
        }

    }
}
