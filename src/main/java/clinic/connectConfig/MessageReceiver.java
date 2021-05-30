package clinic.connectConfig;

import clinic.service.api.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class MessageReceiver {
    static final Logger log = LoggerFactory.getLogger(MessageReceiver.class);

    private static final String ORDER_RESPONSE_QUEUE = "event-response-queue";

    final EventService eventService;

    public MessageReceiver(EventService eventService) {
        this.eventService = eventService;
    }


    @JmsListener(destination = ORDER_RESPONSE_QUEUE)
    public void receiveMessage(final Message<TrackResponse> message) throws JMSException {
        log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        MessageHeaders headers = message.getHeaders();
        log.info("Application : headers received : {}", headers);

        TrackResponse response = message.getPayload();
        log.info("Application : response received : {}", response);

        eventService.eventUpdate(response);
        log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
