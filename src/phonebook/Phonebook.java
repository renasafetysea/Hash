package phonebook;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private final Map<String,String> phonebook;

    public Phonebook(){
        phonebook = new HashMap<>(20);
    }
    public void addPhone(String name,String number){
        phonebook.put(name,number);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
        }
        return sb.toString();
    }
}
