package DS;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<Integer, String> state = new HashMap<Integer, String>();
        state.put(1, "NY");
        state.put(2, "NJ");
        state.put(3, "FL");

        System.out.println(state.get(2));
    }
}
