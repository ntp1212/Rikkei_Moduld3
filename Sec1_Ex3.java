import java.util.Scanner;

public class Sec1_Ex3 {
    // psvm + enter
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn:");
        double r = sc.nextDouble();
        final float  PI = 3.14f;
        double dienTichTron = PI*r*r;
        System.out.printf("Diện tích hình tròn có bán kính %f là %.2f", r, dienTichTron);

    }
}
