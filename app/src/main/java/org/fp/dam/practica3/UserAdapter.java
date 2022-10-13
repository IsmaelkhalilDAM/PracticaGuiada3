package org.fp.dam.practica3;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<String> modelList;
    public UserAdapter(List<String> userModelList){
        this.modelList= userModelList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila, parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.nombre.setText(modelList.get(position));
    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nombre;
        public ViewHolder(View v){
            super(v);
            nombre= (TextView) v.findViewById(R.id.textView);
        }
    }


}
