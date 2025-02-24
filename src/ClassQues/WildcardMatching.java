package ClassQues;

public class WildcardMatching {
    public static void main(String[] args) {
        String a="s?or?";
        String b="stot?";
        System.out.println(match(a,b));
    }
   static boolean match(String a, String b){
        int n=a.length();
        int m =b.length();
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            if(a.charAt(i) != '?' && b.charAt(i) != '?'){
                 if(a.charAt(i)!=b.charAt(i)){
                     return false;
                 }
            }
        }
return true;
   }

}
