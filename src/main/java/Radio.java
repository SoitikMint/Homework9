public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        int newStation;
        newStation = currentStation + 1;
        if (newStation > 9) {
            currentStation = 0;
        } else {
            currentStation = newStation;
        }
    }

    public void prevStation() {
        int newStation;
        newStation = currentStation - 1;
        if (newStation < 0) {
            currentStation = 9;
        } else {
            currentStation = newStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

}
