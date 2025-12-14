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

    public void changeActorInShow(Actor newActor, String surname) {
        int count = 0;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Актёр " + surname + " в \"" + title + "\" не участвует.");
        }
    }

}
