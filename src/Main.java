import java.util.*;

import static java.lang.Float.isFinite;
import static java.lang.Float.isInfinite;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {


        //z6
        /*int x = 0;
        char[] tablica = new char[26];
        for(int i = 97; i < 123; i++){
            tablica[x] = (char)i;
            System.out.println(tablica[x]);
            x+=1;
        }*/

        //z5
        /*int[] tablica = new int[100];
        int x = 0;
        for(int i = 0; i < 100; i++){

            tablica[i] = x;
            if (x == 9){
                x = 0;
            } else {
                x+=1;
            }
            System.out.println(i + ":" + tablica[i]);
        }*/

        //z4
        /*boolean[] tablica = new boolean[20];
        for(int i = 0; i < 20; i++){
            tablica[i] = i%2==0 ? true : false;
            System.out.println(i + ":" + tablica[i]);
        }*/

        //z3
        /*boolean[] tablica = new boolean[20];
        for(int i = 0; i < 20; i++){
            if(i%2==0){
                tablica[i] = true;
            } else {
                tablica[i] = false;
            }
            System.out.println(i + ":" + tablica[i]);
        }*/

        //z2
        /*int tablica[] = new int[10];
        int war = 10;
        for(int i = 0; i < 10; i++){
            tablica[i] = war;
            war+=10;
            System.out.println(tablica[i]);
        }*/


        //z1
        /*int tablica[] = new int[10];
        int war = 101;
        for(int i = 0; i < 10; i++){
            tablica[i] = war;
            war+=1;
            System.out.println(tablica[i]);
        }*/


        //kalkulator
        /*float war_a = 0;
        float war_b = 0;
        float war_d = 0;
        while (true) {
            try {
                Scanner myObj = new Scanner(System.in);
                System.out.println("Podaj liczbę a");
                war_a = myObj.nextFloat();
                System.out.println("Podaj liczbę b");
                war_b = myObj.nextFloat();
                break;
            } catch (Exception Exception) {
                System.out.println("To nie jest liczba!");
            }
        }

        System.out.println("podaj + - / lub *");
        Scanner myObj2 = new Scanner(System.in);
        String war_c = myObj2.nextLine();

        try {
            war_d = switch (war_c) {
                case "+" -> war_a + war_b;
                case "-" -> war_a - war_b;
                case "/" -> war_a / war_b;
                case "*" -> war_a * war_b;
                default -> throw new Exception();
            };
            boolean b = isFinite(war_d);
            if (b){
                System.out.println(war_d);
            } else {
            System.out.println("dzielenie przez 0");
            System.exit(1);
            }
        }
        catch(Exception Exception){
            System.out.println("zła operacja");
        }

        float war_e = 0;
        while(true){
            while (true) {
                try {
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Podaj liczbę c");
                    war_e = myObj.nextFloat();
                    break;
                } catch (Exception Exception) {
                    System.out.println("To nie jest liczba!");
                }
            }

            System.out.println("podaj + - / lub *");
            Scanner myObj3 = new Scanner(System.in);
            war_c = myObj3.nextLine();

            try {
                war_d = switch (war_c) {
                    case "+" -> war_d + war_e;
                    case "-" -> war_d - war_e;
                    case "/" -> war_d / war_e;
                    case "*" -> war_d * war_e;
                    default -> throw new Exception();
                };
                boolean b = isFinite(war_d);
                if (b){
                    System.out.println(war_d);
                } else {
                    System.out.println("Dzielenie przez 0");
                    System.exit(1);
                }
            }
            catch(Exception Exception){
                System.out.println("Zła operacja");
            }
        }*/







        /*Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String war_a = myObj.nextLine();
        String war_b = myObj.nextLine();
        String war_c = myObj.nextLine();

        System.out.println(war_a + war_b + war_c);




        */
    }
}
