public class Main {

    public static void main(String[] args) {
        Person[] pracownicy = new Person[2];
        pracownicy[0] = new Employee("Janusz", "Kowalski", 3500);
        pracownicy[1] = new Director("Dari", "Gryta", 1230, 3000);

        pracownicy[1].showInfo();



    }





}
