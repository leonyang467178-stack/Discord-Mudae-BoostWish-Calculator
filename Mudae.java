import java.util.Scanner;

public class Mudae{
    public static double proba(int bw){
        if (bw<=5){
                return 20.0;
            }
            else if (bw<=15){
                return 15.0;
            }
            else if (bw<=100){
                return 5.0;
            } else {
                return 1.0;
            }
    }

public static double M(int a,double f){
    double c = a;
    for (int i = 0; i<f;i++){
        c += proba(i);
    }
    return (c/100+1);
}


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("cmb de rolls sans bw: ");
        int rolls = scanner.nextInt();
        System.out.println("boost de base en % pour un wish sans boost bw:");
        int a = scanner.nextInt();
        int bestbw = 0;
        double best = 0;
        for (int bw = 0; bw <= rolls; bw++){
            double esperance = (rolls - bw)*M(a,bw);
            if (esperance > best){
                best = esperance;
                bestbw = bw;
            }
            scanner.close();
        }
        System.out.println(bestbw);
    }
}
