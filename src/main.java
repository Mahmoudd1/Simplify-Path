public class main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.simplifyPath("/../.")); // output= " "/"
        System.out.println(sol.simplifyPath("/home//foo/"));// output=  "/home/foo"
        System.out.println(sol.simplifyPath("/../")); // output= "/"
    }
}
