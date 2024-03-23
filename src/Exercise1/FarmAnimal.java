package Exercise1;

public abstract class FarmAnimal {

    String name;
    String gender;
    double weight;
    int age;

    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // toString Method to show results and their attributes
    @Override
    public String toString() {
        return "FarmAnimal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    // Abstract Method to make the subclasses implement a feeding schedule
    public abstract String feedLoadingSchedule();

}
