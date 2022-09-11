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

        // EXERCISE 2 STARTS HERE
        Film newFilm = new Film();
        newFilm.setFilmTitle("The Social Network");
        newFilm.setDirectorFullName("David Fincher");
        newFilm.setDuration(120);
        newFilm.setProductionYear(2010);
        System.out.println("Film: " + newFilm.getFilmTitle());
        System.out.println("Directed By: " + newFilm.getDirectorFullName());
        System.out.println("Duration: " + newFilm.getDuration());
        System.out.println("Year of Production: " + newFilm.getProductionYear());
        // EXERCISE 2 ENDS HERE

        // EXERCISE 3 STARTS HERE


    }
}
