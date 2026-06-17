package Level1PracticeProblems;

public class volumeEarth {
    public static void main(String[] args){
        double radiusKm = 6378;
        double radiusMiles = radiusKm/1.6;
        double volumeKm = (double)(4/3) * Math.PI * Math.pow(radiusKm,3);
        double volumeMiles = (double)(4/3) * Math.PI * Math.pow(radiusMiles,3);
        System.out.println("The volume of earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeMiles);
    }
}