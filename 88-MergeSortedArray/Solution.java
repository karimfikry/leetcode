public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int pa = m - 1;
        int pb = n - 1;
        int p = m + n - 1;

        while(p >= 0) {
            if(pb < 0 || (pa >= 0 && A[pa] > B[pb])) {
                A[p--] = A[pa--];
            } else {
                A[p--] = B[pb--];
            }
        }
    }
}
