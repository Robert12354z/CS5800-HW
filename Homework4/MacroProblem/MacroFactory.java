package Homework4.MacroProblem;

import java.util.ArrayList;
import java.util.Random;

public interface MacroFactory {
    
    Carbs generateCarbs();
    Protein generateProtein();
    Fats generateFats();

}

    
    class NoRestrict implements MacroFactory{

        private static final Random ran = new Random();
        

        private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
        static{
        allCarbs.add(new Bread());
        allCarbs.add(new Lentils());
        allCarbs.add(new Pistachio());
        allCarbs.add(new Cheese());
        }

        int randomIndex = ran.nextInt(allCarbs.size());

        private static final ArrayList<Protein> allProtein = new ArrayList<>();
        static{
        allProtein.add(new Fish());
        allProtein.add(new Beef());
        allProtein.add(new Chicken());
        allProtein.add(new Tofu());
        }

        private static final ArrayList<Fats> allFats = new ArrayList<>();
        static{
        allFats.add(new Avocado());
        allFats.add(new SourCream());
        allFats.add(new Peanuts());
        allFats.add(new Tuna());
        }
        @Override
        public Carbs generateCarbs(){
            return allCarbs.get(randomIndex);
        } 
        @Override
        public Fats generateFats(){
            return allFats.get(randomIndex);
        }
        @Override
        public Protein generateProtein(){
            return allProtein.get(randomIndex);
        }

    }

    class Paleo implements MacroFactory{

        private static final Random ran = new Random();
        

        private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
        static{
        allCarbs.add(new Pistachio());
        
        }

        int randomIndex = ran.nextInt(allCarbs.size());

        private static final ArrayList<Protein> allProtein = new ArrayList<>();
        static{
        allProtein.add(new Fish());
        allProtein.add(new Beef());
        allProtein.add(new Chicken());
        }

        private static final ArrayList<Fats> allFats = new ArrayList<>();
        static{
        allFats.add(new Avocado());
        allFats.add(new Peanuts());
        allFats.add(new Tuna());
        }
        @Override
        public Carbs generateCarbs(){
            return allCarbs.get(ran.nextInt(allCarbs.size()));
        } 
        @Override
        public Fats generateFats(){
            return allFats.get(ran.nextInt(allFats.size()));
        }
        @Override
        public Protein generateProtein(){
            return allProtein.get(ran.nextInt(allProtein.size()));
        }

    }

    class Vegan implements MacroFactory{

        private static final Random ran = new Random();
        

        private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
        static{
        allCarbs.add(new Pistachio());
        allCarbs.add(new Bread());
        allCarbs.add(new Lentils());

        
        }

        int randomIndex = ran.nextInt(allCarbs.size());

        private static final ArrayList<Protein> allProtein = new ArrayList<>();
        static{
        allProtein.add(new Tofu());
        }

        private static final ArrayList<Fats> allFats = new ArrayList<>();
        static{
        allFats.add(new Avocado());
        allFats.add(new Peanuts());
        }
        @Override
        public Carbs generateCarbs(){
            return allCarbs.get(ran.nextInt(allCarbs.size()));
        } 
        @Override
        public Fats generateFats(){
            return allFats.get(ran.nextInt(allFats.size()));
        }
        @Override
        public Protein generateProtein(){
            return allProtein.get(ran.nextInt(allProtein.size()));
        }

    }

    class NutAllergy implements MacroFactory{

        private static final Random ran = new Random();
        

        private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
        static{
        allCarbs.add(new Bread());
        allCarbs.add(new Lentils());
        allCarbs.add(new Cheese());
        
        }

        int randomIndex = ran.nextInt(allCarbs.size());

        private static final ArrayList<Protein> allProtein = new ArrayList<>();
        static{
        allProtein.add(new Fish());
        allProtein.add(new Beef());
        allProtein.add(new Chicken());
        allProtein.add(new Tofu());
        }

        private static final ArrayList<Fats> allFats = new ArrayList<>();
        static{
        allFats.add(new Avocado());
        allFats.add(new Tuna());
        }
        @Override
        public Carbs generateCarbs(){
            return allCarbs.get(ran.nextInt(allCarbs.size()));
        } 
        @Override
        public Fats generateFats(){
            return allFats.get(ran.nextInt(allFats.size()));
        }
        @Override
        public Protein generateProtein(){
            return allProtein.get(ran.nextInt(allProtein.size()));
        }

    }


