package com.example.apitutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apitutorial.Model.Country;

import java.util.ArrayList;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryListViewHolder> {

    ArrayList<Country> countryList;

    public CountryListAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryListAdapter.CountryListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_list_item, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp); /* to attach the above params **/

        CountryListViewHolder rcv = new CountryListViewHolder(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryListAdapter.CountryListViewHolder holder, int position) {

        holder.mCountryName.setText(countryList.get(position).getCountryName());

        holder.mLayout.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), CountryActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("country_name",countryList.get(position).getCountryName());
            intent.putExtras(bundle);
            v.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class CountryListViewHolder extends RecyclerView.ViewHolder {
        public TextView mCountryName;
        public LinearLayout mLayout;

        public CountryListViewHolder(@NonNull View itemView) {
            super(itemView);

            mCountryName = itemView.findViewById(R.id.country_name);
            mLayout = itemView.findViewById(R.id.layout);
        }
    }
}