import java.util.*;

import static java.lang.Float.isFinite;
import static java.lang.Float.isInfinite;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        //kalkulator
        float war_a = 0;
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
        }







        /*Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String war_a = myObj.nextLine();
        String war_b = myObj.nextLine();
        String war_c = myObj.nextLine();

        System.out.println(war_a + war_b + war_c);




        */
    }
}
