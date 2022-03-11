package Lab1;

public class Body {
    double x;
    double y;
    double vx;
    double vy;

    public Body() {
        this.x = this.y = this.vy = this.vx = 0;
    }

    public Body(double x, double y) {
        this.x = x;
        this.y = y;
        this.vx = this.vy = 0;
    }

    public Body(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public void progress(double t){
        this.x += this.vx * t;
        this.y += this.vy * t;
    }
    public void setSpeed(double vx,double vy){
        this.vx=vx;
        this.vy=vy;
    }
    @Override
    public String toString() {
        return "Body{" +
                "x=" + x +
                ", y=" + y +
                ", vx=" + vx +
                ", vy=" + vy +
                '}';
    }
}
