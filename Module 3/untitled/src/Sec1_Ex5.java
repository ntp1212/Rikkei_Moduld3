import java.util.Scanner;

public class Sec1_Ex5 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Vui lòng nhập tử số của phân số thứ nhất:");
        int a = sc.nextInt();
        System.out.println("Vui lòng nhập mẫu số của phân số thứ nhất:");
        int b = sc.nextInt();
        System.out.println("Vui lòng nhập tử số của phân số thứ hai:");
        int c = sc.nextInt();
        System.out.println("Vui lòng nhập tử số của phân số thứ hai:");
        int d = sc.nextInt();
        int numerator = (a*d + c*b);
        int denominator = b*d;
        System.out.printf("Tổng hai phân số là : %d/%d\n",numerator,denominator);

    }
}
