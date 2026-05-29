package PC04PrefixSum;

public class Exercise01Problem1732 {

    public int largestAltitude(int[] gain) {
        // numero de pontos: n+1
        // Começa no ponto 0 de altitude 0
        int lastAltitude = 0;
        int highest = 0;
        for(int i =0; i < gain.length; i++) {
            if(gain[i] - lastAltitude >= highest) {
                highest = gain[i] - lastAltitude;
            }
            lastAltitude = lastAltitude - gain[i];
        }

        return highest;
    }
}
