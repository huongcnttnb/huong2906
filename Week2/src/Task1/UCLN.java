package Task1;

import java.util.Scanner;
public class UCLN {
    public static int gdc(int a, int b){
        int x;
        if(a==0) return b;
        if(b==0) return a;
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int x, y;
        x = nhap.nextInt();
        y = nhap.nextInt();
        System.out.print(gdc(x,y));
    }
}
