public class Recursion {
    static int add (int start, int end){
        if (start < end){
            return start + add(start + 1, end);
        }
        else{
            return end;
        }


    }

    public static void main (String[]args){
        int result = add (1,4);
        System.out.println(result);
    }
    
}
