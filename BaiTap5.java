//Update an Element in ArrayListS
package bailecture8;
import java.util.ArrayList;

public class BaiTap5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=5;i++){
            numbers.add(i);
        }
        System.out.println("Danh sach truoc khi cap nhat: "+numbers);
        numbers.set(2,100);
        System.out.println("Danh sach sau khi cap nhat"+numbers);
       
    }
    
}
