public class Dell implements Laptop {

    Processor processor;

    public Dell(Processor processor){
        this.processor = processor;

    };

    @Override
    public void use(){
        System.out.println("using Dell" + processor.power());
    }
}