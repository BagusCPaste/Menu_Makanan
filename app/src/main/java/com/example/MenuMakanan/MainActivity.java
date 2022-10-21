package com.example.MenuMakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import java.util.ArrayList;

import MenuMakanan.R;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<Integer> hargaMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.recylerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add(" Ayam Geprek Spesial ");
        fotoMakanan.add("https://i.pinimg.com/564x/12/5d/1d/125d1d9dddd857872ed56c840d911be1.jpg");
        infoMakanan.add("Geprek ayam dg sabel bawang. Sajikan dgn nasi hangat, tempe goreng dan lalapan. Dijamin lupa timbangan\uD83D\uDE4A\uD83D\uDE4A");
        hargaMakanan.add(12000);

        namaMakanan.add(" Ayam Bakar Bumbu Merah");
        fotoMakanan.add("https://i.pinimg.com/564x/d6/6a/d8/d66ad86afb0dca74405387cb4d9d5931.jpg");
        infoMakanan.add("Ayam bakar ini sebenernya terinspirasi sama menu di kantin kantor. Rasanya gak eneg, enak banget. ");
        hargaMakanan.add(15000);

        namaMakanan.add("Rendang");
        fotoMakanan.add("https://www.indonesia.travel/content/dam/indtravelrevamp/en/trip-ideas/the-ultimate-guide-to-must-try-indonesian-food/1.jpg");
        infoMakanan.add("Rendang daging sapi");
        hargaMakanan.add(25000);

        namaMakanan.add(" Pentol Julid Pedes Mantul");
        fotoMakanan.add("https://i.pinimg.com/564x/09/ed/90/09ed90def15df76a61e16fc3b5c4e72b.jpg");
        infoMakanan.add("Spicy pentol. Pentol bakso levitation.");
        hargaMakanan.add(2000);

        namaMakanan.add(" Bakso Bakar Madu");
        fotoMakanan.add("https://i.pinimg.com/564x/bd/8d/08/bd8d08db4ebbe14df6b29567b87bd57a.jpg");
        infoMakanan.add("Bakso Bakar Madu Enak dan Murah");
        hargaMakanan.add(3000);

        namaMakanan.add(" Sate Ayam Madura");
        fotoMakanan.add("https://i.pinimg.com/564x/c9/82/6c/c9826cdc2f2b958bfeca69fbc1bfd3dd.jpg");
        infoMakanan.add(" Enak Banget");
        hargaMakanan.add(20000);

        namaMakanan.add(" Nasi Goreng Spesial");
        fotoMakanan.add("https://i.pinimg.com/564x/b3/67/83/b36783905799b34064d13e54641a1ad7.jpg");
        infoMakanan.add(" Nasi Goreng full topping");
        hargaMakanan.add(30000);


        prosesRecyclerViewAdapter();
    }
}