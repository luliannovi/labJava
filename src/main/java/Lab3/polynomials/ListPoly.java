package Lab3.polynomials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly{
    List<Double> coefficients;
    public ListPoly(double[] vector){
        coefficients = new ArrayList<>();
        for(double i : vector) {
            coefficients.add(i);
        }
    }
    @Override
    public double[] coefficients() {
        double[] tmp=new double[coefficients.size()];
        for(int i=0;i<coefficients.size();i++){
            tmp[i] = coefficients.get(i);
        }
        return tmp;
    }

    @Override
    public double coefficient(int value) {
        return coefficients.get(value);
    }

    @Override
    public int degree() {
        return coefficients.size()-1;
    }

    @Override
    public Poly derivative() {
        double[] tmp = new double[this.degree()];
        for(int i=0;i<this.degree();i++){
            tmp[i]=this.coefficient(i+1) * (i+1);
        }
        Poly ret=new ListPoly(tmp);
        return ret;
    }
}
