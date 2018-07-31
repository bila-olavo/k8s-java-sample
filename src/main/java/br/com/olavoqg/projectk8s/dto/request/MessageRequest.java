package br.com.olavoqg.projectk8s.dto.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
@Builder
public class MessageRequest implements Serializable {

  private String ts;

  private String sender;

  private Map<String, Object> message;

  private String sentFromIp;

  private Integer priority;
}
