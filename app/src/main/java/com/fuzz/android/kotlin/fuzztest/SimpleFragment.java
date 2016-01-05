package com.fuzz.android.kotlin.fuzztest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cesaraguilar on 1/5/16.
 */
public class SimpleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity)getActivity()).fakePublicFunction();
        TextGenerator generator = new TextGenerator();
        View view = inflater.inflate(R.layout.fragment_simple, null);

        ((TextView)view.findViewById(R.id.secondtext)).setText(generator.generateText());

        return view;
    }
}
