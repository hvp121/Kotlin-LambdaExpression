public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        // P is the periodic deposit
        // N is number of periods per year
        // R is the effective annual rate
        // r is the periodic rate
        // T is the total number of periods
        // A is the future value
        
        double P = 5000;
        double N = 12;
        double R = 8.25/100;
        double r = Math.pow((1 + R),(double)1/N) - 1;
        //double r1 = Math.pow((1 + 8.25/100),(double)1/12) - 1;
        int T = 12;

        double A = 0;
        for (int i = 1; i <= T; i++){
             A = A + P*Math.pow(1 + r, i);
        }
        double Interest = A - (P*12);
        System.out.println("Final Interest Value : "+r+ " Future Value : " + A);

    }
}
