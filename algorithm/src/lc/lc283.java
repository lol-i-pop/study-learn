package lc;

import java.util.Arrays;

/**
 * lc283
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class lc283 {
    public static void main(String[] args) {
        int[] nums = {1,0,3,5,9,0};
        nums = moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] moveZeroes(int[] nums) {
        //使用快慢指针解决
        //快指针表示当前遍历到的元素
        //慢指针表示下一个非0元素应该插入的位置
        int fastPointer = 0;
        int slowPointer = 0;

        while(fastPointer<nums.length){
            if(nums[slowPointer]!=0){
                slowPointer++;
            }
            if(nums[fastPointer]!=0 && slowPointer<fastPointer){
                nums[slowPointer] = nums[fastPointer];
                nums[fastPointer] = 0;
            }
            fastPointer++;
        }
        slowPointer++;
        while(slowPointer<nums.length){
            nums[slowPointer]=0;
            slowPointer++;
        }

        return nums;
    }
}
