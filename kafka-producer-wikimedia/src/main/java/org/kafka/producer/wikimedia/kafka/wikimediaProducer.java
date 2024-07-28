package org.kafka.producer.wikimedia.kafka;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.launchdarkly.eventsource.EventSource;
import com.launchdarkly.eventsource.StreamException;
import com.launchdarkly.eventsource.background.BackgroundEventHandler;
import com.launchdarkly.eventsource.background.BackgroundEventSource;

@Service
public class wikimediaProducer {
	
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	
	public void message() throws StreamException, InterruptedException
	{
		String topic = "wikimedia_change";
		
		
		// to read real time data from wikimedia we have to use okhttp eventsource dependency and okhttp dependency 
		//jackson bind and core dependency for reading json
		
		BackgroundEventHandler eventhandler = new wikimediaChangeHandler(kafkaTemplate, topic );		
		String url = "https://stream.wikimedia.org/v2/stream/recentchange";
	    EventSource.Builder builder1 = new EventSource.Builder(URI.create(url));
	    BackgroundEventSource.Builder builder = new BackgroundEventSource.Builder(eventhandler, builder1);
		BackgroundEventSource eventSource = builder.build();
		eventSource.start();
		TimeUnit.MINUTES.sleep(10);

	}

}
