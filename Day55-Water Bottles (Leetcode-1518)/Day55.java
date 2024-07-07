class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int remaining=0;
        int divide=0;
        do{
            divide = numBottles/numExchange;
             remaining = numBottles-numExchange*divide;
             numBottles=divide;
            drink=drink+divide;
            numBottles=remaining + divide;
        }while(numBottles>=numExchange);
        return drink;
    }
}
