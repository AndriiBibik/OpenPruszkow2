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
public class GoForExercisesFragment extends Fragment {

    public GoForExercisesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> placesForExercises = new ArrayList<>();
        // Place for exercises Plac w parku Kosciuszki
        //
        // Coordinates

        double[] coordinatesPlacKosciuszki = {52.162451, 20.823317};

        placesForExercises.add(new Place(R.drawable.main_image_exercises_kosciuszki, R.string.plac_park_kosciuszki,
                R.string.plac_park_kosciuszki_description, coordinatesPlacKosciuszki, (int[]) null));

        // Place for exercises w parku Anielin
        //
        // Coordinates
        double[] coordinatesPlacParkAnielin = {52.162451, 20.823317};

        placesForExercises.add(new Place(R.drawable.main_image_exercises_park_anielin, R.string.czwiczenia_park_anielin,
                R.string.czwiczenia_park_anielin_description, coordinatesPlacParkAnielin, (int[]) null));

        // Place for exercises plac do wourkout'u
        //
        // Coordinates
        double[] coordinatesPlacDoWorkout = {52.162451, 20.823317};

        placesForExercises.add(new Place(R.drawable.main_image_exercises_workout, R.string.street_wourkout,
                R.string.street_workout_description, coordinatesPlacDoWorkout, (int[]) null));

        // Place for exercises miejsce do zagrania w Plazowke
        //
        // Coordinates
        double[] coordinatesPlazowka = {52.162451, 20.823317};

        placesForExercises.add(new Place(R.drawable.main_image_exercises_plazowka, R.string.place_exercises_plazowka,
                R.string.place_exercises_plazowka_description, coordinatesPlazowka, (int[]) null));

        // Place for exercises basen Kapry
        //
        // Coordinates
        double[] coordinatesKapry = {52.162451, 20.823317};

        placesForExercises.add(new Place(R.drawable.main_image_exercises_basen_kapry, R.string.place_exercises_basen_kapry,
                R.string.place_exercises_plazowka_description, coordinatesKapry, (int[]) null));


        // adapter knows how to create list items for each item in the list.
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), placesForExercises);

        // Find the ListView object in the view hierarchy with the view ID called list.
        ListView listView = view.findViewById(R.id.list);

        //setting background color for ListView
        listView.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.lightDeepOrangeBackground));

        // Make the found previously ListVew use the PlaceAdapter we created above, so that the
        // ListView will display list items for each ListView item in the list.
        listView.setAdapter(itemsAdapter);

        return view;
    }
}
