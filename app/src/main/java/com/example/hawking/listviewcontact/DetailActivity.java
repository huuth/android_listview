package com.example.hawking.listviewcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = "";
        String number = "";
        int id_src = R.mipmap.ic_launcher;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            name = extras.getString("name");
            number = extras.getString("number");
            id_src = extras.getInt("id_img");
        }

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtNumber = (TextView) findViewById(R.id.txtNumber);
        ImageView imgAvt = (ImageView) findViewById(R.id.imageView2);

        txtName.setText(name);
        txtNumber.setText(number);
        imgAvt.setImageResource(id_src);
    }
}
