/*interface A{
    void print();
}
//class B implements A{
//   public void print(){
//       System.out.println("Hi my name is Ramiz");
//    }
//}
public class Streams {

    public static void main(String[] args) {
        A obj = ()->

                System.out.println("Hi im ramiz");


        obj.print();


    }
}

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        System.out.println("List of numbers: " + nums);

        // Calculate the average using streams
        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average value of the said numbers: " + average);
    }
    
}

import java.util.*;
import java.util.stream.Collectors;

public class Streams{
    public static void main(String[] args) {
        List<Integer>numberslist= Arrays.asList(10,25,30,35,40,46);
        List<Integer>evenNumberslist = new ArrayList<>();
        List<Integer>oddNumberslist = new ArrayList<>();

       evenNumberslist= numberslist.stream().filter(n->n%2==0).collect(Collectors.toList());
       oddNumberslist = numberslist.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(evenNumberslist);
        System.out.println(oddNumberslist);
    }
}


import java.util.*;
import java.util.stream.Collectors;
public class Streams {
    public static void main(String[] args) {
        List<String> nameslist = Arrays.asList("Ramiz","Praneet","vishwaesh", "rahulreddy", "vishwanathvarma","pushpa");
        List<String> longnames = new ArrayList<String>();
        longnames = nameslist.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(longnames);
    }
}

import java.util.*;
import java.util.stream.Collectors;
class Products{
    int id;
    String name;
    int price;
    Products(int id,String name, int price){
        this.id = id;
        this.name = name;
        this.price=price;
    }
}
public class Streams {
    public static void main(String[] args) {
      List<Products>productslist = new ArrayList<>();
      productslist.add(new Products(1,"Ramraj",13000));
        productslist.add(new Products(2,"Dollar",23000));
        productslist.add(new Products(3,"Vip",43000));
        productslist.add(new Products(4,"Nofuss",33000));
        productslist.add(new Products(5,"Teamspirit",30000));
        productslist.stream().filter(p->p.price>30000).forEach(p-> System.out.println(p.price));

    }
}



import  java.util.*;
public class Streams {
 enum Season{
    Spring,Summer,Fall,Winter
}

    public static void main(String[] args) {


        for(Season s:Season.values())
            System.out.println(s);

    }



}
 */
import java.util.*;
import java.util.stream.Collectors;

class Products {
    int id;
    String name;
    int price;

    Products(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Streams {
    public static void main(String[] args) {
        List<Products> prodlist1 = new ArrayList<>();
        prodlist1.add(new Products(1, "pank", 300000));
        prodlist1.add(new Products(2, "bank", 400000));
        prodlist1.add(new Products(3, "rank", 200000));
        prodlist1.add(new Products(4, "hank", 100000));

        List<Integer> prodlist2 = prodlist1.stream()
                .filter(p -> p.price > 300000)
                .map(p -> p.price) // Map to int (not allowed)// Box the int values to Integer objects
                .collect(Collectors.toList());

        System.out.println(prodlist2);
    }
}



























