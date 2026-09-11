import java.util.HashSet;
import java.util.Set;

class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        int n = digits.length;
        
   for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            if (i == j || i == k || j == k) continue;
                 int a = digits[i], b = digits[j], c = digits[k];
                    if (a == 0) continue;         
                    if (c % 2 != 0) continue;  
                    result.add(a * 100 + b * 10 + c);
                }
            }
        }
        return result.size();
    }
}