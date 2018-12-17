package DS;

import java.util.*;

public class UseHashMapList {
    public static void main(String[] args) {
        List<String> cityOfUsa = new ArrayList<String>();
        cityOfUsa.add("NY");
        cityOfUsa.add("NJ");
        cityOfUsa.add("CA");

        List<String> cityOfCanada = new ArrayList<String>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Ottowa");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Scotland");

        Map<String, List<String>> list = new LinkedHashMap<>();
        list.put("USA", cityOfUsa);
        list.put("Canada", cityOfCanada);
        list.put("UK", cityOfUK);

        for(Map.Entry entry:list.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }
}
