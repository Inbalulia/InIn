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

//    boolean state = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button button;

        final TextView textViewToChange = (TextView) view.findViewById(R.id.Names);
        button = (Button) view.findViewById(R.id.Click);

        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View Click) {

//                                           if (state) {
//                                                   textViewToChange.setText("Inbal");
//                                               }
//                                               else{
//                                                   textViewToChange.setText("Inessa");
//                                               }
//                                               state = !state;
//                                           }

                                          if (textViewToChange.getText() == "Inbal") {
                                              textViewToChange.setText("Inessa");
                                          } else {
                                              textViewToChange.setText("Inbal");
                                          }
                                      }
                                  }
        );
    }
}

