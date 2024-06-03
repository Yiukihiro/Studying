
public class CreateCharacter {
    String name;
    int age = 19;
    int height = 155;
    String eyesColor = "зеленые";
    String hairColor = "голубые";

    CreateCharacter (String name){
        this.name = name;
    }

    public void createCharacter(){
        System.out.println("Привет, меня зовут" + " " + this.name + " " + "мне" + " " + age + " " + "лет" );
        System.out.println("Мой рост" + " " + height + " " + "см" + " " + "У меня" + " " + eyesColor + " " + "глаза" +
                " " + "и" + " " + hairColor + " " + "волосы");
        System.out.println("Пообщаемся?");
    }
}
