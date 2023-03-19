import java.util.Scanner;

public class hafta16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        int toplam = 0;

        do{

            for (int i = 0; i <= 100 ; i = i + 5) {

                toplam = toplam + i;


            }

        }while (toplam <= 100);

        System.out.println(toplam);


        //nested loop

       for (int i = 0; i <= 5; i++) {

            System.out.print("*\n");

            for (int j = 0; j <5 ; j++) {

                System.out.print("*");

            }
        }





        System.out.println("\n\n\n\n\n");





        for (int i = 1; i <= 10 ; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.print(i + " x " + j + " = " + i * j + "  ");

            }

        }
        System.out.println("\n\n\n\n\n");
        //array





        String myArray = new String();
        String [] myArray2 = new String [7];

        int benimsayim =6;
        int[]benimsayilarim = new int[5];

        for (int i = 0; i < 7; i++) {

            myArray2 [i] = scanner.next();
            
        }

        myArray2[0] = "Ptesi";
        myArray2[1] = "Sali";
        myArray2[2] = "Carsa";
        myArray2[3] = "Pers";
        myArray2[4] = "Cum";
        myArray2[5] = "Ctesi";
        myArray2[6] = "pazar";

        for (int i = 0; i < 7; i++) {

            System.out.println("myArray2[" + i + "] = " + myArray2[i]);
            
        }

        //odev 2

        String [] myArray3 = new String [11];

        for (int i = 0; i <= 10; i++) {

            myArray3 [i] = scanner.next();

        }

        for (int i = 1; i <= 10; i++) {

            myArray3 [i] = "arkadas" + i;

        }

        for (int i = 1; i <= 10; i++) {

            System.out.println("myArray[" + i + "] = " + myArray3[i]);

        }





    }
}

