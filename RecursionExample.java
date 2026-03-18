public class RecursionExample {

    static int bar(int n) {
        if (n == 0)
            return 0;
        else
            return 1 + bar(n / 2);
    }

    static int foo(int n) {
        if (n <= 1)
            return 1;
        else
            return 1 + foo(bar(n) - 1); // FIX: ensure decrease
    }

    public static void main(String[] args) {
        int result = foo(8);
        System.out.println("foo(8) = " + result);
    }
}
