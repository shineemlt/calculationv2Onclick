package com.example.calculationv2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter adapter;
    ArrayList<String> arrayCourse;
    ListView listviewTinhtoan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btcong(View view)
    {
        arrayCourse=new ArrayList<>();

        listviewTinhtoan=(ListView)findViewById(R.id.listviewlstt);
        EditText edtSoa=(EditText)findViewById(R.id.editta);
        String chuoi1=edtSoa.getText().toString();
        int soa=Integer.parseInt(chuoi1);
        EditText edtSob=(EditText)findViewById(R.id.edittb);
        String chuoi2=edtSob.getText().toString();
        int sob=Integer.parseInt(chuoi2);
        TextView txtvKetqua =(TextView)findViewById(R.id.tvketqua);
        int ketqua=soa+sob;
        txtvKetqua.setText(String.valueOf(soa));
        txtvKetqua.setText(soa+ "+" +sob+"=" +(ketqua));
        arrayCourse.add(soa+ "+" +sob+"=" +(ketqua));
        adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        listviewTinhtoan.setAdapter(adapter);

    }
    public void bttru(View view)
    {
        arrayCourse=new ArrayList<>();
        listviewTinhtoan=(ListView)findViewById(R.id.listviewlstt);
        EditText edtSoa=(EditText)findViewById(R.id.editta);
        String chuoi1=edtSoa.getText().toString();
        int soa=Integer.parseInt(chuoi1);
        EditText edtSob=(EditText)findViewById(R.id.edittb);
        String chuoi2=edtSob.getText().toString();
        int sob=Integer.parseInt(chuoi2);
        TextView txtvKetqua =(TextView)findViewById(R.id.tvketqua);
        int ketqua=soa -sob;
        txtvKetqua.setText(String.valueOf(soa));
        txtvKetqua.setText(soa+ "-" +sob+"=" +(ketqua));
        arrayCourse.add(soa+ "-" +sob+"=" +(ketqua));
        adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        listviewTinhtoan.setAdapter(adapter);



    }
    public void btnhan(View view)
    {
        arrayCourse=new ArrayList<>();
        listviewTinhtoan=(ListView)findViewById(R.id.listviewlstt);
        EditText edtSoa=(EditText)findViewById(R.id.editta);
        String chuoi1=edtSoa.getText().toString();
        int soa=Integer.parseInt(chuoi1);
        EditText edtSob=(EditText)findViewById(R.id.edittb);
        String chuoi2=edtSob.getText().toString();
        int sob=Integer.parseInt(chuoi2);
        TextView txtvKetqua =(TextView)findViewById(R.id.tvketqua);
        int ketqua=soa*sob;
        txtvKetqua.setText(String.valueOf(soa));
        txtvKetqua.setText(soa+ "x" +sob+"=" +(ketqua));
        arrayCourse.add(soa+ "x" +sob+"=" +(ketqua));
        adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        listviewTinhtoan.setAdapter(adapter);



    }
    public void btchia(View view)
    {
        arrayCourse=new ArrayList<>();
        listviewTinhtoan=(ListView)findViewById(R.id.listviewlstt);
        EditText edtSoa=(EditText)findViewById(R.id.editta);
        String chuoi1=edtSoa.getText().toString();
        float soa=Float.parseFloat(chuoi1);
        EditText edtSob=(EditText)findViewById(R.id.edittb);
        String chuoi2=edtSob.getText().toString();
        float sob=Float.parseFloat(chuoi2);
        TextView txtvKetqua =(TextView)findViewById(R.id.tvketqua);
        float ketqua=soa*sob;
        txtvKetqua.setText(String.valueOf(soa));
        txtvKetqua.setText(soa+ "/" +sob+"=" +(ketqua));
        arrayCourse.add(soa+ "/" +sob+"=" +(ketqua));
        adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        listviewTinhtoan.setAdapter(adapter);

    }

}
