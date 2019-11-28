# Java并发编程

- synchronized
- volatile
- CAS
- AQS

## synchronized

JVM的内存空间主要分为：程序计数器、虚拟机栈、本地方法栈、堆、方法区和运行时常量池。
每个线程有自己的栈内存
所有线程共享堆内存
栈中数据只有基本类型和对象引用
堆上只保存对象
方法区放静态变量

锁的优化：
----
- 自旋锁
  线程执行到synchronized同步方法或者代码块时，如果另外的线程已经获取到该对象的锁，该线程就只能等待，被操作系统挂起，直到另外的线程处理完成，该线程才能恢复执行。线程的挂起和恢复都需要从应用的用户态切换到操作系统的内核态才能完成，这种操作给系统也带来了性能上很大的影响。同时虚拟机的研发团队注意到在很多应用上，共享数据上的锁只会持续很短的时间，为了这点时间去挂起和恢复线程是不值得的。如果物理机上有多个CPU，那么就可以同时让多个线程并行执行，就可以在JVM的层面上让请求锁的线程“稍等一下”，但不放弃CPU的执行时间，看下持有锁的线程是否会很快就释放锁。为了让线程等待，就让线程去执行一个忙循环（自旋），这种技术就是所谓的自旋锁

  自旋锁是为了防止线程挂起，让线程忙等

 - 锁消除
```java
private static String concatString(String s1,String s2) {
     return s1 + s2;
}

public static void main(String[] args) {
     EascapeTest eascapeTest = new EascapeTest();
     eascapeTest.concatString("a","b");
```
方法concatString，是我们在实际开发中经常会用到的一个字符串拼接的实现，从源代码层面上看是没有任何同步操作的。但实际JVM在运行这个方法时会优化为StringBuilder的append()操作
通过这种操作消除了锁

- 锁粗化
  对同一对象重复加锁去锁，JVM会进行优化，第一次进入加锁，最后一次退出去锁
- 轻量级锁和偏向锁
    - java对象模型和对象头
         在虚拟机内部，通过instanceOopDesc来表示一个Java对象。对象在内部中的布局可以分为两个连续的部分：instanceOopDesc和实例数据。instanceOopDesc又被称为对象头，继承自oopDesc，看instanceOop.hpp的实现，未新增新的数据结构，和oopDesc一样，包含如下2部分信息：

        _mark：markOop类型，存储对象运行时记录信息，主要有HashCode、分代年龄、锁状态标记、线程持有的锁、偏向线程ID等，占用内存和虚拟机位长一致，如果是32位虚拟机则为32位，在64位虚拟机则为64位；

        _metadata：联合体，指向描述类型的Klass对象的指针，因为Klass对象包含了实例对象所属类型的元数据，故被称为元数据指针。虚拟机运行时将频繁使用这个指针定位到方法区的类信息。

        到此基本描述了Java的对象头，但是这只是一部分，还有一部分是Klass，合起来才是完整的对象模型。那么Klass在对象模型中是如何体现的呢？实际上，HotSpot是这样处理的，通过为每一个已加载的Java类创建一个instanceKlass对象，用来在JVM层表示Java类。来看看instanceKlass的数据结构。
        Java对象在JVM中的表示是这样的，对象的实例（instanceOopDesc）存储在堆上，对象的元数据（instanceKlass）存储在方法区，对象的引用存储在栈上。
    -轻量级锁

   




