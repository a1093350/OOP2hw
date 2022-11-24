import java.util.*;

public class w2hw2 {
    public static void main(String[] args) {

        var tset = new TreeSet<>();

        while (true) {
            int n = (int) (Math.random() * (100 - 1 + 1)) + 1;
            tset.add(n);
            if (tset.size() >= 10)
                break;
        }

        Iterator ite = tset.iterator();
        int n = 1;
        System.out.println("電腦從 1~100 的整數中，亂數取出10個不重複的號碼....");
        while (ite.hasNext()) {
            System.out.printf("第%d個號碼: %d%n", n, ite.next());
            n++;
        }
        System.out.printf("物件內元素個數為:%d%n", tset.size());
        System.out.println("物件內元素的內容:" + tset);
        System.out.printf("第一個元素內容為:%d%n", tset.first());
        System.out.printf("最後一個元素內容為:%d%n", tset.last());
        System.out.println("內容介於 30~70 者:" + tset.subSet(30, 70));

    }
}
