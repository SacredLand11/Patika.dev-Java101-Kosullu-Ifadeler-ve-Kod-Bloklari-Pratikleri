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

## EBOB-EKOK Pratik

import java.util.Scanner;

public class Java101Practices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ebob-Ekok hesaplanmasini istediginiz sayilari giriniz.");
        System.out.print("n1 sayisini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();

        int i = 1;
        int ebob = 1;
        int k = 1;
        if (n1 < n2) {
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
            System.out.println("EBOB:" + ebob);
            System.out.println("EKOK: " + ((n1 * n2) / ebob));
        } else {
            while (i <= n2) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB:" + ebob);
            System.out.println("EKOK: " + ((n1 * n2) / ebob));

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

## Gelismis Hesap Makinesi Pratik
import java.util.Scanner;

public class Java101Practices {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void Mode(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz :");
        int first = scan.nextInt();
        System.out.print("Alinacak modu giriniz :");
        int mode = scan.nextInt();
        System.out.print("Mod = "+(first%mode));
    }
    static void RectangleArea(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kisa kenari giriniz(m) :");
        int kisa = scan.nextInt();
        System.out.print("Uzun kenari giriniz(m) :");
        int uzun = scan.nextInt();
        System.out.print("Dikdortgenin alani = "+(kisa*uzun)+" metrekaredir");
        System.out.print("Dikdortgenin cevresi = "+(2*(kisa+uzun))+" metredir");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    Mode();
                    break;
                case 8:
                    RectangleArea();;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
# Patika.dev-Java101-Diziler-Pratikleri
## Dizideki Elemanlarin Harmonik Ortalamasi
public class Java101Practices {

    public static void main(String[] args) {
        double[] array = {22, 4, 87, 11, 61, 52};
        double sum = 0;

        for (double i : array) {
            sum += 1 / i;
        }
        System.out.println(sum);
    }
}
# Siniflar
## Ogrenci Bilgi Sistemi
class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}
public class Java101Practices {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}

## Boks Oyunu
class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    double dodge;
    public Fighter(String name, int health, int weight, int damage, double dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        this.dodge = dodge;
    }
    public int hit(Fighter fighter) {
        System.out.println("------------");
        System.out.println(this.name + " => " + fighter.name + " " +  this.damage + " hasar vurdu.");
        if (fighter.dodge()) {
            System.out.println(fighter.name + " gelen hasarý savurdu.");
            return fighter.health;
        }
        if (fighter.health-this.damage <0) {
            return 0;
        }
        return fighter.health-this.damage;
    }
    public boolean dodge() {
        double randomvalue=Math.random()*100;
        return randomvalue <=this.dodge;
    }
}
class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run() {
        if (checkWeight()) {
            if (yaziTura()) {
                while (f2.health > 0 && f1.health >0 ) {
                    f2.health=f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health=f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }else {
                while (f2.health > 0 && f1.health >0 ) {
                    f1.health=f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health=f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        }else {
            System.out.println("Sporcularin agirliklari uyusmuyor.");
        }
    }
    public boolean yaziTura() {
        double sayi =Math.random();
        return sayi< 0.5;
    }
    public boolean checkWeight() {
        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight ) && (f2.weight >= this.minWeight && f2.weight <= this.maxWeight );
    }
    public boolean isWin() {
        if (f1.health==0) {
            System.out.println("Maci Kazanan : " + f2.name);
            return true;
        }else if (f2.health==0) {
            System.out.println("Maci Kazanan : " + f1.name);
            return true;
        }
        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
public class Java101Practices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Oyuncu 1'in ismini girin = ");
        String name1 = s.next();
        System.out.print("Oyuncu 2'nin ismini girin = ");
        String name2 = s.next();
        Fighter Player1 = new Fighter(name1, 100, 77, 20,35.0);
        Fighter Player2 = new Fighter(name2, 100, 70, 15,25.0);

        Ring match= new Ring(Player1, Player2, 68, 80);
        match.run();
    }
}
# Diziler
## Dizideki Elemanların Max ve Min Değerlerini Bulan Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listemiz = [15 12 788 1 -1 -778 2 0]");
        System.out.print("Bir sayi giriniz : ");
        int inp = scanner.nextInt();
        scanner.close();
        System.out.println("Girilen Sayi : " + inp);
        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
        int tempMin = inp;
        int tempMax = inp;
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (inp > list[i] && inp < list[i + 1]) {
                tempMin = list[i];
                tempMax = list[i + 1];
            }
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen sayiden kucuk en yakin sayi : " + tempMin);
        System.out.println("Girilen sayiden buyuk en yakin sayi : " + tempMax);

## B Harfi Yazdiran Program
public class Java101Practices {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i==6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

## Dizideki Tekrar Eden Cift Sayi
public class Java101Practices {
    public static void main(String[] args) {
        int[] numbers = {5,4,2,8,7,6,5,2,5,6,7};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 == 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.println("Dizide tekrar eden cift sayi = "+numbers[i]);
                    }
                }
            }
        }
    }
}

# Diger Konular
## Sayi Tahmini Oyunu
    public static void main(String[] args) {
        Random rand = new Random();
        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("1-100 arasi sayi girin = ");
        int right = input.nextInt();
        if(number == right){
            System.out.println("Java tahmini = "+number);
            System.out.println("Senin tahminin = "+right);
            System.out.println("Tutturdun :)");
        }
        else {
            System.out.println("Java tahmini = " + number);
            System.out.println("Senin tahminin = " + right);
            System.out.println("Tutturamadin :(");
        }
    }
## Palindromik Kelimleri Bulan Program
    static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return "Bu palindrom bir kelime degildir";
            i++;
            j--;
        }
        return "Bu palindrome bir kelimedir";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir kelime yazin = ");
        String s1 = s.next();
        System.out.println(isPalindrome(s1));
    }
