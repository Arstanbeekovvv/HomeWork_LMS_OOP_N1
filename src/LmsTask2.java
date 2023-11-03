public class LmsTask2 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass("Mirlan", "Arstanbekov", (byte) 21);
        MyClass mc2 = new MyClass("'OOP, Loop, Array, Varargs'.", "'Plov, Manty, Samsy, Hashan'.");
        System.out.printf("FirstName: %s \nLastName: %s \nAge: %d\n", mc1.firstName, mc1.lastName, mc1.age);
        System.out.println("Peaksoft lessons: " + mc2.peakSoftLessons + "\nMy Favorite Food are " + mc2.myFavoriteFood);
    }
}
