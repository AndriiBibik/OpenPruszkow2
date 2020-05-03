package open.pruszkow.utils;

import android.content.Context;
import android.util.Log;
import open.pruszkow.R;

/**
 * Created by Potato on 03.10.2017.
 */

public class OpeningHours {
    /*
    * this class is for holding open and close hours for some place (like for cafe for example)
    * */
    private int[] mondayOpen;
    private int[] mondayClose;
    private int[] tuesdayOpen;
    private int[] tuesdayClose;
    private int[] wednesdayOpen;
    private int[] wednesdayClose;
    private int[] thursdayOpen;
    private int[] thursdayClose;
    private int[] fridayOpen;
    private int[] fridayClose;
    private int[] saturdayOpen;
    private int[] saturdayClose;
    private int[] sundayOpen;
    private int[] sundayClose;

    //context
    private Context context;

    public OpeningHours(int[] mondayOpen, int[] mondayClose, int[] tuesdayOpen, int[] tuesdayClose,
                        int[] wednesdayOpen, int[] wednesdayClose, int[] thursdayOpen, int[] thursdayClose,
                        int[] fridayOpen, int[] fridayClose, int[] saturdayOpen, int[] saturdayClose,
                        int[] sundayOpen, int[] sundayClose, Context context) {

        if ((mondayOpen.length == 2) &&
                (mondayClose.length == 2) &&
                (tuesdayOpen.length == 2) &&
                (tuesdayClose.length == 2) &&
                (wednesdayOpen.length == 2) &&
                (wednesdayClose.length == 2) &&
                (thursdayOpen.length == 2) &&
                (thursdayClose.length == 2) &&
                (fridayOpen.length == 2) &&
                (fridayClose.length == 2) &&
                (saturdayOpen.length == 2) &&
                (saturdayClose.length == 2) &&
                (sundayOpen.length == 2) &&
                (sundayClose.length == 2)) {

            this.mondayOpen = mondayOpen;
            this.mondayClose = mondayClose;
            this.tuesdayOpen = tuesdayOpen;
            this.tuesdayClose = tuesdayClose;
            this.wednesdayOpen = wednesdayOpen;
            this.wednesdayClose = wednesdayClose;
            this.thursdayOpen = thursdayOpen;
            this.thursdayClose = thursdayClose;
            this.fridayOpen = fridayOpen;
            this.fridayClose = fridayClose;
            this.saturdayOpen = saturdayOpen;
            this.saturdayClose = saturdayClose;
            this.sundayOpen = sundayOpen;
            this.sundayClose = sundayClose;

            this.context = context;

        } else {
            Log.v("OpeningHours.java", "constructor initialization error.");
        }

    }

    public String[] getOpeningHours() {

        String[] openingHours = new String[14];

        // Monday hours into String
        if (mondayOpen[0] != 0 || mondayOpen[1] != 0 || mondayClose[0] != 0 || mondayClose[1] != 0) {
            openingHours[0] = String.valueOf(mondayOpen[0]) + ":" + String.valueOf(mondayOpen[1]);
            openingHours[1] = String.valueOf(mondayClose[0]) + ":" + String.valueOf(mondayClose[1]);
        } else {
            openingHours[0] = "Closed";
            openingHours[1] = "";
        }

        // Tuesday hours into String
        if (tuesdayOpen[0] != 0 || tuesdayOpen[1] != 0 || tuesdayClose[0] != 0 || tuesdayClose[1] != 0) {
            openingHours[2] = String.valueOf(tuesdayOpen[0]) + ":" + String.valueOf(tuesdayOpen[1]);
            openingHours[3] = String.valueOf(tuesdayClose[0]) + ":" + String.valueOf(tuesdayClose[1]);
        } else {
            openingHours[2] = "Closed";
            openingHours[3] = "";
        }

        // Wednesday hours into String
        if (wednesdayOpen[0] != 0 || wednesdayOpen[1] != 0 || wednesdayClose[0] != 0 || wednesdayClose[1] != 0) {
            openingHours[4] = String.valueOf(wednesdayOpen[0]) + ":" + String.valueOf(wednesdayOpen[1]);
            openingHours[5] = String.valueOf(wednesdayClose[0]) + ":" + String.valueOf(wednesdayClose[1]);
        } else {
            openingHours[4] = "Closed";
            openingHours[5] = "";
        }

        // Thursday hours into String
        if (thursdayOpen[0] != 0 || thursdayOpen[1] != 0 || thursdayClose[0] != 0 || thursdayClose[1] != 0) {
            openingHours[6] = String.valueOf(thursdayOpen[0]) + ":" + String.valueOf(thursdayOpen[1]);
            openingHours[7] = String.valueOf(thursdayClose[0]) + ":" + String.valueOf(thursdayClose[1]);
        } else {
            openingHours[6] = "Closed";
            openingHours[7] = "";
        }

        // Friday hours into String
        if (fridayOpen[0] != 0 || fridayOpen[1] != 0 || fridayClose[0] != 0 || fridayClose[1] != 0) {
            openingHours[8] = String.valueOf(fridayOpen[0]) + ":" + String.valueOf(fridayOpen[1]);
            openingHours[9] = String.valueOf(fridayClose[0]) + ":" + String.valueOf(fridayClose[1]);
        } else {
            openingHours[8] = "Closed";
            openingHours[9] = "";
        }

        // Saturday hours into String
        if (saturdayOpen[0] != 0 || saturdayOpen[1] != 0 || saturdayClose[0] != 0 || saturdayClose[1] != 0) {
            openingHours[10] = String.valueOf(saturdayOpen[0]) + ":" + String.valueOf(saturdayOpen[1]);
            openingHours[11] = String.valueOf(saturdayClose[0]) + ":" + String.valueOf(saturdayClose[1]);
        } else {
            openingHours[10] = "Closed";
            openingHours[11] = "";
        }

        // Sunday hours into String
        if (sundayOpen[0] != 0 || sundayOpen[1] != 0 || sundayClose[0] != 0 || sundayClose[1] != 0) {
            openingHours[12] = String.valueOf(sundayOpen[0]) + ":" + String.valueOf(sundayOpen[1]);
            openingHours[13] = String.valueOf(sundayClose[0]) + ":" + String.valueOf(sundayClose[1]);
        } else {
            openingHours[12] = "Closed";
            openingHours[13] = "";
        }

        return openingHours;
    }

    public String[] formatedOpeningHours() {
        String[] openingHoursArray = getOpeningHours();
        String formatedOpeningHours[] = {
                context.getString(R.string.monday) + ":\n" +
                        context.getString(R.string.tuesday) + ":\n" +
                        context.getString(R.string.wednesday) + ":\n" +
                        context.getString(R.string.thursday) + ":\n" +
                        context.getString(R.string.friday) + ":\n" +
                        context.getString(R.string.saturday) + ":\n" +
                        context.getString(R.string.sunday) + ":"
                ,
                openingHoursArray[0] + " - " + openingHoursArray[1] + "\n" +
                        openingHoursArray[2] + " - " + openingHoursArray[3] + "\n" +
                        openingHoursArray[4] + " - " + openingHoursArray[5] + "\n" +
                        openingHoursArray[6] + " - " + openingHoursArray[7] + "\n" +
                        openingHoursArray[8] + " - " + openingHoursArray[9] + "\n" +
                        openingHoursArray[10] + " - " + openingHoursArray[11] + "\n" +
                        openingHoursArray[12] + " - " + openingHoursArray[13]
        };

        return formatedOpeningHours;
    }
}
