package br.com.galdar.legendsofgaldar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.com.galdar.legendsofgaldar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CharactersFragment extends Fragment {

    private ListView charsList;
    private String[] myChars = {
            "Rick Manu",
            "Ganondorf",
            "Aiser Dominic",
            "Asmordan Klinn",
            "Darciro Nemelau",
            "Robin D'Laws",
            "Robert Kenny",
            "Eduard Kenny",
            "Master Kenobi",
            "Ipsum lorem",
            "Joao de Sá",
    };
    private String[] xxx = {
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
            "Foobar",
    };


    public CharactersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_characters, container, false);

        charsList = (ListView) view.findViewById(R.id.charsList);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                myChars
        );

        charsList.setAdapter( listAdapter );
        charsList.setOnItemClickListener( new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // String charSelected = charsList.getItemIdAtPosition(position).toString();
            }
        });

        return view;
    }

}
