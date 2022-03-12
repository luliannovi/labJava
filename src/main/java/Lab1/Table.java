package Lab1;

public class Table {
    int a,b;

    public Table() {
        this.a=10;
        this.b=10;
    }
    public Table(int a, int b){
        this.a=a;
        this.b=b;
    }
    public double sum(){
        double sum=0;
        for(int i=1;i<=this.a;i++){
            for(int j=1;j<=this.b;j++){
                sum += i*j;
            }
        }
        return sum;
    }
    public double avg(){
        double sum = sum();
        double avg = sum/(a*b);
        return avg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                sb.append(i*j);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Table t = new Table();
        System.out.println(t.toString());
    }
}


