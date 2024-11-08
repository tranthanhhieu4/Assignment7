package bailecture8;
import java.util.ArrayList;

public class BaiTap4 {
    public static void main(String[] args) {
        ArrayList <String> keyWords=new ArrayList<>();
        keyWords.add("java");
        keyWords.add("Python");
        keyWords.add("C++");
        keyWords.add("JavaScript");
        String searchKeyword="Python";
        if(keyWords.contains(searchKeyword)){
            System.out.println(searchKeyword+" co trong danh sach");
            
            
        }else {
            System.out.println(searchKeyword+"Khong co trong danh sach");
        }

        


    }
    
}
