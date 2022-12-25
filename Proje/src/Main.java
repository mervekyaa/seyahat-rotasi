import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bulundugunSehir;
        int giris,secim,secim2,secim3,secim4;
        Scanner tarayici = new Scanner(System.in);

        System.out.println("....Seyahat Yeri Bulma Programına Hosgeldiniz....");

        Sehirler sehirler = new Sehirler();
        Tarihi tarihi = new Tarihi();
        DogalGuzellik dguzellik = new DogalGuzellik();
        AcikAlan acikAlan= new AcikAlan();
        KampAlani kampAlani= new KampAlani();

        Sehirler sehirler1 = new Otel(); // polymorphism kullanılan yer

        sehirler.soru1();
        giris= tarayici.nextInt();
            if (giris==1){ //sehir içi için filtreleme yapılır
                System.out.println("hangi sehirdesiniz ? ");
                bulundugunSehir= tarayici.next();
                if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAdana())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Adana();
                    }
                    else if (secim==2) {
                        dguzellik.Adana();
                    }
                    else if (secim==3) {
                        acikAlan.Adana();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAntalya())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Antalya();
                    }
                    else if (secim==2) {
                        dguzellik.Antalya();
                    }
                    else if (secim==3) {
                        acikAlan.Antalya();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getMersin())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Mersin();
                    }
                    else if (secim==2) {
                        dguzellik.Mersin();
                    }
                    else if (secim==3) {
                        acikAlan.Mersin();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getHatay())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Hatay();
                    }
                    else if (secim==2) {
                        dguzellik.Hatay();
                    }
                    else if (secim==3) {
                        acikAlan.Hatay();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKmaras())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kmaras();
                    }
                    else if (secim==2) {
                        dguzellik.Kmaras();
                    }
                    else if (secim==3) {
                        acikAlan.Kmaras();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getOsmaniye())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Osmaniye();
                    }
                    else if (secim==2) {
                        dguzellik.Osmaniye();
                    }
                    else if (secim==3) {
                        acikAlan.Osmaniye();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getIsparta())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Isparta();
                    }
                    else if (secim==2) {
                        dguzellik.Isparta();
                    }
                    else if (secim==3) {
                        acikAlan.Isparta();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getBurdur())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Burdur();
                    }
                    else if (secim==2) {
                        dguzellik.Burdur();
                    }
                    else if (secim==3) {
                        acikAlan.Burdur();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getTrabzon())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Trabzon();
                    }
                    else if (secim==2) {
                        dguzellik.Trabzon();
                    }
                    else if (secim==3) {
                        acikAlan.Trabzon();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getSamsun())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Samsun();
                    }
                    else if (secim==2) {
                        dguzellik.Samsun();
                    }
                    else if (secim==3) {
                        acikAlan.Samsun();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getRize())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Rize();
                    }
                    else if (secim==2) {
                        dguzellik.Rize();
                    }
                    else if (secim==3) {
                        acikAlan.Rize();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getOrdu())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Ordu();
                    }
                    else if (secim==2) {
                        dguzellik.Ordu();
                    }
                    else if (secim==3) {
                        acikAlan.Ordu();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getGiresun())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Giresun();
                    }
                    else if (secim==2) {
                        dguzellik.Giresun();
                    }
                    else if (secim==3) {
                        acikAlan.Giresun();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getSinop())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Sinop();
                    }
                    else if (secim==2) {
                        dguzellik.Sinop();
                    }
                    else if (secim==3) {
                        acikAlan.Sinop();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAmasya())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Amasya();
                    }
                    else if (secim==2) {
                        dguzellik.Amasya();
                    }
                    else if (secim==3) {
                        acikAlan.Amasya();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKastamonu())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kastamonu();
                    }
                    else if (secim==2) {
                        dguzellik.Kastamonu();
                    }
                    else if (secim==3) {
                        acikAlan.Kastamonu();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getIstanbul())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Istanbul();
                    }
                    else if (secim==2) {
                        dguzellik.Istanbul();
                    }
                    else if (secim==3) {
                        acikAlan.Istanbul();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getBursa())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Bursa();
                    }
                    else if (secim==2) {
                        dguzellik.Bursa();
                    }
                    else if (secim==3) {
                        acikAlan.Bursa();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getBalikesir())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Balikesir();
                    }
                    else if (secim==2) {
                        dguzellik.Balikesir();
                    }
                    else if (secim==3) {
                        acikAlan.Balikesir();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getCanakkale())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Canakkale();
                    }
                    else if (secim==2) {
                        dguzellik.Canakkale();
                    }
                    else if (secim==3) {
                        acikAlan.Canakkale();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getEdirne())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Edirne();
                    }
                    else if (secim==2) {
                        dguzellik.Edirne();
                    }
                    else if (secim==3) {
                        acikAlan.Edirne();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKocaeli())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kocaeli();
                    }
                    else if (secim==2) {
                        dguzellik.Kocaeli();
                    }
                    else if (secim==3) {
                        acikAlan.Kocaeli();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getTekirdag())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Tekirdag();
                    }
                    else if (secim==2) {
                        dguzellik.Tekirdag();
                    }
                    else if (secim==3) {
                        acikAlan.Tekirdag();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getSakarya())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Sakarya();
                    }
                    else if (secim==2) {
                        dguzellik.Sakarya();
                    }
                    else if (secim==3) {
                        acikAlan.Sakarya();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getIzmir())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Izmir();
                    }
                    else if (secim==2) {
                        dguzellik.Izmir();
                    }
                    else if (secim==3) {
                        acikAlan.Izmir();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getMugla())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Mugla();
                    }
                    else if (secim==2) {
                        dguzellik.Mugla();
                    }
                    else if (secim==3) {
                        acikAlan.Mugla();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAydin())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Aydin();
                    }
                    else if (secim==2) {
                        dguzellik.Aydin();
                    }
                    else if (secim==3) {
                        acikAlan.Aydin();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getManisa())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Manisa();
                    }
                    else if (secim==2) {
                        dguzellik.Manisa();
                    }
                    else if (secim==3) {
                        acikAlan.Manisa();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getDenizli())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Denizli();
                    }
                    else if (secim==2) {
                        dguzellik.Denizli();
                    }
                    else if (secim==3) {
                        acikAlan.Denizli();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKutahya())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kutahya();
                    }
                    else if (secim==2) {
                        dguzellik.Kutahya();
                    }
                    else if (secim==3) {
                        acikAlan.Kutahya();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAfyon())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Afyon();
                    }
                    else if (secim==2) {
                        dguzellik.Afyon();
                    }
                    else if (secim==3) {
                        acikAlan.Afyon();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getUsak())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Usak();
                    }
                    else if (secim==2) {
                        dguzellik.Usak();
                    }
                    else if (secim==3) {
                        acikAlan.Usak();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAnkara())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Ankara();
                    }
                    else if (secim==2) {
                        dguzellik.Ankara();
                    }
                    else if (secim==3) {
                        acikAlan.Ankara();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getEskisehir())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Eskisehir();
                    }
                    else if (secim==2) {
                        dguzellik.Eskisehir();
                    }
                    else if (secim==3) {
                        acikAlan.Eskisehir();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKonya())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Konya();
                    }
                    else if (secim==2) {
                        dguzellik.Konya();
                    }
                    else if (secim==3) {
                        acikAlan.Konya();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKayseri())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kayseri();
                    }
                    else if (secim==2) {
                        dguzellik.Kayseri();
                    }
                    else if (secim==3) {
                        acikAlan.Kayseri();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getNevsehir())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Nevsehir();
                    }
                    else if (secim==2) {
                        dguzellik.Nevsehir();
                    }
                    else if (secim==3) {
                        acikAlan.Nevsehir();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getSivas())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Sivas();
                    }
                    else if (secim==2) {
                        dguzellik.Sivas();
                    }
                    else if (secim==3) {
                        acikAlan.Sivas();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getNigde())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Nigde();
                    }
                    else if (secim==2) {
                        dguzellik.Nigde();
                    }
                    else if (secim==3) {
                        acikAlan.Nigde();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getYozgat())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Yozgat();
                    }
                    else if (secim==2) {
                        dguzellik.Yozgat();
                    }
                    else if (secim==3) {
                        acikAlan.Yozgat();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getGantep())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Gantep();
                    }
                    else if (secim==2) {
                        dguzellik.Gantep();
                    }
                    else if (secim==3) {
                        acikAlan.Gantep();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getSanliurfa())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Sanliurfa();
                    }
                    else if (secim==2) {
                        dguzellik.Sanliurfa();
                    }
                    else if (secim==3) {
                        acikAlan.Sanliurfa();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getDiyarbakir())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Diyarbakir();
                    }
                    else if (secim==2) {
                        dguzellik.Diyarbakir();
                    }
                    else if (secim==3) {
                        acikAlan.Diyarbakir();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getMardin())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Mardin();
                    }
                    else if (secim==2) {
                        dguzellik.Mardin();
                    }
                    else if (secim==3) {
                        acikAlan.Mardin();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getBatman())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Batman();
                    }
                    else if (secim==2) {
                        dguzellik.Batman();
                    }
                    else if (secim==3) {
                        acikAlan.Batman();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getSiirt())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Siirt();
                    }
                    else if (secim==2) {
                        dguzellik.Siirt();
                    }
                    else if (secim==3) {
                        acikAlan.Siirt();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getAdiyaman())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Adiyaman();
                    }
                    else if (secim==2) {
                        dguzellik.Adiyaman();
                    }
                    else if (secim==3) {
                        acikAlan.Adiyaman();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKilis())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kilis();
                    }
                    else if (secim==2) {
                        dguzellik.Kilis();
                    }
                    else if (secim==3) {
                        acikAlan.Kilis();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getErzurum())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Erzurum();
                    }
                    else if (secim==2) {
                        dguzellik.Erzurum();
                    }
                    else if (secim==3) {
                        acikAlan.Erzurum();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getMalatya())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Malatya();
                    }
                    else if (secim==2) {
                        dguzellik.Malatya();
                    }
                    else if (secim==3) {
                        acikAlan.Malatya();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getVan())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Van();
                    }
                    else if (secim==2) {
                        dguzellik.Van();
                    }
                    else if (secim==3) {
                        acikAlan.Van();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getKars())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Kars();
                    }
                    else if (secim==2) {
                        dguzellik.Kars();
                    }
                    else if (secim==3) {
                        acikAlan.Kars();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getElazig())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Elazig();
                    }
                    else if (secim==2) {
                        dguzellik.Elazig();
                    }
                    else if (secim==3) {
                        acikAlan.Elazig();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getErzincan())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Erzincan();
                    }
                    else if (secim==2) {
                        dguzellik.Erzincan();
                    }
                    else if (secim==3) {
                        acikAlan.Erzincan();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getBitlis())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Bitlis();
                    }
                    else if (secim==2) {
                        dguzellik.Bitlis();
                    }
                    else if (secim==3) {
                        acikAlan.Bitlis();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
                else if ( bulundugunSehir.equalsIgnoreCase(sehirler.getArdahan())){
                    sehirler.soru2();
                    secim= tarayici.nextInt();
                    if (secim==1) {
                        tarihi.Ardahan();
                    }
                    else if (secim==2) {
                        dguzellik.Ardahan();
                    }
                    else if (secim==3) {
                        acikAlan.Ardahan();
                    }
                    else
                        System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");

                }
            }
            if(giris==2){ // sehir dısı için filtreleme yapılır
                sehirler.soru6();
                secim2= tarayici.nextInt();
                if(secim2==1){
                    sehirler.soru6sec1();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Adana();
                        }
                        else if (secim4==2) {
                            dguzellik.Adana();
                        }
                        else if (secim4==3) {
                            acikAlan.Adana();
                        }
                        else if (secim4==4) {
                            kampAlani.Adana();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAdana();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Antalya();
                        }
                        else if (secim4==2) {
                            dguzellik.Antalya();
                        }
                        else if (secim4==3) {
                            acikAlan.Antalya();
                        }
                        else if (secim4==4) {
                            kampAlani.Antalya();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAntalya();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Mersin();
                        }
                        else if (secim4==2) {
                            dguzellik.Mersin();
                        }
                        else if (secim4==3) {
                            acikAlan.Mersin();
                        }
                        else if (secim4==4) {
                            kampAlani.Mersin();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getMersin();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Hatay();
                        }
                        else if (secim4==2) {
                            dguzellik.Hatay();
                        }
                        else if (secim4==3) {
                            acikAlan.Hatay();
                        }
                        else if (secim4==4) {
                            kampAlani.Hatay();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getHatay();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kmaras();
                        }
                        else if (secim4==2) {
                            dguzellik.Kmaras();
                        }
                        else if (secim4==3) {
                            acikAlan.Kmaras();
                        }
                        else if (secim4==4) {
                            kampAlani.Kmaras();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKmaras();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Osmaniye();
                        }
                        else if (secim4==2) {
                            dguzellik.Osmaniye();
                        }
                        else if (secim4==3) {
                            acikAlan.Osmaniye();
                        }
                        else if (secim4==4) {
                            kampAlani.Osmaniye();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getOsmaniye();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Isparta();
                        }
                        else if (secim4==2) {
                            dguzellik.Isparta();
                        }
                        else if (secim4==3) {
                            acikAlan.Isparta();
                        }
                        else if (secim4==4) {
                            kampAlani.Isparta();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getIsparta();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Burdur();
                        }
                        else if (secim4==2) {
                            dguzellik.Burdur();
                        }
                        else if (secim4==3) {
                            acikAlan.Burdur();
                        }
                        else if (secim4==4) {
                            kampAlani.Burdur();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getBurdur();
                    }
                    }
                if(secim2==2){
                    sehirler.soru6sec2();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Trabzon();
                        }
                        else if (secim4==2) {
                            dguzellik.Trabzon();
                        }
                        else if (secim4==3) {
                            acikAlan.Trabzon();
                        }
                        else if (secim4==4) {
                            kampAlani.Trabzon();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getTrabzon();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Samsun();
                        }
                        else if (secim4==2) {
                            dguzellik.Samsun();
                        }
                        else if (secim4==3) {
                            acikAlan.Samsun();
                        }
                        else if (secim4==4) {
                            kampAlani.Samsun();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getSamsun();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Rize();
                        }
                        else if (secim4==2) {
                            dguzellik.Rize();
                        }
                        else if (secim4==3) {
                            acikAlan.Rize();
                        }
                        else if (secim4==4) {
                            kampAlani.Rize();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getRize();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Ordu();
                        }
                        else if (secim4==2) {
                            dguzellik.Ordu();
                        }
                        else if (secim4==3) {
                            acikAlan.Ordu();
                        }
                        else if (secim4==4) {
                            kampAlani.Ordu();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getOrdu();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Giresun();
                        }
                        else if (secim4==2) {
                            dguzellik.Giresun();
                        }
                        else if (secim4==3) {
                            acikAlan.Giresun();
                        }
                        else if (secim4==4) {
                            kampAlani.Giresun();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getGiresun();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Sinop();
                        }
                        else if (secim4==2) {
                            dguzellik.Sinop();
                        }
                        else if (secim4==3) {
                            acikAlan.Sinop();
                        }
                        else if (secim4==4) {
                            kampAlani.Sinop();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getSinop();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Amasya();
                        }
                        else if (secim4==2) {
                            dguzellik.Amasya();
                        }
                        else if (secim4==3) {
                            acikAlan.Amasya();
                        }
                        else if (secim4==4) {
                            kampAlani.Amasya();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAmasya();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kastamonu();
                        }
                        else if (secim4==2) {
                            dguzellik.Kastamonu();
                        }
                        else if (secim4==3) {
                            acikAlan.Kastamonu();
                        }
                        else if (secim4==4) {
                            kampAlani.Kastamonu();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKastamonu();
                    }
                }
                if(secim2==3){
                    sehirler.soru6sec3();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Istanbul();
                        }
                        else if (secim4==2) {
                            dguzellik.Istanbul();
                        }
                        else if (secim4==3) {
                            acikAlan.Istanbul();
                        }
                        else if (secim4==4) {
                            kampAlani.Istanbul();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getIstanbul();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Bursa();
                        }
                        else if (secim4==2) {
                            dguzellik.Bursa();
                        }
                        else if (secim4==3) {
                            acikAlan.Bursa();
                        }
                        else if (secim4==4) {
                            kampAlani.Bursa();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getBursa();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Balikesir();
                        }
                        else if (secim4==2) {
                            dguzellik.Balikesir();
                        }
                        else if (secim4==3) {
                            acikAlan.Balikesir();
                        }
                        else if (secim4==4) {
                            kampAlani.Balikesir();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getBalikesir();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Canakkale();
                        }
                        else if (secim4==2) {
                            dguzellik.Canakkale();
                        }
                        else if (secim4==3) {
                            acikAlan.Canakkale();
                        }
                        else if (secim4==4) {
                            kampAlani.Canakkale();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getCanakkale();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Edirne();
                        }
                        else if (secim4==2) {
                            dguzellik.Edirne();
                        }
                        else if (secim4==3) {
                            acikAlan.Edirne();
                        }
                        else if (secim4==4) {
                            kampAlani.Edirne();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getEdirne();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kocaeli();
                        }
                        else if (secim4==2) {
                            dguzellik.Kocaeli();
                        }
                        else if (secim4==3) {
                            acikAlan.Kocaeli();
                        }
                        else if (secim4==4) {
                            kampAlani.Kocaeli();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKocaeli();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Tekirdag();
                        }
                        else if (secim4==2) {
                            dguzellik.Tekirdag();
                        }
                        else if (secim4==3) {
                            acikAlan.Tekirdag();
                        }
                        else if (secim4==4) {
                            kampAlani.Tekirdag();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getTekirdag();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Sakarya();
                        }
                        else if (secim4==2) {
                            dguzellik.Sakarya();
                        }
                        else if (secim4==3) {
                            acikAlan.Sakarya();
                        }
                        else if (secim4==4) {
                            kampAlani.Sakarya();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getSakarya();
                    }
                }
                if(secim2==4){
                    sehirler.soru6sec4();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Izmir();
                        }
                        else if (secim4==2) {
                            dguzellik.Izmir();
                        }
                        else if (secim4==3) {
                            acikAlan.Izmir();
                        }
                        else if (secim4==4) {
                            kampAlani.Izmir();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getIzmir();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Mugla();
                        }
                        else if (secim4==2) {
                            dguzellik.Mugla();
                        }
                        else if (secim4==3) {
                            acikAlan.Mugla();
                        }
                        else if (secim4==4) {
                            kampAlani.Mugla();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getMugla();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Aydin();
                        }
                        else if (secim4==2) {
                            dguzellik.Aydin();
                        }
                        else if (secim4==3) {
                            acikAlan.Aydin();
                        }
                        else if (secim4==4) {
                            kampAlani.Aydin();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAydin();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Manisa();
                        }
                        else if (secim4==2) {
                            dguzellik.Manisa();
                        }
                        else if (secim4==3) {
                            acikAlan.Manisa();
                        }
                        else if (secim4==4) {
                            kampAlani.Manisa();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getManisa();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Denizli();
                        }
                        else if (secim4==2) {
                            dguzellik.Denizli();
                        }
                        else if (secim4==3) {
                            acikAlan.Denizli();
                        }
                        else if (secim4==4) {
                            kampAlani.Denizli();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getDenizli();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kutahya();
                        }
                        else if (secim4==2) {
                            dguzellik.Kutahya();
                        }
                        else if (secim4==3) {
                            acikAlan.Kutahya();
                        }
                        else if (secim4==4) {
                            kampAlani.Kutahya();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKutahya();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Afyon();
                        }
                        else if (secim4==2) {
                            dguzellik.Afyon();
                        }
                        else if (secim4==3) {
                            acikAlan.Afyon();
                        }
                        else if (secim4==4) {
                            kampAlani.Afyon();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAfyon();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Usak();
                        }
                        else if (secim4==2) {
                            dguzellik.Usak();
                        }
                        else if (secim4==3) {
                            acikAlan.Usak();
                        }
                        else if (secim4==4) {
                            kampAlani.Usak();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getUsak();
                    }
                }
                if(secim2==5){
                    sehirler.soru6sec5();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Ankara();
                        }
                        else if (secim4==2) {
                            dguzellik.Ankara();
                        }
                        else if (secim4==3) {
                            acikAlan.Ankara();
                        }
                        else if (secim4==4) {
                            kampAlani.Ankara();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAnkara();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Eskisehir();
                        }
                        else if (secim4==2) {
                            dguzellik.Eskisehir();
                        }
                        else if (secim4==3) {
                            acikAlan.Eskisehir();
                        }
                        else if (secim4==4) {
                            kampAlani.Eskisehir();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getEskisehir();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Konya();
                        }
                        else if (secim4==2) {
                            dguzellik.Konya();
                        }
                        else if (secim4==3) {
                            acikAlan.Konya();
                        }
                        else if (secim4==4) {
                            kampAlani.Konya();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKonya();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kayseri();
                        }
                        else if (secim4==2) {
                            dguzellik.Kayseri();
                        }
                        else if (secim4==3) {
                            acikAlan.Kayseri();
                        }
                        else if (secim4==4) {
                            kampAlani.Kayseri();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKayseri();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Nevsehir();
                        }
                        else if (secim4==2) {
                            dguzellik.Nevsehir();
                        }
                        else if (secim4==3) {
                            acikAlan.Nevsehir();
                        }
                        else if (secim4==4) {
                            kampAlani.Nevsehir();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getNevsehir();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Sivas();
                        }
                        else if (secim4==2) {
                            dguzellik.Sivas();
                        }
                        else if (secim4==3) {
                            acikAlan.Sivas();
                        }
                        else if (secim4==4) {
                            kampAlani.Sivas();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getSivas();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Nigde();
                        }
                        else if (secim4==2) {
                            dguzellik.Nigde();
                        }
                        else if (secim4==3) {
                            acikAlan.Nigde();
                        }
                        else if (secim4==4) {
                            kampAlani.Nigde();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getNigde();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Yozgat();
                        }
                        else if (secim4==2) {
                            dguzellik.Yozgat();
                        }
                        else if (secim4==3) {
                            acikAlan.Yozgat();
                        }
                        else if (secim4==4) {
                            kampAlani.Yozgat();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getYozgat();
                    }
                }
                if(secim2==6){
                    sehirler.soru6sec6();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Gantep();
                        }
                        else if (secim4==2) {
                            dguzellik.Gantep();
                        }
                        else if (secim4==3) {
                            acikAlan.Gantep();
                        }
                        else if (secim4==4) {
                            kampAlani.Gantep();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getGantep();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Sanliurfa();
                        }
                        else if (secim4==2) {
                            dguzellik.Sanliurfa();
                        }
                        else if (secim4==3) {
                            acikAlan.Sanliurfa();
                        }
                        else if (secim4==4) {
                            kampAlani.Sanliurfa();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getSanliurfa();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Diyarbakir();
                        }
                        else if (secim4==2) {
                            dguzellik.Diyarbakir();
                        }
                        else if (secim4==3) {
                            acikAlan.Diyarbakir();
                        }
                        else if (secim4==4) {
                            kampAlani.Diyarbakir();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getDiyarbakir();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Mardin();
                        }
                        else if (secim4==2) {
                            dguzellik.Mardin();
                        }
                        else if (secim4==3) {
                            acikAlan.Mardin();
                        }
                        else if (secim4==4) {
                            kampAlani.Mardin();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getMardin();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Batman();
                        }
                        else if (secim4==2) {
                            dguzellik.Batman();
                        }
                        else if (secim4==3) {
                            acikAlan.Batman();
                        }
                        else if (secim4==4) {
                            kampAlani.Batman();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getBatman();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Siirt();
                        }
                        else if (secim4==2) {
                            dguzellik.Siirt();
                        }
                        else if (secim4==3) {
                            acikAlan.Siirt();
                        }
                        else if (secim4==4) {
                            kampAlani.Siirt();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getSiirt();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Adiyaman();
                        }
                        else if (secim4==2) {
                            dguzellik.Adiyaman();;
                        }
                        else if (secim4==3) {
                            acikAlan.Adiyaman();
                        }
                        else if (secim4==4) {
                            kampAlani.Adiyaman();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getAdiyaman();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kilis();
                        }
                        else if (secim4==2) {
                            dguzellik.Kilis();
                        }
                        else if (secim4==3) {
                            acikAlan.Kilis();
                        }
                        else if (secim4==4) {
                            kampAlani.Kilis();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKilis();
                    }
                }
                if(secim2==7){
                    sehirler.soru6sec7();
                    secim3= tarayici.nextInt();
                    if (secim3==1){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Erzurum();
                        }
                        else if (secim4==2) {
                            dguzellik.Erzurum();
                        }
                        else if (secim4==3) {
                            acikAlan.Erzurum();
                        }
                        else if (secim4==4) {
                            kampAlani.Erzurum();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getErzurum();
                    }
                    else if (secim3==2){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Malatya();
                        }
                        else if (secim4==2) {
                            dguzellik.Malatya();
                        }
                        else if (secim4==3) {
                            acikAlan.Malatya();
                        }
                        else if (secim4==4) {
                            kampAlani.Malatya();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getMalatya();
                    }
                    else if (secim3==3){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Van();
                        }
                        else if (secim4==2) {
                            dguzellik.Van();
                        }
                        else if (secim4==3) {
                            acikAlan.Van();
                        }
                        else if (secim4==4) {
                            kampAlani.Van();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getVan();
                    }
                    else if (secim3==4){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Kars();
                        }
                        else if (secim4==2) {
                            dguzellik.Kars();
                        }
                        else if (secim4==3) {
                            acikAlan.Kars();
                        }
                        else if (secim4==4) {
                            kampAlani.Kars();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getKars();
                    }
                    else if (secim3==5){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Elazig();
                        }
                        else if (secim4==2) {
                            dguzellik.Elazig();
                        }
                        else if (secim4==3) {
                            acikAlan.Elazig();
                        }
                        else if (secim4==4) {
                            kampAlani.Elazig();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getElazig();
                    }
                    else if (secim3==6){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Erzincan();
                        }
                        else if (secim4==2) {
                            dguzellik.Erzincan();
                        }
                        else if (secim4==3) {
                            acikAlan.Erzincan();
                        }
                        else if (secim4==4) {
                            kampAlani.Erzincan();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getErzincan();
                    }
                    else if (secim3==7){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Bitlis();
                        }
                        else if (secim4==2) {
                            dguzellik.Bitlis();
                        }
                        else if (secim4==3) {
                            acikAlan.Bitlis();
                        }
                        else if (secim4==4) {
                            kampAlani.Bitlis();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getBitlis();
                    }
                    else if (secim3==8){
                        sehirler.soru5();
                        secim4= tarayici.nextInt();
                        if (secim4==1) {
                            tarihi.Ardahan();
                        }
                        else if (secim4==2) {
                            dguzellik.Ardahan();
                        }
                        else if (secim4==3) {
                            acikAlan.Ardahan();
                        }
                        else if (secim4==4) {
                            kampAlani.Ardahan();
                        }
                        else
                            System.out.println("!!!yanlis secim yaptiniz,tekrardan programa baslayiniz!!!");
                        sehirler1.getArdahan();
                    }
                }


            }

        }

}



