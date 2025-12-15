import java.util.ArrayList;
import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" + super.toString() +
                " (" + height + "см)" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return Objects.equals(this.name, actor.name) && Objects.equals(this.surname,actor.surname) && height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

}
