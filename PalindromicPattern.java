/*
output:
    1
   212
  32123
 4321234
543212345

*/
import java.util.*;

public class PalindromicPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i = 1; i <= n; i++){
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            if(i >= 2){
                for(int j=2; j<=i; j++){
                    System.out.print(j);
                }
            } 
            System.out.println();
        }
    }
}
