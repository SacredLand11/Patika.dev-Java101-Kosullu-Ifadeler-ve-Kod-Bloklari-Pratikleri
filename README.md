# Patika.dev-Java101-Kosullu-Ifadeler-ve-Kod-Bloklari-Pratikleri
Patika.dev'in Java 101 derslerinde "Kosullu Ifadeler ve Kod Bloklari" bolumunun pratik odevleri

www.patika.dev

## Hesap Makinesi

import java.io.*;
import java.util.*;

public class Solut {

    public static void main(String[] args) {
        int n1,n2,select;
        Scanner s = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = s.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = s.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4_Bölme");
        System.out.print("Seçiminiz: ");
        select = s.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
            case 2:
                System.out.println("Fark: " + (n1-n2));
            case 3:
                System.out.println("Çarpım: " + (n1*n2));
            case 4:
                if(n2 == 0){
                    System.out.println("Sayı sıfıra bölünemez.");
                }
                else {
                    System.out.println("Bölüm: " + (n1 / n2));
                }
            default:
                System.out.println("Yanlış seçim yaptınız, lütfen 1-4 arası sayı giriniz");
        }
        }
    }
    
## Kullanici Girisi

import java.io.*;
import java.util.*;

public class Solut {

    public static void main(String[] args) {
        String username,password, newpass;
        int select;
        Scanner s = new Scanner(System.in);

        System.out.print("UserID: ");
        username = s.nextLine();

        System.out.print("Password: ");
        password = s.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Welcome !");
        }
        else {
            System.out.println("Username or Password is wrong. Do you want to reset your password ? 1=y, 2=n");
            select = s.nextInt();
            if(select == 2){
                System.out.println("Your access has been damped out.");
            }
            else if(select == 1){
                System.out.println("Write your new password: ");
                newpass = s.nextLine();
                if(newpass.equals("java123") || newpass.equals(password)){
                    System.out.println("New password cannot be same with the old one. Please try again.");
                }
                else {
                    System.out.println("Your password has been changed.");
                }
            }
            else {
                System.out.println("Your choice is wrong. Please try again.");
            }
        }
    }
}

## Sinif Gecme
import java.io.*;
import java.util.*;

public class Solut {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya;

        Scanner s = new Scanner(System.in);

        System.out.println("Matematik Notunuz");
        mat = s.nextInt();
        System.out.println("Fizik Notunuz");
        fizik = s.nextInt();
        System.out.println("Turkce Notunuz");
        turkce = s.nextInt();
        System.out.println("Kimya Notunuz");
        kimya = s.nextInt();

        double average = (mat+fizik+turkce+kimya)/4;
        if(average<55){
            System.out.println("Sınıfta Kaldın");
        }
        else{
            System.out.println("Geçtin");
            System.out.println("Ortalamanız: "+average);
        }
    }
}
## Hava Sicakligina Gore Etkinlik
import java.io.*;
import java.util.*;

public class Solut {

    public static void main(String[] args) {
        int temp;
        Scanner s = new Scanner(System.in);
        temp = s.nextInt();
        if(temp<5){
            System.out.println("Kayaga git");
        }
        if(temp == 5){
            System.out.println("Kayaga veya Sinemaya git");
        }
        if(5<temp && temp<15){
            System.out.println("Sinemaya git");
        }
        if(temp == 15){
            System.out.println("Pikniğe veya Sinemaya git");
        }
        if(15<temp && temp<25){
            System.out.println("Pikniğe git");
        }
        if(temp == 25){
            System.out.println("Pikniğe veya Yüzmeye git");
        }
        if(25<temp){
            System.out.println("Yüzmeye git");
        }
    }
}
