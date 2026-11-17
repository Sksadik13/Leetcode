class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i =0;i<s.length();i++){
            String sub="";
            for(int j=i;j<s.length();j++){
                if(checkPalindrome(s,i,j)==true){
                    count++;
                }
            }
        }
        return count;
    }
    boolean checkPalindrome(String s,int left,int right){
        while(right>left){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}