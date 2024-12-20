import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    private final Map<String, List<Pair<Integer, String>>> store = new HashMap<>();

    public void set(String key, String value, int timestamp){
        store.computeIfAbsent(key, (k)->new ArrayList<>()).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> pairs = store.getOrDefault(key, new ArrayList<>());
        int l = 0;
        int r = pairs.size()-1;
        String res = "";
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (pairs.get(mid).getTimestamp() < timestamp) {
                res = pairs.get(mid).getValue();
                l = mid + 1;
            } else if (pairs.get(mid).getTimestamp() > timestamp) {
                r = mid - 1;
            } else {
                return pairs.get(mid).getValue();
            }
        }
        return res;
    }

    public static class Pair<T,V> {
        private final T timestamp;
        private final V value;

        public Pair(T timestamp, V value) {
            this.timestamp = timestamp;
            this.value = value;
        }

        public T getTimestamp() {
            return timestamp;
        }

        public V getValue() {
            return value;
        }
    }
}
