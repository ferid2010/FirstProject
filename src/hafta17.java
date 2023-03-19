public class hafta17 {

    public static void main(String[] args) {

        for (int i = 0 ; i < 6; i++) {


            for (int j = 0; j < 6; j++) {
                if(i<=j) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }



            }

            System.out.println();


        }



       int[] matScores2 = {100,90,100,50,100,100,10,40,80,100};

       int ortalama = (matScores2[0] + matScores2[1] + matScores2[2] + matScores2[3] + matScores2[4] +
                matScores2[5] + matScores2[6] +  matScores2[7] + matScores2[8] + matScores2[9])/ 10;

        System.out.println(ortalama);







        //odev 1

        for (int i = 0; i <= 5; i++) {

            System.out.print("*\n");

            for (int j = 0; j <5 ; j++) {

                System.out.print("*");



        }


        }

    }


}





