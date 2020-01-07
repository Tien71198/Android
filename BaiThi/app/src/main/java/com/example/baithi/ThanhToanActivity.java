package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThanhToanActivity extends AppCompatActivity {

    Button btnQL, btnTinhtien, btnXacNhanDP;
    EditText loaiphong, sophongdat, ngayo, dem;
    TextView tinhtien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
        btnQL = (Button) findViewById(R.id.quaylai);
        btnTinhtien = (Button) findViewById(R.id.bttien);
        btnXacNhanDP = (Button) findViewById(R.id.btxndp);
        loaiphong = (EditText) findViewById(R.id.edloaiphong);
        sophongdat = (EditText) findViewById(R.id.edsophong);
        ngayo = (EditText) findViewById(R.id.edngayo);
        dem = (EditText)findViewById(R.id.eddem) ;
        tinhtien = (TextView) findViewById(R.id.thtien);


        btnTinhtien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isongayo,isodemo, isophong, itienngay, itiendem, itongtien;
                String ssongayo, ssodemo, sloaiphong, ssophong;
                sloaiphong=loaiphong.getText().toString();
                ssophong=sophongdat.getText().toString();
                isophong=Integer.parseInt(ssophong);
                ssongayo=ngayo.getText().toString();
                isongayo=Integer.parseInt(ssongayo);
                ssodemo=ngayo.getText().toString();
                isodemo=Integer.parseInt(ssodemo);
                if (sloaiphong.equals("don"))
                {
                   /* itongtien = isongayo*isophong*500000;*/
                   int  igiangay=500000, igiadem=300000;
                   itienngay = isongayo*igiangay*isophong;
                   itiendem = isodemo*igiadem*isophong;
                   itongtien = itienngay + itiendem;
                }
                else
                if (sloaiphong.equals("doi"))
                {
                   // itongtien = isongayo*isophong*700000;
                    int  igiangay=600000, igiadem=300000;
                    itienngay = isongayo*igiangay*isophong;
                    itiendem = isodemo*igiadem*isophong;
                    itongtien = itienngay + itiendem;
                }
                else //    if (sloaiphong.equals("da"))
                {
                   // itongtien = isongayo*isophong*1000000;
                    int  igiangay=700000, igiadem=300000;
                    itienngay = isongayo*igiangay*isophong;
                    itiendem = isodemo*igiadem*isophong;
                    itongtien = itienngay + itiendem;
                }
                tinhtien.setText(itongtien+"VND");
            }
        });


        btnQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnXacNhanDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xn = new Intent(ThanhToanActivity.this,XacNhanDatPhongActivity.class);
                startActivity(xn);
            }
        });

    }
}
