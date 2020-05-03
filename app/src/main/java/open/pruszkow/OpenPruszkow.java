package open.pruszkow;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import open.pruszkow.utils.CustomFragmentPagerAdapter;

public class OpenPruszkow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_open_pruszkow);

        // Get view pager and set up adapter
        ViewPager viewPager = findViewById(R.id.viewpager);
        CustomFragmentPagerAdapter pagerAdapter = new CustomFragmentPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(pagerAdapter);

        // Get TabLayout and 'GLUE' it with our viewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
