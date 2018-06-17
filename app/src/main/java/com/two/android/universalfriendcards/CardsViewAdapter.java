package com.two.android.universalfriendcards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;

public class CardsViewAdapter extends RecyclerView.Adapter<ViewHolder>{

    private static final String TAG = "CardsViewAdapter";
    private Context context;
    private ArrayList<String> cardNumbers;
    private ArrayList<String> cardHolders;

    public CardsViewAdapter(Context mContext,
                            ArrayList<String> mCardHolders,
                            ArrayList<String> mCardNumbers) {
        this.context = mContext;
        this.cardHolders = mCardHolders;
        this.cardNumbers = mCardNumbers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        holder.cardNumber.setText(cardNumbers.get(position));
        holder.cardholderName.setText(cardHolders.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + cardNumbers.get(position));
                Toast.makeText(context, cardNumbers.get(position) + " copied!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cardNumbers.size();
    }
}
