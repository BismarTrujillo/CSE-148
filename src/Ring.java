import java.time.Clock;

public class Ring {
    double outerRadius;
    double innerRadius;

    public Ring(){
        outerRadius = 2.0;
        innerRadius = 1.0;
    }
    public Ring(double outer, double inner){

        if (outer > inner){
            outerRadius = outer;
            innerRadius = inner;
        }else {
            System.out.println("Outer radius smaller or equals than inner radius");
        }
    }
    public double getOuterRadius() {
        return outerRadius;
    }
    public void setOuterRadius(double outerRadius) {

        if (outerRadius > innerRadius){
            this.outerRadius = outerRadius;
        }else {
            System.out.println("Outer radius smaller or equals than inner radius");
        }
    }
    public double getInnerRadius() {
        return innerRadius;
    }
    public void setInnerRadius(double innerRadius) {

        if (outerRadius > innerRadius){
            this.innerRadius = innerRadius;
        }else {
            System.out.println("Inner radius greater or equals than outer radius");
        }
    }
    public double getArea(){
        return (outerRadius*outerRadius - innerRadius*innerRadius) * Math.PI;
    }
    public String toString(){
        return "Outer radius: " + outerRadius + " Inner radius: " + innerRadius + " Area: " + getArea();
    }

}
