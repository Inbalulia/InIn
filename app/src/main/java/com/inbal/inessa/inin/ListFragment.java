package com.inbal.inessa.inin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ListFragment extends Fragment {

    boolean x = true;

    public ListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button button;
        button = (Button) getView().findViewById(R.id.Click);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View Click) {
                    if (x) {
                        final TextView textViewToChange = (TextView) getView().findViewById(R.id.Names);
                        textViewToChange.setText("Inbal");
                    }
                    else{
                        final TextView textViewToChange = (TextView) getView().findViewById(R.id.Names);
                        textViewToChange.setText("Inessa");
                    }
                    x = !x;
                }
        });
    }
}
