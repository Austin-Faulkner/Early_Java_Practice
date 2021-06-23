import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static java.lang.System.*;

public class PoliceOfficer {
    private String offName;
    private String badgeNum;

    public PoliceOfficer() {
        offName = " ";
        badgeNum = " ";
    }

    public void setOffName(String offName) {
        this.offName = offName;
    }

    public void setBadgeNum(String badgeNum) {
        this.badgeNum = badgeNum;
    }

    public String getOffName() {
        return offName;
    }

    public String getBadgeNum() {
        return badgeNum;
    }

    public static void newLine() {
        out.println();
    }

    public static void main(String [] args) throws IOException {
        newLine();
        ParkingTicket.ticket();
    }
}
