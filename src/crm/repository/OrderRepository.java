package crm.repository;

import com.sun.source.tree.Tree;
import crm.model.Order;

import java.util.*;

public class OrderRepository {
    private final Map<UUID, Order> orders = new TreeMap<>();
     public void add(UUID id, Order order){
         orders.put(id, order);
     }
     public Optional<Order> findById(UUID id){
        return Optional.ofNullable(orders.get(id));
     }

     public List<Order> findAll(){
         return new ArrayList<>(orders.values());
     }
     public void remove(UUID id){
         orders.remove(id);
     }



}
