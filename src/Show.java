import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void directorInfo() {
        System.out.println(director);
    }

    public void printListOfActors ( ) {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorToShow(Actor actor) {
        if (listOfActors.size() > 0) {
            for (Actor act : listOfActors) {
                if (!actor.equals(act)) {
                    listOfActors.add(actor);
                    break;
                } else {
                    System.out.println("Этот актёр уже участвует в " + title);
                }
            }
        } else {
            listOfActors.add(actor);
        }
    }

    /*Добрый день! По условию задания, нам необходимо заменить актёра с подходящей фамилией,
    если рассмотреть ситуацию, что у нас в списке может оказаться несколько актёров с одинаковой фамилией
    то, по идеи можно заменить первого подходящего актёра(т.к. более подробной информации нет)
    и выйти из цикла for */
    public void changeActorInShow(Actor newActor, String surname) {
        int numderOfActorsToReplace = 0;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)) { //Находим актёра с подходящей фамилией
                listOfActors.remove(actor); //Удаляем этого актёра из списка
                listOfActors.add(newActor); //Добавляем актёра взамен удаленного, согласно условию
                numderOfActorsToReplace++; //Инкрементируем счётчик, для проверки условия о совершенной замене
                break; //Выходим из цикла, так как замена была произведена
            }
        }
        if (numderOfActorsToReplace == 0) {
            System.out.println("Актёр " + surname + " в \"" + title + "\" не участвует.");
        }
    }

}
