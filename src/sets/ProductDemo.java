package sets;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductDemo {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        products.add(new Product(1,"Cookie", 119.9));
        products.add(new Product(2,"Chiken", 229.9));
        Product bread1 = new Product(3,"Bread", 79.9);
        Product bread2 = new Product(3,"Bread", 49.9);
        System.out.println(bread1.equals(bread2));
        products.add(bread1);
        products.add(bread2);
        System.out.println(products.toString());
        Set<Product> products1 = new  TreeSet<>();
        products1.add(new Product(1,"Cookie", 119.9));
        products1.add(new Product(2,"Chiken", 229.9));
        products1.add(bread1);
        System.out.println(products1.toString());

    }
}
