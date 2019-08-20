package com.example.a5friends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserDashboard extends AppCompatActivity {

    CardView cardcontributions, cardprofile, cardexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        //Join UI to Logic
        cardcontributions = findViewById(R.id.cardcontributions );
        cardprofile = findViewById(R.id.cardprofile);
        cardexit = findViewById(R.id.cardexit);


        //Method calls
        cardcontributionsClicked();
        cardprofileClicked();
        cardexitClicked();
    }

    public void  cardcontributionsClicked() {
        cardcontributions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardcontributions.setCardElevation(15);
                // cardHomes.animate().rotationBy(360);
                cardcontributions.animate().alphaBy(10);
                cardcontributions.setRadius(20);
                cardcontributions.setPadding(2, 2, 2, 2);

                cardprofile.setCardElevation(0);
                cardprofile.setRadius(0);
                cardexit.setCardElevation(0);
                cardexit.setRadius(0);

                Intent i = new Intent(getApplicationContext(), Contributions.class);
                startActivity(i);

            }
        });
    }

    public void cardprofileClicked() {
        cardprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardprofile.setCardElevation(15);
                //cardPlots.animate().rotationBy(360);
                cardprofile.setRadius(20);

                cardcontributions.setCardElevation(0);
                cardcontributions.setRadius(0);
                cardexit.setCardElevation(0);
                cardexit.setRadius(0);


                Intent i = new Intent(getApplicationContext(),Profile.class);
                startActivity(i);

            }
        });
    }


    public void cardexitClicked() {
        cardexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardexit.setCardElevation(15);
                // cardSales.animate().rotationBy(360);
                cardexit.animate().alphaBy(10);
                cardexit.setRadius(20);

                cardcontributions.setCardElevation(0);
                cardcontributions.setRadius(0);
                cardprofile.setCardElevation(0);
                cardprofile.setRadius(0);

                Intent i = new Intent(getApplicationContext(),Signin.class);
                startActivity(i);

            }
        });
    }


}
