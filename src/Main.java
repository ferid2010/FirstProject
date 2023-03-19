import javax.print.attribute.standard.JobHoldUntil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("3x1=");

        System.out.println(3 * 1);

        System.out.print("3x2=");

        System.out.println(3 * 2);

        System.out.print("3x3=");

        System.out.println(3 * 3);

        System.out.print("3x4=");

        System.out.println(3 * 4);

        System.out.print("3x5=");

        System.out.println(3 * 5);

        System.out.print("3x6=");

        System.out.println(3 * 6);

        System.out.print("3x7=");

        System.out.println(3 * 7);

        System.out.print("3x8=");

        System.out.println(3 * 8);

        System.out.print("3x9=");

        System.out.println(3 * 9);

        System.out.print("3x10=");

        System.out.println(3 * 10);

        System.out.println("MCLEAN STORE \n" +
                "2019-06-19 04:38PM \n\n" +
                "Gallons:      10.870 \n" +
                "price/Gallons:  $ 2.89\n\n" +
                "Fuel total:  $ 22.71\n\n\n");






        String companyName = "First Bricks International";

        System.out.println(companyName);

        String teachercount = "500";

        System.out.println(companyName + " is an International organization");

        System.out.println("there are over " + teachercount +   " teachers in " + companyName);

        int teachercount2 = 500;

        int studentnumber = 100000;

        int sundentteacherratio = studentnumber / teachercount2 ;

        System.out.println("ve her " + sundentteacherratio + " ogrenciye bir ogretmen dusuyor\n\n\n");

        int uzunluk = 20;

        int genislik = 6;

        int dikdortgencapi = uzunluk*genislik;

        System.out.println("bu dikdortgenin uzunlugu = " +
                uzunluk + "\nbu dikdortgenin genisligi = " +
                genislik + "\nbu dikdortgenin capi = " + dikdortgencapi + "\n");

        int uzunluk2 = 30;

        int genislik2 = 10;

        int dikdortgencapi2 = uzunluk2*genislik2;

        System.out.println("bu dikdortgenin uzunlugu = " +
                uzunluk2 + "\nbu dikdortgenin genisligi = " +
                genislik2 + "\nbu dikdortgenin capi = " +
                dikdortgencapi2 + "\n\n\n");

        String firstname = "JOHN";

        String lastname = "THOMOUSE";

        String profession = "GRAPHIC DESIGNER";

        String ID = "510484454";

        String Position = "Director";

        String join = "03-08-2016";

        String Expire = "03-08-2020";

        String Phone = "05-547-987-104";

        String Mail = "urmail@Email.com";

        System.out.println(firstname + " " +
                lastname + "\n" +
                profession + "\n\nID         :" +
                ID + "\nPosition   :" +
                Position + "\nJoin       :" +
                join + "\nExpire     :" +
                Expire + "\n\nPhone     :" +
                Phone + "\nE-mail    :" +
                Mail+ "\n\n\n\n\n");

        double uzunluk3= 7.9;

        double genislik3 = 4.5;

        double dikdortgencevresi = (uzunluk3 + genislik3) * 2;

        double Dikdortgencapi = uzunluk3 * genislik3;

        System.out.println("bu dikdortgenin uzunlugu = " +
                uzunluk3 + "\nbu dikdortgenin genisligi = " +
                genislik3 + "\nbu dikdortgenin cevresi = " +
                dikdortgencevresi + "\nbu dikdortgenin capi = " +
                Dikdortgencapi + "\n\n\n");

        String sayi ="623";

        int birincirakam = 6;

        int ikincirakam = 2;

        int ucuncurakam = 3;

        int rakamlarintoplami = birincirakam + ikincirakam + ucuncurakam;

        System.out.println(sayi + "\'un rakamlarinin toplami =" +
                rakamlarintoplami + "\n\n\n\n\n");

        System.out.println("sizin notunuzu yaziniz");

        Scanner input = new Scanner(System.in);

        int grade = input.nextInt();

        String result = "";

        if (grade >= 90){
            result = " A";

        } else if (grade >= 80) {

            result = " B";
        } else if (grade >= 70) {

            result = " C";
        } else if (grade >= 60) {

            result = " D";
        } else if (grade <= 59) {

            result = " F";
        }

        System.out.println("sizin notunuz " + result + "\n\n\n");





        Scanner scanner = new Scanner(System.in);

        System.out.println("birinci sayi:");

        int sayi1 = scanner.nextInt();

        System.out.println("ikinci sayi:");

        int sayi2 = scanner.nextInt();

        String cevap = "";

        if (sayi1 > sayi2){cevap = "birinci sayi ikinci sayidan daha buyuk";

        }else if (sayi1 < sayi2) {cevap = "ikinci sayi birinci sayidan daha buyuk";
        }else {cevap = "iki sayida esit";

        }System.out.println(cevap);




        System.out.println("birinci sayi:");

        int sayi2de1 = scanner.nextInt();

        System.out.println("ikinci sayi:");

        int sayi2de2 = scanner.nextInt();

        System.out.println("ucuncu sayi:");

        int sayi2de3 = scanner.nextInt();

        String cevap2 = "";

        if (sayi2de1 > sayi2de2 && sayi2de1>sayi2de3){cevap2 = "en buyuk sayi birinci";

        }else if (sayi2de2>sayi2de1 && sayi2de2>sayi2de3){cevap2 = "en buyuk sayi ikinci";

        }else if (sayi2de3>sayi2de1 && sayi2de3>sayi2de2) {
            cevap2 = "en buyuk sayi ucuncu";

        }else if (sayi2de1 == sayi2de2 && sayi2de1 == sayi2de3 && sayi2de2 == sayi2de3 ) {

            cevap2 = "butun sayilar esit";
        }
        System.out.println(cevap2);













        
       }
    }