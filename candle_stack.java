//You are given a list of candle boxes stacked top to bottom, and a number n.

//You need to find the minimum number of top boxes to open so that you have all candles numbered from 1 to n (inclusive).
public static int count_boxes_to_get_candles(int n, List<Integer> stack) {
    Set<Integer> found = new HashSet<>();
    
    for (int i = 0; i < stack.size(); i++) {
        int candle = stack.get(i);
        if (candle >= 1 && candle <= n) {
            found.add(candle);
        }
        if (found.size() == n) {
            return i + 1;  // i is 0-indexed, so +1 boxes opened
        }
    }
    
    return stack.size();  // Fallback: all boxes opened (in case something is missing)
}
