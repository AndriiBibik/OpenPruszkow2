package open.pruszkow.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import open.pruszkow.MorePicturesActivity;
import open.pruszkow.R;

/**
 * Created by Potato on 08.10.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    // list of places
    private ArrayList<Place> listOfPlaces;

    //context
    private Context context;

    public PlaceAdapter(Context context, ArrayList<Place> listOfPlaces) {
        super(context, R.layout.place_list_item, listOfPlaces);
        this.listOfPlaces = listOfPlaces;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Getting current place for current list item
        final Place currentPlace = listOfPlaces.get(position);

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.place_list_item, parent, false);

            ViewHolder holder = new ViewHolder(listItemView);
            listItemView.setTag(holder);

        }

        ViewHolder holder = (ViewHolder) listItemView.getTag();

        //Set corresponding place main image for list item
        holder.mainImage.setImageResource(currentPlace.getMainImageId());

        // Check if there is more images available - if not disable indicative text
        int visibility = !currentPlace.isPlacePicturesIdsSet() ? View.GONE : View.VISIBLE;
        holder.morePicsTextTextView.setVisibility(visibility);

        // Set corresponding text title
        holder.titleTextView.setText(currentPlace.getTitleId());

        // Set description text
        holder.descriptionTextView.setText(currentPlace.getShortDescriptionId());

        // Check if there is any opening hours for current place
        if (currentPlace.isOpeningHoursSet()) {
            // Setting days titles if there any hour for this place
            holder.openingHoursTitles.setText(currentPlace.getFormattedOpeningHours()[0]);
            // Setting opening hours if there is any for specific place
            holder.openingHoursTextView.setText(currentPlace.getFormattedOpeningHours()[1]);
        } else {
            holder.openingHoursTitles.setVisibility(View.GONE);
            holder.openingHoursTextView.setVisibility(View.GONE);
        }

        holder.placeMainImageLayout.setOnClickListener(view -> {
            if (currentPlace.isPlacePicturesIdsSet()) {
                Intent morePicturesIntent = new Intent(context, MorePicturesActivity.class);
                morePicturesIntent.putExtra("picturesArray", currentPlace.getPlacePicturesIds());
                context.startActivity(morePicturesIntent);
            }
        });

        holder.placeMainInfoLayout.setOnClickListener(view -> {
            Intent placeOnMap = new Intent(Intent.ACTION_VIEW);
            placeOnMap.setData(Uri.parse(currentPlace.getMapsUri()));
            context.startActivity(placeOnMap);
        });

        return listItemView;
    }

    class ViewHolder {
        @BindView(R.id.place_main_image) ImageView mainImage;
        @BindView(R.id.place_title) TextView titleTextView;
        @BindView(R.id.description_text) TextView descriptionTextView;
        @BindView(R.id.more_pics_text) TextView morePicsTextTextView;
        @BindView(R.id.opening_hours_days_titles) TextView openingHoursTitles;
        @BindView(R.id.opening_hours) TextView openingHoursTextView;
        @BindView(R.id.place_main_image_layout) LinearLayout placeMainImageLayout;
        @BindView(R.id.place_main_information) LinearLayout placeMainInfoLayout;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
