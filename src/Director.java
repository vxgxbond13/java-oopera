public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void directorInfo(Director director){
        System.out.println("Имя: " + director.getName());
        System.out.println("Фамилия: " + director.getSurname());
    }
}
