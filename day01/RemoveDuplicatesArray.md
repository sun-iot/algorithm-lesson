
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

<!--more-->
## 题目来源

[删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array)

示例1：

> 给定数组 nums = [1,1,2],
>
> 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
>
> 你不需要考虑数组中超出新长度后面的元素。

示例2：

> 给定 nums = [0,0,1,1,1,2,2,3,3,4],
>
> 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
>
> 你不需要考虑数组中超出新长度后面的元素。

## 解题思路

我其实有想到用两个指针来做，但是一直没想明白相等喝不相等情况下的逻辑处理。知道看到了大佬的题解，我才想明白。其实我可以不用管的。

首先呢，我们可以定义两个指针， index_p , index_q , 这两个指针初始化是数组的 0 ， 1 位置。做一下的逻辑分析处理：

+ 如果 arrays[index_p] 与 arrays[index_q]的，这时候不用管，我们将 index_q指针后移 1 ， 做 index_q ++ 操作；
+ 若 array[index_p] 与 arrays[index_q] 相等，我们就把 index_q 位置上的元素复制到 index_p +1 位置上，也就是 index_p 后面一个元素，最后呢，在将 index_p , index_q 双双 后挪一位
+ 输出的是 index_p + 1 ， 要的是长度 。

## 图解思路

![26.png](https://sun-iot.coding.net/p/hexo-image/git/raw/master/leetcode/26.png)

## 代码

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        // 在一个数组内做运算，不得开辟新的空间
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return 1;
        }
        // 定义两个指针，分别是前置指针和后置指针，用于标记位置
        int index_p = 0, index_q = 1;
        // 开始对整个数组进行遍历
        int array_length = nums.length;
        while (index_q < array_length) {
            // 先判断两个 index_p , index_q 位置上的元素是否一致)
            if (nums[index_p] == nums[index_q]) {
                // 将 index_q 后置指针往后移动一位
                // 这一步放在外边

            } else {
                // 如果不相等的话，就把 index_q 位置上的元素 复制到 index_p + 1 位置上，
                nums[index_p + 1] = nums[index_q];
                // 然后在吧 index_p , index_q 位置往后挪一位

                index_p++;
            }
            index_q++ ;
        }
        return index_p + 1;
    }
}
```

## 改进

目前还在根据这个程序进行改进， 程序中 `nums[index_p] == nums[index_q]` 的判断其实并没有得到实质的效果，去掉后会对程序的性能有所提升。
