package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int setNumberRS = 9;
    private int minRadioStation = 0;
    private int maxRadiostation = setNumberRS;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int setNumberRS) {
        this.setNumberRS = setNumberRS;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadiostation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentRadioStation >= maxRadiostation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }


    public void prevStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadiostation;
            return;
        }
        currentRadioStation--;
    }

}


