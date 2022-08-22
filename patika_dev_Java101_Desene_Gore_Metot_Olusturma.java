import java.util.Scanner;

public class patika_dev_Java101_Desene_Gore_Metot_Olusturma {

    public static void Desen(int num){
        System.out.print(num+" ");
        int count = 0;

        while(num>0){
            num -=5;
            System.out.print(num+" ");
            count++;
        }
        for(int i = count; i>0; i--){
            num +=5;
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir desen sayisi giriniz: ");
        Desen(s.nextInt());
        s.close();
    }
}
