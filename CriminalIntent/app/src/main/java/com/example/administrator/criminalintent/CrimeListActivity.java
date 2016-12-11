package com.example.administrator.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ngoctu on 11/12/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
