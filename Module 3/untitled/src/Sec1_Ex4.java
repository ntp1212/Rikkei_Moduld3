public class Sec1_Ex4 {
    static void main() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a/b;
        System.out.printf(
                "Tổng 2 số a+b = %d\nHiệu 2 số a-b = %d\nTích 2 số a*b = %d\nThương 2 số a/b = %.2f",
                sum,difference,product,quotient);
    }
}
