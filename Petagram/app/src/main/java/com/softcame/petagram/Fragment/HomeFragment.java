package com.softcame.petagram.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softcame.petagram.Adapter.AnimalesAdaptador;
import  com.softcame.petagram.R;
import com.softcame.petagram.pojo.Animales;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private RecyclerView ListaAnimales;
    ArrayList<Animales> animales;

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ListaAnimales = (RecyclerView) v.findViewById(R.id.rvAnimales);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        ListaAnimales.setLayoutManager(llm);
        inicializaListaAnimales();
        inicializaAdaptador();
        return v;
    }

    public AnimalesAdaptador adaptador;
    public void inicializaAdaptador(){
        adaptador = new AnimalesAdaptador(animales);
        ListaAnimales.setAdapter(adaptador);
    }

    public void inicializaListaAnimales(){
        animales = new ArrayList<Animales>();

        animales.add(new Animales(R.drawable.conejo,"Conejo","3"));
        animales.add(new Animales(R.drawable.perro2,"Perro 1","4"));
        animales.add(new Animales(R.drawable.perro,"Perro 2","5"));
        animales.add(new Animales(R.drawable.ferret,"Ferret","6"));
        animales.add(new Animales(R.drawable.ferrets,"Ferrets","7"));
        animales.add(new Animales(R.drawable.gato,"Gato","8"));
        animales.add(new Animales(R.drawable.india,"India","3"));
    }
}
