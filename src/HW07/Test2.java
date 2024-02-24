package HW07;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        double a = randomDouble();
        double b = randomDouble();
        double c = randomDouble();
        double d = randomDouble();
        double e = randomDouble();

        System.out.println(analyzeData(new CalculateAvg(), a,b,c,d,e));

        System.out.println(analyzeData(new MyProcessor() {
            @Override
            public double process(double... data) {
                double max = data[0];
                for (double num : data) {
                    if (max < num)
                        max = num;
                }
                return max;
            }
        }, a,b,c,d,e));

        System.out.println(analyzeData(data -> {
            double max = data[0];
            for (double num : data) {
                if (max < num)
                    max = num;
            }
            return max;
        }, a,b,c,d,e));


    }

    public static double analyzeData(MyProcessor proc, double... data){
        return  proc.process(data);

    }
    private static double randomDouble(){
        Random rd = new Random();
        return rd.nextDouble() * 200.0 - 100.0;
    }
}
