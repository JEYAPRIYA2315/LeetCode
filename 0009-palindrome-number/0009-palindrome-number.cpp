class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
       long reverse=0;
       int temp=x;
       while(temp!=0)
       {
         int digit=temp%10;
          reverse=reverse*10+digit;
         temp/=10;
       } 
       return(x==reverse);
    }
};