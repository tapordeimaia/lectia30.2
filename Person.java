public class Person implements Comparable<Person>{
    private int age;
    private String name;
    private int idnp;
    public Person(int age, String name, int idnp){
        this.age = age;
        this.name = name;
        this.idnp = idnp;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public int getIdnp(){
        return idnp;
    }

    @Override
    public int compareTo(Person o) {
        return this.idnp - o.getIdnp();
    }

    public int hashCode(){
        return idnp;
    }

    public boolean equals(Object obj){
        Person person = (Person) obj;
        return name.equals(person.getName()) && age == person.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
