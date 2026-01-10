import java.util.Scanner;
public class carnivalWheel{
    public static int GCD(int a,int b){
        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -- > 0){
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = l - GCD(l,b) + (a%GCD(l,b));
            System.out.println(max);
        }
    }
}