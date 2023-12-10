package part01;

public class Factorial02 {
    public static void main(String[] args) {
        int n = 4;
        int result = 1;
        for(int i=1; i<=n; i++)
            result = result * i;
        System.out.println(result);
    }
}
