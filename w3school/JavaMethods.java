public class JavaMethods {

    static boolean checkAge (int age){

        boolean flag;

        if (age < 18) {
            flag = false;

        } 
        else{
            flag = true;
        }
            return flag;
    }

    static String checkIn (String name, int age){
        boolean checkAge = checkAge(age);
        String output;

        if (checkAge == true){
            output = name + " is allowed";
            return output;
        }
        else {
            output = name + " is not allowed";
            return output; 
        }
    }
    


    public static void main(String[] args) {
        String ans;
        
        ans = checkIn("Rahat", 18);
        System.out.println(ans);

        ans = checkIn("Hasnath", 17);
        System.out.println(ans);

        ans = checkIn("Tisha", 19);
        System.out.println(ans);



    }
}