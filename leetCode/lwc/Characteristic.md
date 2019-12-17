#### 123. Best Time to Buy and Sell Stock III

- 动态规划，状态转移

#### 207. Course Schedule

* 检查有向图是否具有环，采用拓扑排序

#### 215. Kth Largest Element in an Array
* 堆排序PriorityQueue
* 快速选择

#### 220. Contains Duplicate III
* 平衡二叉树TreeSet
* 桶排序

#### 279. Perfect Squares

- 动态转移方程

#### 307. Range Sum Query - Mutable

- 可变数组范围搜索树

#### 332. Reconstruct Itinerary

- 能否不重复遍历所有边问题
- 连通的无向图 G有欧拉路径的充要条件是：G中奇顶点（连接的边数量为奇数的顶点）的数目小于等于2
- 1. 一个连通的有向图可以表示为一条从顶点u到v的（不闭合的）欧拉路径的充要条件是：u的出度（从这个顶点发出的[有向边](https://zh.wikipedia.org/wiki/有向边)的数量）比入度（指向这个顶点的有向边的数量）多1，v的出度比入度少1，而其它顶点的出度和入度都相等。
  2. 一个连通的有向图是欧拉环（存在欧拉回路）的充要条件是以下两个之一：
     1. 每个顶点的出度和入度都相等；
     2. 存在一系列的（有向）环，使得图的每一条边都恰好属于某一个环。

#### 372. Super Pow

- (a*b)%c = ((a%c)*(b%c)%c

- a^b%c = ((a%c)^b)%c

  