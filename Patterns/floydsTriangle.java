import java.util.Scanner;
public class floydsTriangle {
    public static void printFloydsTriangle(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printFloydsTriangle(n);
    }
}
