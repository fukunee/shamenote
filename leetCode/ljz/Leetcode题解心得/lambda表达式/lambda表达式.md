# lambda表达式
[参考文章1:基础知识](https://www.cnblogs.com/nnxud/p/9827704.html)
[参考文章2:进阶操作](https://blog.csdn.net/afmin/article/details/82947276)
Lambda 表达式的基础语法：Java8中引入了一个新的操作符 "->" 该操作符称为箭头操作符或 Lambda 操作符
箭头操作符将 Lambda 表达式拆分成两部分：
左侧：Lambda 表达式的参数列表
右侧：Lambda 表达式中所需执行的功能， 即 Lambda 体
用法：左侧是一个类声明这个类的实例，等号右侧是一个lambda表达式。如： A a = xxxx->xxxx;
左侧这个A类一定是一个函数式接口，也就是能被注解@FunctionalInterface注解的一个类（只有最多一个抽象函数），这样右边的lambda表达式才知道是实现了具体哪一个方法。
# lambda表达式基础语法
1. **无参数，无返回值**
``` java
@Test
    public void test1() {
        Runnable runnable = new Runnable() {
            //注意这里是一个匿名内部类，对抽象类Runnable的run方法直接重写了
            @Override
            public void run() {
        System.out.println("线程启动了");        
            }
        };
        runnable.run();
    }
  /**
   * 语法格式一：无参数，无返回值
   *        () -> System.out.println("Hello Lambda!");
   */
    @Test
    public void test2() {
        //“->”左边只有一个小括号，表示无参数，右边是Lambda体(就相当于实现了匿名内部类里面的方法了，(即就是一个可用的接口实现类了。))
    Runnable runnable = ()->System.out.println("线程启动了");    
    runnable.run();
    }
```
2. **有一个参数，无返回值**
``` java
/**语法格式二：有一个参数，并且无返回值
     *      (x) -> System.out.println(x)
     *       x  -> System.out.println(x) //只有一个参数的时候，可以不用()
     */
    @Test
    public void test3() {
          //这个e就代表所实现的接口的方法的参数，
       Consumer<String> consumer = e->System.out.println("front-"+e);
       consumer.accept("behind");
       //输出 front-behind
    }
```
3. **有一个以上参数，有返回值**
``` java
 public void test4() {
 		/**
 		(x, y) -> {}
 		**/
        //Lambda 体中有多条语句，记得要用大括号括起来
        Comparator<Integer> com = (x, y) -> {
                        System.out.println("函数式接口");
                        return Integer.compare(x, y);
                    };
                    int compare = com.compare(100, 244);
                    System.out.println(compare); // < -1, = 0, > 1
            }
        //如果lambda体中只有一条语句，可以省略{}和return
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);//效果同上
```
# 方法引用与构造器引用
当要传递给Lambda体的操作，已经有实现的方法了，可以使用**方法引用**！
方法引用就是Lambda表达式，就是函数式接口的一个实例，通过方法的名字来指向一个方法，可以认为是Lambda表达式的一个语法糖。
要求：**实现抽象方法的参数列表和返回值类型，必须与方法引用的方法的参数列表和返回值类型保持一致**！
方法引用：使用操作符 “::” 将类(或对象) 与 方法名分隔开来。
如下三种主要使用情况：
对象::实例方法名
类::静态方法名
类::实例方法名
"**实现抽象方法的参数列表和返回值类型，必须与方法引用的方法的参数列表和返回值类型保持一致**" 这句话很重要，一定要理解
我的理解是：
举个例子
Comparator comparator = (x,y)->Integer.compare(x, y);等同于
Comparator comparator1 = Integer::compare;
这里能这么写是因为,函数式接口Comparator里面未实现compare方法是int compare(int x, inty)，而这个和int Integer.compare(x, y)的参数类型，返回类型都一样，这就是上面那句话的意思。


