package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int numberOfRadioStations = 9;
    private int selectedRadioStations = 3;

    public Radio() {
    }

    public Radio(int currentRadioStation, int numberOfRadioStations, int selectedRadioStations) {
        this.currentRadioStation = currentRadioStation;
        this.numberOfRadioStations = numberOfRadioStations;
        this.selectedRadioStations = selectedRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }


    public void prevStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation--;
    }

}


