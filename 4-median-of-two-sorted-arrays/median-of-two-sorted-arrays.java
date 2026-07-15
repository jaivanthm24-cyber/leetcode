class Solution {
    public double findMedianSortedArrays(int[] left, int[] right) {
        int[] temp = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;        
        while (i < left.length && j < right.length) {           
            if (left[i] <= right[j]) temp[k++] = left[i++];            
            else temp[k++] = right[j++];
        }
        while (i < left.length) temp[k++] = left[i++];        
        while (j < right.length) temp[k++] = right[j++];
        int totalLength =left.length+right.length;
        if (totalLength % 2 == 0) {
            return (temp[totalLength / 2 - 1]
                    + temp[totalLength / 2])/2.0 ;
        } else {
            return temp[totalLength / 2];
        }
    }
}