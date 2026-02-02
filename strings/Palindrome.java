package strings;

public class Palindrome {
    public static void main(String[]args){
        String str="abcbcba"

        for(int i=0;i<str.length;i++){
            char start=str.charAt();
            char end=str.charAt(str.length()-1-i);
            
            if(start!=end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abcbcbag";
        boolean result Solution(str);
        returns result;
    }
        

        
    
}
