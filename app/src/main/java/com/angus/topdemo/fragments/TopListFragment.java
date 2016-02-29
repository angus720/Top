package com.angus.topdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.angus.topdemo.R;
import com.angus.topdemo.entities.Topclass;
import com.angus.topdemo.utils.DbUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopListFragment extends Fragment {


    public TopListFragment() {
        // Required empty public constructor
    }

    public static TopListFragment newInstance(long id) {

        Bundle args = new Bundle();

        TopListFragment fragment = new TopListFragment();
        args.putLong("id", id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        long id = getArguments().getLong("id");
        Topclass topclass = DbUtil.getSession().getTopclassDao().load(id);
        TextView text = (TextView) view.findViewById(R.id.top_list_text);
        text.setText(topclass.getName());
    }
}
