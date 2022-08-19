import java.util.Scanner;

public class patika_dev_Java101_Ucak_Bileti_Hesaplama_Odev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int km, yas, gitgel;
        System.out.print("Kac km gideceksiniz: ");
        km = s.nextInt();
        System.out.print("Yasiniz: ");
        yas = s.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        gitgel = s.nextInt();
        if(km<0 || yas<0 || gitgel<1 || gitgel>2){
            System.out.println("Hatali veri girdiniz.");
        }
        else {
            float normal_tutar,indirim = 0, toplam, gitgelInd;
            normal_tutar = km*0.1f;
            if(yas<12){
                indirim = normal_tutar*0.5f;
                if(gitgel == 2) {
                    gitgelInd = (normal_tutar - indirim) * 0.2f;
                    toplam = (normal_tutar-indirim-gitgelInd)*2;
                }
                else{
                    toplam = normal_tutar-indirim;
                }
            }
            else if(yas>=12 && yas<24){
                indirim = normal_tutar*0.1f;
                if(gitgel == 2) {
                    gitgelInd = (normal_tutar - indirim) * 0.2f;
                    toplam = (normal_tutar-indirim-gitgelInd)*2;
                }
                else{
                    toplam = normal_tutar-indirim;
                }
            }
            else if(yas>65){
                indirim = normal_tutar*0.3f;
                if(gitgel == 2) {
                    gitgelInd = (normal_tutar - indirim) * 0.2f;
                    toplam = (normal_tutar-indirim-gitgelInd)*2;
                }
                else{
                    toplam = normal_tutar-indirim;
                }
            }
            else{
                toplam = normal_tutar;
            }
            System.out.println("Toplam tutar: "+toplam+" TL");
        }
    }
}
