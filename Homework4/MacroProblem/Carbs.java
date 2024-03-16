package Homework4.MacroProblem;

public interface Carbs {
    String getString();
}

class Cheese implements Carbs{
    public String getString()
    {
        return "Cheese";
    }
}

class Bread implements Carbs{
    public String getString()
    {
        return "Bread";
    }
}

class Lentils implements Carbs{
    public String getString()
    {
        return "Lentils";
    }
}

class Pistachio implements Carbs{
    public String getString()
    {
        return "Pistachio";
    }
}

