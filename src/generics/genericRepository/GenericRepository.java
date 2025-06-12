package generics.genericRepository;

import java.util.*;

public class GenericRepository <T extends Identifiable>{
    Map<Integer, T> map = new TreeMap<>();
    private int id;
    public void add(T item){
        map.put(item.getId(),item);
    }
    public void removeById(int id){
        map.remove(id);
    }
    public T findById(int id){
        return map.get(id);
    }
    public List<T> getAll(){
        List<T> result = new ArrayList<>();
             for (T value : map.values()) {
                 result.add(value);

             }
        return result;
    }

    public int getId() {
        return id;
    }
}
