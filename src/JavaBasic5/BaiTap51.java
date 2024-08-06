package JavaBasic5;

import java.util.ArrayList;
import java.util.List;

public class BaiTap51 {
    List<String> employee = new ArrayList<>();

    public void addEmployee() {
        String name = "Mai";
        String gender = "Female";
        employee.add(name);
        employee.add(gender);
    }

    public void addEmployee2(String name, String gender) {
        employee.add(name);
        employee.add(gender);
    }

    public static void main(String[] args) {
        BaiTap51 bt = new BaiTap51();
        bt.addEmployee();
        bt.addEmployee2("Lan", "Female");
        bt.addEmployee2("Mai", "Female");
        bt.addEmployee2("Anh", "Female");

        //In ra thông tin nv dùng for cơ bản
        for (int i = 0; i < bt.employee.size(); i++) {
            System.out.println(bt.employee.get(i));
        }
    }
}
