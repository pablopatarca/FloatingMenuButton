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

public class MainFragment extends Fragment {

    public static MainFragment newInstance() {

        Bundle args = new Bundle();

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingMenuButton fmb = (FloatingMenuButton) getActivity().findViewById(R.id.fabButton);
        fmb.setMenuListener(new FloatingMenuButton.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.first:
                        getFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainer, SecondFragment.newInstance())
                                .commit();
                        break;
                    case R.id.second:
                        break;
                }
                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }
}
