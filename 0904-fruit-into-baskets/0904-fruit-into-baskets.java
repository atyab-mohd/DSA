class Solution {
    public int totalFruit(int[] fruits) {
        int last_fruit= -1, second_last_fruit= -1;
        int last_fruit_count= 0, cur_count=0, max=0;
        for(int fruit : fruits){
            if(fruit == last_fruit || fruit == second_last_fruit){
                cur_count++;
            }
            else cur_count= last_fruit_count + 1;
            if(fruit == last_fruit) last_fruit_count++;
            else last_fruit_count = 1;
            if(fruit != last_fruit){
                second_last_fruit = last_fruit;
                last_fruit = fruit;
            }
            max= Math.max(cur_count, max);
        }
        return max;
    }
}