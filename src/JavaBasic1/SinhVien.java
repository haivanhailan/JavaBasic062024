package JavaBasic1;

public class SinhVien {

    //Biến static
    static String tenLop = "AT9";


    //Biến instance
    String tenSV;
    String maSV;

    public void setSinhVien(String tenSV, String maSV) {
        String tenKhoa = "CNTT";
        System.out.println("Tên SV: " + tenSV);
        System.out.println("Tên lớp: " + tenLop);
        System.out.println("Mã SV: " + maSV);
        System.out.println("Khoa: " + tenKhoa);
//        System.out.println("Trường: " + ThongTin.tenTruong);
        System.out.println("Địa chỉ: " + ThongTin.address);
        System.out.println("Năm học: " + ThongTin.year);
    }

    public static void main(String[] args) {
        System.out.println(ThongTin.tenTruong);


        SinhVien sv = new SinhVien();
        sv.setSinhVien("Tùng", "A001");
        sv.setSinhVien("Cúc", "A102");
        sv.setSinhVien("Trúc", "A103");
        sv.setSinhVien("Mai", "A104");


    }
}
