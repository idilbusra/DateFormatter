package datetimedays;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeDays {
     /*
        Kullanicidan alinan bir tarihin haftanin hangi gunune denk geldigini bulan bir program yazmaniz isteniyor.
        Kullanicidan yil, ay ve gun bilgilerini alarak, tarihin hangi gun oldugunu bulan bir Java programi yazin.
        Sonuc olarak, tarihin haftanin hangi gunune denk geldigini Turkce olarak ekrana yazdirin.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl, ay ve gün bilgilerini sayısal olarak giriniz: ");
        int yil = input.nextInt();
        int ay = input.nextInt();
        int gun = input.nextInt();


        LocalDate tarih = LocalDate.of(yil, ay, gun);
        String haftaninGunu = tarih.getDayOfWeek().name();

        switch (haftaninGunu) {
            case "MONDAY":
                System.out.println("Girdiğiniz tarih PAZARTESİ gününe denk geliyor.");
                break;
            case "TUESDAY":
                System.out.println("Girdiğiniz tarih SALI gününe denk geliyor.");
                break;
            case "WEDNESDAY":
                System.out.println("Girdiğiniz tarih ÇARŞAMBA gününe denk geliyor.");
                break;
            case "THURSDAY":
                System.out.println("Girdiğiniz tarih PERŞEMBE gününe denk geliyor.");
                break;
            case "FRIDAY":
                System.out.println("Girdiğiniz tarih CUMA gününe denk geliyor.");
                break;
            case "SATURDAY":
                System.out.println("Girdiğiniz tarih CUMARTESİ gününe denk geliyor.");
                break;
            case "SUNDAY":
             System.out.println("Girdiğiniz tarih PAZAR gününe denk geliyor.");
                break;

        }
    }
}