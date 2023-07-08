package datetimeclock;

import java.time.LocalTime;
import java.util.Scanner;

public class DateTimeClock {
    /*
         Kullanıcıya anlık saati ve dakikayı soran bir program yazmanız isteniyor.
         Ardından kullanıcının girdiği saat ve dakikayı kullanarak 2 saat 50 dakika sonrasının saatini ve dakikasını bulun.
         Elde edilen sonucu Türkçe olarak ekrana yazdırın.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saat bilgisini giriniz: ");
        int saat = input.nextInt();
        System.out.println("Dakika bilgisini giriniz: ");
        int dakika = input.nextInt();

        LocalTime girilenSaat = LocalTime.of(saat, dakika);
        LocalTime ilerikiSaat = girilenSaat.plusHours(2).plusMinutes(50);

        int yeniSaat = ilerikiSaat.getHour();
        int yeniDakika = ilerikiSaat.getMinute();
        System.out.println("2 saat 50 dakika sonra saat = " + yeniSaat + ":" + yeniDakika + " olacaktır.");
    }
}
