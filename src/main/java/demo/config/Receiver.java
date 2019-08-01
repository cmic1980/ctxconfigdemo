package demo.config;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

/**
 * @author yu.miao
 */
@Component
@RabbitListener(queues = "ctx.ns.queue")
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String jsonMessage) throws InterruptedException, MessagingException {

    }
}

