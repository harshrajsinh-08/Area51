import java.util.Scanner;

public class pension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: INR");
        double sal = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        double[] contri = contriCalc(sal, age);

        System.out.printf("employee contri is: %.2f INR%n", contri[0]);
        System.out.printf("employer contri is: %.2f INR%n", contri[1]);
        System.out.printf("The total contri is: %.2f INR%n", contri[2]);
    }

    public static double[] contriCalc(double sal, int age) {
        double minsal = 6000;
        double EmpR, Emplr_R;

        if (age <= 55) {
            EmpR = 20;
            Emplr_R = 17;
        } else if (age <= 60) {
            EmpR = 13;
            Emplr_R = 13;
        } else if (age <= 65) {
            EmpR = 7.5;
            Emplr_R = 9;
        } else {
            EmpR = 5;
            Emplr_R = 7.5;
        }
        double elgib_inc = Math.min(sal, minsal);
        double emp_contri = elgib_inc * (EmpR / 100);
        double emplr_contri = elgib_inc * (Emplr_R / 100);
        double totalContribution = emp_contri + emplr_contri;

        return new double[] { round(emp_contri, 2), round(emplr_contri, 2),
                round(totalContribution, 2) };
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
