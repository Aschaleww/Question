//An array is called centered-15 if some consecutive sequence of elements of the array sum to
//15 and this sequence is preceded and followed by the same number of elements. For example
//{3, 2, 10, 4, 1, 6, 9} is centered-15 because the sequence 10, 4, 1 sums to 15 and the
//sequence is preceded by two elements (3, 2) and followed by two elements(6,9).
//Write a method called isCentered15 that returns 1 if its array argument is centered-15, otherwise
//it returns 0.
    
    
public class centered15 {
    public static void main(String[] args) {
        System.out.println("{3, 2, 10, 4, 1, 6, 9} centered15 status: " + f(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println("{2, 10, 4, 1, 6, 9} centered15 status: " + f(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println("{3, 2, 10, 4, 1, 6}  centered15 status: " + f(new int[]{3, 2, 10, 4, 1, 6} ));
        System.out.println("{1,1,8, 3, 1, 1} centered15 status: " + f(new int[]{1,1,8, 3, 1, 1}));
        System.out.println("{9, 15, 6}  centered15 status: " + f(new int[]{9, 15, 6} ));
        System.out.println("{1, 1, 2, 2, 1, 1}  centered15 status: " + f(new int[]{1, 1, 2, 2, 1, 1} ));
        System.out.println("{1, 1, 15, -1,-1}  centered15 status: " + f(new int[]{1, 1, 15, -1,-1} ));
        System.out.println("{1, 1, 14, 1, 1,-1}  centered15 status: " + f(new int[]{1, 1, 14, 1, 1,-1} ));
    }
    public static int f(int[] a) {
        if(a.length < 3) return 0;
        int i, j;
        for(i = 1; i < a.length - 1; i++) {
           int sum = 0;
            for(j = i; j < a.length -i; j++) {
                sum += a[j];
                if(sum > 15) break;
            }
            if(sum == 15 ) return 1;
        }
        return 0;
    }
}
