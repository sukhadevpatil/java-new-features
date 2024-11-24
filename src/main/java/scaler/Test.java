package scaler;

public class Test {

    public static void main2(String[] args) {
        int n = 6;
        for(int i = 1; i <n; i++) {
            System.out.println(printTriRec(i) + " ");
        }
    }

    static int printTriRec(int n) {
        if(n ==0 || n ==1 || n==2) {
            return 0;
        }
        if( n == 3)
            return 1;
        else
            return printTriRec(n-1) + printTriRec(n-2) + printTriRec(n-3);
    }


    public static void main1(String[] args) {
        int i = 0;
        int sum = 0;

        while(i < 100) {
            sum = sum + i;
            sum = i + sum;
            i += 1;
        }

        System.out.println(sum);
    }

    public static void main3(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {

        int ans = fun(100, 2000);
        System.out.println(ans);
    }

    public static int fun(int a, int b) {
        if(b==0)
            return a;
        else
            return fun(b, a%b);

    }
}
