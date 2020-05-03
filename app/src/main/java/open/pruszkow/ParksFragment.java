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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.places_list, container, false);

        // ArrayList of Parks
        ArrayList<Place> parksList = new ArrayList<>();

        // Adding each park to ArrayList

        // Anielin
        double[] coordinates = {52.168772, 20.807641};
        parksList.add(new Place(R.drawable.main_image_park_anielin,
                R.string.park_anielin,
                R.string.park_anielin_description, coordinates, (int[]) null));

        // Kosciuszki
        coordinates[0] = 52.166663;
        coordinates[1] = 20.802053;
        parksList.add(new Place(R.drawable.main_image_park_kosciuszki,
                R.string.park_kosciuszki,
                R.string.park_kosciuszki_description, coordinates, (int[]) null));

        // Mazowsze
        coordinates[0] = 52.184372;
        coordinates[1] = 20.802114;
        parksList.add(new Place(R.drawable.main_image_park_mazowsze,
                R.string.park_mazowsze,
                R.string.park_mazowsze_description, coordinates, (int[]) null));

        // Potulickich
        coordinates[0] = 52.167423;
        coordinates[1] = 20.809584;
        // array of additional images ids
        int[] picsPotulickich = {R.drawable.park_potulickich_1, R.drawable.park_potulickich_2,
                R.drawable.park_potulickich_3, R.drawable.park_potulickich_4};
        parksList.add(new Place(R.drawable.main_image_park_potulickich,
                R.string.park_potulickich,
                R.string.park_potulickich_description, coordinates, picsPotulickich));


        // Zwirowisko
        coordinates[0] = 52.151482;
        coordinates[1] = 20.796470;
        parksList.add(new Place(R.drawable.main_image_park_zwirowisko,
                R.string.park_zwirowisko,
                R.string.park_zwirowisko_description, coordinates, (int[]) null));


        // adapter knows how to create list items for each item in the list.
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), parksList);

        // Find the ListView object in the view hierarchy with the view ID called list.
        ListView listView = view.findViewById(R.id.list);

        //setting background color for ListView
        listView.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.lightGreenBackground));

        // Make the found previously ListVew use the PlaceAdapter we created above, so that the
        // ListView will display list items for each ListView item in the list.
        listView.setAdapter(itemsAdapter);

        return view;
    }
}
