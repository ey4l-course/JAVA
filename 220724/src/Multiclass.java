public class Multiclass {
    private static int staticNum = 10;
    private int dynamicNum;

    public Multiclass(int dynamicNum){
        this.dynamicNum = dynamicNum;
    }

    public static class Player{
        private String name;
        private int age;

        Player(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void display(){
            System.out.printf("Player name: %s \nPlayer age: %d", this.name, this.age);
        }
    }

}

class AnotherClass{
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        Multiclass multiclass = new Multiclass(20);
        multiclass.Player player = new multiclass.Player("Eyal", 30);
    }
}
