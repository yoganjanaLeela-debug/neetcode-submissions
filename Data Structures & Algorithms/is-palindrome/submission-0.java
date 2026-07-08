class Solution {
    public boolean isPalindrome(String s) {
       String ans = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
       String og=ans;
       String r=new StringBuilder(ans).reverse().toString();
       String rev=r; 
       for(int i=0;i<ans.length();i++){
        if(og.charAt(i)!=rev.charAt(i)){
            return false;
        }
       }
       return true;
    }
}
