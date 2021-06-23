import java.io.*;

import static java.lang.System.*;

public class ParkingTicket {
    private double fine;
    private double timeParked;

    public ParkingTicket() {
        fine = 0.0;
        timeParked =0.0;
    }

    public static void newLine() {
        out.println();
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    public static void ticket() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("ticket.txt"));


        ParkedCar pc = new ParkedCar();
        PlateNum pn = new PlateNum();
        ParkingMeter pm = new ParkingMeter();

        PoliceOfficer po = new PoliceOfficer();
        out.print("\t\tEnter Issuing Officer's Name: ");
        po.setOffName(getString());
        out.print("\t\tEnter Issuing Officer's Badge ID: ");
        po.setBadgeNum(getString());

        out.print("\t\tEnter Make: ");
        pc.setMake(getString());
        out.print("\t\tEnter Model: ");
        pc.setModel(getString());
        out.print("\t\tEnter Color: ");
        pc.setColor(getString());
        out.print("\t\tEnter Plate #: ");
        pn.setPlateNum(getString());
        out.print("\t\tEnter Number of Minutes Parked: ");
        pc.setMinsParked(Double.parseDouble(getString()));
        out.print("\t\tEnter Minutes Paid: ");
        pm.setMeterPay(Double.parseDouble((getString())));

        double citAmount = calcFine(pm.getMeterPay(), pc.getMinsParked());

        newLine();
        out.println("\t\tPrinting citation . . . ");
        newLine();

        pw.println();
        pw.println();
        pw.println();
        pw.println("\t\t---------------------------------------------------------");
        pw.println("\t\tMunicipal Ticketing, Inc.: Citation for Parking Violation");
        pw.println("\t\t---------------------------------------------------------");
        pw.println("\t\tMake: " + pc.getMake());
        pw.println("\t\tModel: " + pc.getModel());
        pw.println("\t\tColor: " + pc.getColor());
        pw.println("\t\tPlate #: " + pn.getPlateNum());
        pw.println("\t\tMinutes Parked: " + pc.getMinsParked());
        pw.println("\t\tMinutes Paid: " + pm.getMeterPay());
        pw.println("\t\t---------------------------------------------------------");
        pw.printf("\t\tFine: %.2f\n", citAmount);
        pw.println("\t\t---------------------------------------------------------");
        pw.println("\t\t\t\t\t  Issuing Officer's Credentials");
        pw.println("\t\t---------------------------------------------------------");
        pw.println("\t\tOfficer Name: " + po.getOffName());
        pw.println("\t\tOfficer Badge ID: " + po.getBadgeNum());
        pw.println("\t\t---------------------------------------------------------");

        pw.close();
    }

    public void setTimeParked(double timeParked) { this.timeParked = timeParked; }

    public double getTimeParked() {
        return timeParked;
    }

    public static double calcFine(double paid, double tParked) {
        final double hour = 60.0;   // minutes
        double citationCost = 0.00;

        ParkingMeter pm = new ParkingMeter();
        pm.setMeterPay(paid);

        ParkingTicket pt = new ParkingTicket();
        pt.setTimeParked(tParked);

        if (pt.getTimeParked() <= pm.getMeterPay())
            return 0.00;
        else if (pm.getMeterPay() < pt.getTimeParked()) {
            if (pt.getTimeParked() <= hour) {
                citationCost += 25.00;   // $
                return citationCost;
            } else if ((pt.getTimeParked() > hour) ) {
                int times60GoesIntoTimeParked = (int) pt.getTimeParked() / (int) hour;

                citationCost += 25.00 + times60GoesIntoTimeParked * 10.00;
                return citationCost;
            }
        }
        return citationCost;
    }

    // inner class protecting sensitive information
    private static class PlateNum {
        public String plateNum;

        public PlateNum() {
            plateNum = " ";
        }

        public void setPlateNum(String plateNum) {
            this.plateNum = plateNum;
        }

        public String getPlateNum() {
            return plateNum;
        }
    }
}
