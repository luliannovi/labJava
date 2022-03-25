package Lab3.polynomials;

import java.util.Collection;

public interface Poly  {
    public double[] coefficients();

    public double coefficient(int value);

    public int degree();

    public Poly derivative();
}
