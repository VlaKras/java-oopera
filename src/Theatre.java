public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 186);
        Actor actor2 = new Actor("Василий", "Васильев", Gender.MALE, 195);
        Actor actor3 = new Actor("Анфиса", "Борисова", Gender.FEMALE, 155);
        Director director1 = new Director("Кристофер", "Нолан", Gender.MALE, 10);
        Director director2 = new Director("Алексей", "Балабанов", Gender.MALE, 8);
        Person musicAuthor = new Person("Олег", "Газманов", Gender.MALE);
        Person choreographer = new Person("Олеся", "Вальсова", Gender.FEMALE);
        Show show = new Show("Сатира", 80, director2);
        Ballet ballet = new Ballet("Лебединое Озеро", 120, director2, musicAuthor, "Либретто Лебединого озера", choreographer);
        Opera opera = new Opera("Опера", 183, director1, musicAuthor, "Либретто Оперы", 15);
        show.addActorToShow(actor1);
        show.addActorToShow(actor2);
        ballet.addActorToShow(actor2);
        ballet.addActorToShow(actor3);
        opera.addActorToShow(actor1);
        opera.addActorToShow(actor3);
        show.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();
        ballet.changeActorInShow(actor1, actor3.getSurname());
        ballet.printListOfActors();
        opera.changeActorInShow(actor1, "Попов");
        ballet.printLibrettoText();
        opera.printLibrettoText();
    }
}
