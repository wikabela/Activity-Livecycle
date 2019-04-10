package com.example.latihanpratikum_wika;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_latihanpratikum);

        TextView txt3 = (TextView) findViewById(R.id.txt3);
        txt3.setPaintFlags(txt3.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

    }
}
