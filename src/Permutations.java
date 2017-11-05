import java.util.ArrayList;

//yet another elegant recursive solution
public class Permutations {
    public static void main( String[] args ) {
        ArrayList<String> lists = new ArrayList<String>();
        permu(0, "ABCD", lists);
        System.out.println(lists);
    }
    static void permu(int fixed, String s, ArrayList<String> lists) {
        char[] chr = s.toCharArray();
        if (fixed == s.length())
//            System.out.println(s);
            lists.add(s);
        for (int i = fixed; i < s.length(); i++) {
            char c = chr[i];
            chr[i] = chr[fixed];
            chr[fixed] = c;
            permu(fixed + 1, new String(chr), lists);
        }
    }
}
