//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("DaBaby car", 0, 69);
        Book book = new Book("Проблемы философии", "Рассел", 1900);
        Person person = new Person("Доля", "Канькин", 7002);
        person.aboutBookAndCar(book, car);
    }
}

class Book{
    String name;
    String author;
    int releaseYear;
    Book(String name, String author, int releaseYear){
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    public void getInfo(){
        System.out.printf("Имя: %s, фамилия: %s, год рождения: %s \n", name, author, releaseYear);
    }
}

class Person{
    String name;
    String surname;
    int birthYear;
    Person(String name, String surname, int birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    public void getInfo() {
        System.out.printf("Имя: %s, фамилия: %s, год рождения: %s \n", name, surname, birthYear);
    }
    public void aboutBookAndCar(Book book, Car car){
        System.out.printf("%s читает книгу '%s' в своей машине %s", name, book.name, car.mark);
    }
}

class Car {
    String mark;
    int releaseYear;
    double engineCapacity;

    Car(String mark, int releaseYear, double engineCapacity) {
        this.mark = mark;
        this.releaseYear = releaseYear;
        this.engineCapacity = engineCapacity;
    }

    public void getInfo() {
        System.out.printf("Марка: %s, год выпуска: %s, объём двигателя: %s \n", mark, releaseYear, engineCapacity);
    }
}