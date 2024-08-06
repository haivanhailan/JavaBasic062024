package JavaBasic3;

public class OnTapToanTu {
    public static void main(String[] args) {
        int diemToan = 10;
        int diemVan = 7;
        int diemAnh = 5;
        int tongDiem = diemAnh+diemVan+diemToan;
        if(diemToan>diemVan){
            System.out.println("Bạn nên thi khối A");
        }else {
            System.out.println("Bạn nên thi khối D");
        }

        if (diemToan==0||diemAnh==0||diemVan==0){
            System.out.println("Bạn đã trượt kì thi");
        }else if ((tongDiem)>20){
            System.out.println("Chúc mừng bạn đã đỗ cấp 3");
        }else {
            System.out.println("Bạn chưa đủ điểm đỗ");
        }



    }
}
