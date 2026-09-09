class Solution {
    public long countCommas(long n) {

        long count = 0;

        if (n >= 1000) {
            count += n - 1000 + 1;
        }

        if (n >= 1000000) {
            count += n - 1000000 + 1;
        }

        if (n >= 1000000000L) {
            count += n - 1000000000L + 1;
        }

        if (n >= 1000000000000L) {
            count += n - 1000000000000L + 1;
        }

        if (n >= 1000000000000000L) {
            count += n - 1000000000000000L + 1;
        }

        return count;
    }
}