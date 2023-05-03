package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioTestCan() {
        Radio radioTestCan = new Radio();
        radioTestCan.setCurreentStation(7);

        int actual = radioTestCan.getCurreentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNextStation() {
        Radio radioNextStation = new Radio();
        radioNextStation.setCurreentStation(8);

        radioNextStation.next();

        int actual = radioNextStation.getCurreentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNextStationMax() {
        Radio radioNextStationMax = new Radio();
        radioNextStationMax.setCurreentStation(9);

        radioNextStationMax.next();

        int actual = radioNextStationMax.getCurreentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioPrevtStation() {
        Radio radioPrevStation = new Radio();
        radioPrevStation.setCurreentStation(2);

        radioPrevStation.prev();

        int actual = radioPrevStation.getCurreentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioPrevtStationMin() {
        Radio radioPrevtStationMin = new Radio();
        radioPrevtStationMin.setCurreentStation(0);

        radioPrevtStationMin.prev();

        int actual = radioPrevtStationMin.getCurreentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMaxStation() {
        Radio radioMaxStation;
        radioMaxStation = new Radio(17);
        radioMaxStation.setCurreentStation(12);

        int actual = radioMaxStation.getCurreentStation();
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio increaseVolumeTest = new Radio();
        increaseVolumeTest.setCurrentVolume(10);

        increaseVolumeTest.increaseVolume();

        int actual = increaseVolumeTest.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio decreaseVolumeTest = new Radio();
        decreaseVolumeTest.setCurrentVolume(1);

        decreaseVolumeTest.decreaseVolume();

        int actual = decreaseVolumeTest.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
