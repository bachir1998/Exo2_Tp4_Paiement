package com.example.exo2_tp4_paiement;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;

public class PCarteFragment extends DialogFragment
{

    private EditText firstname,lastname,num_carte,code_cvc,date_exp;
    private TextView label_firstname,label_lastname,label_numcarte,label_codecvc,label_datexp;

    public PCarteFragment() {
        // le fragment est créé par la méthode newInstance
    }


    public static PCarteFragment newInstance(String title) {

        PCarteFragment frag = new PCarteFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_carte_bancaire, container, false);



        label_firstname = view.findViewById(R.id.label_firstname);
        label_lastname = view.findViewById(R.id.label_lastname);
        label_numcarte = view.findViewById(R.id.label_numcarte);
        label_codecvc = view.findViewById(R.id.label_code_cvc);
        label_datexp = view.findViewById(R.id.label_date_exp);

        firstname= (EditText) view.findViewById(R.id.firstname);
        lastname= (EditText) view.findViewById(R.id.lastname);
        num_carte= (EditText) view.findViewById(R.id.num_carte);
        code_cvc= (EditText) view.findViewById(R.id.code_cvc);
        date_exp= (EditText) view.findViewById(R.id.date_exp);




       return  view;
    }








}
