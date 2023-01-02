class This_Key{  
    int rollno;  
    String name;  
    float fee;  
    This_Key(int rollno,String name,float fee){  
    rollno=rollno;  
    name=name;  
    fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
    class TestThis1{  
    public static void main(String args[]){  
    This_Key s1=new This_Key(111,"ankit",5000f);  
    This_Key s2=new This_Key(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }} 
