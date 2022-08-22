import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class patika_dev_Java101_Dizideki_Elemanlari_Siralama {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz = ");
        int bosint = s.nextInt();
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<bosint; i++){
            array.add(s.nextInt());
        }
        int[] primitive = array.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(primitive);
        System.out.println(Arrays.toString(primitive));
    }
}
