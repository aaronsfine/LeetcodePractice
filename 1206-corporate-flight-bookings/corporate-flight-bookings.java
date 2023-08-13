class Solution {

    //first solution, runs. Looking at others for runtime efficiency
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] totalSeats = new int[n];
        for (int[] row : bookings) {
            for (int i = row[0]; i <= row[1]; i++) {
                totalSeats[i-1] += row[2];
            }
        }

        return totalSeats;
    }
}