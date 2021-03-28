import java.util.*;

public class SocialNetwork {

    public static ArrayList<String> findGroupA(HashMap<String, ArrayList<String>> network,
                                               HashMap<String, String> employer){
        ArrayList<String> groupA = new ArrayList<>();

        //Use network map and employeer map create a graph

        //logic to find who donot have friend who share the same employeer

        return groupA;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> network = new HashMap<>();
        HashMap<String, String> employer = new HashMap<>();


        ArrayList<String> listA = new ArrayList<>();
        listA.add("Supreeth");
        listA.add("Desai");
        listA.add("Subadha");
        network.put("Manish", listA);

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Sumanth");
        listB.add("Suneel");
        listB.add("Subadha");
        network.put("Vijay", listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.add("Sushmitha");
        listC.add("Bargahv");
        listC.add("Suneel");
        network.put("Anuroop", listC);

        employer.put("Manisha", "Nokia");
        employer.put("Desai", "Akamai");
        employer.put("Subadha", "Akamai");
        employer.put("Sumanth", "Lam");
        employer.put("Anuroop", "Walmart");
        employer.put("Suneel", "Nokia");
        employer.put("Supreeth", "Nokia");
        employer.put("Vijay", "Bayer");


        ArrayList<String> groupA= SocialNetwork.findGroupA(network, employer);
        System.out.println(groupA);


    }
}

