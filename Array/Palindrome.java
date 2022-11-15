//Given an integer x, return true if x is a palindrome, and false otherwise.
class Palindrome{
    public boolean isPalindrome(int x) {
        int rem=0,rev=0;
        int num=x;
        boolean flag=false;
    while(x>0){
        rem=x%10;
        rev=(rev*10)+rem;
        x=x/10;
    }
        if(rev==num){
            flag=true;
        }
        return flag;
    }
}