package Lab4.generics;

import java.util.*;

public class Generics {
    public static <T> void fill(List<? super T> list,T obj){
        for(int i=0;i<list.size();i++)
            list.set(i,obj);
    }

    public static <T> void copy(List<? super T> dst, List<? extends T> src){
        for(int i=0;i<src.size();i++){
            dst.set(i,src.get(i));
        }
    }
    public static void swap(List<?> list,int a,int b){
        final List l=list;
        l.set(a,l.set(b,l.get(a)));
    }
    public static void reverse(List<?> list){
        int max=list.size() -1;
        for(int i=0;i<list.size()/2;i++,max--){
            swap(list,i,max);
        }
    }
    public static <T extends Comparable<? super T>> T min(Collection<T> list){
        Iterator<T> it = list.iterator();
        T min = it.next();
        for (; it.hasNext(); ) {
            T obj = it.next();
            if(obj.compareTo(min)<0)
                min=obj;
        }
        return min;
    }
    public static <T extends Comparable<? super T>> T max(List<T> list, Comparator<T> cmp){
        Iterator<T> it= list.iterator();
        T max=it.next();
        for(;it.hasNext();){
            T obj=it.next();
            if(cmp.compare(obj,max)>0)
                max=obj;
        }
        return max;
    }


    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(3);
        l.add(2);
        l.add(4);
        Integer k=min(l);
        System.out.println(k);
        Comparator<Integer> integerComparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<02)
                    return -1;
                else if(o2==o1)
                    return 0;
                else
                    return 1;
            }
        };
        k=max(l,integerComparator);
        System.out.println(k);
    }
}
