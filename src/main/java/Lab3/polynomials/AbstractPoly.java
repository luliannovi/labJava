package Lab3.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly{
    private double[] derive(){
        double[] tmp = new double[Math.max(1, this.degree())];
        for(int i=1;i<=this.degree();i++){
            tmp[i-1]= coefficient(i) * i;
        }
        return tmp;
    }
     public boolean equals(Object o){
        if(o instanceof double[]){
            if(this.degree() == ((double[]) o).length){
                double[] tmp = (double[]) o;
                for(int i=0;i<=this.degree();i++){
                    if(tmp[i]!=this.coefficient(i))
                        return false;
                }
                return true;
            }else
                return false;
        }else
            return false;
     }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < degree(); i++) {
            sb.append(coefficient(i)).append("x^").append(i).append(" + ");
        }
        sb.append(coefficient(degree())).append("x^").append(degree());
        return sb.toString();
    }
}
