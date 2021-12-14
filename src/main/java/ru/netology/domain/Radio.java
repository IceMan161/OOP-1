package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int next;
    private int prev;
    private int plusVolume;
    private int minusVolume;

    public int getPlusVolume() {
        return plusVolume;
    }

    public void setPlusVolume(int plusVolume) {
        if (plusVolume < 10) {
            plusVolume = plusVolume + 1;
        }
        if (plusVolume > 10) {
            plusVolume = 10;
        }
        this.plusVolume = plusVolume;
    }

    public int getMinusVolume() {
        return minusVolume;
    }

    public void setMinusVolume(int minusVolume) {
        if (minusVolume > 0) {
            minusVolume = minusVolume - 1;
        }
        if (minusVolume < 0) {
            minusVolume = 0;
        }
        this.minusVolume = minusVolume;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        if (next < 9) {
            next = next + 1;
        }
        if (next > 9) {
            next = 0;
        }
        this.next = next;
    }


    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        if (prev > 0) {
            prev = prev - 1;
        }
        if (prev < 0) {
            prev = 9;
        }

        this.prev = prev;
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
        this.currentVolume=currentVolume;
    }
}
