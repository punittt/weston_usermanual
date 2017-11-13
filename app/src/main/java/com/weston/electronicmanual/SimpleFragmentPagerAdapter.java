package com.weston.electronicmanual;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by LENOVO on 10/4/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new TVFragment();
        } else if (position == 2) {
            return new AppsFragment();
        } else if (position == 3) {
            return new AppStoreFragment();
        } else if (position == 4) {
            return new MediaFragment();
        } else if (position == 5) {
            return new SettingsFragment();
        } else {
            return new RemoteFragment();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 7;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.home);
            case 1:
                return mContext.getString(R.string.tv);
            case 2:
                return mContext.getString(R.string.apps);
            case 3:
                return mContext.getString(R.string.appstore);
            case 4:
                return mContext.getString(R.string.media);
            case 5:
                return mContext.getString(R.string.settings);
            case 6:
                return mContext.getString(R.string.remote_shortcuts);
            default:
                return null;
        }
    }

}
