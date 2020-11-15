import java.util.ArrayList;

public abstract class Pizza {
        String name;
        Dough dough;
        Sauce sauce;
        Veggies [] veggies;
        Cheese cheese;
        Pepperoni pepperoni;
        Clams clam;

        abstract void prepare () ;
        public void bake () {
            System.out.println("Bake 25 minutes at 350");
        }
        public void cut () {
            System.out.println("Cutting pizza into diagonal slices");
        }
        public void box () {
            System.out.println("Place pizza in official pizza box");
        }
        public String getName () {
            return name;
        }
        void setName(String name){
            this.name = name;
        }
    }
