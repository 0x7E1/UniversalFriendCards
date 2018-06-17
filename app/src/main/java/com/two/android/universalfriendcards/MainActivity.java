package com.two.android.universalfriendcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mCardholders = new ArrayList<>();
    private ArrayList<String> mCards = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initCards();
    }

    private void initCards() {
        Log.d(TAG, "initCards: preparing cards.");

        mCardholders.add("Ivan Dorn");
        mCards.add("5168 3478 9872 0144");

        mCardholders.add("Petro Glotov");
        mCards.add("7843 0155 8931 8529");

        mCardholders.add("Alina Pilipets");
        mCards.add("4067 0932 1739 0592");

        mCardholders.add("Diane Kovtunenko");
        mCards.add("3438 7353 1498 9245");

        mCardholders.add("Carl Sagan");
        mCards.add("2389 1850 0158 0975");

        mCardholders.add("Max Pain");
        mCards.add("5120 8905 2153 5010");

        mCardholders.add("John Newman");
        mCards.add("7842 0285 1205 2308");

        mCardholders.add("Charlotte Cherry");
        mCards.add("8915 8011 2305 8501");

        mCardholders.add("Pitter Parker");
        mCards.add("0153 1200 1295 2178");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: RecyclerView init.");

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        CardsViewAdapter adapter =
                new CardsViewAdapter(this, mCardholders, mCards);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(recyclerView.getContext(),
                DividerItemDecoration.VERTICAL));
    }
}
