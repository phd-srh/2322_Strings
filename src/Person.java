public class Person /* extends Object */ {
    private String name;
    private int geburtsjahr;

    public Person(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    @Override
    public String toString() {
        return name + ", geb. " + geburtsjahr;
    }

//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", geburtsjahr=" + geburtsjahr +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null) return false;
//        if (o == this) return true; // damit manches etwas schneller läuft
//        if (o.getClass() != this.getClass()) return false;
//
//        Person that = (Person) o;    // <- DOWNCAST (GEFÄHRLICH)
//        if ( !this.name.equals(that.name) ) return false;
//        if ( this.geburtsjahr != that.geburtsjahr ) return false;
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (geburtsjahr != person.geburtsjahr) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

}
