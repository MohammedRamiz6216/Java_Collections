import java.util.*;
import java.util.stream.Collectors;
class  Product{
    int id;
    String name;
    float price;
    public Product(int id,String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
        }
public class Main{
    public static void main(String[] args) {
        List<Product>list=new ArrayList<>();
        list.add(new Product(1,"hp",95000f));
        list.add(new Product(2,"pp",25000f));
        list.add(new Product(3,"kp",45000f));
        list.add(new Product(4,"lp",25000f));
        list.add(new Product(5,"rp",15000f));
        List<Float> productlist2 = list.stream()
                .filter(p->p.price>30000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(productlist2);




    }
}