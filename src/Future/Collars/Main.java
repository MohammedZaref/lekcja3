package Future.Collars;

public class Main {

    public static void main(String[] args) {
        // LEKCJA 3 EXERCISE 1 STARTS HERE
	Place newPlaceInCinema = new Place();
	newPlaceInCinema.setPlaceNumber(5);
	newPlaceInCinema.setRowNumber(3);
	newPlaceInCinema.setPlaceStatus(true);

        System.out.println("Place Number: " + newPlaceInCinema.getPlaceNumber());
        System.out.println("Row number: " + newPlaceInCinema.getRowNumber());
        System.out.println("Is busy: " + newPlaceInCinema.getPlaceStatus());
        // LEKCJA 3 EXERCISE 1 ENDS HERE
    }
}
