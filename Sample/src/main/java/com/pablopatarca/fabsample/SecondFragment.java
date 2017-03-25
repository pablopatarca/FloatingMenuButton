package com.pablopatarca.fabsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.pablopatarca.fab.FloatingMenuButton;

/**
 * Created by Pablo on 3/25/17.
 */

public class SecondFragment extends Fragment {

    public static SecondFragment newInstance() {

        Bundle args = new Bundle();

        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingMenuButton fmb = (FloatingMenuButton) getActivity().findViewById(R.id.fabButton);
        fmb.updateMenuItems(R.menu.second_fab_menu);
        fmb.setMenuListener(new FloatingMenuButton.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }
}
