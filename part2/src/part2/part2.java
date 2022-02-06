
package part2;

class Patika{
    public void greetings(){
        System.out.print("Hello from Patika!");
    }
}

class Kodluyoruz{
    public void greetings(){
        System.out.print("Hello from Kodluyoruz!");
    }
}

/*
Gives Error
class Test extends Patika, Kodluyoruz{
    ...
}*/

interface A{
    public void greetings();
}
interface B{
    public void greetings();
}
class C implements A,B{
    @Override
    public void greetings(){
        System.out.println("Hello from the darkness!!");
    }
}



public class part2 {

    public static void main(String[] args) {
        
        C c = new C();
        c.greetings();
    }
    
}
