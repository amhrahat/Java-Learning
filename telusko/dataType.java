class dataType
{
    public static void main (String args[]){

        float marks = 56.6f;
        long subNum = 5l;
        float result;
        result = marks * subNum;
        System.out.println(result);


        char letter = 'A';
        System.out.println(letter);

        boolean flag = true;
        System.out.println(flag);

        int binary = 0b101; // for binary num use ob
        System.out.println(binary);

        int hexa = 0x7E;   // for hexa-decimal num use 0X
        System.out.println(hexa);

        int lotOfZeros = 10_00_00_000; // for separating zeros for better visualization
        System.out.println(lotOfZeros);

        double sciNum = 17e10;
        System.out.println(sciNum);

        char letter2 = 'a';
        letter2++;        // increase the unicode value by 1. then convert that in char value
        System.out.println(letter2);


    }
}