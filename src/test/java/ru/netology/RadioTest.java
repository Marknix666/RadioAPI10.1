package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RadioVolumeCan() {
        Radio RadioVolumeCan = new Radio();
        RadioVolumeCan.setCurrentVolume(8);

        int actual = RadioVolumeCan.getCurrentVolume();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioIncreaseVolume() {
        Radio RadioIncreaseVolume = new Radio();
        RadioIncreaseVolume.setCurrentVolume(9);
        RadioIncreaseVolume.increaseVolume();

        int actual = RadioIncreaseVolume.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioMaxVolume() {
        Radio RadioMaxVolume = new Radio();
        RadioMaxVolume.setCurrentVolume(10);
        RadioMaxVolume.increaseVolume();

        int actual = RadioMaxVolume.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioVolumeGran() {
        Radio RadioVolumeGran = new Radio();
        RadioVolumeGran.setCurrentVolume(-1);

        int actual = RadioVolumeGran.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioVolumeGrant() {
        Radio RadioVolumeGrant = new Radio();
        RadioVolumeGrant.setCurrentVolume(14);

        int actual = RadioVolumeGrant.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioLessVolume() {
        Radio RadioLessVolume = new Radio();
        RadioLessVolume.setCurrentVolume(9);
        RadioLessVolume.lessVolume();

        int actual = RadioLessVolume.getCurrentVolume();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioMinVolume() {
        Radio RadioMinVolume = new Radio();
        RadioMinVolume.setCurrentVolume(1);
        RadioMinVolume.lessVolume();

        int actual = RadioMinVolume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void RadioStationCan() {
        Radio RadioStationCan = new Radio();
        RadioStationCan.setCurrentStation(5);

        int actual = RadioStationCan.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioNextStation() {
        Radio RadioNextStation = new Radio();
        RadioNextStation.setCurrentStation(8);
        RadioNextStation.next();

        int actual = RadioNextStation.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioMaxStation() {
        Radio RadioMaxStation = new Radio();
        RadioMaxStation.setCurrentStation(9);
        RadioMaxStation.next();

        int actual = RadioMaxStation.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationGran() {
        Radio RadioStationGran = new Radio();
        RadioStationGran.setCurrentStation(-1);

        int actual = RadioStationGran.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationGrant() {
        Radio RadioStationGrant = new Radio();
        RadioStationGrant.setCurrentStation(14);

        int actual = RadioStationGrant.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevStation() {
        Radio RadioPrevStation = new Radio();
        RadioPrevStation.setCurrentStation(7);
        RadioPrevStation.prev();

        int actual = RadioPrevStation.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioMinStation() {
        Radio RadioMinStation = new Radio();
        RadioMinStation.setCurrentStation(0);
        RadioMinStation.prev();

        int actual = RadioMinStation.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestRadioStation() {
        Radio TestRadioStation = new Radio(25);
        TestRadioStation.setCurrentStation(17);

        int actual = TestRadioStation.getCurrentStation();
        int expected = 17;
        Assertions.assertEquals(expected, actual);
    }
}
