import java.util.*;

public class w2hw1 {
    public static void main(String[] args) {
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Janurary");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");
        boolean out = false;
        while (!out) {
            System.out.print("請輸入1~12? ");
            Scanner input = new Scanner(System.in);
            int findnum = input.nextInt();
            if (month.containsKey(findnum)) {
                System.out.printf("第%d月的英文單字為%s%n", findnum, month.get(findnum));
                out = true;
            } else {
                System.out.printf("範圍錯誤!%n");
            }
        }

    }
}
