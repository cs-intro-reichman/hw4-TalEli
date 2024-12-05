public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean [] sieve = new boolean[N+1];
        int p = 2;

        for (int i=2; i<=N; i++){
            sieve[i] = true;
        }

        while (p <= N){
            if (sieve[p] == true){
                int m = p * p;
                while (m <=N){
                    sieve[m] = false;
                    m += p;
                }
            }
            p ++;
        }

        int count = 0; 
        System.out.println("Prime numbers up to " + N +":"); 
        for (int i=2; i<= N;i++){
            if (sieve[i] == true){
                count ++;
                System.out.println(i); 
            }
        }

    int precent = (100*count)/N;
        System.out.println("There are " + count + " primes between 2 and "+ N + " (" + precent + "% are primes)"); 
    }
}