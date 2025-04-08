import java.util.HashMap;

public class TelephoneDirectory {
    private String surname;
    private int telephoneNumber;

    HashMap<Integer, String> telephoneDirectory = new HashMap<>();

    public void add(int telephoneNumber, String surname){
        telephoneDirectory.put(telephoneNumber, surname);
    }

    public void printAllDirectory(){
        for (var entry : telephoneDirectory.entrySet()){
            int n = entry.getKey();
            String s = entry.getValue();
            System.out.println(s + " - " + n);
        }
        System.out.println("");
    }

    public void get(String surname){
        System.out.println("Номера телефона по фамилии " + surname + ":");
        for (var entry : telephoneDirectory.entrySet()){
            if (surname.equals(entry.getValue())){
                System.out.println(entry.getKey());
            }
            if (!telephoneDirectory.containsValue(surname)){
                System.out.println("Такой фамилии нет в справочнике.");
                break;
            }
        }
    }

}
