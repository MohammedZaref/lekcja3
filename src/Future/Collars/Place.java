package Future.Collars;

public class Place {
    private int placeNumber;
    private int rowNumber;
    private boolean placeStatus;

    public Place(int placeNumber, int rowNumber, boolean placeStatus) {
        this.placeNumber = placeNumber;
        this.rowNumber = rowNumber;
        this.placeStatus = placeStatus;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }
    public int getRowNumber() {
        return rowNumber;
    }
    public boolean getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }
    public void setPlaceStatus(boolean placeStatus) {
        this.placeStatus = placeStatus;
    }
}
