import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Быков", Gender.MALE, 182);
        Actor actor2 = new Actor("Мария", "Игнатова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Александр", "Пистолетов", Gender.MALE, 203);

        Director director1 = new Director("Семён", "Лобанов", Gender.MALE, 14);
        Director director2 = new Director("Анастасия", "Кудрявцева", Gender.FEMALE, 7);



        ArrayList<Actor> listOfActorsShow = new ArrayList<>();
        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();
        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();

        Show show = new Show("Пираты Монголии", 120, director1, listOfActorsShow);
        Opera opera = new Opera("Опера Круто", 90, director2, listOfActorsOpera, "Позитивчик", "Лалалалал", 12);
        Ballet ballet = new Ballet("Лебединое Море", 60, director1, listOfActorsBallet, "Негативчик", "Тралалала", "Наталья Пивоварова");

        show.addActorInShow(actor1);
        opera.addActorInShow(actor2);
        ballet.addActorInShow(actor1);
        ballet.addActorInShow(actor3);

        show.infoListOfActors();
        System.out.println();
        opera.infoListOfActors();
        System.out.println();
        ballet.infoListOfActors();


        System.out.println();
        ballet.replaceActor(actor2, actor1.getSurname());
        System.out.println();
        ballet.infoListOfActors();

        System.out.println();
        opera.replaceActor(actor3, "Никифорова");


        System.out.println();
        opera.printLibrettoText();
        System.out.println();
        ballet.printLibrettoText();
    }
}
