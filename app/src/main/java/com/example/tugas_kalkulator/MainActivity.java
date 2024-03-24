package com.example.tugas_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private EditText etNilaia, etNilaib;
    private TextView tvhsl_hitung;
    private Button btn_hitung;
    private RadioButton rbTambah, rbKurang, rbKali, rbBagi;

    RadioGroup operasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilaia = findViewById(R.id.etNilaia);
        etNilaib = findViewById(R.id.etNilaib);
        tvhsl_hitung = findViewById(R.id.tvhsl_hitung);
        btn_hitung = findViewById(R.id.btn_hitung);
        rbTambah = findViewById(R.id.rbTambah);
        rbKurang = findViewById(R.id.rbKurang);
        rbKali = findViewById(R.id.rbKali);
        rbBagi = findViewById(R.id.rbBagi);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNilaia.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Angka belum ter isi!", Toast.LENGTH_SHORT).show();
                } else if (etNilaib.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Angka belum ter isi!", Toast.LENGTH_SHORT).show();
                } else {
                    int a = Integer.valueOf(etNilaia.getText().toString());
                    int b = Integer.valueOf(etNilaib.getText().toString());
                    int hasil;

                    operasi = (RadioGroup) findViewById(R.id.rgOperasi);
                    if (rbTambah.isChecked()) {
                        hasil = a + b;
                        tvhsl_hitung.setText(String.valueOf(hasil));
                    } else if (rbKurang.isChecked()) {
                        hasil = a - b;
                        tvhsl_hitung.setText(String.valueOf(hasil));
                    } else if (rbKali.isChecked()) {
                        hasil = a * b;
                        tvhsl_hitung.setText(String.valueOf(hasil));
                    } else if (rbBagi.isChecked()) {
                        hasil = a / b;
                        tvhsl_hitung.setText(String.valueOf(hasil));
                    } else {
                        Toast.makeText(MainActivity.this, "Silahkan Pilih Operatornya Terlebih Dahulu!!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
