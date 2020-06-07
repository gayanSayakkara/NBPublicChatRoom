package projectseven;

public class ProjectSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatObservable chatObservable = new ChatObservable();
        chatObservable.addPerson(new ChatWindow("Gayan", chatObservable));
        chatObservable.addPerson(new ChatWindow("Harsha", chatObservable));
    }
    
}
 