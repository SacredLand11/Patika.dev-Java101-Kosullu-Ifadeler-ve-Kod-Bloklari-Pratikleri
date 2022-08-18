import java.util.*;
import java.io.*;

public class patika_dev_Java101_artik_yil_hesaplama {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        boolean leap = false;
        if(year%4 == 0){
            leap = true;
            if(year%400 != 0 && year%100 == 0){
                leap = false;
            }
        }
        else {
            leap = false;
        }
        if(leap){
            System.out.println(year+" bir artik yildir.");
        }
        else {
            System.out.println(year+"bir artik yil degildir.");
        }
    }
}
