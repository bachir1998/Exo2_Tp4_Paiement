package com.example.exo2_tp4_paiement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements PCarteFragmentListener, PayPalFragmentListener {
    Button frag_PC_btn;
    Button frag_PP_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_PC_btn = findViewById(R.id.frag_PC_btn);
        frag_PP_btn = findViewById(R.id.frag_PP_btn);

        frag_PC_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showPCDialog();

        }
        });

        frag_PP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                PayPalFragment payPalFragment = PayPalFragment.newInstance("Titre");
                payPalFragment.show(fm, "fragment_carte_paypal");
            }
        });



    }


    private void showPCDialog() {

        FragmentManager fm = getSupportFragmentManager();
        PCarteFragment pCarteFragment = PCarteFragment.newInstance("Titre");
        pCarteFragment.show(fm, "fragment_carte_bancaire");

    }

    public void onOkClickCarteDialog(String nom) {
        Toast.makeText(this, "Thanks, " + nom, Toast.LENGTH_SHORT).show();
    }

    public void onOkClickPAypalDialog(String nom) {
        Toast.makeText(this, "Vous êtes bien connecté : " + nom, Toast.LENGTH_SHORT).show();
    }


}