package com.example.lesson3mod4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    //создание коллекции контейнера для данных класса Car
    List<Car> cars =new ArrayList<Car>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_Porsche);

        // создадим адаптер и загрузим в него контейнер с данными
        CarAdapter adapter = new CarAdapter(this,cars);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);

    }
    // создадим адаптер и загрузим в него контейнер с данными
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Car
        cars.add(new Car("Renault","Logan,Duster,Sandero,Megane",
                R.drawable.renault_logo,"910000,1150000,910000,1340000"));
        cars.add(new Car("Toyota","Camry,Land Cruiser Prado,RAV4,Corolla",
                R.drawable.toyota_logo,"3500000,8000000,3000000,5500000"));
        cars.add(new Car("BMW","X5,X7,M5,M8",
                R.drawable.bmw_logo,"7000000,7500000,8000000,11000000"));
        cars.add(new Car("Mercedes","A-Класс,AMG GT,C-Класс,S-Класс",
                R.drawable.mercedes_logo,"2500000,11000000,3000000,6500000"));
        cars.add(new Car("Porsche","911,Cayenne,Macan,Panamera",
                R.drawable.porsche_logo,"12000000,8000000,4500000,4000000"));
    }
}