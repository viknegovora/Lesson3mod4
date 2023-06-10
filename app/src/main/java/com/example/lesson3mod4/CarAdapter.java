package com.example.lesson3mod4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    // поля адаптера
    private LayoutInflater inflater; // поле для трансформации layout файла во View-элемент
    private final List<Car> cars; // поле коллекции контейнера для хранения данных(объектов класса Animal)

    //конструктор адаптера
    public CarAdapter(Context context, List<Car> cars) {
        this.inflater = LayoutInflater.from(context);
        this.cars = cars;
    }


    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Car
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(CarAdapter.ViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.carView.setImageResource(car.getCarResource());
        holder.nameView.setText(car.getName());
        holder.carDescriptionView.setText(car.getNameDescription());
        holder.carPriceView.setText(car.getCarPrice());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return cars.size();
    }


    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // неизменные поля представления
        final ImageView carView;
        final TextView nameView, carDescriptionView, carPriceView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля в представление list_item.xml
        ViewHolder(View view) {
        super(view);
        carView = view.findViewById(R.id.carResources);
        nameView = view.findViewById(R.id.name);
        carDescriptionView = view.findViewById(R.id.carDescription);
        carPriceView = view.findViewById(R.id.carPrice);
        }
    }
}
