public class Solution {
    public int sqrt(int x) {
        if(x<0) throw new IllegalArgumentException("x cannot be negative");
        if(x<2) return x;
        int a = 1, b = x;
        while (a < b-1) {
            int m = (a+b)/2;
            if(m*m > x) b = m;
            else if(m*m < x) a = m;
            else return m;
        }
        if(b*b<=x) return b;
        return a;
    }
}
