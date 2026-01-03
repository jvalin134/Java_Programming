public class Variable {
    /*
    Variables:- it is a container that can store a value and can be
    used where the value is need.
    1. Primitive variable:- this variable store the simple value directly to the
       memory (stake memory).
       eg:- int,chr,double,boolean
    2. Reference variable :- this variable store the address of the variable in stake
       memory which point to the heap memory.
       eg:- strings,arrays
     */
    public static void main(String[] args){
        String camel_name = "longneck";
        int heightFeet = 10;
        double width = 20.23;
        char gender = 'M';
        boolean isFast = false;

        System.out.println(camel_name +" is " + heightFeet + " feet Tall & " + width + " feet wide" );

        if(isFast) {
            System.out.println(camel_name + " is Fast");
        }
        else{
            System.out.println(camel_name + " is slow");

        }


    }
}
