import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lenght: ");
        int n = scan.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %d number: ", i);
            arr[i] = scan.nextDouble();
        }
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number = " + max);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("max/arr["+i+"]= " + (arr[i]/max));
        }
    }
}
