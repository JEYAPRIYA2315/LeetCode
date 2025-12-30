class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
    int rev=0;
    int rev1=0;
    while(num!=0)
    {
        int digit=num%10;
        rev=rev*10+digit;
        num/=10;
    } 
    int temp=rev; 
    while(temp!=0)
    {
      int digit=temp%10;
      rev1=rev1*10+digit;
      temp/=10;
    }
    if(original==rev1)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
}