
package bailecture8;
import java.util.Collections;
import java.util.ArrayList;
public class BaiTap6 {
    public static void main(String[] args) {
       ArrayList<Integer>numbers=new ArrayList<>();
       numbers.add(5);
       numbers.add(3);
       numbers.add(8);
       numbers.add(2);
       numbers.add(4);
       System.out.println("Danh sach truoc khi sap xep: "+numbers);
       Collections.sort(numbers);
       System.out.println("Danh sach sau khi sap xep"+numbers);
       
    }
    
}
