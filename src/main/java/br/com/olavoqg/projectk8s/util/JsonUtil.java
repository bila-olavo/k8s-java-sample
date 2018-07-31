package br.com.olavoqg.projectk8s.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JsonUtil {

  @Bean
  public ObjectMapper mapper() {
    return new ObjectMapper();
  }

  public String toJson(Object object) {
    try {
      return mapper().writeValueAsString(object);
    } catch (JsonProcessingException e) {
      return null;
    }
  }

  public <T> T parseAs(String json, Class<T> klass) {
    try {
      return mapper().readValue(json, klass);
    } catch (Exception e) {
      return null;
    }
  }

}
