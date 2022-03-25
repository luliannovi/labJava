package Lab3.polynomials;

public class ArrayPoly extends AbstractPoly{
    double[] coefficients;
    public ArrayPoly(double[] vector){
        coefficients=new double[vector.length];
        coefficients = vector.clone();
    }
    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public double coefficient(int value) {

        return coefficients[value];
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] tmp=new double[this.degree()];
        for(int i=0;i<this.degree();i++){
            tmp[i]=coefficient(i+1) * (i+1);
        }
        Poly ret=new ArrayPoly(tmp);
        return ret;
    }
}
