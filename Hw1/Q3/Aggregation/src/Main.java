public class Main {
    public static void main(String[] args) throws Exception {
      Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
      Instructor instructor2 = new Instructor("Robert", "Reyes", "3-2565");
      Textbook textbook2 = new Textbook("The Bible", "Jesus", "Nazareth", "Christianity");
      Textbook textbook1 = new Textbook("Clean Code", "Robert", "Martin", "Prentice Hall");
      Course course1 = new Course("CS5800", instructor1, textbook1, instructor2, textbook2);

      System.out.println(course1);


    }
}
