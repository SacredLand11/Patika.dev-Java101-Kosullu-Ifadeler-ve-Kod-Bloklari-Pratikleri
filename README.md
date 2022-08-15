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
