class Person{
    protected String name;
    public int id;
    public Person(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String get(){
       return "姓名：" + this.name + "  编号：" + this.id;
    }
}
public class KeJian {
    public static void main(String[] args) {
        Person per = new Person("你",18);
        System.out.print(per.name);
        System.out.println(per.id);
        System.out.println(per.get());
    }
}
