


import java.util.Scanner;
public class hafta10odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //birinci soru

        System.out.println("birinci sayi:");

        int sayi1 = scanner.nextInt();

        System.out.println("ikinci sayi:");

        int sayi2 = scanner.nextInt();

        String cevap = "";

        if (sayi1 > sayi2){cevap = "birinci sayi ikinci sayidan daha buyuk";

        }else if (sayi1 < sayi2) {cevap = "ikinci sayi birinci sayidan daha buyuk";
        }else {cevap = "iki sayida esit";

        }System.out.println(cevap);



        //ikinci soru

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










        //ucuncu soru

        System.out.println("Bir harf giriniz:");

        String input = scanner.next();

       if (input=="A" || input=="a" ||       //||=or/yada
               input=="e" || input=="E" ||
               input=="o" || input=="O" ||
               input=="i" || input=="I" ||
               input=="u" || input=="U"){

           System.out.println("bu harf sesli");

       }else if (input == "B" ||  input == "b" ||
                 input == "C" ||  input == "c" ||
                 input == "D" ||  input == "d" ||
                 input == "F" ||  input == "f" ||
                 input == "G" ||  input == "g" ||
                 input == "H" ||  input == "h" ||
                 input == "J" ||  input == "j" ||
                 input == "K" ||  input == "k" ||
                 input == "L" ||  input == "l" ||
                 input == "M" ||  input == "m" ||
                 input == "N" ||  input == "n" ||
                 input == "P" ||  input == "p" ||
                 input == "Q" ||  input == "q" ||
                 input == "R" ||  input == "r" ||
                 input == "S" ||  input == "s" ){

           System.out.println("bu harf sessiz");
       }









    }


}


