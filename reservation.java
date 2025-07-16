// You're working on a seat reservation system where:

// You must reserve the lowest-numbered available seat on each 0 (reservation request).

// A positive number x means cancel reservation for seat x.

// For each 0, print the seat number reserved.

// For cancellations, print nothing.
import java.util.*;

public class SeatReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // total seats
        int K = sc.nextInt(); // total operations
        int[] alloc = new int[N + 1]; // index from 1 to N

        for (int i = 0; i < K; i++) {
            int op = sc.nextInt();

            if (op == 0) {
                // Reservation request — find the lowest free seat
                for (int j = 1; j <= N; j++) {
                    if (alloc[j] == 0) {
                        alloc[j] = 1;  // reserve
                        System.out.println(j);  // print reserved seat
                        break;
                    }
                }
            } else {
                // Cancellation request — mark seat op as free
                alloc[op] = 0;
            }
        }

        sc.close();
    }
}
