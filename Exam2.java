public class Exam2 {
    public static void main(String[] args) {

        // 높이를 입력해주세요 : 3                // 출력

        /*

         *

         ***

         *****

         */

        int h1 = 3;

        for(int i = 0; i<h1; i++){
            for(int j = h1-1; j > i; j--){
                System.out.printf(" ");
            }
            for(int k = 0; k < 2*i+1 ; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


        // 높이를 입력해주세요 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        int h2 = 5;

        for(int i = 0; i<h2; i++){
            for(int j = h2-1; j > i; j--){
                System.out.printf(" ");
            }
            for(int k = 0; k < 2*i+1 ; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        // 높이를 입력해주세요 : 7

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */

        int h3 = 7;

        for(int i = 0; i<h3; i++){
            for(int j = h3-1; j > i; j--){
                System.out.printf(" ");
            }
            for(int k = 0; k < 2*i+1 ; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }

}
