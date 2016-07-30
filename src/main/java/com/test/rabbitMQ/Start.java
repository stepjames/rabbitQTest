/**
 * 
 */
package com.test.rabbitMQ;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author J. Annam
 * 19 Jul 2016
 *
 * Version History
 * Date      Author     Reason for change
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Start
{

  /**
   * 
   */
  public Start()
  {
    // TODO Auto-generated constructor stub
  }
  
  @RequestMapping("/test")
  public String hello()
  {
    return "Just completed first Spring boot app 3333...";
  }
  
  @RequestMapping("/test/another/test")
  public String hello2()
  {
    return "Just completed first Spring boot app - calling hello2...";
  }
  
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    SpringApplication.run(Start.class, args);
  }

}
