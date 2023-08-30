package pubsub.subscriber;

import com.sun.jdi.ArrayReference;
import pubsub.Message;
import pubsub.service.PubSubService;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {
    public List<Message> subscriberMessages = new ArrayList<>();
    public List<Message> getSubscriberMessages(){
        return subscriberMessages;
    }

    public void setSubscriberMessages(List<Message> subscriberMessages){
        this.subscriberMessages = subscriberMessages;
    }

    public abstract void  addSubscriber(String topic, PubSubService pubSubService);
    public abstract void unSubscribe(String topic, PubSubService pubSubService);

    public abstract void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService);
    public void printMessages(){
        if(subscriberMessages.isEmpty()){
            System.out.println("No Messages");
        }else{
            for(Message message : subscriberMessages){
                System.out.println("Message Text : " + message.getTopic() + " : " + message.getTopic());
            }
        }
    }
}
