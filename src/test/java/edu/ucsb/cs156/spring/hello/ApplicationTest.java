package edu.ucsb.cs156.spring.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ApplicationTest {
  @Test
  public void applicationStarts() {
    Application.main(new String[] {});
  }
}
