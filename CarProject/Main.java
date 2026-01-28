public class Main {
    public static void main(String[] args) {
        Processor processor = new i7();
        Laptop laptop = new Dell(processor);
        laptop.use();
        
    }
}
