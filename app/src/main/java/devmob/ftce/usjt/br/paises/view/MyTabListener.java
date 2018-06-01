package devmob.ftce.usjt.br.paises.view;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by roger on 21/04/2018.
 */

public class MyTabListener implements ActionBar.TabListener {

    private ViewPager viewPager;
    private int index;

    public MyTabListener(ViewPager viewPager, int index) {
        this.index = index;
        this.viewPager = viewPager;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(index);
    }


}