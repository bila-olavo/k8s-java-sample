package br.com.olavoqg.projectk8s.resource;

import br.com.olavoqg.projectk8s.dto.request.MessageRequest;
import org.springframework.http.ResponseEntity;

public interface MessageDefinition {

  ResponseEntity<Void> publishMessage(MessageRequest request);
}
