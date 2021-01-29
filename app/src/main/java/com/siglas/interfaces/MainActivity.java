package com.siglas.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alespero.expandablecardview.ExpandableCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // *** EXPANDABLE CARD ***
        ExpandableCardView card = findViewById(R.id.profile);
        card.setOnExpandedListener(new ExpandableCardView.OnExpandedListener() {
            @Override
            public void onExpandChanged(View v, boolean isExpanded) {
                Toast.makeText(MainActivity.this, isExpanded ? "Expanded!" :
                        "Collapsed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}