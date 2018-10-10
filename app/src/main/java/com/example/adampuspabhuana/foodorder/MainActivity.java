package com.example.adampuspabhuana.foodorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox menu1,menu2,menu3,menu4;
    TextView daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu1=(CheckBox) findViewById(R.id.m1);
        menu1.setOnCheckedChangeListener(ckb1);
        menu2=(CheckBox) findViewById(R.id.m2);
        menu2.setOnCheckedChangeListener(ckb2);
        menu3=(CheckBox) findViewById(R.id.m3);
        menu3.setOnCheckedChangeListener(ckb3);
        menu4=(CheckBox) findViewById(R.id.m4);
        menu4.setOnCheckedChangeListener(ckb4);
        daftar=(TextView) findViewById(R.id.pesanan);
        daftar.setText("");
    }
    CompoundButton.OnCheckedChangeListener  ckb1 = new CompoundButton.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String word= (String) daftar.getText();
            String remove=" Nasi ";
            if(isChecked)
            {
                daftar.setText(word+" Nasi ");
            }
            else
            {

                daftar.setText(word.replace(remove,""));
            }
        }
    };
    CompoundButton.OnCheckedChangeListener  ckb2 = new CompoundButton.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String word= (String) daftar.getText();
            String remove=" Ayam Goreng ";
            if(isChecked)
            {
                daftar.setText(daftar.getText()+" Ayam Goreng ");
            }
            else
            {

                daftar.setText(word.replace(remove,""));
            }
        }
    };
    CompoundButton.OnCheckedChangeListener  ckb3 = new CompoundButton.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String word= (String) daftar.getText();
            String remove=" Sayur Asem ";
            if(isChecked)
            {
                daftar.setText(daftar.getText()+" Sayur Asem ");
            }
            else
            {
                daftar.setText(word.replace(remove,""));
            }
        }
    };
    CompoundButton.OnCheckedChangeListener  ckb4 = new CompoundButton.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String word= (String) daftar.getText();
            String remove=" Air Mineral ";
            if(isChecked)
            {
                daftar.setText(daftar.getText()+" Air Mineral ");
            }
            else
            {
                daftar.setText(word.replace(remove,""));
            }
        }
    };
    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
      if(isChecked)
      {
          daftar.setText("Nasi");
      }
        else
      {
          daftar.setText("");
      }

    }
}
