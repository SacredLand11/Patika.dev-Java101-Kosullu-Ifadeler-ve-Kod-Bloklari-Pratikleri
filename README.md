Patika.dev'in Java 101 bolumunun pratik odevleri

www.patika.dev

# Patika.dev-Java101-Kosullu-Ifadeler-ve-Kod-Bloklari-Pratikleri

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
## Sayilari Kucukten Buyuge Siralama

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solut {

    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int[] numbers = new int[3];
        numbers[0] =a;
        numbers[1] =b;
        numbers[2] =c;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
## Burç Bulan Program

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Giris
{
    public static void main(String[] args) {
        int month,day;
        Scanner s = new Scanner(System.in);
        System.out.println("Dogdunuz ay: ");
        month = s.nextInt();
        System.out.println("Dogdunuz gün: ");
        day = s.nextInt();
        if(day>31 || month>12){
            System.out.println("Yanlis sayi girdiniz!");
        }
        else{
            if((month == 1 && day>=22) || (month == 2 && day<20)){
                System.out.println("Kova Burcu");
            }
            else if((month == 2 && day>=20) || (month == 3 && day<21)){
                System.out.println("Balık Burcu");
            }
            else if((month == 3 && day>=21) || (month == 4 && day<21)){
                System.out.println("Koç Burcu");
            }
            else if((month == 4 && day>=21) || (month == 5 && day<22)){
                System.out.println("Boğa Burcu");
            }
            else if((month == 5 && day>=22) || (month == 6 && day<23)){
                System.out.println("İkizler Burcu");
            }
            else if((month == 6 && day>=23) || (month == 7 && day<23)){
                System.out.println("Yengeç Burcu");
            }
            else if((month == 7 && day>=23) || (month == 8 && day<23)){
                System.out.println("Aslan Burcu");
            }
            else if((month == 8 && day>=23) || (month == 9 && day<23)){
                System.out.println("Başak Burcu");
            }
            else if((month == 9 && day>=23) || (month == 10 && day<23)){
                System.out.println("Terazi Burcu");
            }
            else if((month == 10 && day>=23) || (month == 11 && day<22)){
                System.out.println("Akrep Burcu");
            }
            else if((month == 11 && day>=22) || (month == 12 && day<22)){
                System.out.println("Yay Burcu");
            }
            else{
                System.out.println("Oğlak Burcu");
            }
        }
    }
}
# Patika.dev-Java101-Donguler-Pratikleri
## Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program

import java.util.Scanner;

public class Java101Practices {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp%10;
            reverseNumber = reverseNumber*10 + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int k,nextNum,leng = 0,ave = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Kaç sayı girilecek: ");
        k = s.nextInt();
        for (int i=0; i<k;i++){
            nextNum = s.nextInt();
            if(nextNum%3==0 && nextNum%4==0){
                ave += nextNum;
                leng++;
            }
        }
        System.out.println(ave/leng);
    }
}

## Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

import java.util.Scanner;

public class Java101Practices {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num,evenSum=0;
        boolean oddNumberCheck = true;
        for(int i = 0; oddNumberCheck;i++){
            num = s.nextInt();
            if(num%4 == 0){
                evenSum += num;
            }
            if(num%2 == 1){
                System.out.println("Tek sayi girdiniz. Bu zamana kadar girilen 4'un katlari olan sayilarin toplami= "+evenSum);
                oddNumberCheck = false;
            }
        }

    }
}

## Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;

public class Java101Practices {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = s.nextInt();
        int fourStack = 0,fiveStack = 0;
        boolean checkBool = true;
        for(int i=0; checkBool;i++){
            if(num%4==0){
                num /=4;
                fourStack++;
            } else if (num%5 == 0) {
                num /=5;
                fiveStack++;
            }
            else {
                System.out.println("4'un kuvveti: "+fourStack);
                System.out.println("5'in kuvveti: "+fiveStack);
                break;
            }
        }
    }
}

## Olasilik Kombinasyonlari

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, r, nProb = 1, olasilik = 1, ProbOlasilik = 1;
        System.out.print("Kume sayisini giriniz ");
        n = s.nextInt();
        System.out.print("Kombinasyon degerini giriniz : ");
        r = s.nextInt();

        for(int i =1; i <= n; i++){

            nProb *= i;
        }

        for(int j =1; j <= r; j++){

            olasilik *= j;

        }

        for(int t = 1; t <= (n - r); t++){

            ProbOlasilik *= t;

        }

        System.out.println("Kombinasyon hesabi : "  + nProb / (olasilik * ProbOlasilik));
    }
}

## For Ile Us Bulma Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,k,firstnum;
        System.out.print("Ustu alinacak sayi: ");
        k = s.nextInt();
        firstnum = k;
        System.out.print("Ust degeri: ");
        n = s.nextInt();
        if(n==0){
            System.out.println(1);
        }
        else if(n<0){
            for(int i = 1; i<(n*-1);i++){
                k *= firstnum;
            }
            System.out.println("1/"+k);
        }
        else {
            for(int i = 1; i< n; i++){
                k *= firstnum;
            }
            System.out.println(k);
        }
    }
}

## Sayilarin Basamaklarinin Toplami Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Sayi giriniz: ");
       int num = s.nextInt();
       int tempNumber = num;
       int basNumber = 0;
        while (tempNumber != 0) {
            basNumber += tempNumber%10;
            tempNumber /= 10;
        }
        System.out.println(basNumber);
    }
}

## Harmonik Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Sayi giriniz: ");
       int num = s.nextInt();
       if(num <= 0){
           System.out.println("Lutfen 1'den daha buyuk bir sayi giriniz.");
       }
       else {
           float hamSum = 0.0f;
           for(int i=1;i<=num;i++){
               hamSum += 1.0f/i;
           }
           System.out.println(hamSum);
       }
    }
}

## Elmas Yildiz Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = s.nextInt();

        for (int i = 0; i < n/2 ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n/2; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

## ATM Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        String id = "osman";
        String pass = "12345";
        int balance = 2000;
        int money;
        int money2;
        int sayac = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz :");
        String userName = input.nextLine();
        while (!(userName.equals(id))) {

            System.out.println("kullanıcı adınız yanlıs");
            String a = input.nextLine();
            if (a.equals(id)) {
                break;
            }
        }
        System.out.println("Sifrenizi giriniz :");
        String password = input.nextLine();

        while (!(password.equals(pass))) {


            System.out.println("hatalı tekrar giriniiz. Kalan hakkınız : " + sayac);
            password = input.nextLine();
            sayac--;

            if (sayac == 0) {
                System.out.println("hesabınız bloke olmuştur");
                return;
            }
        }
        System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        System.out.println("1-Para yatırma\n" +
                "2-Para Çekme\n" +
                "3-Bakiye Sorgula\n" +
                "4-Çıkış Yap");
        int select = input.nextInt();

        while (select < 1 || select > 4) {


            System.out.println("hatalı işlem seçimi : ");
            select = input.nextInt();
            sayac--;

            if (sayac == 0) {
                System.out.println("hesabınızdan çıkılıyor. Kartınızı alınız");
                return;
            }
        }

        switch (select) {

            case 1:
                if (select == 1) {
                    System.out.println("yüklemek isediğiniz tutarı giriniz");
                    money = input.nextInt();
                    balance += money;
                    System.out.println("yeni bakiyeniz :" + balance);

                }
            case 2:
                if (select == 2) {

                    System.out.println("Çekmek istedipiniz tutarı giriniz");
                    money2 =input.nextInt();
                    balance =balance-money2;
                    System.out.println("Kalan Bakiyeniz :" + balance);
                }
            case 3:
                if (select == 3) {


                    System.out.println("Bakiyeniz :" + balance);
                }
            default:
                System.out.println("Çıkış yapıldı. İyi Günler");
        }
    }
}

## Max-Min Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz :");
        int n = s.nextInt();


        int max=0,min=0;
        for(int i=0; i<n; i++){
            System.out.print((i+1)+". sayiyi giriniz: ");
            int k = s.nextInt();
            if(i==0){
                max = k;
                min = k;
            }
            else{
                if(k>max){
                    max = k;
                }
                if(k<min){
                    min = k;
                }
            }
        }
        System.out.println("En buyuk sayi= "+max);
        System.out.println("En kuçuk sayi= "+min);
    }
}

## Mukemmel Sayi Odev

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Bir sayi giriniz: ");
        int sayi = s.nextInt();
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mukemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mukemmel bir sayi degildir.");
        }
    }
}

## Ters Ucgen Odev

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = s.nextInt();

    for (int i = n-1; i >= 0 ; i--) {
        for (int j = 0; j < (n - i); j++) {
            System.out.print(" ");
        }
        for (int k = (2 * i + 1); k >= 1; k--) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}

## Asal Sayi Odev

public class Java101Practices {
    public static void main(String[] args) {
        for(int i = 2; i<100;i++){
            boolean checkAsal = true;
            for(int j=i; j>1;j--){
                if(j<i){
                    if(i%j==0){
                        checkAsal = false;
                    }
                }
            }
            if(checkAsal){
                System.out.print(i+" ");
            }
        }
    }
}

## Fibonacci Serisi Odev

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Fibonacci serisi terim sayisini giriniz: ");
        int n = s.nextInt();
        int f1 = 0,f2 = 1,f3;
        for(int i=1; i<n;i++){
            f3 = f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");
        }
    }
}

# Patika.dev-Java101-Metotlar-Pratikleri
## Palindrom Sayilar

import java.util.Scanner;

public class Java101Practices {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp%10;
            reverseNumber = reverseNumber*10 + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(isPalindrom(s.nextInt()));
    }
}
