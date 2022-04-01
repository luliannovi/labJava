package Lab4.shop;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Shop<T>{
    final Queue<T> items;

    public Shop(Queue<T> items) {
        this.items = items;
    }
    public Shop(){
        this.items=new LinkedList<>();
    }
    public T sell(){
        return items.poll();
    }
    public void sell(Collection<? super T> list,int n){
        for(int i=0;i<n;i++)
            list.add(items.poll());
    }
    public void buy(Collection<? extends T> cart){
        items.addAll(cart);
    }
}
