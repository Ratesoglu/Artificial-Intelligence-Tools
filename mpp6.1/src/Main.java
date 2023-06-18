
public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        BruteForce2.findBestBasket("C:\\EclipseUTP\\mpp6.1\\knapsack.txt");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000000;  //divide by 1000000000 to get seconds
        System.out.println("Program execution time: "+duration+"s");
    }
}
