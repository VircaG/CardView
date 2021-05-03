package com.vircagoncalves.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vircagoncalves.cardview.R;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent
                ,false);

            return  new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textnome.setText("Virca Gonçalves");
        holder.textpostagem.setText("#tbt Viagem legal!");
        holder.imagePostagem.setImageResource(R.drawable.imagem1);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

            private TextView textnome;
            private TextView textpostagem;
            private ImageView imagePostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textnome = itemView.findViewById(R.id.textNome);
            textpostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
