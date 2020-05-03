package open.pruszkow.utils;

/**
 * Created by Potato on 03.10.2017.
 */

public class Place {

    //image resource id
    private int mainImageId;

    //place title resource id
    private int titleId;

    //short description about place
    private int shortDescriptionId;

    //coordinate to send maps intent later
    private double[] coordinates;

    //Uri for place location
    private String placeUri;

    //more pictures files names
    private int[] placePicturesIds;

    //opening hours for places like restaurants etc.
    private OpeningHours openingHours;


    //this counstructor is used for places like parks, places for exersizes, where you cannot aply opening hours
    public Place(int mainImageId, int titleId, int shortDescriptionId, double[] coordinates, int[] placePicturesIds) {
        this.mainImageId = mainImageId;
        this.titleId = titleId;
        this.shortDescriptionId = shortDescriptionId;
        this.coordinates = coordinates;
        this.placeUri = "http://www.google.com/maps/search/?api=1&query=" + coordinates[0] + "," + coordinates[1];
        this.placePicturesIds = placePicturesIds;
    }


    //this constructor is used for places like restaurants, where we want to specify opening hours
    public Place(int mainImageId, int titleId, int shortDescriptionId, double[] coordinates, OpeningHours openingHours) {
        this.mainImageId = mainImageId;
        this.titleId = titleId;
        this.shortDescriptionId = shortDescriptionId;
        this.coordinates = coordinates;
        this.placeUri = "http://www.google.com/maps/search/?api=1&query=" + coordinates[0] + "," + coordinates[1];
        this.openingHours = openingHours;
    }

    // returning of Main image for this Place
    public int getMainImageId() {
        return mainImageId;
    }

    // returning title id for this place
    public int getTitleId() {
        return titleId;
    }

    // returning description id for this place
    public int getShortDescriptionId() {
        return shortDescriptionId;
    }

    // checks if there is array for pictures ids initialized
    public boolean isPlacePicturesIdsSet() { return placePicturesIds != null; }

    // returns array with additional pictures, always should be used with isPlacePicturesIdsSet method
    public int[] getPlacePicturesIds() {
        return placePicturesIds;
    }

    // checks if there is opening hours initialized
    public boolean isOpeningHoursSet() { return openingHours != null; }

    // returnts formatted openingHours. This method should be used with isOpeningHoursSet method
    public String[] getFormattedOpeningHours() {
        return openingHours.formatedOpeningHours();
    }

    // Returns String with url to specific place for list item
    public String getMapsUri() {
        return placeUri;
    }
}
