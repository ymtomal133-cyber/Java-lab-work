public class BusCounter {

    public static void main(String[] args) {


        BusTrip[] trips = new BusTrip[4];

        trips[0] = new BusTrip("Mirpur-DSC", 50, 30);
        trips[1] = new BusTrip("Uttara-DSC", 40, 25);
        trips[2] = new BusTrip("Gabtoli-DSC", 35);
        trips[3] = new BusTrip("Savar-DSC", 30, 20);

        
        System.out.println("Trips created: " + BusTrip.getTripCount());

        
        if (!trips[0].bookSeats(12)) {
            System.out.println("Booking failed for " + trips[0].getRoute());
        }

        if (!trips[1].bookSeats(30)) {
            System.out.println("Booking failed for " + trips[1].getRoute());
        }

        if (!trips[2].bookSeats(8)) {
            System.out.println("Booking failed for " + trips[2].getRoute());
        }

        BusTrip busy = trips[3];

        busy.bookSeats(20);

        int totalRevenue = 0;
        BusTrip emptiest = trips[0];

        for (int i = 0; i < trips.length; i++) {

            trips[i].printInfo();

            totalRevenue += trips[i].getRevenue();

            if (trips[i].getSeatsLeft() > emptiest.getSeatsLeft()) {
                emptiest = trips[i];
            }
        }

        System.out.println("Total revenue: Tk " + totalRevenue);

        System.out.println("Most seats left: " + emptiest.getRoute());

        System.out.println("trips[3] seats left: " + trips[3].getSeatsLeft());
    }
}