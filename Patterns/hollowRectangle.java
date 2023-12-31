import java.util.Scanner;

public class hollowRectangle{
    public static void printHollowRectangle(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || i==1 || i==n-1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHollowRectangle(n);
        sc.close();
    }
}