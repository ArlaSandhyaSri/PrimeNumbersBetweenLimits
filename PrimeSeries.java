import java.util.Scanner;
public class PrimeSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int count=0;

        for(int n=min;n<=max;n++){
            int i;
            for(i=2;i<n;i++){
                if(n%i==0){
                    break;
                }
            }
            if(n==i){
                System.out.print(n+" ");
            }
        }
    }
    
}
