package br.com.olavoqg.projectk8s.repository.jms;

import java.util.Map;

import br.com.olavoqg.projectk8s.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class PublishMQ {

  @Autowired
  private JmsTemplate jmsTemplate;

  @Autowired
  private JsonUtil jsonUtil;

  @Value("${jms.queue.message}")
  private String queue;



  public void sendMessage(Map<String, Object> message) {

    String msg = jsonUtil.toJson(message);
    jmsTemplate.convertAndSend(queue, msg);

  }
}
