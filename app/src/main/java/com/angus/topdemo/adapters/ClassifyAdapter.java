package com.angus.topdemo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.angus.topdemo.entities.Topclass;
import com.angus.topdemo.fragments.TopListFragment;
import com.angus.topdemo.utils.DbUtil;

import java.util.List;

/**
 * Created by Administrator on 2016/2/27.
 */
public class ClassifyAdapter extends FragmentPagerAdapter {
    private List<Topclass> list;
    public ClassifyAdapter(FragmentManager fm) {
        super(fm);
        list = DbUtil.getSession().getTopclassDao().loadAll();
    }

    @Override
    public Fragment getItem(int position) {
        return TopListFragment.newInstance(list.get(position).getId());
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getName();
    }
}
