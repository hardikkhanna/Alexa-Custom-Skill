package com.alexa.main;

import com.alexa.handler.CancelandStopIntentHandler;
import com.alexa.handler.HelloWorldIntentHandler;
import com.alexa.handler.HelpIntentHandler;
import com.alexa.handler.LaunchRequestHandler;
import com.alexa.handler.SessionEndedRequestHandler;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class HelloWorldStreamHandler extends SkillStreamHandler {
 
 private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("Skill Id ")
                .build();
    }
public HelloWorldStreamHandler() {
        super(getSkill());
    }
}