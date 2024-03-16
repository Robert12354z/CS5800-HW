package Homework4.MacroProblem;

public interface Protein {
    String getString();
}

class Fish implements Protein{
    public String getString(){
        return "Fish";
    }
}

class Chicken implements Protein{
    public String getString(){
        return "Chicken";
    }
}

class Beef implements Protein{
    public String getString(){
        return "Beef";
    }
}

class Tofu implements Protein{
    public String getString(){
        return "Tofu";
    }
}