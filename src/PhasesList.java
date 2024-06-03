import java.util.HashMap;
import java.util.Map;

public class PhasesList {
    Integer Index;

    PhasesList(Integer index){
        this.Index = index;
    }

    public void phrases(){
        Map<Integer, String> phrases = new HashMap<Integer, String>();
        phrases.put(0 , "Не хочешь, не надо");
        phrases.put(1 , "О чем поговорим?");
        System.out.println(phrases.get(Index));
    };

}
