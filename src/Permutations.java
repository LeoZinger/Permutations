import java.util.ArrayList;

//yet another elegant recursive solution
public class Permutations {
    public static void main( String[] args ) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        permu(0, "ABCD");
    }
    static void permu(int fixed, String s) {
        char[] chr = s.toCharArray();
        if (fixed == s.length())
            System.out.println(s);
        for (int i = fixed; i < s.length(); i++) {
            char c = chr[i];
            chr[i] = chr[fixed];
            chr[fixed] = c;
            permu(fixed + 1, new String(chr));
        }
    }
}
