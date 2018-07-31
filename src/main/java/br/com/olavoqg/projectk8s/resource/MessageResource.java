package br.com.olavoqg.projectk8s.resource;

import br.com.olavoqg.projectk8s.dto.request.MessageRequest;
import br.com.olavoqg.projectk8s.repository.jms.PublishMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageResource implements MessageDefinition {

  @Autowired
  private PublishMQ publishMQ;

  @PostMapping
  public ResponseEntity<Void> publishMessage(@RequestBody MessageRequest request) {
    publishMQ.sendMessage(request.getMessage());
    return ResponseEntity.accepted().build();
  }
}
