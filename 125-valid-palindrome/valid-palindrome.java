class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left= 0;
        int right = s.length()-1;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!isalnum(l)){
                left++;
            }
            else if(!isalnum(r)){
                right--;
            }
            else{
                if(l!=r){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    boolean isalnum(char ch){
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')
            return true;
        return false;
    }
}