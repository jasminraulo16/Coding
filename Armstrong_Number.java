import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int rem,num,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();
        num=n;
        while(num!=0)
        {
            rem = num%10;
            sum = sum+rem*rem*rem;
            num = num/10;
        }
        if(sum==n)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}