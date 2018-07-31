package br.com.olavoqg.projectk8s.repository.jms;

import br.com.olavoqg.projectk8s.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class ConsumerMQ {

  @Autowired
  private JsonUtil jsonUtil;

  @JmsListener(destination = "${jms.queue.message}", concurrency = "10-10")
  public void listenerMessageQueue(String message) {
    log.info("[Message recived = {}]", message);
    Map<String, Object> recived = jsonUtil.parseAs(message, Map.class);
    log.info("[Message Convert = {}]", recived);
  }
}
