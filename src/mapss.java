import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

class employee{
    int id;
    String name;
    int ph_no;
    employee(int id,String name,int ph_no){
        this.id=id;
        this.name = name;
        this.ph_no = ph_no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return ph_no == employee.ph_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ph_no);
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph_no=" + ph_no +
                '}';
    }
}
public class mapss {
    public static void main(String[] args) {
        Map<Integer,employee> maps = new HashMap<>();
        employee obj1=new employee(12,"roy",22234567);
        employee obj2=new employee(13,"loy",342234567);
        employee obj3=new employee(14,"koy",22234567);

        maps.put(obj1.id, obj1);
        maps.put(obj2.id,obj2);
        maps.put(obj3.id,obj3);

//          List<employee>emplistsss =  new ArrayList<>();
//          for(Map.Entry<Integer,employee>k:maps.entrySet()){
//              if(!emplistsss.contains(k.getValue())){
//                  emplistsss.add(k.getValue());
//              }
//          }
//        System.out.println(emplistsss);
        Set<employee>setl = new HashSet<>();
        for (Map.Entry<Integer,employee>x:maps.entrySet() ){
            setl.add(x.getValue());
        }
        List<employee> emplists =setl.stream().collect(Collectors.toList());
       System.out.println(emplists);
    }

}
