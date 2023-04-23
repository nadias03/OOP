package towary;

import java.util.*;

public class TrefnyTowar extends TowaryOgolnie {
    private String nazwa;
    private static final List<String> nazwyTrefnychTowarow = Arrays.asList("bron", "alkohol bez banderli", "bursztyn", "lopatka wieprzowa");
    private static final Map<String, List<Integer>> daneTrefnychTowarow = new HashMap<>();
    static {
        daneTrefnychTowarow.put("bron", Arrays.asList(15000, 12000));
        daneTrefnychTowarow.put("alkohol bez banderoli", Arrays.asList(700, 750, 800));
        daneTrefnychTowarow.put("bursztyn", Arrays.asList(3500));
        daneTrefnychTowarow.put("lopatka wieprzowa", Arrays.asList(1450, 1350));
    }

    public TrefnyTowar() {
        Random rand = new Random();
        this.nazwa = nazwyTrefnychTowarow.get(rand.nextInt(nazwyTrefnychTowarow.size()));
        List<Integer> mozliweWartosci = daneTrefnychTowarow.get(nazwa);
        System.out.println(mozliweWartosci);   // dlaczego to jest null
        this.setWartoscCzarnorynkowa(mozliweWartosci.get(rand.nextInt(mozliweWartosci.size())));
    }

    public void printMe() {
        System.out.print("Mozliwe nazwy trefnych towarow to: ");
        for (String n : nazwyTrefnychTowarow) {
            System.out.print(n + " ");
        }
    }
}
