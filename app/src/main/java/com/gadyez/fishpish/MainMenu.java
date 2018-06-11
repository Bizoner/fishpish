package com.gadyez.fishpish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        MusicController.start(MainMenu.this);
    }

    public void onSettingsClick(View view) {
        startActivity(new Intent(this, Settings.class));
    }

}
