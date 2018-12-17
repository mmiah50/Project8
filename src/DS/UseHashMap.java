package DS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> state = new LinkedHashMap<String, String>();
        state.put("USA", "NY");
        state.put("Canada", "Toronto");
        state.put("UK", "London");
        for(Map.Entry entry:state.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }


}
