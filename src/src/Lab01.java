public class Lab01 {

    public int highestAltitude (int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        Lab01 p1 = new Lab01();
        System.out.println(p1.highestAltitude(new int[]{1, 4, -7, -11}));
    }
}