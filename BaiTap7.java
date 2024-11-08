package bailecture8;
import java.util.ArrayList;
public class BaiTap7 {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> numbers=new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    Integer[] array =new Integer[numbers.size()];
    array=numbers.toArray(array);
    System.out.println("Danh sach mang: ");
    for (Integer num:array){
        System.out.println(num);
    }
    
    
    }  
}
