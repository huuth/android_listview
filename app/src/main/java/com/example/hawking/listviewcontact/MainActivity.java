package com.example.hawking.listviewcontact;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hawking.listviewcontact.Contact;
import com.example.hawking.listviewcontact.CustomListAdapter;
import com.example.hawking.listviewcontact.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Contact> details = getListContact();
        ListView listView = (ListView)findViewById(R.id.listContact);

        listView.setAdapter(new CustomListAdapter(this, details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("name", details.get(position).getName());
                detailIntent.putExtra("number", details.get(position).getNumber());
                detailIntent.putExtra("id_img", details.get(position).getSrcAvt());
                startActivity(detailIntent);
            }
        });
    }
    private List<Contact> getListContact(){

        List<Contact> res = new ArrayList<Contact>();
        Contact huu = new Contact("Truong Thanh Huu","01958200495", R.mipmap.huu);
        Contact hoan = new Contact("Vo Van Hoan","01958200496", R.mipmap.hoan);
        Contact tien = new Contact("Dang Thi Thuy Tien","01958200497", R.mipmap.tien);
        Contact top = new Contact("T.O.P","01958200400", R.mipmap.icon_person);
        Contact mtp = new Contact("Son Tung MTP","01958200497", R.mipmap.icon_person);
        Contact tuan = new Contact("Bui Anh Tuan","01958200498", R.mipmap.icon_person);
        Contact quynh = new Contact("Phan Manh Quynh","01958200499", R.mipmap.icon_person);

        res.add(huu);
        res.add(hoan);
        res.add(tien);
        res.add(mtp);res.add(tuan);res.add(quynh);res.add(top);

        return res;
    }
}