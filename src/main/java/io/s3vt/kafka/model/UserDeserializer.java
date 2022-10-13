package io.s3vt.kafka.model;

import org.apache.kafka.common.serialization.Deserializer;

public class UserDeserializer implements Deserializer<User> {
    @Override
    public User deserialize(String topic, byte[] data) {
        System.out.println("Reading user");
        return null;
    }
}
