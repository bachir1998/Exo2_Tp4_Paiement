package com.example.exo2_tp4_paiement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class PayPalFragment extends DialogFragment
{

    private EditText pseudo,password;
    private TextView label_pseudo,label_password;
    public PayPalFragment() {
        // le fragment est créé par la méthode newInstance
    }


    public static PayPalFragment newInstance(String title) {

        PayPalFragment frag = new PayPalFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_carte_paypal, container, false);

        label_pseudo = view.findViewById(R.id.label_pseudo);
        label_password = view.findViewById(R.id.label_pseudo);

        pseudo= (EditText) view.findViewById(R.id.pseudo);
        password= (EditText) view.findViewById(R.id.password);


        return  view;
    }








}
