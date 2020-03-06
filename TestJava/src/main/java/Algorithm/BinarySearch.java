package Algorithm;

public class BinarySearch {
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if(key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    //判断字符串是否是一条回文
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N/2; i++) {
            if (s.charAt(i) != s.charAt(N-1-i))
                return false;
        }
        return true;
    }

    //检查一个字符串数组中的元素是否已经按照字母表顺序排列
    public boolean isSorted(String[] a) {
        for (int i = 1; i<a.length; i++) {
            if (a[i-1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //从一个命令行参数中提取文件名和拓展名
        String s = args[0];
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());
    }
}
