public class Scope {
    static void scope(int value){
        int methodVar = 6; //method scope variable
        int ans;
        ans = value + methodVar;
        System.out.println(ans);

        if (methodVar == 6){
            int blockVar = methodVar;   // we will be able to use methodVar in the entire method in any scope

            for (int loopVar = 0; loopVar < blockVar; loopVar++){
                System.out.println(loopVar); // i 
            }

            //System.out.println(loopVar); // will not work as loopVar is only work inside the llop scope
            System.out.println(blockVar); // will work as we are still inside the scope blockVar was declared

        }
        //System.out.println(blockVar); will not work as blockVar is being declared in another block scope
    }

    public static void main(String[] args) {
        scope(5);
        //System.out.println(methodVar); will not work as methodVar is being declared in another method scope
    }
    
}
