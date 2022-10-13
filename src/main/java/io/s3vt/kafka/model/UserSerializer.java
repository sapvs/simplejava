package io.s3vt.kafka.model;

import org.apache.kafka.common.serialization.Serializer;

public class UserSerializer implements Serializer<User> {
    @Override
    public byte[] serialize(String topic, User data) {

        return data.toString().getBytes();


    }
}
