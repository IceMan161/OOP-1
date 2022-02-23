package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void currentRadioStations() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStations2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStations3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.nextStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.nextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPreviousRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPreviousRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPreviousRadioStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.prevStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(24);
        assertEquals(24, radio.getNumberRS());
    }

    @Test
    public void shouldUseConstructor2 () {
        Radio radio = new Radio();
        assertEquals(10,radio.getNumberRS());
    }

    @Test
    public void shouldSetUpRS () {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        assertEquals(15,radio.getCurrentRadioStation());
    }
}


