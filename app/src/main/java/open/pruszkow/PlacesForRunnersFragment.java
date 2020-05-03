package open.pruszkow;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import open.pruszkow.utils.Place;
import open.pruszkow.utils.PlaceAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesForRunnersFragment extends Fragment {

    public PlacesForRunnersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.places_list, container, false);

        // ArrayList of places for runners
        ArrayList<Place> placesForRunnersList = new ArrayList<>();

        // First place
        //
        // Pictures  ids for za_basenem place
        int[] zaBasenemPicturesArray = {R.drawable.za_basenem_1, R.drawable.za_basenem_2,
                R.drawable.za_basenem_3, R.drawable.za_basenem_4, R.drawable.za_basenem_5,
                R.drawable.za_basenem_6, R.drawable.za_basenem_7, R.drawable.za_basenem_8,
                R.drawable.za_basenem_9};

        // Coordinates
        double[] coordinatesZaBasenem = {52.162451, 20.823317};
        placesForRunnersList.add(new Place(R.drawable.za_basenem_1, R.string.za_basenem,
                R.string.za_basenem_description, coordinatesZaBasenem, zaBasenemPicturesArray));


        // Second place
        //
        // Pictures  ids for Komorów place
        int[] komorowPicturesArray = {R.drawable.komorow_1, R.drawable.komorow_2};

        // Coordinates
        double[] coordinatesKomorow = {52.162451, 20.823317};
        placesForRunnersList.add(new Place(R.drawable.komorow_1, R.string.komorow,
                R.string.komorów_description, coordinatesKomorow, komorowPicturesArray));

        // Third place
        //
        // Coordinates
        double[] coordinatesStadionMOS = {52.162451, 20.823317};
        placesForRunnersList.add(new Place(R.drawable.main_image_stadion_mos, R.string.stadion_mos,
                R.string.stadion_mos_description, coordinatesStadionMOS, (int[]) null));


        // Adapter knows how to create list items for each item in the list.
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), placesForRunnersList);

        // Find the ListView object in the view hierarchy with the view ID called list.
        ListView listView = view.findViewById(R.id.list);

        //setting background color for ListView
        listView.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.lightBlueBackground));

        // Make the found previously ListVew use the PlaceAdapter we created above, so that the
        // ListView will display list items for each ListView item in the list.
        listView.setAdapter(itemsAdapter);

        return view;
    }
}
