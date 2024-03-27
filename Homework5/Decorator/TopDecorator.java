package Homework5.Decorator;

abstract class TopDecorator implements Food{
    protected Food food;

    public TopDecorator(Food food) {
        this.food = food;
    }

    
}
