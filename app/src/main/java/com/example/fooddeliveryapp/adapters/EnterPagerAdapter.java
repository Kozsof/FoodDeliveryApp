package com.example.fooddeliveryapp.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fooddeliveryapp.fragment.LoginFragment;
import com.example.fooddeliveryapp.fragment.RegistrationFragment;

public class EnterPagerAdapter extends FragmentPagerAdapter {
    public EnterPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return position == 0 ? new LoginFragment() : new RegistrationFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return position == 0 ? "Авторизация" : "Регистрация";
    }
}
