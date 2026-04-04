package String;
import java.util.*;
public class isoMorphicString {
        public static boolean isIsomorphic(String s, String t) {

            HashMap<Character,Character> hm = new HashMap<>();
            int n=s.length();
            for(int i=0;i<n;i++)
            {
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);
                if(hm.containsKey(ch1))
                {
                    if(hm.get(ch1)!=ch2)
                        return false;
                }
                else if(hm.containsValue(ch2))
                {
                    return false;
                }
                hm.put(ch1,ch2);

            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(isIsomorphic(s,t));
    }
}
