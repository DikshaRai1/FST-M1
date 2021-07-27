public class Activity7 {
    public static void main(String args[]) {
        MountainBike mountainBike = new MountainBike(12,4,10);
        System.out.println(mountainBike.bicycleDesc());
        System.out.println("The speed after incrementing: " +mountainBike.speedUp(30));
        System.out.println("The speed after decrementing: " +mountainBike.applyBrake(10));
    }
}