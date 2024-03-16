package Homework4.MacroProblem;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
    
        ArrayList <Customer> cus = new ArrayList<>();
        cus.add(new Customer("Robert", DietPlan.NORESTRICT));
        cus.add(new Customer("James", DietPlan.VEGAN));
        cus.add(new Customer("Bluey", DietPlan.NUTALL));
        cus.add(new Customer("Chris", DietPlan.PALEO));
        cus.add(new Customer("Kanye", DietPlan.NUTALL));
        cus.add(new Customer("Michael", DietPlan.NORESTRICT));

        for(int i =0; i < cus.size(); i++){
            Customer current = cus.get(i);
            Finalize fin= current.finalizing();
            System.out.println(current.getName() + " "+ fin.toString());
        }
    }
}
