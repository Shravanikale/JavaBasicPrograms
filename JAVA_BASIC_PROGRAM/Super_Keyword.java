public class Super_Keyword {
    void show(){
        System.out.println("SHOW METHOD ITS");
        
    }}
class child extends Super_Keyword{
    void show(){
        super.show();
        System.out.println("Hey child class its");
        
    }
}
class Test{
    public static void main (String args[]){{
        child s1=new child();
        s1.show();
    }}}

    

