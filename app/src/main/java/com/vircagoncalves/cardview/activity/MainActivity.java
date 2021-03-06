package com.vircagoncalves.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.vircagoncalves.cardview.R;
import com.vircagoncalves.cardview.adapter.PostagemAdapter;
import com.vircagoncalves.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);
        //Define layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
       // RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void  prepararPostagens(){
        Postagem p;

        p = new Postagem("Virca Gonçalves","#tbt Viagem Legal!", R.drawable.imagem1);
        postagens.add(p);

        p = new Postagem("Hotel JM","Viaje, aproveite nossos descontos", R.drawable.imagem2);
        postagens.add(p);

        p = new Postagem("Carla Diaz","#Paris!", R.drawable.imagem3);
        postagens.add(p);

        p = new Postagem("Vanessa Lino","Que foto linda!", R.drawable.imagem4);
        postagens.add(p);


    }
}