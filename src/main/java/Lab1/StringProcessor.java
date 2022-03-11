package Lab1;

import java.util.Arrays;

public class StringProcessor {
    String v[];

    public StringProcessor(String[] v) {

        this.v = v;
    }

    public String[] getV() {
        return v;
    }

    public void setV(String[] v) {
        this.v = v;
    }

    public int findShortest(){
        if(v.length==0)
            return -1;
        int max=0;
        int len = v[0].length();
        for(int i=0;i<v.length;i++) {
            if (v[i].length() < len){
                len = v[i].length();
                max=i;
        }
        }
        return max;
    }

    public int search(String key){
        if(v.length == 0)
            return -1;
        int index=-1;
        for(int i=0;i<v.length;i++){
            if(v[i].equals(key))
                index=i;

        }
        return index;
    }

    public void reverse(){
        int j=v.length-1;
        for(int i=0;i<(v.length/2) && j>= (v.length/2);i++,j--){
            String tmp=v[i];
            v[i]=v[j];
            v[j]=tmp;
        }
    }
     public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof StringProcessor))
            return false;
        StringProcessor a=(StringProcessor) obj;
        return Arrays.equals(this.v, a.v);
     }
}
