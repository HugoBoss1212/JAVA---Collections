package Collections;
import java.util.*;

public class main {

    static class Osoba implements Comparable<Osoba> {
        private String imie;
        private String nazwisko;

        Osoba(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        @Override
        public String toString() {
            return this.imie + " " + this.nazwisko;
        }

        @Override
        public int compareTo(Osoba o) {
            if (o.getImie().compareTo(imie) < 0) return 1;
            if (o.getImie().compareTo(imie) > 0) return -1;
            return 0;
        }
    }

    public static void main(String[] args) {

//--------------------PriorityQueue-------------------
        System.out.println("\n//--------------------PriorityQueue-------------------");
        Osoba o1 = new Osoba("Jan", "Kowalski");
        Osoba o2 = new Osoba("Alicja", "Rys");
        PriorityQueue<Osoba> pq = new PriorityQueue<>();
        pq.add(o1);
        pq.add(o2);
        for (Object aPq : pq) {
            System.out.println(aPq);
        }


//-------------------ArrayList------------------------
        System.out.println("\n//-------------------ArrayList------------------------");
        //szybki dostep do elementow // usuwanie i wstawianie nowych elementow malo efektywne
        List<String> lista = new ArrayList<>(Arrays.asList("Sylwek", "Tomek"));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        lista.add("Mariusz");
        System.out.println(lista);
        System.out.println(lista.get(1));
        System.out.println(lista.contains("S"));
        System.out.println(lista.contains("Sylwek"));
        ArrayList<String> lista2 = new ArrayList<>(Arrays.asList("Wiktor", "Andrzej"));
        lista.addAll(lista2);
        lista.remove("Tomek");
        lista.remove(1);
        Collections.reverse(lista);
        System.out.println("----------odwrócenie--------------\n" + lista);
        Collections.sort(lista);
        System.out.println("----------sortowanie--------------\n" + lista);
        //lista.replaceAll(x -> x * x);
        //lista.clear(); --- czyszczenie listy

        // ----------------ITERATORY---------------------------------------------
        System.out.println("\n//-------------------Lista iterowana-------------------");
        for (Object aLista : lista) {
            System.out.println("Imie: " + aLista);
        }
        System.out.println("\n//-------------------Lista iterowana od tylu------------");
        ListIterator lIt = lista.listIterator(lista.size());
        while (lIt.hasPrevious()){
            System.out.println("imie: " + lIt.previous());
        }
        System.out.println("\n//------------------for-each-iterowanie-----------------");
        for (String element: lista){
            System.out.println(element);
        }


//----------------------------LinkdedList---------------------------------------------
        System.out.println("\n//-------------------LinkdedList------------------------");
        List <Integer> ll = new LinkedList<>(Arrays.asList(1,3,5,7,9));
        System.out.println(ll);
        ll.add(1,2); //wstawienie na pozycji 1 elementu "2"
        System.out.println(ll);

//------------------------HashSet--------------------------
        System.out.println("\n//-------------------HashSet------------------------");
        Set <String> hs = new HashSet<>();
        hs.add("maslo");
        hs.add("maslo");
        hs.add("jajka");
        System.out.println(hs);
        //add, contains, remove

//--------------------TreeSet--------------------------------
        System.out.println("\n//-------------------TreeSet------------------------");
        Set<String> ts = new TreeSet<>();
        ts.add("python");
        ts.add("java");
        System.out.println(ts);
        //automatyczne sortowanie, add, remove,

//-------------------hashMap--------------------------------
        System.out.println("\n//-------------------hashMap------------------------");
        Map<String, Integer> hm = new HashMap<>();
        hm.put("batonik", 2);
        hm.put("cola", 1);

        System.out.println(hm.get("cola"));
        Set <String> klucze = hm.keySet();
        for (String klucz: klucze){
            System.out.println(klucz + " : "+hm.get(klucz));
        }

//-----------------------Queue-------------------------------------------
        System.out.println("\n//-------------------Queue------------------------");
        ArrayDeque<String> ad = new ArrayDeque<>(Arrays.asList("jesc", "pic", "spac"));

        ad.addFirst("cpac");
        ad.addLast("smarkac");
        try{
            System.out.println(ad.getFirst());
            System.out.println(ad.removeFirst());
            System.out.println(ad.getLast());
            System.out.println(ad.removeLast());
            System.out.println(ad);
        }
        catch (NullPointerException | NoSuchElementException e ){System.err.println(e);}
        //bez wyjatkow offer, poll, peek //LIFO = addFirst and removeFirst
    }

}