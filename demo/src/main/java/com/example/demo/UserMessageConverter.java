package com.example.demo;

import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.mapping.DefaultJackson2JavaTypeMapper;
import org.springframework.kafka.support.mapping.Jackson2JavaTypeMapper;

import java.util.Collections;

public class UserMessageConverter extends JsonMessageConverter {

    public UserMessageConverter(){
        super();
        DefaultJackson2JavaTypeMapper typeMapper = new DefaultJackson2JavaTypeMapper();
        typeMapper.setTypePrecedence(Jackson2JavaTypeMapper.TypePrecedence.TYPE_ID);
        typeMapper.addTrustedPackages("com.example.demo");
        typeMapper.setIdClassMapping(Collections.singletonMap("user", User.class));
        this.setTypeMapper(typeMapper);
    }
}
