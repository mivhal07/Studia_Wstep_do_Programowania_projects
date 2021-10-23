package pierwszy_wykład;

public class Third01 {

    public static void main(String[] args) {
        System.out.println(toMuchForInt());
        System.out.println("");
        System.out.println(toMuchForDouble());
        System.out.println("");
        System.out.println(toLowForDouble());
    }

    public static int toMuchForInt(){
        int max = Integer.MAX_VALUE + 1;
        return max;
    }

    public static double toMuchForDouble(){
        double max = Double.MAX_VALUE + 1;
        return max;
    }

    public static double toLowForDouble(){
        double min = Double.MIN_VALUE - 1;
        return min;
    }
}
