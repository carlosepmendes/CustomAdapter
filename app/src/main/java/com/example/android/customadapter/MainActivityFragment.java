package com.example.android.customadapter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Arrays;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private BandsAdapter bandsAdapter;

    Bands[] bands = {
            new Bands("Muse", R.drawable.cupcake),
            new Bands("Caricas",  R.drawable.donut),
            new Bands("Xanatoctoc", R.drawable.eclair),
            new Bands("Caricas",  R.drawable.froyo),
            new Bands("Velvet Carochinha",  R.drawable.gingerbread),
            new Bands("Onda Choque",  R.drawable.honeycomb),
            new Bands("Ana Malhoa",  R.drawable.icecream),
            new Bands("Avô cantigas",  R.drawable.jellybean),
            new Bands("Dartacão",  R.drawable.kitkat),
            new Bands("Pilotas",  R.drawable.lollipop)
    };

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        bandsAdapter = new BandsAdapter(getActivity(), Arrays.asList(bands));

        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.artist_list);
        listView.setAdapter(bandsAdapter);

        return rootView;
    }
}
