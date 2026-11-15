class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        String str="";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str+=ch;
            }
        }
        String rev = ReverseStr(str);
        return str.equals(rev);
    }
    String ReverseStr(String s){
        int left=0;
        int right=s.length()-1;
        char[]arr = s.toCharArray();
        while(left<=right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}