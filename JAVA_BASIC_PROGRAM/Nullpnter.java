public class Nullpnter {
    public static void main(String args[]){
        try{
            String a=null;
            String n=a.toUpperCase();
            System.out.println(n);

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of Practical!!")

    }
    
}
