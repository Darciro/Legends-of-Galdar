package br.com.galdar.legendsofgaldar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.galdar.legendsofgaldar.R;
import br.com.galdar.legendsofgaldar.RecyclerItemClickListener;
import br.com.galdar.legendsofgaldar.adapters.AdapterChars;
import br.com.galdar.legendsofgaldar.models.Being;

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
    private RecyclerView charsRecyclerView;
    private List<Being> beingsList = new ArrayList<>();


    public CharactersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_characters, container, false);

        /*charsList = (ListView) view.findViewById(R.id.charsList);

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
                String charSelectedPos = String.valueOf( charsList.getItemIdAtPosition(position) );
                Toast.makeText(getContext(), charSelectedPos, Toast.LENGTH_LONG).show();
            }
        });*/

        charsRecyclerView = view.findViewById(R.id.charsRecyclerView);

        this.defineTestBeings();

        // Configuring the adapter
        AdapterChars adapterChars = new AdapterChars( beingsList );

        // Configuring Recycler
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getContext() );
        charsRecyclerView.setLayoutManager( layoutManager );
        charsRecyclerView.setHasFixedSize( true );
        charsRecyclerView.addItemDecoration( new DividerItemDecoration( getContext(), LinearLayout.VERTICAL) );
        charsRecyclerView.setAdapter( adapterChars );
        charsRecyclerView.addOnItemTouchListener( new RecyclerItemClickListener(getContext(), charsRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Being being = beingsList.get( position );
                Toast.makeText( getContext(), "On item click " + being.getName(), Toast.LENGTH_LONG ).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Being being = beingsList.get( position );
                Toast.makeText( getContext(), "On item long click "  + being.getName(), Toast.LENGTH_LONG ).show();
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText( getContext(), "On item click " + position, Toast.LENGTH_LONG ).show();
            }
        }) );

        return view;
    }

    public void defineTestBeings() {

        Being being = new Being("Rick Manu", "06", "Ladino");
        beingsList.add( being );

        Being being2 = new Being("Asmordan Klinn", "26", "Mago");
        beingsList.add( being2 );

        Being being3 = new Being("Fulano de Talz", "04", "Guerreiro");
        beingsList.add( being3 );

    }

}
