public class Array_an_object {  
        String Name,Branch;
        Student(String n, String B){
                Name=n;
                Branch=b;

        }
        void show(){
                System.out.print("Name :"+Name+"Branch"+Branch);
        }
        public static void main(String args[]){  
        Array_an_object a[]=new Array_an_object[5];
        a[0]=new Array_an_object("TFT","IT");  
        a[1]=new Array_an_object("TFT","CSE"); ;  
        a[2]=new Array_an_object("TFT","IT"); ;  
        a[3]=new Array_an_object("TFT","EXTC"); ;  
        a[4]=new Array_an_object("TFT","CIVIL"); ;  
        a[0].show();
        a[1].show();
        a[2].show();
        a[3].show();
        a[4].show(); 
        }}
