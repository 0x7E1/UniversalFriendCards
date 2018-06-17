package com.two.android.universalfriendcards;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    RelativeLayout parentLayout;
    TextView cardholderName;
    TextView cardNumber;

    public ViewHolder(View itemView) {
        super(itemView);

        parentLayout = itemView.findViewById(R.id.parent_layout);
        cardholderName = itemView.findViewById(R.id.cardholder_name);
        cardNumber = itemView.findViewById(R.id.card_number);
    }
}
