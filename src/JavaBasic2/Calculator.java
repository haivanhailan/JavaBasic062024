package JavaBasic2;

public class Calculator {

    public int tong2SoNguyen(int a, int b) {
        return a + b;
    }

    public double tich2SoThuc(double a, double b) {
        return a * b;
    }


    public static void main(String[] args) {
        Calculator phepTinh = new Calculator();
        System.out.println("Tổng 2 số nguyên: " + phepTinh.tong2SoNguyen(3, 4));
        System.out.println("Tích 2 số thực: " + phepTinh.tich2SoThuc(3.5, 4.5));
    }
}
