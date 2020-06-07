package projectseven;

public class ProjectSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatObservable chatObservable = new ChatObservable();
        chatObservable.addPerson(new ChatWindow("Mahinda Rajapaksha", chatObservable));
        chatObservable.addPerson(new ChatWindow("Maithreepala Sirisena", chatObservable));
    }
    
}
