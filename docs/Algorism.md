迭代算法

 - 初始化
	 - 迭代次数是否可计算。
	- 要返回什么。
	 - 迭代中需要哪些变量，其初始值是什么。哪些单次迭代后即可销毁，哪些需要在N个迭代间共享，哪些需要全迭代共享。
 - 迭代体
	 - 变量间如何相互作用并发生改变。
	 - 变量的值如何改变并传递给下一次迭代，改变时是否会因为执行到结尾产生错误。
 - 完成点
	 - 若迭代次数不可计算，则需要详细枚举迭代完成时的各种情况进行分析并写出测试用例。



---



### 递归算法

- **递归算法**指一种通过重复将问题分解为同类的子问题而解决问题的方法。

---

### 字符串

https://www.jianshu.com/p/3d07e9a91430

| 问题序号 | 问题内容                 | 思路解法 |
| -------- | ------------------------ | -------- |
| 344, 541 | 反转字符串               |          |
| 3 | 无重复字符的最长子串 |          |
| 14 | 最长公共前缀         |          |



---



### 链表

https://www.jianshu.com/p/d675288f0b81

 - 定义：链表是非连续、非顺序的存储结构，数据元素的逻辑顺序是通过链表中的指针链接次序实现的。
 - 构成：链表由一系列结点组成。每个结点包括两个部分：一个是存储数据元素的数据，另一个是存储下一个结点地址的指针。 
 - 优点：
      - 由于不须按顺序存储，链表在插入和移除时可以达到O(1)的复杂度
      - 使用链表结构可以克服数组链表需要预先知道数据大小的缺点
 - 缺点：
      - 访问特定编号的节点则需要O(n)的时间，而线性表和顺序表相应的时间复杂度分别是O(logn)和O(1)。
      - 链表由于增加了结点的指针，空间开销大。
 - 类型：
     - 单向链表 A1->A2->A3->A4  (A1.next==A2)
     - 双向链表 A1<->A2<->A3<->A4  (A2.prior==A1)
     - 循环链表 A1->A2->A3->A4->A1  (A4.rear==A1)
     - 双循环链表 A1<->A2<->A3<->A4<->A1  (A1.prior==A4 , A4.rear==A1)

| 问题序号 | 问题内容                 | 思路解法 |
| -------- | ------------------------ | -------- |
| 206 | 反转链表               |          |
| 92 | 反转链表 II |          |
| 141 | 环形链表             |          |
| 142 | 环形链表 II          |          |



---

### 小猫钓鱼

- 定义：在字符串中寻找具有XX特征的最长子串。**包含非XX特征子串的字符串也不满足XX特征。**
- 思路：即以元素Str[i]为尾的子串中符合XX特征的子串，并遍历出最长的一个。
- 遍历：增尾，单步加长尾部元素。切头，切除足够多的头部元素使子串符合XX特征。每次增尾去头操作后都是一个符合XX特征的合法子串。此法可以完全遍历。

| 问题序号 | 问题内容                                                     | 思路解法 |
| -------- | ------------------------------------------------------------ | -------- |
|   3       | 无重复字符的最长子串 |          |



---

### 动态规划法

> 动态规划能够遍历所有解空间并避免重复计算。避免了回溯算法的重复计算。
> 

 - 适用问题：无后效性、重复子问题。
 - 问题类型：
    - 求最优解
    - 求解空间大小。
 - 思维模式：
    - 首先正向思维。用回溯法枚举出解空间。（最优解问题要善用假设缩小解空间）
    - 回溯过程分析。判读是否存在中间状态，同一个中间状态是否出现在了多个解中，多个重复的中间状态间相同的状态可以用什么参数描述。
    - 状态转移分析。用DP(arg)函数定义中间状态,（当arg为某值时，最优解DP为../解空间大小DP为...），并用DP转移方程描述状态间的关系（当arg发生变化时，DP会发生什么变化）。
    - 初始状态分析。绘制状态转移表。
    - 状态转移优化。绘制状态转移流程图。单个arg时，状态转移为一条单链表。多个arg时，状态应呈现树状。判断状态转移顺序（是各个参数嵌套还是同步递增）

| 问题序号           | 问题内容                                                     | 思路解法                                                     |
| ------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 70, 746            | 爬楼梯问题：假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ | 正向思考，每一次选择都是二选一`steps+=1`或`steps+=2`，做k次选择直到`steps==n`，最后计算方法数。这是回溯法，也称试探法，枚举地尝试每一种可能性。我们发现解空间里存在大量相同的部分。所以我们尝试使用逆向思维。到达楼顶最后一步必是n-2或n-1，所以K^n^=K^n-1^+K^n-2^。在我最后一次爬楼梯时我不关心你前面具体怎么爬的，告诉我你爬了多少种就可以了。 |
| 62, 63, 980        | 不同路径问题：一个机器人位于一个 m x n 网格的左上角。机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角，有多少条路径。 | 思路：这个问题和爬楼梯类似。使用回溯法依旧可以完美地解出问题。但是同样的，解空间里重复性过高。尝试逆向思维。到达终点要么是向下要么是向右，即K^i,j^=K^i-1,j^+K^i,j-1^。同时将（i，j）为障碍的K置0即可。 |
| 72, 161            | 编辑距离：给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。你可以对一个单词进行如下三种操作：插入一个字符，删除一个字符，替换一个字符 | 这个问题上来就让人摸不着头脑，万能回溯法似乎不好使。果断逆向思考。我们假设DP(i,j)为wordA的前i位与wordB的前j位相同的情况下最少的操作次数。那么DP(i,j)=1+Math.min(DP(i,j+1), DP(i-1,j), DP(i-1,j-1)) (WA^i^ !== WB^j^) DP(i,j)=DP(i-1, j-1) (WA^i^ === WB^j^)。 |
| 121, 122, 123, 188 | 买卖股票的最佳时机IV：给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。注意: 你必须在再次购买前出售掉之前的股票。 | 这个问题上来就让人摸不着头脑，万能回溯法似乎不好使。果断逆向思考。在i日第k笔卖出的最优收益是i日前某日进行的第k笔买入时的最优收益加上i日股价。i日k笔买入的最优收益是i日前某日第k-1笔卖出时收益减去i日股价。 |



---

### 背包问题

https://www.jianshu.com/p/d9a0624c05e7

| 问题序号 | 问题内容   | 思路解法 |
| -------- | ---------- | -------- |
| 332, 518 | 零钱兑换   |          |
| 474      | 一和零     |          |
| -        | 01背包问题 |          |
| -        | 完全背包   |          |
| -        | 多重背包   |          |



---



### 分治法

 - 分解（Divide）：将原问题分解成一系列子问题；
 - 解决（conquer）：递归地解各个子问题。若子问题足够小，则直接求解；
 - 合并（Combine）：将子问题的结果合并成原问题的解。

| 问题序号 | 问题内容                                                     | 思路解法                 |
| -------- | ------------------------------------------------------------ | ------------------------ |
| 23       | [合并K个排序链表](https://leetcode-cn.com/problems/merge-k-sorted-lists) | 两两合并逐渐减小问题规模 |
| 50       | Pow(x, n)                                                    |                          |
| 169, 229 | 求众数                                                       |                          |



---

### 贪心算法

https://www.jianshu.com/p/1e1a9a81bbc0

| 问题序号 | 问题内容       | 思路解法 |
| -------- | -------------- | -------- |
| 860      | 柠檬水找零     |          |
| 135      | 分发糖果       |          |
| 330      | 按要求补齐数组 |          |



---

### 哈希表

https://www.jianshu.com/p/d3a48852d5e3

 - 对数组进行分类时，可以采用哈系表来表达分类结果。

| 问题序号 | 问题内容         | 思路解法 |
| -------- | ---------------- | -------- |
| 1        | 两数之和         |          |
| 242      | 有效的字母异位词 |          |
| 15       | 三数之和         |          |



---

### 优先队列

https://www.jianshu.com/p/1bedaee726da

| 问题序号 | 问题内容                | 思路解法 |
| -------- | ----------------------- | -------- |
| 703 | 数据流中的第K大元素 |          |
| 239 | 滑动窗口最大值      |          |
| 692 | 前K个高频单词      |          |



---

### 栈和队列

https://www.jianshu.com/p/e231c0d3c05e

| 问题序号 | 问题内容       | 思路解法 |
| -------- | -------------- | -------- |
| 20 | 有效的括号 |          |
| 739 | 每日温度   |          |
| 394 | 字符串解码 |          |



---

### 树

https://www.jianshu.com/p/47e632985f11

- **树**是一种数据结构，它是由n>=1个有限结点组成一个具有层次关系的集合。没有父结点的结点称为根结点；每一个非根结点有且只有一个父结点；除了根结点外，每个子结点可以分为多个不相交的子树。

- **二叉树**是每个结点最多有两个子树的树结构。通常子树被称作“左子树”（left subtree）和“右子树”（right subtree）。二叉树常被用于实现二叉搜索树和二叉堆。

- **二叉搜索树**是具有下列性质的二叉树： 若它的左子树非空，则其所有结点的值均小于它的根结点的值； 若它的右子树非空，则其所有结点的值均大于它的根结点的值； 任意节点第左、右子树也是二叉搜索树。

- 一些经典的二叉树问题：

  - 二叉树前序遍历
    - 递归，按照**根-左-右**的方式递归。
    - 迭代，见代码。
    ```javascript
    var preorderTraversal = function(root){
        let treeStack = []
        let res = []
        while(root || treeStack.length){
            while(root){
                res.push(root.val)
                treeStack.push(root)
                root = root.left
            }
            if(treeStack.length){
                root = treeStack.pop()
                root = root.right
            }
        }
        return res
    }
    ```
    
  - 二叉树的中序遍历
  
    - 递归，按照**左-根-右**的方式递归。
    - 迭代，见代码。
    ```javascript
    var inorderTraversal = function(root){
        let treeStack = []
        let res = []
        while(root || treeStack.length){
            while(root){
                treeStack.push(root)
                root = root.left
            }
            if(treeStack.length){
                root = treeStack.pop()
                res.push(root.val)
                root = root.right
            }
        }
        return res
    }
    ```
    
  - 二叉树的后序遍历
  
    - 递归，按照**左-右-根**的方式递归。
    - 迭代，见代码。
    ```javascript
    var postorderTraversal = function(root) {
        if(!root) return []
        let treeStack = [root]
        let res = []
        let pre
        while(treeStack.length){
            root = treeStack[treeStack.length - 1]
            if((!root.left && !root.right) || (pre &&(pre == root.left || pre == root.right))){
                res.push(root.val)
                treeStack.pop()
                pre = root
            }else{
                if(root.right) treeStack.push(root.right)
                if(root.left) treeStack.push(root.left)
            }
        }
        return res
    }
    ```
  

| 问题序号 | 问题内容                 | 思路解法                                         |
| -------- | ------------------------ | ------------------------------------------------ |
| 226      | 二叉树翻转               | 用前序遍历对各节点的子节点进行翻转               |
| 144      | 二叉树前序遍历           | 递归，按照**根-左-右**的方式递归。               |
| 94       | 二叉树的中序遍历         | 递归，按照**左-根-右**的方式递归。               |
| 145      | 二叉树的后序遍历         | 递归，按照**左-右-根**的方式递归。               |
| 102, 107 | 二叉树的层次遍历         |                                                  |
| 987      | 二叉树的垂序遍历         |                                                  |
| 98       | 验证二叉搜索树           |                                                  |
| 110      | 验证平衡二叉树           | 递归，每个节点满足（左<=根）且（右>=根）则成立。 |
| 236      | 二叉树的最近公共祖先     |                                                  |
| 235      | 二叉搜索树的最近公共祖先 |                                                  |
| 538      | 搜索树转累加树           | 递归，按照**右-根-左**的方式递归。               |



### 二分法

| 问题序号 | 问题内容         | 思路解法                                           |
| -------- | ---------------- | -------------------------------------------------- |
| 35       | 搜索插入位置     | 二分法                                             |
| 33       | 搜索旋转排序数组 | 二分法，这题可以通过异或操作简化代码，但是烦的起飞 |


### 回溯算法详解

**解决一个回溯问题，实际上就是一个决策树的遍历过程**。你只需要思考3个问题：

1. **路径**：也就是已经做出的选择。
2. **选择列表**：也就是你当前可以做的选择。
3. **结束条件**：也就是到达决策树底层，无法再做选择的条件。  

如果你不理解这3个词语的解释，没关系，我们后面会用“全排列”和“N皇后问题”这两个经典的回溯算法问题来帮你理解这些词语是什么意思，现在你先留着印象。

代码方面，回溯算法的框架：

```伪代码
result = []
def backtrack(路径, 选择列表):
	if 满足结束条件:
		result.add(路径);
		return
	for 选择 in 选择列表:
		做选择
		backtrack(路径, 选择列表)
		撤销选择
```

**其核心就是for循环里面的递归，在递归调用之前"做选择"，在递归调用之后“撤销选择”**，特别简单。

什么叫做选择和撤销选择呢，这个框架的底层原理是什么呢？下面我们通过“全排列”这个问题来解开之前的疑惑，详细探究一下其中的奥妙！

#### 一、全排列问题

我们在高中的时候就做过排列组合的数学题，我们也知道n个不重复的数，全排列共有n！个。

PS：**为了简单清晰起见，我们这次讨论的全排列问题不包含重复的数字**。

那么我们当时是怎么穷举全排列的呢？比方说给三个数[1, 2, 3]，你肯定不会无规律地胡乱穷举，一般是这样：

先固定第一位为1，然后第二位可以是2，那么第三位只能是3；然后可以把第二位变成3，第三位就只能是2了；然后就只能变化第一位，变成2，然后再穷举后两位......

其实这就是回溯算法，我们高中无师自通就会用，或者有的同学直接画出如下这棵回溯树： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnaiajSszYXJXr0urCiaicEUphNzENwxqmAzgmic6mtKzckwDBS5JsKbDvg6w/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

只要从根遍历这棵树，记录路径上的数字，其实就是所有的全排列。**我们不妨把这棵树称为回溯算法的“决策树”**。

**为啥说这是决策树呢，因为你在每个节点上其实都在做决策**。比如说你站在下图的红色节点上： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnaFiaPqEfzFgnOELzL8KETx0BuC6xCyrab7dssqwLuVTGsVkj6jiaYHdwA/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

你现在就在做决策，可以选择1那条树枝，也可以选择3那条树枝。为啥只能在1和3之中选择呢？因为2这个树枝在你身后，这个选择你之前做过了，而全排列是不允许重复使用数字的。

**现在可以解答开头的几个名词：[2]就是[路径]，记录你已经做过的选择；[1, 3]就是[选择列表]，表示你当前可以做出的选择；[结束条件]就是遍历到树的底层，在这里就是选择列表为空的时候**。

如果明白了这几个名词，**可以把[路径]和[选择列表]作为决策树上每个节点的属性**，比如下图列出了几个节点的属性： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnaGJiambtpqc4vkhsqZYoEZWianibsImtDvmXRMCJuUB8gkLfCJVAQDt2RA/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

**我们定义的backtrack函数其实就像一个指针，在这棵树上游走，同时要正确维护每个节点的属性，每当走到树的底层，其[路径]就是一个全排列**。

再进一步，如何遍历一棵树？这个应该不难吧。各种搜索问题其实都是树的遍历问题，而多叉树的遍历框架就是这样：

```伪代码
void traverse(TreeNode root) {
	for (TreeNode child : root.children)
		// 前序遍历需要的操作
		traverse(child);
		// 后序遍历需要的操作
}
```

而所谓的前序遍历和后序遍历，他们只是两个很有用的时间点，我给你画张图你就明白了： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnajTgCl3dL1z2wJpbvdfiaM1dMuCqPOO5JxicOgiaQAmQBJfZCwAbIxfFmQ/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

**前序遍历的代码在进入某一个节点之前的那个时间点执行，后序遍历代码在离开某个节点之后的那个时间点执行**。

回想我们刚才说的，[路径]和[选择]是每个节点的属性，函数在树上游走要正确维护节点的属性，那么就要在这两个特殊的时间点搞点动作： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnaR2cbSJabtrWQtib7OP5ZrSicZY2IOZibsia5dlibcvWhlQC1TibO97yia6mQA/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

现在，你是否理解了回溯算法的这段核心框架？

```伪代码
for 选择 in 选择列表:
	# 做选择
	将该选择从选择列表移除
	路径.add(选择)
	backtrack(路径, 选择列表)
	# 撤销选择
	路径.remove(选择)
	将该选择再加入选择列表
```

**我们只要在递归之前做出选择，在递归之后撤销刚才的选择**，就能正确得到每个节点的选择列表和路径。

下面，直接看全排列代码：

```java
List<List<Integer>> res = new LinkedList<>();
// 主函数，输入一组不重复的数字，返回他们的全排列
List<List<Integer>> permute(int[] nums) {
	// 记录[路径]
	LinkedList<Integer> track = new LinkedList<>();
	backtrack(nums, track);
	return res;
}
// 路径：记录在track中
// 选择列表：nums中不存在于track的那些元素
// 结束条件：nums中的元素全都在track中出现
void backtrack(int[] nums, LinkedList<Integer> track) {
	// 触发结束条件
	if (track.size() == nums.length) {
		res.add(new LinkedList(track));
		return;
	}
	for (int i = 0; i < nums.length; i++) {
		// 排除不合法的选择
		if (track.contains(nums[i])) continue;
		// 做选择
		track.add(nums[i]);
		// 进入下一层决策树
		backtrack(nums, track);
		// 取消选择
		track.removeLast();
	}
}
```

我们这里稍微做了些变通，没有显式记录[选择列表]，而是通过nums和track推导出当前的选择列表： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnaWuNCGdIXFoeBp1U7IA4tSEz1Pia9VvK2H9mSib1Mch3Yb5V8PCHib8dog/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

至此，我们就通过全排列问题详解了回溯算法的底层原理。当然，这个算法解决全排列不是很高效，因为对链表使用contains方法需要O(N)的时间复杂度。有更好的方法通过交换元素达到目的，但是难理解一些，这里就不写了，有兴趣可以自行搜索一下。

但是必须说明的是，不管怎么优化，都符合回溯框架，而且时间复杂度都不可能低于O(N!)，因为穷举整棵决策树是无法避免的。**这也是回溯算法的一个特点，不像动态规划存在重叠子问题可以优化，回溯算法就是纯暴力穷举，复杂度一般都很高**。

明白了全排列问题，就可以直接套回溯算法框架了，下面简单看看N皇后问题。

#### 二、N皇后问题

这个问题很经典了，简单解释一下：给你一个N X N的棋盘，让你放置N个皇后，使得它们不能互相攻击。

PS：皇后可以攻击同一行、同一列、左上左下右上右下四个方向的任意单位。

这是N = 8的一种放置方法：

​												 ![img](https://mmbiz.qpic.cn/sz_mmbiz_png/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnaCYhG0HKQr9prq9N5LXCKiaEQgWgN8B25s1jBXib5jWmjh7keHXWY7kGQ/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

这个问题本质上跟全排列问题差不多，决策树的每一层表示棋盘上的每一行；每个节点可以做出的选择是，在该行的任意一列放置一个皇后。

直接套用框架：

```c++
vector<vector<string>> res;
// 输入棋盘边长n，返回所有合法的放置
vector<vector<string>> solveNQueens(int n) {
	// '.'表示空，'Q'表示皇后，初始化空棋盘。
	vector<string> board(n, string(n, '.'));
	backtrack(board, 0);
	return res;
}
// 路径：board中小于row的那些行都已经成功放置了皇后
// 选择列表：第row行的所有列都是放置皇后的选择
// 结束条件：row超过board的最后一行
void backtrack(vector<string>& board, int row) {
	// 触发结束条件
	if (row == board.size()) {
		res.push_back(board);
		return;
	}
	int n = board[row].size();
	for (int col = 0; col < n; col++) {
		// 排除不合法选择
		if (!isValid(board, row, col)) continue;
		// 做选择
		board[row][col] = 'Q';
		// 进入下一行决策
		backtrack(board, row + 1);
		// 撤销选择
		board[row][col] = '.';
	}
}
```

这部分主要代码，跟全排列问题差不多。isValid函数的实现也很简单：

```c++
// 是否可以在board[row][col]放置皇后?
bool isValid(vector<string>& board, int row, int col) {
	int n = board.size();
	// 检查列是否有皇后互相冲突
	for (int i = 0; i < n; i++) {
		if (board[i][col] == 'Q') return false;
	}
	// 检查右上方是否有皇后互相冲突
	for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
		if (board[i][j] == 'Q') return false;
	}
	// 检查左上方是否有皇后互相冲突
	for (int i = row - 1, j = col - 1; i >=0 && j >= 0; i--, j--) {
		if (board[i][j] == 'Q') return false;
	}
	return true;
}
```

函数backtrack依然像个在决策树上游走的指针，每个节点就表示在"board row col"上放置皇后，通过isValid函数可以将不符合条件的情况剪枝： ![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdF1umAdyXuPq54ibw7X23mnatLgUFjaKJEbzPQfnwJoI9JrnxlpibLY3pX7iagiaoUniccxEqObDnkKdibg/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1) 

如果直接给你这么一大段解法代码，可能是懵逼的。但是现在明白了回溯算法的框架套路，还有啥难理解的呢？无非是改改做选择的方式，排除不合法选择的方式而已，只要框架存于心，你面对的只剩下小问题了。

当N = 8时，就是八皇后问题，数学大佬高斯穷尽一生都没有数清楚八皇后问题到底有几种可能的放置方法，但是我们的算法只需要一秒就可以算出来所有可能的结果。

不过真的不怪高斯。这个问题的复杂度确实非常高，看看我们的决策树，虽然有isValid函数剪枝，但是最坏的时间复杂度仍然是O(N^(N + 1))，而且无法优化。如果N = 10的时候，计算就已经很耗时了。

**有的时候，我们并不想得到所有合法的答案，只想要一个答案，怎么办呢**？比如解数独的算法，找所有解法复杂度太高，只要找到一种解法就可以。

其实特别简单，只要稍微修改一下回溯算法的代码即可：

```c++
// 函数找到一个答案后就返回true
bool backtrack(vector<string>& board, int row) {
	// 触发结束条件
	if (row == board.size()) {
		res.push_back(board);
		return true;
	}
	...
	for (int col = 0; col < n; col++) {
		...
		board[row][col] = 'Q';
		if (backtrack(board, row + 1)) return true;
		board[row][col] = '.';
	}
	return false;
}
```

这样修改后，只要找到一个答案，for循环的后续递归穷举都会被阻断。

#### 三、最后总结

回溯算法就是个多叉树的遍历问题，关键就是在前序遍历和后序遍历的位置做一些操作，算法框架如下：

```伪代码
def backtrack(...):
	for 选择 in 选择列表:
		做选择
		backt(...)
		撤销选择
```

**写backtrack函数时，需要维护走过的[路径]和当前可以做的[选择列表]，当触发[结束条件]时，将[路径]计入结果集**。

其实想想看，回溯算法和动态规划是不是有点像呢？动态规划的三个需要明确的点就是[状态]、[选择]和[base case]，是不是就对应着走过的[路径]，当前的[选择列表]和[结束条件]？

某种程度上说，动态规划的暴力求解阶段就是回溯算法。只是有的问题具有重叠子问题性质，可以用dp table或者备忘录优化，将递归树大幅剪枝，这就变成了动态规划。而今天的两个问题，都没有重叠子问题，也就是回溯算法问题了，复杂度非常高是不可避免的。

**本文转自公众号：labuladong**