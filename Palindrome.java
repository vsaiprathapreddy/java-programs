public class Palindrome{
    static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args){
        String str="geekg";
       if(isPalindrome(str))
        System.out.println("Yes it is palindrome");
        else
        System.out.println("No it is not a palindrome");
    }
}