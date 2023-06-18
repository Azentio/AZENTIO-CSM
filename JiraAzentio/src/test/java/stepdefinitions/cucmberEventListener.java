package stepdefinitions;

import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import io.cucumber.java.Status;
import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.EventPublisher;

public class cucmberEventListener implements EventListener {
	private final Map<String, UUID> startedSteps = new TreeMap<String, UUID>();
    private final Map<String, Status> finishedCases = new TreeMap<String, Status>();
	@Override
	public void setEventPublisher(EventPublisher publisher) {
	
		
	}

}
