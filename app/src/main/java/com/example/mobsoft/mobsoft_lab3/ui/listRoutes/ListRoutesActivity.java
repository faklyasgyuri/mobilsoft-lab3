package com.example.mobsoft.mobsoft_lab3.ui.listRoutes;

/**
 * Created by mobsoft on 2017. 03. 20..
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;
import com.example.mobsoft.mobsoft_lab3.R;
import com.example.mobsoft.mobsoft_lab3.MobSoftApplication;


public class ListRoutesActivity extends AppCompatActivity implements ListRoutesScreen {

    @Inject
    ListRoutesPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listroutes);

        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        loginPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
