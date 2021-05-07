package com.example.amitarcticturecomponnents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amitarcticturecomponnents.databinding.ItemBinding;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.personHolder> {
    List<Person> personList;

    public AdapterClass(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public personHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new personHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.activity_main,parent
        ,false));
    }

    @Override
    public void onBindViewHolder(@NonNull personHolder holder, int position) {
Person person=personList.get(position);
holder.itemBinding.setPerson(person);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    class personHolder extends RecyclerView.ViewHolder{
ItemBinding itemBinding;

        public personHolder(@NonNull ItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding=itemBinding;
            //كده مش هعرف ال فيو اللي عندي
        }
    }


}
