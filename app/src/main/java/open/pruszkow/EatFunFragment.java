package open.pruszkow;

import android.content.Context;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import open.pruszkow.utils.OpeningHours;
import open.pruszkow.utils.Place;
import open.pruszkow.utils.PlaceAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatFunFragment extends Fragment {

    public EatFunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Context context = getActivity();

        View view = inflater.inflate(R.layout.places_list, container, false);


        //ArrayList of places to eat
        ArrayList<Place> placesToEat = new ArrayList<>();

        //Biesiadowo
        //
        //Opening hours for Biesiadowo in Pruszków
        int[] monOpen1 = {11, 0};
        int[] monClose1 = {22, 0};
        int[] tueOpen1 = {11, 0};
        int[] tueClose1 = {22, 0};
        int[] wedOpen1 = {11, 0};
        int[] wedClose1 = {22, 0};
        int[] thuOpen1 = {11, 0};
        int[] thuClose1 = {22, 0};
        int[] friOpen1 = {11, 0};
        int[] friClose1 = {23, 0};
        int[] satOpen1 = {11, 0};
        int[] satClose1 = {23, 0};
        int[] sunOpen1 = {12, 0};
        int[] sunClose1 = {22, 0};

        OpeningHours openingHours = new OpeningHours(monOpen1, monClose1, tueOpen1, tueClose1,
                wedOpen1, wedClose1, thuOpen1, thuClose1, friOpen1, friClose1, satOpen1, satClose1,
                sunOpen1, sunClose1, context);

        // Biesiadowo coordinates
        double[] coordinatesBesiadowo = {52.159775, 20.804992};

        //addiing Biesiadowo place to Arraylist
        placesToEat.add(new Place(R.drawable.main_image_eat_besiadowo, R.string.besiadowo_title,
                R.string.biesiadowo_description, coordinatesBesiadowo, openingHours));


        //Corrado
        //
        //Opening hours for Corrado in Pruszków
        int[] monOpen2 = {10, 0};
        int[] monClose2 = {23, 0};
        int[] tueOpen2 = {10, 0};
        int[] tueClose2 = {23, 0};
        int[] wedOpen2 = {10, 0};
        int[] wedClose2 = {23, 0};
        int[] thuOpen2 = {10, 0};
        int[] thuClose2 = {23, 0};
        int[] friOpen2 = {10, 0};
        int[] friClose2 = {0, 0};
        int[] satOpen2 = {10, 0};
        int[] satClose2 = {0, 0};
        int[] sunOpen2 = {11, 0};
        int[] sunClose2 = {23, 0};

        OpeningHours openingHoursBesiadowo = new OpeningHours(monOpen2, monClose2, tueOpen2, tueClose2,
                wedOpen2, wedClose2, thuOpen2, thuClose2, friOpen2, friClose2, satOpen2, satClose2,
                sunOpen2, sunClose2, context);

        // Corrado coordinates
        double[] coordinatesCorrado = {52.158411, 20.799633};

        //addiing Corrado place to Arraylist
        placesToEat.add(new Place(R.drawable.main_image_eat_corrado, R.string.corrado_title,
                R.string.corrado_description, coordinatesCorrado, openingHoursBesiadowo));


        //Erebuni
        //
        //Opening hours for Erebuni in Pruszków
        int[] monOpen3 = {11, 0};
        int[] monClose3 = {21, 30};
        int[] tueOpen3 = {11, 0};
        int[] tueClose3 = {21, 30};
        int[] wedOpen3 = {11, 0};
        int[] wedClose3 = {21, 30};
        int[] thuOpen3 = {11, 0};
        int[] thuClose3 = {21, 30};
        int[] friOpen3 = {11, 0};
        int[] friClose3 = {21, 30};
        int[] satOpen3 = {11, 15};
        int[] satClose3 = {21, 30};
        int[] sunOpen3 = {11, 15};
        int[] sunClose3 = {21, 30};

        OpeningHours openingHoursErebuni = new OpeningHours(monOpen3, monClose3, tueOpen3, tueClose3,
                wedOpen3, wedClose3, thuOpen3, thuClose3, friOpen3, friClose3, satOpen3, satClose3,
                sunOpen3, sunClose3, context);

        // Erebuni coordinates
        double[] coordinatesErebuni = {52.163824, 20.804124};

        //adding Erebuni place to Arraylist
        placesToEat.add(new Place(R.drawable.main_image_eat_erebuni_kebab, R.string.erebuni_kebab_title,
                R.string.erebuni_kebab_description, coordinatesErebuni, openingHoursErebuni));

        //Eskaem Cafe
        //
        //Opening hours for Eskaem Cafe in Pruszków
        int[] monOpen4 = {13, 30};
        int[] monClose4 = {23, 0};
        int[] tueOpen4 = {13, 30};
        int[] tueClose4 = {22, 30};
        int[] wedOpen4 = {13, 30};
        int[] wedClose4 = {22, 30};
        int[] thuOpen4 = {13, 30};
        int[] thuClose4 = {22, 30};
        int[] friOpen4 = {13, 30};
        int[] friClose4 = {1, 0};
        int[] satOpen4 = {13, 30};
        int[] satClose4 = {2, 0};
        int[] sunOpen4 = {13, 30};
        int[] sunClose4 = {23, 0};

        OpeningHours openingHoursEskaemCafe = new OpeningHours(monOpen4, monClose4, tueOpen4, tueClose4,
                wedOpen4, wedClose4, thuOpen4, thuClose4, friOpen4, friClose4, satOpen4, satClose4,
                sunOpen4, sunClose4, context);

        // Eskaem Cafe coordinates
        double[] coordinatesEskaemCafe = {52.167633, 20.798731};

        //addiing Eskaem Cafe place to Arraylist
        placesToEat.add(new Place(R.drawable.main_image_eat_eskaem, R.string.eskaem_title,
                R.string.eskaem_description, coordinatesEskaemCafe, openingHoursEskaemCafe));

        //Oliwka
        //
        //Opening hours for Oliwka in Pruszków
        int[] monOpen5 = {11, 0};
        int[] monClose5 = {18, 0};
        int[] tueOpen5 = {11, 0};
        int[] tueClose5 = {18, 0};
        int[] wedOpen5 = {11, 0};
        int[] wedClose5 = {18, 0};
        int[] thuOpen5 = {11, 0};
        int[] thuClose5 = {18, 0};
        int[] friOpen5 = {11, 0};
        int[] friClose5 = {18, 0};
        int[] satOpen5 = {0, 0};
        int[] satClose5 = {0, 0};
        int[] sunOpen5 = {0, 0};
        int[] sunClose5 = {0, 0};

        OpeningHours openingHoursOliwka = new OpeningHours(monOpen5, monClose5, tueOpen5, tueClose5,
                wedOpen5, wedClose5, thuOpen5, thuClose5, friOpen5, friClose5, satOpen5, satClose5,
                sunOpen5, sunClose5, context);

        // Oliwka coordinates
        double[] coordinatesOliwka = {52.167561, 20.801015};

        //addiing Oliwka place to Arraylist
        placesToEat.add(new Place(R.drawable.main_image_eat_oliwka, R.string.oliwka_title,
                R.string.oliwka_description, coordinatesOliwka, openingHoursOliwka));


        //Sila Kebab
        //
        //Opening hours for Sila Kebab in Pruszków
        int[] monOpen6 = {9, 0};
        int[] monClose6 = {23, 0};
        int[] tueOpen6 = {9, 0};
        int[] tueClose6 = {23, 0};
        int[] wedOpen6 = {9, 0};
        int[] wedClose6 = {23, 0};
        int[] thuOpen6 = {9, 0};
        int[] thuClose6 = {23, 0};
        int[] friOpen6 = {9, 0};
        int[] friClose6 = {23, 0};
        int[] satOpen6 = {9, 0};
        int[] satClose6 = {23, 0};
        int[] sunOpen6 = {10, 0};
        int[] sunClose6 = {23, 0};

        OpeningHours openingHoursSilaKebab = new OpeningHours(monOpen6, monClose6, tueOpen6, tueClose6,
                wedOpen6, wedClose6, thuOpen6, thuClose6, friOpen6, friClose6, satOpen6, satClose6,
                sunOpen6, sunClose6, context);

        // Sila Kebab coordinates
        double[] coordinatesSilaKebab = {52.154440, 20.792976};

        //addiing Sila Kebab place to Arraylist
        placesToEat.add(new Place(R.drawable.main_image_eat_sila_kebab, R.string.sila_kebab_title,
                R.string.sila_kebab_description, coordinatesSilaKebab, openingHoursSilaKebab));


        // Adapter knows how to create list items for each item in the list.
        PlaceAdapter itemsAdapter = new PlaceAdapter(context, placesToEat);

        // Find the ListView object in the view hierarchy with the view ID called list.
        ListView listView = view.findViewById(R.id.list);

        //setting background color for ListView
        listView.setBackgroundColor(ContextCompat.getColor(context, R.color.lightAmberBackground));

        // Make the found previously ListVew use the PlaceAdapter we created above, so that the
        // ListView will display list items for each ListView item in the list.
        listView.setAdapter(itemsAdapter);

        return view;
    }
}
