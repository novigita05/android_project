package com.example.win_10.utsipk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner dataJurusan;
    String jurusan[] ={"Sistem Informasi", "Teknologi Informasi", "Public Relation", "Pariwisata", "Perhotelan"};
    EditText nama,nim,matkul1,matkul2,Sks1,Sks2,Uts1,Uts2,Uas1,Uas2;
    TextView HasilNama,HasilNim,HasilJurusan, Hasilmatkul, HasilMatkul1,HasilMatkul2,
            HasilSks,HasilSks1,HasilSks2,HasilAlpha1,HasilAlpha2,HasilNilai,HasilIPK;
    Button submit;
    Integer nUts1,nUts2,nUas1,nUas2,nSks1,nSks2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.inputNama);
        nim  = (EditText) findViewById(R.id.inputNIM);
        dataJurusan = (Spinner) findViewById(R.id.jurusan);
        ArrayAdapter<String> arrayprodi = new ArrayAdapter<>(this, R.layout.activity_list_jurusan,R.id.textJurusan,jurusan);
        dataJurusan.setAdapter(arrayprodi);

        matkul1 = (EditText) findViewById(R.id.inputMatkul1);
        matkul2 = (EditText) findViewById(R.id.inputMatkul2);
        Sks1 = (EditText) findViewById(R.id.inputSks1);
        Sks2 = (EditText) findViewById(R.id.inputSks2);
        Uts1 = (EditText) findViewById(R.id.inputUts1);
        Uts2 = (EditText) findViewById(R.id.inputUts2);
        Uas1 = (EditText) findViewById(R.id.inputUas1);
        Uas2 = (EditText) findViewById(R.id.inputUas2);
        HasilNama = (TextView) findViewById(R.id.hasilNama);
        HasilNim = (TextView) findViewById(R.id.hasilNim);
        HasilJurusan = (TextView) findViewById(R.id.hasilJurusan);
        Hasilmatkul = (TextView)findViewById(R.id.hasilMatkul);
        HasilMatkul1 = (TextView) findViewById(R.id.hasilMatkul1);
        HasilMatkul2 = (TextView) findViewById(R.id.hasilMatkul2);
        HasilSks = (TextView) findViewById(R.id.hasilSKS);
        HasilSks1 = (TextView) findViewById(R.id.hasilSks1);
        HasilSks2 = (TextView) findViewById(R.id.hasilSks2);
        HasilNilai = (TextView)findViewById(R.id.hasilNilai);
        HasilAlpha1 = (TextView) findViewById(R.id.hasilAlpha1);
        HasilAlpha2 = (TextView) findViewById(R.id.hasilAlpha2);
        HasilIPK = (TextView) findViewById(R.id.hasilIPK);
        submit = (Button) findViewById(R.id.submit);



        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){

                String inputNama = nama.getText().toString();
                HasilNama.setText(inputNama);

                String inputNim  = nim.getText().toString();
                HasilNim.setText("("+inputNim+")");

                String jurusan = dataJurusan.getSelectedItem().toString();
                HasilJurusan.setText("-"+jurusan);

                String inputMatkul1 = matkul1.getText().toString();
                HasilMatkul1.setText(inputMatkul1);

                String inputMatkul2 = matkul2.getText().toString();
                HasilMatkul2.setText(inputMatkul2);

                String inputSks1 = Sks1.getText().toString();
                HasilSks1.setText(inputSks1);

                String inputSks2 = Sks2.getText().toString();
                HasilSks2.setText(inputSks2);

                Hasilmatkul.setText("Mata Kuliah");
                HasilNilai.setText("Nilai");
                HasilSks.setText("SKS");

                nUts1 = Integer.parseInt(Uts1.getText().toString());
                nUts2 = Integer.parseInt(Uts2.getText().toString());
                nUas1 = Integer.parseInt(Uas1.getText().toString());
                nUas2 = Integer.parseInt(Uas2.getText().toString());
                nSks1 = Integer.parseInt(HasilSks1.getText().toString());
                nSks2 = Integer.parseInt(HasilSks2.getText().toString());

                Integer HasilSks = (nSks1+nSks2);
                Integer Hasil1 = (nUas1+nUts1)/2;
                Integer Hasil2 = (nUas2+nUts2)/2;
                double N1,N2;

                if (Hasil1 > 80 ){
                    HasilAlpha1.setText("A");
                    N1 = 4;
                }else if (Hasil1 >75 && Hasil1 <= 80){
                    HasilAlpha1.setText("B+");
                    N1 = 3.5;
                }else if (Hasil1 > 70 && Hasil1 <= 75){
                    HasilAlpha1.setText("B");
                    N1 = 3;
                }else if(Hasil1 >65 && Hasil1 <=70){
                    HasilAlpha1.setText("C+");
                    N1 = 2.5;
                }else if(Hasil1 >60 && Hasil1 <=65){
                    HasilAlpha1.setText("C");
                    N1 = 2;
                }
                else if(Hasil1 >55 && Hasil1 <=60){
                    HasilAlpha1.setText("D+");
                    N1 = 1.5;
                }
                else if(Hasil1 >50 && Hasil1 <=55){
                    HasilAlpha1.setText("D");
                    N1 = 1;
                }else {
                    HasilAlpha1.setText("E");
                    N1 = 0.5;
                }


                if (Hasil2 > 80 ){
                    HasilAlpha2.setText("A");
                    N2 = 4;
                }else if (Hasil2 >75 && Hasil2 <= 80){
                    HasilAlpha2.setText("B+");
                    N2 = 3.5;
                }else if (Hasil2 > 70 && Hasil2 <= 75){
                    HasilAlpha2.setText("B");
                    N2 = 3;
                }else if(Hasil2 >65 && Hasil2 <=70){
                    HasilAlpha2.setText("C+");
                    N2 = 2.5;
                }else if(Hasil2 >60 && Hasil2 <=65){
                    HasilAlpha2.setText("C");
                    N2 = 2;
                }
                else if(Hasil2 >55 && Hasil2 <=60){
                    HasilAlpha2.setText("D+");
                    N2 = 1.5;
                }
                else if(Hasil2 >50 && Hasil2 <=55){
                    HasilAlpha2.setText("D");
                    N2= 1;
                }else {
                    HasilAlpha2.setText("E");
                    N2 = 0.5;
                }
                double IPK = ((N1*nSks1)+(N2*nSks2))/HasilSks;
                String number =  String.format("%,.2f", IPK);
                HasilIPK.setText("IPK : "+(number));
            }
        });


    }
}
