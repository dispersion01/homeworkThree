package ru.spypro.homework;

public class Main {
    public static void main(String[] args) {
        //exerciseOne();
        //exerciseTwo();
        exerciseThree();
    }


    public static void exerciseOne(){
        int i = 1;
            while ( i <=10 ) {
                System.out.print(" " + i++);
            }
        System.out.println();
            for (int a = 10; a >= 1; ){
                System.out.print(" " + a--);
            }
        /* бесконечный цикл - не удается обойти
        for (;  (i>=1) && (i <= 10);) {
            System.out.print(" " + i--);
        }*/
   }
   public static void exerciseTwo(){

         for(int friday = 5; friday <= 31; friday = friday + 7) {
             System.out.println("Сегодня пятница, " + friday +"-е число. Необходимо подготовить отчет.");
         }
   }

   public static void exerciseThree(){
        int cometCloseEarth = 79;
        int startYear = 1817;
        for (; (startYear <= 200) && (startYear >=100); startYear = startYear + cometCloseEarth) {
            System.out.println(startYear);
        }
   }



}
