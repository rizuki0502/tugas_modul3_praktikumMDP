package com.example.rizki.aplikasimodul2kel5.ui.home;

import com.example.rizki.aplikasimodul2kel5.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);
}
