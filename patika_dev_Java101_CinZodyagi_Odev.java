import java.util.Scanner;
import java.util.*;

public class patika_dev_Java101_CinZodyagi_Odev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int a = s.nextInt();
        String animal;
        switch (a%12){
            case 0:
                animal = "Maymun";
                break;
            case 1:
                animal = "Horoz";
                break;
            case 2:
                animal = "Köpek";
                break;
            case 3:
                animal = "Domuz";
                break;
            case 4:
                animal = "Fare";
                break;
            case 5:
                animal = "Öküz";
                break;
            case 6:
                animal = "Kaplan";
                break;
            case 7:
                animal = "Tavşan";
                break;
            case 8:
                animal = "Ejderha";
                break;
            case 9:
                animal = "Yılan";
                break;
            case 10:
                animal = "At";
                break;
            default:
                animal = "Koyun";
                break;
        }
        System.out.println("Çin zodyağı burcunuz: "+animal);
    }
}
