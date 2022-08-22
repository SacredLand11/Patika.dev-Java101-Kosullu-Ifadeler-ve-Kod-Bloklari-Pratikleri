import java.util.Scanner;

public class patika_dev_Java101_Us_Hesabi_Yapan_Program {
    public static int UsBulma(int num,int firstNum, int us){
        if(us>0){
            if(us == 1){
                return num;
            }
            else {
                num *= firstNum;
                return UsBulma(num,firstNum,us-1);
            }
        }
        else if(us == 0){
            return 0;
        }
        else {
            System.out.print("Pozitif sayi giriniz. Girdiginiz sayi us sayisi = ");
            return us;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int number = s.nextInt();
        int firstNum = number;
        System.out.print("Us degeri giriniz: ");
        int power = s.nextInt();
        s.close();
        System.out.print(UsBulma(number,firstNum,power));
    }
}

