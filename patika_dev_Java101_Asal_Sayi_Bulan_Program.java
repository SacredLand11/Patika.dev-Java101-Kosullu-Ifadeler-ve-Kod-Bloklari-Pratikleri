import java.util.Scanner;
import java.util.*;
import java.io.*;

public class patika_dev_Java101_Asal_Sayi_Bulan_Program {

    public static String AsalSayi (int num, int i){
        if(num == 1){
            return "1 asal degildir.";
        }
        if(num == 2){
            return "2 asal sayidir.";
        }
        if(num%i == 0){
            return num+" asal degildir.";
        }
        if(i*i>num){
            return num+" asal sayidir.";
        }


        return AsalSayi(num,i+1);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        s.close();

        System.out.println(AsalSayi(num,2));

    }
}
