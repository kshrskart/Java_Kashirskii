import java.util.Vector;

public class task24 {
    public static void main(String[] args) {
        int n = 5, m = 5, flag = 0;
        double max = 0;
        double[][] arr = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * (30 + 10) - 10);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j]<0 && flag==0){
                    max= arr[i][j];
                    flag =1;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < 0) {
                    if (arr[i][j] >= max) {
                        max = arr[i][j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
