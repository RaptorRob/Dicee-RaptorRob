package de.friendcycle.dicee;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageViewDice1 = (ImageView) findViewById(R.id.imageViewLeftDice);
        final ImageView imageViewDice2 = (ImageView) findViewById(R.id.imageViewRightDice);

        Button buttonRollDice = (Button) findViewById(R.id.button);

        final int[] diceArray = {
                R.drawable.dice1
                ,R.drawable.dice2
                ,R.drawable.dice3
                ,R.drawable.dice4
                ,R.drawable.dice5
                ,R.drawable.dice6
        };


        buttonRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageViewDice1.setImageResource(diceArray[getRandomNumberIntegerFromTo(6)]);
                imageViewDice2.setImageResource(diceArray[getRandomNumberIntegerFromTo(6)]);
            }
        });
    }

    public int getRandomNumberIntegerFromTo(int upperBound){
        int randomInt;
        Random randomNumber = new Random();

        randomInt = randomNumber.nextInt(upperBound);

        return randomInt;
    }

}
