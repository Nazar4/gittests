import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

    }
        private void calculateArea (double radius) {
            double area = radius * radius * Math.PI;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter radius: ");
            double r = sc.nextDouble();
            calculateArea(radius);
        }
        private void calculateLenght (double radius){
        double Lenght = radius * 2 * Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double r = sc.nextDouble();
        calculateLenght(radius);

        }


}