class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minprice=INT_MAX;
        int maxProfit=0;
        for(int price:prices)
        {
            if(price<minprice)
            {
                minprice=price;
            }
                else if(price-minprice > maxProfit)
                {
                    maxProfit=price-minprice;
                }
            }
            return maxProfit;
        }
    
};