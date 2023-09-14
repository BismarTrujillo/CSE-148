public class Ring {
    double outerRadius;
    double innerRadius;
    Ring largest;
    Ring smallest;


    public Ring() {
        outerRadius = 2.0;
        innerRadius = 1.0;
    }

    public Ring(double outer, double inner) {
        if (outer > inner) {
            outerRadius = outer;
            innerRadius = inner;
        } else {
            System.out.println("Outer radius smaller or equals than inner radius");
        }
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(double outerRadius) {
        if (outerRadius > innerRadius) {
            this.outerRadius = outerRadius;
        } else {
            System.out.println("Outer radius smaller or equals than inner radius");
        }
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        if (outerRadius > innerRadius) {
            this.innerRadius = innerRadius;
        } else {
            System.out.println("Inner radius greater or equals than outer radius");
        }
    }

    public double getArea() {
        return (outerRadius * outerRadius - innerRadius * innerRadius) * Math.PI;
    }

    public static double averageAreaOfRings(Ring[] ringsArray) {
        double areaSum = 0.0;
        for (Ring ring : ringsArray) {
            areaSum += ring.getArea();
        }
        return areaSum / ringsArray.length;
    }

    public static Ring smallestLargestRing(Ring[] ringsArray){
        Ring [] smallestLargest = new Ring[2];
        Ring smallest = ringsArray[0];
        Ring largest = ringsArray[0];

        for (Ring ring: ringsArray){
            if(smallest.getArea() > ring.getArea()){
                smallest = ring;
            }
            if(largest.getArea() < ring.getArea()){
                largest = ring;
            }
        }

        Ring ring = new Ring();
        ring.smallest = smallest;
        ring.largest = largest;

        return ring;
    }

    public String toString() {
        return "Outer radius: " + outerRadius + " Inner radius: " + innerRadius + " Area: " + getArea();
    }

}
