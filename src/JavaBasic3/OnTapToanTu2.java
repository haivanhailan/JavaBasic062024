package JavaBasic3;

public class OnTapToanTu2 {
    static int number = 100;

    public static void nhapGiaTri(int n) {
        if (n == number) {
            System.out.println("Đã tuyển đủ 100 sinh viên");
        } else if (n < number) {
            System.out.println("Cần tuyển thêm sinh viên");
        } else {
            System.out.println("Số lượng sinh viên đã vượt quá chỉ tiêu 100" );
        }

    }

    public static void main(String[] args) {
        nhapGiaTri(99);
        nhapGiaTri(100);
        nhapGiaTri(101);


    }
}
