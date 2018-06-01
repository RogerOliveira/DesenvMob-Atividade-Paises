package devmob.ftce.usjt.br.paises.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by roger on 21/04/2018.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if(position == 0){
            return new DetalhePais();
        } else {
            return null;

        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
