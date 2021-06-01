package clinic.mymq;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.jms.*;

@LocalBean
@Stateless
public class Producer {
    @Resource(name = "java:/clinic/MyConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(name = "java:/clinic/myQueue")
    private Destination destination;

    @Schedule(hour = "*", minute = "*", second = "*/9", persistent = false)
    public void produceMessage(){
        try {
            Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(destination);
            TextMessage textMessage = session.createTextMessage("funktioniert");

            messageProducer.send(textMessage);
            System.out.println("______________________________");
            connection.close();
            session.close();
        }
        catch (JMSException e){
            e.printStackTrace();
        }
    }
}
