package Example;

public class Person {
    String name ;
     int rank ;
     public Person(String name , int rank ) {
         this.name = name;
         this.rank = rank;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Person p = new Person("harish" , 1);
        System.out.println(p.getName());
        System.out.println(p.getRank());
    }

}

class Team{
    Person person;
    public Team(Person person) {
        this.person = person;
    }
}