package com.danielad.resistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String color, color2, color3, color4;
    private Button bCalcular;
    private Spinner sBanda1, sBanda2, sBanda3, sBanda4;
    private TextView tInfo, tBanda1, tBanda2, tBanda3, tBanda4;
    private String n1,n2,n3,n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular = (Button) findViewById(R.id.bCalcular);
        sBanda1 = (Spinner) findViewById(R.id.sBanda1);
        sBanda2 = (Spinner) findViewById(R.id.sBanda2);
        sBanda3 = (Spinner) findViewById(R.id.sBanda3);
        sBanda4 = (Spinner) findViewById(R.id.sBanda4);
        tInfo = (TextView) findViewById(R.id.tInfo);
        tBanda1 = (TextView) findViewById(R.id.tBanda1);
        tBanda2 = (TextView) findViewById(R.id.tBanda2);
        tBanda3 = (TextView) findViewById(R.id.tBanda3);
        tBanda4 = (TextView) findViewById(R.id.tBanda4);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.colores, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sBanda1.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.colores2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sBanda2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.colores3, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sBanda3.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.colores4, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sBanda4.setAdapter(adapter4);



        sBanda1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color = adapterView.getItemAtPosition(i).toString();
                if (color.equals("Marrón")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.brown));
                    n1="1";
                }
                if (color.equals("Blanco")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.white));
                    n1="9";
                }
                if (color.equals("Rojo")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.red));
                    n1="2";
                }
                if (color.equals("Naranja")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.orange));
                    n1="3";
                }
                if (color.equals("Amarillo")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.yellow));
                    n1="4";
                }
                if (color.equals("Verde")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.green));
                    n1="5";
                }
                if (color.equals("Azul")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.blue));
                    n1="6";
                }
                if (color.equals("Violeta")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.violet));
                    n1="7";
                }
                if (color.equals("Gris")){
                    tBanda1.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.gray));
                    n1="8";
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sBanda2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color2 = adapterView.getItemAtPosition(i).toString();
                if (color2.equals("Negro")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.black));
                    n2="0";
                }

                if (color2.equals("Marrón")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.brown));
                    n2="1";
                }
                if (color2.equals("Blanco")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.white));
                    n2="9";
                }
                if (color2.equals("Rojo")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.red));
                    n2="2";
                }
                if (color2.equals("Naranja")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.orange));
                    n2="3";
                }
                if (color2.equals("Amarillo")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.yellow));
                    n2="4";
                }
                if (color2.equals("Verde")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.green));
                    n2="5";
                }
                if (color2.equals("Azul")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.blue));
                    n2="6";
                }
                if (color2.equals("Violeta")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.violet));
                    n2="7";
                }
                if (color2.equals("Gris")){
                    tBanda2.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.gray));
                    n2="8";
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sBanda3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color3 = adapterView.getItemAtPosition(i).toString();
                if (color3.equals("Negro")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.black));
                    n3="1";
                }

                if (color3.equals("Marrón")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.brown));
                    n3="0";
                }
                if (color3.equals("Rojo")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.red));
                    n3="00";
                }
                if (color3.equals("Naranja")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.orange));
                    n3=" K";
                }
                if (color3.equals("Amarillo")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.yellow));
                    n3="0 K";
                }
                if (color3.equals("Verde")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.green));
                    n3="00 K";
                }
                if (color3.equals("Azul")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.blue));
                    n3=" M";
                }
                if (color3.equals("Violeta")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.violet));
                    n3="0 M";
                }
                if (color3.equals("Dorado")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.gold));
                    n3="2";
                }
                if (color3.equals("Plateado")){
                    tBanda3.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.silver));
                    n3="3";
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sBanda4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color4 = adapterView.getItemAtPosition(i).toString();

                if (color4.equals("Marrón")){
                    tBanda4.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.brown));
                    n4="1%";
                }
                if (color4.equals("Rojo")){
                    tBanda4.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.red));
                    n4="2%";
                }
                if (color4.equals("Dorado")){
                    tBanda4.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.gold));
                    n4="5%";
                }
                if (color4.equals("Plateado")){
                    tBanda4.setBackgroundColor(tBanda1.getContext().getResources().getColor(R.color.silver));
                    n4="10%";
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        bCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                if (n3.equals("1")){
                    tInfo.setText("Resistencia de "+n1+n2+ "Ω ±"+n4);
                }
                else if (n3.equals("2")){
                    tInfo.setText("Resistencia de "+n1+"."+n2+" Ω ±"+n4);
                }
                else if (n3.equals("3")){
                    tInfo.setText("Resistencia de "+"0."+n1+n2+" Ω ±"+n4);
                }else{
                    tInfo.setText("Resistencia de "+n1+n2+ n3+"Ω ±"+n4);
                }
            }

        });


    }
}
