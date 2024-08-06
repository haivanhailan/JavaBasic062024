package JavaBasic5;

import java.util.ArrayList;
import java.util.List;

public class BaiTap5 {
    public static void main(String[] args) {
        List<Integer> mangSoChan = new ArrayList<>();

        //Thêm các số chẵn từ 0-50 vào mảng
        for (int i = 0; i<=50;i++){
           if (i%2==0){
               mangSoChan.add(i);
           }
        }

        //Duyệt mảng và in ra kết quả
        for (int i =0;i<mangSoChan.size();i++){
            System.out.println(mangSoChan.get(i));
        }

    }
}
