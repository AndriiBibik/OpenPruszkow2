package open.pruszkow.utils;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import open.pruszkow.EatFunFragment;
import open.pruszkow.GoForExercisesFragment;
import open.pruszkow.ParksFragment;
import open.pruszkow.PlacesForRunnersFragment;
import open.pruszkow.R;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public CustomFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.parks);
            case 1:
                return context.getString(R.string.pl_for_runners);
            case 2:
                return context.getString(R.string.exercises);
            default:
                return context.getString(R.string.eat_fun);
        }
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new PlacesForRunnersFragment();
            case 2:
                return new GoForExercisesFragment();
            default:
                return new EatFunFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
