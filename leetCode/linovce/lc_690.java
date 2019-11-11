/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        Queue<Employee> queue = new LinkedList<Employee>();
        int num=0;
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).id==id)
            {
                queue.offer(employees.get(i));
                break;
            }
        }
        
        while(queue.peek()!=null){
            Employee e = queue.poll();
            num+=e.importance;
            
            for(int i=0;i<e.subordinates.size();i++){
                for(int j=0;j<employees.size();j++){
                    if(employees.get(j).id==e.subordinates.get(i))
                    {
                        queue.offer(employees.get(j));
                        break;
                    }
                }
            }
            
            employees.remove(e);
        }
        return num;
    }
}