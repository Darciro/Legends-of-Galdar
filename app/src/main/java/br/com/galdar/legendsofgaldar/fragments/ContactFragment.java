package br.com.galdar.legendsofgaldar.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.galdar.legendsofgaldar.R;
import br.com.galdar.legendsofgaldar.activities.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    private FloatingActionButton fabSendEmail;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        fabSendEmail = (FloatingActionButton) view.findViewById(R.id.fab_send_email);
        fabSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                sendEmail();

            }
        });
        fabSendEmail.show();
        return view;
    }

    public void sendEmail() {

        Intent email = new Intent( Intent.ACTION_SEND );
        email.putExtra( Intent.EXTRA_EMAIL, new String[]{ "rickmanu@gmail.com", "contato@galdar.com.br" } );
        email.putExtra( Intent.EXTRA_SUBJECT, "New message from Legends of Galdar" );
        email.putExtra( Intent.EXTRA_TEXT, "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat." );
        email.setType( "message/rfc822" ); // Type for send email message
        // email.setType( "application/pdf" ); // Type for open pdf
        // email.setType( "image/png" ); // Type for open image png

        startActivity( Intent.createChooser( email, "Escolha o app para enviar o email" ) );
    }

}
