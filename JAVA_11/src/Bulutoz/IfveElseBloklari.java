package Bulutoz;

public class IfveElseBloklari {
    public static void main(String[] args) {
         int a = 10;
         int b = 20;
         int c = 30;

       /* if(a==b){
            System.out.println("A ve B sayilari birbirine esittir : ");
        }else{
            System.out.println("Ave B sayilari birbirene esit degil :");
        }*/

       if(b==c) {
           System.out.println("B ve C esittir. ");
       }else if(a>c){
           System.out.println("A büyüktür C den.");
       }else{
           System.out.println(("B ve C esit degil"));
       }
    }
}
