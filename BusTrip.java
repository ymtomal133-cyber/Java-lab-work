public class BusTrip {

    private String tripCode;
    private String route;
    private int fare;
    private int capacity;
    private int seatsLeft;

    private static int tripCount = 0;

    public BusTrip(String route, int fare, int capacity) {
        tripCount++;
        this.tripCode = "BT-" + (200 + tripCount);
        this.route = route;
        this.fare = fare;
        this.capacity = capacity;
        this.seatsLeft = capacity;
    }

    public BusTrip(String route, int fare) {
        this(route, fare, 40);
    }

    public static int getTripCount() {
        return tripCount;
    }

    public String getRoute() {
        return route;
    }

    public int getSeatsLeft() {
        return seatsLeft;
    }

    public int getRevenue() {
        return fare * (capacity - seatsLeft);
    }

    public boolean bookSeats(int count) {
        if (count <= 0 || count > seatsLeft) {
            return false;
        }

        seatsLeft -= count;
        return true;
    }

    public void printInfo() {
        System.out.printf(
            "%s %-12s Tk %3d seats left: %2d%n",
            tripCode, route, fare, seatsLeft
        );
    }
}