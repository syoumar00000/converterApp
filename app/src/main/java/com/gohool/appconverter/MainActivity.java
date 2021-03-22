package com.gohool.appconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText Montant;
  private Button validID;
  private Button deleteID;
  private TextView AffResultID;
  private double resultat;
  private double indice;
  private RadioGroup rg;
  private RadioGroup rgR;
  private RadioButton rb;
  private RadioButton rb2;
  private double somme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Montant = (EditText) findViewById(R.id.editTextMonantID);
        validID = (Button) findViewById(R.id.validID);
        deleteID = (Button) findViewById(R.id.deleteID);
        AffResultID = (TextView) findViewById(R.id.AffResultID);
        deleteID = (Button) findViewById(R.id.deleteID);

        rg = findViewById(R.id.RD1);
         rgR =  findViewById(R.id.RD2);



        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb = findViewById(checkedId);

                switch (rb.getId()){
                    case R.id.RB1:
                        rgR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                rb2 = findViewById(checkedId);

                                switch (rb2.getId()){
                                    case R.id.RB21:
                                        AffResultID.setText(R.string.ERROR_MSG);
                                        break;
                                    case R.id.RB22:
                                        indice = 0.0015;
                                        break;
                                    case R.id.RB23:
                                        indice = 0.0022;
                                        break;
                                    case R.id.RB24:
                                        indice = 0.0013;
                                        break;
                                }
                            }
                        });
                        break;
                    case R.id.RB2:
                        rgR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                rb2 = findViewById(checkedId);

                                switch (rb2.getId()){
                                    case R.id.RB21:
                                        indice = 655.53;

                                        break;
                                    case R.id.RB22:

                                        AffResultID.setText(R.string.ERROR_MSG);

                                        break;
                                    case R.id.RB23:
                                        indice = 1.10;

                                        break;
                                    case R.id.RB24:
                                        indice = 0.86;

                                        break;
                                }
                            }
                        });
                        break;
                    case R.id.RB3:
                        rgR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                rb2 = findViewById(checkedId);

                                switch (rb2.getId()){
                                    case R.id.RB21:
                                        indice=595.47;

                                        break;
                                    case R.id.RB22:
                                        indice=0.91;

                                        break;
                                    case R.id.RB23:
                                        AffResultID.setText(R.string.ERROR_MSG);

                                        break;
                                    case R.id.RB24:
                                        indice=0.78;

                                        break;
                                }
                            }
                        });
                        break;
                    case R.id.RB4:
                        rgR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                rb2 = findViewById(checkedId);

                                switch (rb2.getId()){
                                    case R.id.RB21:
                                        indice=766.49;
                                        break;
                                    case R.id.RB22:
                                        indice=1.17;

                                        break;
                                    case R.id.RB23:
                                        indice=1.29;

                                        break;
                                    case R.id.RB24:

                                        AffResultID.setText(R.string.ERROR_MSG);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        validID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                somme = Double.parseDouble(Montant.getText().toString());
                resultat = somme*indice;
                AffResultID.setText(String.format("%.2f", resultat));
            }
        });
        deleteID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AffResultID.setText(" ");
            }
        });
    }
}
