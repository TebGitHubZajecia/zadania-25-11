import java.util.*;

public class Main {




    public static void main(String[] args) {






        //tabliczka mnożenia
        /*for(int i = 1; i < 10; i++){
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for (int x = 1; x < 10; x++){
                lista.add(i*x);
            }
            System.out.println(lista);
        }*/




        //totolotek
        /*Scanner scan = new Scanner(System.in);
        ArrayList<Integer> wybor = new ArrayList<Integer>();
        for (int i = 0; i < 6;){
            System.out.println("Podaj liczbę: " + (i+1));
            int number = scan.nextInt();
            if(!wybor.contains(number)){
                wybor.add(number);
                i++;
            } else {
                System.out.println("Ta liczba już była podana");
            }
        }
        Collections.sort(wybor);
        System.out.println(wybor);


        ArrayList<Integer> liczby = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 6;){
            int number = rand.nextInt(1, 50);
            if (!liczby.contains(number)){
                liczby.add(number);
                i++;
            }
        }
        Collections.sort(liczby);
        System.out.println("Wylosowane liczby " + liczby);


        ArrayList<Integer> pasujace = new ArrayList<Integer>();
        for (int liczba : liczby){
            if (wybor.contains(liczba)){
                pasujace.add(liczba);
            }
        }
        Collections.sort(pasujace);
        System.out.println("Pasujące liczby " + pasujace);*/









        //liczby pierwsze
        /*Scanner scan = new Scanner(System.in);
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        int x = scan.nextInt(); //dolny przedział
        int y = scan.nextInt(); //górny przedział
        for (int i = x ; i < y ; i++){ // i - przechodzi przez liczby od dolnego do górnego przedziału
            int z = 0; //liczba dzielników liczby
            for (int a = 1; a <= i; a++){ // a - sprawdza czy liczba jest dzielnikiem
                if (i % a == 0) z++;
            }
            if (z == 2) liczby.add(i); //jeżeli liczba ma 2 dzielniki, to jest pierwsza, dodaj do listy
        }
        System.out.println(liczby);*/




    }





    /*static void sprawdz(String wyraz) {
        System.out.println(wyraz);
        System.exit(1);
    }

    static void porownaj(String wyraz, String[] array) {
        System.out.println("Z którym wyrazem porównać?");
        Scanner scan = new Scanner(System.in);
        int war2 = scan.nextInt();
        System.out.println(wyraz + " " + array[war2]);
        System.out.println(wyraz.compareTo(array[war2]));
        System.exit(1);
    }

    static void dodaj(String wyraz, String[] array) {
        System.out.println("Który wyraz chcesz dodać?");
        Scanner scan = new Scanner(System.in);
        int war2 = scan.nextInt();
        System.out.println(wyraz.concat(array[war2]));
        System.exit(1);
    }

    static void znajdz(String wyraz) {
        System.out.println("Jaki znak chcesz znaleźć?");
        Scanner scan = new Scanner(System.in);
        String war2 = scan.nextLine();
        System.out.println("Indeks znaku: " + wyraz.indexOf(war2));
        System.exit(1);
    }

    static void length(String wyraz) {
        System.out.println("Długość wynosi: " + wyraz.length());
        System.exit(1);
    }


    static void casee(String wyraz) {
        System.out.println(wyraz.toUpperCase().charAt(0) + wyraz.substring(1));
        System.exit(1);
    }

    static void con(String wyraz) {
        System.out.println("Index 1");
        Scanner scan = new Scanner(System.in);
        int war2 = scan.nextInt();
        System.out.println("Index 2");
        int war3 = scan.nextInt();
        System.out.println(wyraz.substring(war2, war3));
        System.exit(1);
    }

    static void dlugosc(String wyraz, String[] array) {
        System.out.println("Z którym wyrazem porównać?");
        Scanner scan = new Scanner(System.in);
        int war2 = scan.nextInt();
        String slowo = wyraz.length() > array[war2].length() ? wyraz : array[war2];
        System.out.println("Dłuższy:" + slowo);
        System.exit(1);
    }

    static void pali(String wyraz, String[] array) {
        System.out.println("Z którym wyrazem porównać?");
        Scanner scan = new Scanner(System.in);
        int war2 = scan.nextInt();
        wyraz = wyraz.replace(" ", "");
        array[war2] = array[war2].replace(" ", "");
        wyraz = wyraz.toLowerCase();
        array[war2] = array[war2].toLowerCase();

        System.out.println("wyraz 1 " + wyraz);
        System.out.println("wyraz 2 " + array[war2]);

        if (wyraz.length() != array[war2].length()) {
            System.out.println("To nie palindrom");
            System.exit(1);
        }

        int x = -1;
        for (int i = 0; i < wyraz.length(); i++) {
            try {
                if (wyraz.charAt(i) == array[war2].charAt(array[war2].length() + x)) {
                    x -= 1;
                } else {
                    System.out.println("To nie palindrom");
                    System.exit(1);
                }
            } catch (Exception Exception) {
                System.out.println("To nie palindrom");
            }
        }
        System.out.println("To palindrom");
        System.exit(1);
    }


    public static void main(String[] args) {


        //z2
        String[] array = new String[3];
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj słowo 0");
        array[0] = myObj.nextLine();
        System.out.println("Podaj słowo 1");
        array[1] = myObj.nextLine();
        System.out.println("Podaj słowo 2");
        array[2] = myObj.nextLine();
        System.out.println("Wybierz słowo 0/1/2");
        int war = myObj.nextInt();
        String s = """
                1.Sprawdź
                2.Porównaj leksykograficznie
                3.Dodaj wyraz do drugiego
                4.Znajdź znak
                5.Długość wyrazu
                6.Wielka litera
                7.Przycięcie wyrazu
                8.Porównaj długość
                9.Palindrom""";
        System.out.println(s);
        int zad = myObj.nextInt();
        switch (zad) {
            case 1:
                sprawdz(array[war]);
                break;
            case 2:
                porownaj(array[war], array);
                break;
            case 3:
                dodaj(array[war], array);
                break;
            case 4:
                znajdz(array[war]);
                break;
            case 5:
                length(array[war]);
                break;
            case 6:
                casee(array[war]);
                break;
            case 7:
                con(array[war]);
                break;
            case 8:
                dlugosc(array[war], array);
                break;
            case 9:
                pali(array[war], array);
                break;
            default:
                break;
        }
    }*/

        //z1
        /*String ciag1 = "abc";
        String ciag2 = "123";

        String ciag3 = ciag1 + ciag2;

        String ciag4 = ciag1.concat(ciag2);*/

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
            System.out.println(i + " : " + tablica[i]);
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