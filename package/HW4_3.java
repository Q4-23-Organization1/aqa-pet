import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {

//        double ab = 20;
//        double bc = 23;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the sides values : ");

        double ab = scanner.nextDouble();

        double bc = scanner.nextDouble();


        double s = ab * bc / 2;

        System.out.println("The area is: "  + s);


    }
}

