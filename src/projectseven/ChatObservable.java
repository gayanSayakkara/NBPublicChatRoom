
package projectseven;

import java.util.ArrayList;

public class ChatObservable {
    private ArrayList<ChatObserver>observerList=new ArrayList<>();
    
    public void addPerson(ChatObserver chatObserver){
        observerList.add(chatObserver);
    }
    public void removePerson(ChatObserver chatObserver){
        observerList.remove(chatObserver);
    }
    public void notifyAllPerson(String message){
        for (ChatObserver chatObserver : observerList) {
            chatObserver.updateChat(message);
        }
    }
}
