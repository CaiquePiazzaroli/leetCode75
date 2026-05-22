package PC07Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise01Problem933 {
    private Queue<Integer> calls = new LinkedList<>();

    public Exercise01Problem933() {
        
    }
    
    public int ping(int t) {
        this.calls.offer(t);

        int baseInterval = t - 3000;
        int topInteval = t;

        int result = calls.stream()
        .filter(e -> e >= baseInterval)
        .filter(e -> e <= topInteval)
        .toList()
        .size();
        
        return result;
    }
}
