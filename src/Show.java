import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void infoListOfActors(){
        for (Actor actor : listOfActors){
            System.out.println("Имя: " + actor.getName() + ". Фамилия: " + actor.getSurname() + ". Рост " + "(" + actor.getHeight() + ")");
        }
    }

    public void addActorInShow(Actor actor){
        for (Actor actors : listOfActors){
            if (actor.getName().equals(actors.getName()) && actor.getSurname().equals(actors.getSurname()) && actor.getHeight() == actors.getHeight()){
                System.out.println("Такой актёр уже участвует в спектакле");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String lastName) {
        boolean found = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(lastName)) {
                listOfActors.set(i, newActor);
                found = true;
                System.out.println("Актёр " + lastName + " заменён на " + newActor.getSurname());
                break;
            }
        }

        if (!found) {
            System.out.println("Актёр с фамилией '" + lastName + "' не найден.");
        }
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
