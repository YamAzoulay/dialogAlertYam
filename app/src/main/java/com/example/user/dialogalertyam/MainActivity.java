package com.example.user.dialogalertyam;


import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    AlertDialog.Builder adb;
    LinearLayout l1;
    Random rnd = new Random();
    int R1,G1,B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        l1 = (LinearLayout) findViewById(R.id.l1);
    }


    public void MessageDialog(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("only massage");
        adb.setMessage("this is an example of a dialog");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void IconDialog(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("massage and icon");
        adb.setMessage("nice icon?");
        adb.setIcon(R.drawable.dog1);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void ButtonDialog(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("massage, icon and button");
        adb.setMessage("press the button");
        adb.setIcon(R.drawable.dog1);
        adb.setNeutralButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void Buttons2Dialog(View view) {
        R1 = rnd.nextInt()*256;
        G1 = rnd.nextInt()*256;
        B1 = rnd.nextInt()*256;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random background colors");
        adb.setMessage("change backgorund color");
        adb.setIcon(R.drawable.dog1);
        adb.setNeutralButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setPositiveButton("change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                l1.setBackgroundColor(Color.rgb(R1,G1,B1));
            }
        });
        AlertDialog ad = adb.create();
        ad.show();

    }

    public void Buttons3Dialog(View view) {
        R1 = rnd.nextInt()*256;
        G1 = rnd.nextInt()*256;
        B1 = rnd.nextInt()*256;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random background colors");
        adb.setMessage("change backgorund color or reset");
        adb.setIcon(R.drawable.dog1);
        adb.setNeutralButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setPositiveButton("change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                l1.setBackgroundColor(Color.rgb(R1,G1,B1));
            }
        });
        adb.setNegativeButton("reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                l1.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad = adb.create();
        ad.show();

    }
}
