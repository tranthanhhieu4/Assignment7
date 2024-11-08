//Traverse the ArrayList
package bailecture8;
import java.util.ArrayList;
public class BaiTap3 {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Hai Phong");
        cities.add("Da Lat");
        cities.add("Hoi An");
        cities.add("Da Nang");
        System.out.println("Danh sach thanh pho:");
        for(String city:cities)
        {
            System.out.println(city);
        }        
        
    }
}
