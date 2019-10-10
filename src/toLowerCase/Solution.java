/*
    709. To Lower Case
    Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.



    Example 1:

    Input: "Hello"
    Output: "hello"
    Example 2:

    Input: "here"
    Output: "here"
    Example 3:

    Input: "LOVELY"
    Output: "lovely"
 */
package toLowerCase;

public class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            int j = (str.charAt(i) - 'A');
            if (j > -1 && j < 27) {
                c = (char) (j + 97);
            } else {
                c = str.charAt(i);
            }
            sb.append("" + c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Solution ss = new Solution();
        
        String str = "HELLO";
        System.out.println(ss.toLowerCase(str));
    }
}
