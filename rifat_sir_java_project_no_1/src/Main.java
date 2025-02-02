import java.util.*;
public class Main {
    public static void main(String [] args) {
        List<User> user1=new ArrayList<>();
        user1.add(new User(23,"Nazmus shakib","chankherpool","ahaku"));
        user1.add(new User(27,"Nazmus sadat","mugdha","sadat"));
        user1.add(new User(24,"imtiaz","chankherpool","ahaku"));
        user1.add(new User(24,"rakin sarker","nazimuddinroad","aakun"));

        // Create a HashSet to track unique IDs and usernames
        Set<Integer> uid=new HashSet<>();
        Set<String> uname=new HashSet<>();
        // the uniques id and username add here
        List<User> uniquser=new ArrayList<>();
        for(User s:user1) {
            if(uid.add(s.getId()) && uname.add(s.getUsername())) {
                uniquser.add(s);
            }
        }

        System.out.println(uniquser);

        //PriorityQueue<User> user2=new PriorityQueue<>();
        PriorityQueue<User> user2 = new PriorityQueue<>(Comparator.comparing(User::getUsername));
        //  if we want more compare    .thenComparing(User::getUsername));
        user2.addAll(uniquser);
        // Print all items from the priority queue (sorted by username)
        while(!user2.isEmpty()) {
            System.out.println(user2.poll());

        }
    }

}
