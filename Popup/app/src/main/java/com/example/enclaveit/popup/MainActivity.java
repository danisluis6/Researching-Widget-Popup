package com.example.enclaveit.popup;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupMenu;

public class MainActivity extends Activity implements PopupMenu.OnMenuItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        this.findViewById(R.id.demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
                popupMenu.setOnMenuItemClickListener(MainActivity.this);
                popupMenu.inflate(R.menu.layout_popup);
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.Philippines:
                findViewById(R.id.activity_main).setBackgroundResource(R.drawable.a);
                return true;
            case R.id.Netherlands:
                findViewById(R.id.activity_main).setBackgroundResource(R.drawable.b);
                return true;
            case R.id.Russia:
                findViewById(R.id.activity_main).setBackgroundResource(R.drawable.c);
                return true;
        }
        return false;
    }
}
