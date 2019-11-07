# Leetcode-Yllnss

## 实用技巧
- int[]转List 
  List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
- 不使用额外空间交换 两个数
  a = a ^ b
  b = a ^ b
  a = a ^ b
  原理：如果 a ^ b = c 则 a ^ c = b   b ^ c = a
- for(Integer num : a) 和 for(int num : a) 效率相差很大，请根据a的类型选择
- List<List<Integer>> result = new LinkedList<>();

    ```java
    result.add(new LinkedList<>(Arrays.asList(1,3)));
    result.add(new LinkedList<>(Arrays.asList(1,4)));
    ```
- Integer.parseInt   Integer.toBinaryString();
- int i = ((day + 2 * month + 3 * (month + 1)/5 + year + year / 4 - year / 100 + year / 400) %7);
 i%7 = 0 Monday 计算周几的方法
- 对有限范围内重复出现的数进行计数，并输出
 1.map保存（数，计数）最慢
 2.int[] a = new int[数出现的范围+1];
  Set<Integer> set = new HashSet();
  a[num[i]]++  set.add(num[i]);
  然后遍历set读出
 3.int[] a = new int[数出现的范围+1];
  然后直接遍历a读出
  
  效率3>2>1,这里的3>2的情况是数出现的范围不太大，但是如果出现2>3，说明int[] a 这样都不太好了，所以以后遇到直接用第3种
- 位运算
 1.最后一位置1其他变为0：x & -x . 
 2.最后一位1置0 : x &(x-1) 
 3.（1 << n）-1 就生成了n个1组成的二进制数


## 1071.字符串的最大因子（求公因子通用方法）

- 辗转相除
 思路：取两个数中最大的数做除数，较小的数做被除数，用最大的数除较小数，如果余数为0，则较小数为这两个数的最大公约数，如果余数不为0，用较小数除上一步计算出的余数，直到余数为0，则这两个数的最大公约数为上一步的余数。
1、递归

private static int gcd(int a,int b) {
        return (b==0)?a:gcd(b,a%b);
    }



2、非递归形式

private static int gcd(int a, int b) {
        int rem = 0;
        while (b != 0) {
             rem= a % b;
            a = b;
            b = rem;
        }
        return a;
    }

原文链接：https://blog.csdn.net/qq_36172443/article/details/79716070
- 更相减损

## 39.组合总和（难写）
- 动态规划（想法简单，代码实现难，对于这道题效率低）
- 回溯+剪枝

## 754.到达终点数字（数学）

 首先， 由于坐标轴是对称的，往左往右走的几率相等，因此可以只考虑右半轴。先递推一下可以知道:

 步数        能到达的位置
1:          1
2:          3, 1
3:          6, 4, 2, 0
4:          10, 8, 6, 4, 0
5:          15, 13, 11, 9, 7, 5, 3, 1
...
 可以看出来，每一步能到达的最大位置是上一步最大位置加上步数，而每一步所能达到的位置之间间隔都为2。
记f(n)为第n步能到达的位置，那么有：

max(f(n)) = max(f(n-1)) + n
f(n) = [max(f(n)),  max(f(n)) - 2, max(f(n)) - 4, ....]
如果target可以在第n步达到，那么target一定小于等于max(f(n))且max(f(n))与taget同奇同偶。

aqs

## 877.石子游戏（数学，dp）
很多堆石头【a,b,c,d】，一次拿一堆，但是只能从最左或者最右拿，1先拿，2后，给一个数组表示石头堆，返回一个结果（true，false）表示1是否能赢，数组.length %2 == 2
- 数学想法
 直观看的话，因为数组是偶数，所以一定是一人拿一半，那么总有一半石头总和多，那么只要1采取那种取法，则能稳赢，所以直接 return true;
- 动态规划
 现在假设石头堆书是奇数，那么这道题需要用动态规划：
 设dp(i, j)表示从包括i到包括j的石堆拿石头能得到最大石头数，根据是从左边拿还是右边拿，还写不出来转移方程，因为这个从左还是从右要看2是怎么拿的，所以还需要设置一个表示对手2是怎么拿的维度。
 设dp(i, j).fir 表示1从i-j石堆能取得的最大值，dp(i, j).sec表示2取得的最大值。
 dp(i, j).fir = max{dp(i+1, j).sec+pliles[i],  dp(i, j-1).sec+piles[j]}
 注意这里 是   i+1, j-1    i,j作为最左最右，整个状态方程是一个向外扩张的过程

## 338.比特位计数（数学，dp）
注意观察
0	0	0
1	1	1
------------------
2	10	1
3	11	2
------------------
4	100	1
5	101	2
6	110	2
7	111	3
可以看到2和3就是在之前的前面加了一个1，4567就是在0123基础上前面又加上了一个1

## 127.单词接龙（BFS）
 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：

每次转换只能改变一个字母。
转换过程中的中间单词必须是字典中的单词。
说明:

如果不存在这样的转换序列，返回 0。
所有单词具有相同的长度。
所有单词只由小写字母组成。
字典中不存在重复的单词。
你可以假设 beginWord 和 endWord 是非空的，且二者不相同。

beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog]
输出  5

- 单向bfs
想法：从beginWord的第一位开始，从a-z生成新的单词，每生成一个新的单词，就和wordList比较，是否在wordList里面，并且是为曾访问过的，如果是，那么就加入队列，然后通过第二位生成，按照上面的步骤，直到每一位都被访问完成。然后pop队列头，不断重复，直到找到endWord

这种方法能70%左右，但是有个问题就是，当树特别大的时候，找到endword需要很多时间，于是衍生了双向bfs
- 双向bfs
想法：分别从beginword和endword出发，选择含有元素更少的队列，每次做个交换，然后运用单向bfs的想法。代码：
https://github.com/fukunee/shamenote/blob/master/leetCode/ljz/leetcode/leetcode/editor/cn/WordLadder.java

## 52.N皇后问题（回溯+bitmap位运算）
参照实用技巧里面对位运算的几个介绍

```java
private int x = n, ret = 0; //n就是n个皇后
private void back(int row, int col, int left, int right) {
    //如果row现在已经摆满了棋盘
    if (row >= x) {
        ret++;
        return;
    }
    //col || left || right代表的是，计算新的一行里面，哪些
    //位置是不能放的
    //再来一个取反，就是能放的
    //(1<<x)-1这句话是生成一个长度为x的全为1的数,先把1往左			
    //移动x位，然后-1
    //例如：x = 10, 1<<x=1 00 0000 0000,(1<<x)-1 =  1111 1111 11;
    //二者交集，就是这一行可以取到的所有位置（为1的地方）
    int allbit = ~(col | left | right) & ((1 << x) - 1);
    while (allbit != 0) {
    //allbit & -allbit取的是这一行能取的位置里最右边的				  //一个，
    //也就是取一个数最右边的1
    //例如： 4&-4=4&（~4+1）= 0000 1000&（1111 0111+1）
    //=0000 1000&1111 1000= 0000 1000
    int freebit = allbit & -allbit;
    //递归的时候 row+1表示取下一行，col|freebit表示，对于下一行来说
    //这一行取得位置的正下方的位置不能取，(left|freebit)<<1表示这一行
    //取得到下一行就是-135°的那个地方，也不能取，右边同理
    back(row + 1, (col | freebit), (left | freebit) << 1, (right | freebit) >> 1);
    //取完了之后，要修改这一行能取的位置，x = x & (x-1)能将右边一个1变成0
    //例如：10=0000 1010；9=0000 1001；10&9=0000 1000
    //将最右边的1变成了0，这个操作表示这一行可以取的点已经取过了
    //继续往左，直到不符合allbit ！= 0
    allbit &= (allbit - 1);
            }
        }
```

