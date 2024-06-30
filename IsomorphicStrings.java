import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            /*
             * For any key in the HashMap, if the corresponding value is
             * not equal to the character of t, i.e.,
             * for same key, values are different, so return false
             */
            if (hm.containsKey(s.charAt(i))) {
                if (hm.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                /*
                 * For any new key in the HashMap, if the character of t
                 * already exist, i.e., for two different keys, values are same,
                 * so return false
                 */
                if (hm.containsValue(t.charAt(i)))
                    return false;
                else
                    hm.put(s.charAt(i), t.charAt(i));
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "bar";
        System.out.println("Are strings \"" + s1 + "\" and \"" + s2 + "\" isomorphic? " + isIsomorphic(s1, s2));

        String s3 = "egg";
        String s4 = "add";
        System.out.println("Are strings \"" + s3 + "\" and \"" + s4 + "\" isomorphic? " + isIsomorphic(s3, s4));

        String s5 = "paper";
        String s6 = "title";
        System.out.println("Are strings \"" + s5 + "\" and \"" + s6 + "\" isomorphic? " + isIsomorphic(s5, s6));
    }
}
