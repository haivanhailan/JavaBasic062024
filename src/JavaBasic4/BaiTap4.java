package JavaBasic4;

public class BaiTap4 {

    public static void main(String[] args) {
        int dem=0;
        int j=0;

        //Tạo vòng lặp for đếm số lượng số chẵn từ 0 đến 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                i++;
            }
            dem++;
        }

        //Tạo mảng có tên mangSoChan dùng vòng lặp for để thêm giá trị vào mảng
        int mangSoChan[] = new int[dem];
        for (int i = 0; i<=50; i ++){
            if (i%2==0){
                mangSoChan[j]=i;
                j++;
            }
        }

        //In kết quả của mảng ra màn hình
        for (int i = 0;i<mangSoChan.length;i++){
            System.out.println(mangSoChan[i]);
        }
    }
}
