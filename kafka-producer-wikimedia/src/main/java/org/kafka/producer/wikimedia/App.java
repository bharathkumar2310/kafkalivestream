package org.kafka.producer.wikimedia;
import org.kafka.producer.wikimedia.kafka.wikimediaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
    public class App
//               implements CommandLineRunner
{
    public static void main( String[] args )
    {
    	
    	SpringApplication.run(App.class);
    }
    
//    @Autowired
//    private wikimediaProducer wikimediaproducer;
//    
//    @Override
//    public void run(String... args) throws Exception{
//    	
//    	wikimediaproducer.message();
//    }
    
    
}
