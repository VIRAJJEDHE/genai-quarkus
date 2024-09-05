package org.streamliners;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface GenAIService {
    
    public String chat(@UserMessage String message);
}
