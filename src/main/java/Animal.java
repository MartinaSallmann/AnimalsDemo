public class Animal {
    private String name;
    private int age;
    private String species;
    private String animalLoud;

    public Animal(String name, int age, String species, String animalLoud){
        this.name = name;
        this.age = age;
        this.species = species;
        this.animalLoud = animalLoud;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud(){
        return animalLoud;
    }
    public String getNameAndAge(){
        System.out.println(" " + getName() + " " + getAge());

         return getName() + getAge();
    }

    public String ageCategory(int age){

        if (age < 2){
            return "baby animal";
        }else if (age < 4){
            return "young animal";
        }else{
            return "old animal";
        }

    }
}
