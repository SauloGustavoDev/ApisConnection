package com.example.freelanceeactivity.ui.fragment;

import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freelanceeactivity.R;
import com.example.freelanceeactivity.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.filmes.setOnClickListener(view1 -> {
        replaceFragmentFilmes();
        });

        binding.Moedas.setOnClickListener(view1 ->{
            replaceFragmentMoedas();
        });

        binding.Maps.setOnClickListener(view1 ->{
            replaceFragmentMaps();
        });

        binding.Pokedex.setOnClickListener(view1 ->{
            replaceFragmentPokedex();
        });
    }

    public void replaceFragmentFilmes(){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameConteudo, new FilmesFragment()).addToBackStack(null).commit();
    }

    public void replaceFragmentMaps(){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameConteudo, new MapsFragment()).addToBackStack(null).commit();
    }

    public void replaceFragmentMoedas(){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameConteudo, new MoedasFragment()).addToBackStack(null).commit();
    }

    public void replaceFragmentPokedex(){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameConteudo, new PokedexFragment()).addToBackStack(null).commit();
    }
}