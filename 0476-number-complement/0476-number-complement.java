class Solution {
    public int findComplement(int num) {
        int n=0;
        int temp=num;
        while(temp>0)
        {
        n=(n<<1)|1;
        temp>>=1;
        }
        return num^n;
    }
}