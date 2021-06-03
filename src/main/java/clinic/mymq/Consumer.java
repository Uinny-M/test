//package clinic.mymq;
//
//import javax.ejb.ActivationConfigProperty;
//import javax.ejb.MessageDriven;
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.MessageListener;
//import javax.jms.TextMessage;
//@MessageDriven(name = "Consumer",
//activationConfig = {
//        @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/clinic/MyQueue")
//})
//public class Consumer implements MessageListener {
//    @Override
//    public void onMessage(Message message) {
//        TextMessage textMessage = (TextMessage) message;
//        try {
//            System.out.println(textMessage.getText() + this.getClass().toString());
//        } catch (JMSException e){
//            e.printStackTrace();
//        }
//    }
//}
