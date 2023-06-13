class Solution {
    int base = 1337;
    public int superPow(int a, int[] b) {
        return getResult(a, b, b.length);
    }
    
    private int getResult(int a, int[] b, int length) {
        if (length == 0) return 1;
        
        int last = b[length - 1];
        
        int part1 = myPow(a, last);
        int part2 = myPow(getResult(a, b, length - 1), 10);
        
        return part1 * part2 % base;
    }
    
    private int myPow(int a, int k) {
        
        if (k == 0) return 1;
        
        int res = 1;
        a = a % base;
        for (int i = 1; i <= k; i++) {
            res = res * a;
            res= res % base;
        }
        
        return res;
    }
}
