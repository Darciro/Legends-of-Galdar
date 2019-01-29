package br.com.galdar.legendsofgaldar.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.galdar.legendsofgaldar.R;
import mehdi.sakout.aboutpage.AboutPage;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // View view = inflater.inflate(R.layout.fragment_about, container, false);

        View aboutPageView = new AboutPage(getContext())
                .isRTL(false)
                .setImage(R.drawable.side_nav_bar)
                // .addItem("0.0.1")
                // .addItem(adsElement)
                .setDescription("Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.")
                .addGroup("Connect with us")
                .addEmail("elmehdi.sakout@gmail.com")
                .addWebsite("http://medyo.github.io/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addGitHub("medyo")
                .addInstagram("medyo80")
                .create();

        return aboutPageView;
    }
}
