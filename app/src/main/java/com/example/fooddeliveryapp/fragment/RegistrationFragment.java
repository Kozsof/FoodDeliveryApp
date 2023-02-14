package com.example.fooddeliveryapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fooddeliveryapp.R;
import com.example.fooddeliveryapp.databinding.FragmentRegistrationBinding;

public class RegistrationFragment extends Fragment {
    FragmentRegistrationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false);
        binding.buttonEnter.setOnClickListener(view -> {
            String email = binding.inputEmail.getInputText();
            String password = binding.inputPassword.getInputText();
            String passwordRepeat = binding.inputPasswordRepeat.getInputText();
            String nickname = binding.inputNickname.getInputText();
            Toast.makeText(getContext(), email + " " + password, Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}