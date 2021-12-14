package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void currentRadioStations() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation () {
        Radio radio = new Radio();
        radio.setNext(10);
        assertEquals(0, radio.getNext());
    }

    @Test
    public void shouldPreviousRadioStation () {
        Radio radio = new Radio();
        radio.setPrev(-1);
        assertEquals(9,radio.getPrev());
    }

    @Test
    public void shouldPlusVolume () {
        Radio radio = new Radio();
        radio.setPlusVolume(9);
        assertEquals(10,radio.getPlusVolume());
    }

    @Test
    public void shouldMinusVolume () {
        Radio radio = new Radio();
        radio.setMinusVolume(-1);
        assertEquals(0,radio.getMinusVolume());
    }

    @Test
    public void shouldCurrentVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        assertEquals(7,radio.getCurrentVolume());
    }
}


