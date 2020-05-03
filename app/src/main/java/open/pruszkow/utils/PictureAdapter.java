package open.pruszkow.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import java.util.ArrayList;
import open.pruszkow.R;

/**
 * Created by Potato on 14.10.2017.
 */

public class PictureAdapter extends ArrayAdapter<Integer> {

    // more pictures ids for current place
    private ArrayList<Integer> listOfPicturesIds;

    // context of parent Activity relative to this pictures
    private Context context;


    public PictureAdapter(Context context, ArrayList<Integer> listOfPicturesIds) {
        super(context, R.layout.picture_list_item, listOfPicturesIds);
        this.listOfPicturesIds = listOfPicturesIds;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        // inflate view if not been used
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.picture_list_item, parent, false);
        }

        // Getting current place for current list item
        final Integer currentPicture = listOfPicturesIds.get(position);

        // Find corresponding id for picture in Activity for more pictures
        ImageView picture = listItemView.findViewById(R.id.more_pictures_item);

        // Set picture by resource id
        picture.setImageResource(currentPicture);

        // return list item with pith inserted picture inside, YO ;/
        return listItemView;
    }
}
