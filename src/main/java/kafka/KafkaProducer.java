package kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer
{

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);



    private KafkaTemplate<String,String> stringKafkaTemplate;
    public KafkaProducer(KafkaTemplate<String, String> stringKafkaTemplate) {
        this.stringKafkaTemplate = stringKafkaTemplate;


    }

    public void sendMessage(String message)
    {

        LOGGER.info(String.format("Message Sent %s",message));
        stringKafkaTemplate.send("java",message);
    }







}
