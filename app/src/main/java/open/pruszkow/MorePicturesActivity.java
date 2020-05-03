package open.pruszkow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import open.pruszkow.utils.PictureAdapter;

public class MorePicturesActivity extends AppCompatActivity {

    private int[] picturesIds;


    // Overriding method that will finish current activity and will start previously Opened Activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) // Press Back Icon
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    // Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Get pictures ids from previously sent intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            picturesIds = extras.getIntArray("picturesArray");
            //The key argument here must match that used in the other activity
        }

        setContentView(R.layout.more_pictures_list);


        // Preparing ActionBar
        ActionBar actionBar = getSupportActionBar();
        //
        // To allow Up navigation with the app icon in the action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        // ArrayList of pictures ids
        ArrayList<Integer> picturesIdsArray = new ArrayList<>();

        // integer array into ArrayList
        for (int i = 0; i < picturesIds.length; i++) {
            picturesIdsArray.add(new Integer(picturesIds[i]));
        }

        // adapter knows how to create list items for each item in the list.
        PictureAdapter itemsAdapter = new PictureAdapter(this, new ArrayList<Integer>(picturesIdsArray));

        // Find the ListView object in the view hierarchy with the view ID called list.
        ListView listView = findViewById(R.id.more_pictures_list);

        //setting background color for ListView
        listView.setBackgroundColor(ContextCompat.getColor(this, R.color.lightLimeBackground));

        // Make the found previously ListVew use the PlaceAdapter we created above, so that the
        // ListView will display list items for each ListView item in the list.
        listView.setAdapter(itemsAdapter);
    }
}
