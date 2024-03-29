import java.util.*;
public class CoinClient {
    public static void main(String[] args) throws Exception {
        Coin coin1 = new Coin("Bronze", "Copper", "Abraham Lincoln", 0.01);
        Coin coin2 = new Coin("Silver", "Copper", "Thomas Jefferson", 0.05);
        Coin coin3 = new Coin("Silver", "Copper", "Franklin D. Roosevelt", 0.10);
        Coin coin4 = new Coin("Silver", "Copper", "George Washington", 0.25);

        Coin test = new Coin("Orange", "play-doh", "Steven Jirschele", 0.100);

        List<Coin> myList = new ArrayList<Coin>();
        myList.add(coin1);
        myList.add(coin2);
        myList.add(coin3);
        myList.add(coin4);

        myList.add(test);

        System.out.println(myList);
        myList.remove(test);
        System.out.println("\n");
        System.out.println(myList);

        System.out.println("\n");

        System.out.println("\n");
        System.out.println(searchList(myList, "color", "silver"));
    }
    public static void addItem(List<Coin> myList, Coin add) {
        myList.add(add);
    }
    public static void removeItem(List<Coin> myList, Coin remove) {
        myList.remove(remove);
    }
    public static List<Coin> searchList(List<Coin> myList, String prop, String context) {
        List<Coin> temp = new ArrayList<Coin>();
        if(prop.toLowerCase().equals("color")) {
            for(Coin i:myList) {
                if(i.getColor().toLowerCase().equals(context.toLowerCase())) {
                    temp.add(i);
                }
            }
        }
        else if(prop.equals("material")) {
            for(Coin i:myList) {
                if(i.getMaterial().toLowerCase().equals(context.toLowerCase())) {
                    temp.add(i);
                }
            }
        }
        else if(prop.equals("person")) {
            for(Coin i:myList) {
                if(i.getPerson().toLowerCase().equals(context.toLowerCase())) {
                    temp.add(i);
                }
            }
        }
        else if(prop.equals("value")) {
            for(Coin i:myList) {
                if(i.getValue() == Double.parseDouble(context)) {
                    temp.add(i);
                }
            }
        } else {
            return null;
        }
        return temp;
    }
    public static int listCount(List<Coin> myList) {
        return myList.size();
    }
}
