public class GetAllSubsequencies {

    static void gss(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        //pick
        gss(s.substring(1), ans + s.charAt(0));

        // not pick
        gss(s.substring(1), ans);
    }

    public static void main(String[] args) {
        gss("abc","");
    }

}
