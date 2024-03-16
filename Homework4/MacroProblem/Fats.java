package Homework4.MacroProblem;

public interface Fats {
    String getString();
}

class Avocado implements Fats{
    public String getString(){
        return "Avocado";
    }
}

class SourCream implements Fats{
    public String getString(){
        return "Sour Cream";
    }
}

class Tuna implements Fats{
    public String getString(){
        return "Tuna";
    }
}

class Peanuts implements Fats{
    public String getString(){
        return "Peanuts";
    }
}