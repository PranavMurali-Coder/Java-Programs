class class2{
    int id;
    String name;
    int salary;

    void setId(int a){
        id=a;
    }

    void setName(String b){
        name=b;
    }

    void setSalary(int c){
        salary=c;
    }

    void getDetails(){
        System.out.println(name+"'s salary is "+salary);
    }
}

public class class1{
    public static void main(String[] args){
        class2 obj=new class2();
        obj.setId(1);
        obj.setName("Pranav");
        obj.setSalary(80000);
        obj.getDetails();

    }
}