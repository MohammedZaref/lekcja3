package Future.Collars;

public class Main {

    public static void main(String[] args) {
	Place newPlaceInCinema = new Place();
	newPlaceInCinema.setPlaceNumber(5);
	newPlaceInCinema.setRowNumber(3);
	newPlaceInCinema.setPlaceStatus(false);

        System.out.println("Place Number: " + newPlaceInCinema.getPlaceNumber());
    }
}
