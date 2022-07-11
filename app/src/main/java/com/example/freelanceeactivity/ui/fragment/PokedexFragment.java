package com.example.freelanceeactivity.ui.fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freelanceeactivity.R;
import com.example.freelanceeactivity.databinding.FragmentPokedexBinding;
import com.example.freelanceeactivity.ui.viewModel.PokedexViewModel;

public class PokedexFragment extends Fragment {

    private PokedexViewModel mViewModel;
    private FragmentPokedexBinding binding;

    public static PokedexFragment newInstance() {
        return new PokedexFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentPokedexBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}