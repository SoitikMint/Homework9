public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        int newStation;
        newStation = currentStation + 1;
        if (newStation > maxStation) {
            currentStation = 0;
        } else {
            currentStation = newStation;
        }
    }

    public void prevStation() {
        int newStation;
        newStation = currentStation - 1;
        if (newStation < 0) {
            currentStation = maxStation;
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
