package Lab3.mylist;

public abstract class MyAbstractList implements MyList{
    public void checkBoundaries(int index,int limit){
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size();i++){
            sb.append(get(i));
        }
        return sb.toString();
    }
}
