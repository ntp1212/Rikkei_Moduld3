import java.util.Scanner;

public class Sec1_Ex6 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        float width = sc.nextFloat();
        System.out.print("Nhap chieu cao: ");
        float height = sc.nextFloat();
        float area = width * height;
        float circumference = 2 * (width + height);
        System.out.printf("Dien tich hinh chu nhat = %.2f%n", area);
        System.out.printf("Chu vi hinh chu nhat = %.2f%n", circumference);
    }
}
