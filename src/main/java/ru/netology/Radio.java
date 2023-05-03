package ru.netology;

public class Radio {
    private int curreentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationcount) {
        maxStation = stationcount - 1;
    }


    public void next() {
        if (curreentStation != maxStation) {
            curreentStation++;
        } else {
            curreentStation = 0;
        }
    }


    public void prev() {
        if (curreentStation != 0) {
            curreentStation--;
        } else {
            curreentStation = maxStation;
        }
    }

    public int getCurreentStation() {
        return curreentStation;
    }

    public void setCurreentStation(int curreentStation) {
        if (curreentStation < 0) {
            return;
        }
        if (curreentStation > maxStation) {
            return;
        }
        this.curreentStation = curreentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 1) {
            currentVolume = currentVolume - 1;
        }else {
            currentVolume = 1;
        }
    }
}
