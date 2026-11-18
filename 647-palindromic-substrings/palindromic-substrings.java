class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=Palindrome(s,i,i);
            count+=Palindrome(s,i,i+1);
        }
        return count;
    }
    int Palindrome(String s,int left,int right){        //function to expand and check palindrome 
        int count =0;
        while(left>=0 &&right<s.length()){
            if(s.charAt(left)!=s.charAt(right)){
                break;
            }
            count++;
            left--;
            right++;
        }
        return count;
    }
}