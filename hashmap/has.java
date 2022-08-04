package hashmap;

import java.util.HashMap;

public class has {
    public static void main(String[] args) {
        employee n1=new employee(1,"Natraj");
        employee n2=new employee(1,"ASwin");
        employee n3=new employee(3,"Ram");
        HashMap<employee,String> hs=new HashMap<employee,String>();
        hs.put(n1,"nat");
        hs.put(n2,"nat");
        hs.put(n3,"nat");
        System.out.println(hs.size());
        Integer a=10;
    }
}
class employee{
    Integer id;
    employee(int id, String val){
    this.id=id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        return true;
    }
}