public class Main {
    public static void main(String[] args) throws Exception {
        
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones","111-11-1111", 2500);
        HourlyEmployee steph = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel","555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee manhnaz = new CommisionEmployee("Manhaz", "Vaziri", "777-77-7777", 22, 40000);

        System.out.println(joe);
        System.out.println(steph);
        System.out.println(mary);
        System.out.println(nicole);
        System.out.println(renwa);
        System.out.println(mike);
        System.out.println(manhnaz);
        

         
    }
}
