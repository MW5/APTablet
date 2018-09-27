package com.example.mw5.aptablet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.name = getIntent().getExtras().getString("name");
    }

    public void goToResources(View view) {
        Intent intent = new Intent(MenuActivity.this, DisplayResourcesActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
        MenuActivity.this.finish();
    }
    public void goToCondition(View view) {
        Intent intent = new Intent(MenuActivity.this, ConditionActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
        MenuActivity.this.finish();
    }
    public void goToPolishing(View view) {
        Intent intent = new Intent(MenuActivity.this, PolishingActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
        MenuActivity.this.finish();
    }
    public void goToAutodetailing(View view) {
        Intent intent = new Intent(MenuActivity.this, AutodetailingActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
        MenuActivity.this.finish();
    }

}
