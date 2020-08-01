package Task1;

import java.util.Scanner;
public class songuyento {
    public static  boolean ktnt(int n){
        if(n>=2) {
            for(int i=2; i<=n/2; i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
        else
            return false;
    }
    public static void sieveEratosthenes(int n){
        for(int i=2; i<=n; i++){
            if(ktnt(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sieveEratosthenes(n);
    }
}
