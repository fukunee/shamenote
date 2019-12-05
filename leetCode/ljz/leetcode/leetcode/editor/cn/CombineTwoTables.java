 //表1: Person 
//
// +-------------+---------+
//| 列名         | 类型     |
//+-------------+---------+
//| PersonId    | int     |
//| FirstName   | varchar |
//| LastName    | varchar |
//+-------------+---------+
//PersonId 是上表主键
// 
//
// 表2: Address 
//
// +-------------+---------+
//| 列名         | 类型    |
//+-------------+---------+
//| AddressId   | int     |
//| PersonId    | int     |
//| City        | varchar |
//| State       | varchar |
//+-------------+---------+
//AddressId 是上表主键
// 
//
// 
//
// 编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息： 
//
// 
//
// FirstName, LastName, City, State
// 
//
  
  package cn;
  public class CombineTwoTables{
      public static void main(String[] args) {
      
           //Solution solution = new CombineTwoTables().new Solution();
      }
      //${question.code}
      //select FirstName, LastName, City, state from Person left join Address on Person.PersonId = Address.PersonId;
      //30%
      //select A.FirstName, A.LastName, B.City, B.State from Person A left join (
      //select distinct PersonId, City, State from Address) B
      //on A.PersonId = B.PersonId;
      //90% 这种方法是先通过对第二张表进行去重操作，这种在数据量大的情况下，可以减少join次数
  }