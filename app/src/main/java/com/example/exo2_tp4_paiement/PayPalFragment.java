package com.example.exo2_tp4_paiement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PayPalFragment extends DialogFragment
{

    private EditText pseudo,password;
    private TextView label_pseudo,label_password;
    PayPalFragmentListener payPalFragmentListener;
    private Button ok_paypal;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        return inflater.inflate(R.layout.fragment_carte_paypal, container);

    }


    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        //View view = inflater.inflate(R.layout.fragment_carte_bancaire, container, false);
        super.onViewCreated(view, savedInstanceState);


        payPalFragmentListener = (PayPalFragmentListener)getActivity();
        label_pseudo = view.findViewById(R.id.label_pseudo);
        label_password = view.findViewById(R.id.label_pseudo);

        pseudo= (EditText) view.findViewById(R.id.pseudo);
        password= (EditText) view.findViewById(R.id.password);
        ok_paypal = view.findViewById(R.id.ok_paypal);

        ok_paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                payPalFragmentListener.onOkClickPAypalDialog(label_pseudo.getText().toString());
            }
        });



    }








}
