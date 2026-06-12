package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import payload.User;


@Component
public class JsonKafkaConsumer
{

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);


    @KafkaListener(topics = "topic-example-json", groupId = "myGroup")
  public  void consume(User user)
  {
      LOGGER.info(String.format("josn Message Received  -->%s",user.toString()));
  }

}
