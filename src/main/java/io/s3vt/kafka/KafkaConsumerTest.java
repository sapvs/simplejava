package io.s3vt.kafka;

import io.s3vt.kafka.model.User;
import io.s3vt.kafka.model.UserDeserializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumerTest {
    public static void main(String[] args) {

        System.out.println(UserDeserializer.class.getCanonicalName());
        System.out.println(UserDeserializer.class.getName());

        Properties props = new Properties();

        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "test");
        //props.setProperty("enable.auto.commit", "true");
        //props.setProperty("auto.commit.interval.ms", "1000");
        props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getCanonicalName());
        props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, UserDeserializer.class.getCanonicalName());
        try (KafkaConsumer<String, User> consumer = new KafkaConsumer<>(props)) {
            consumer.subscribe(Arrays.asList("my-topic", "bar"));
            while (true) {
                ConsumerRecords<String, User> records = consumer.poll(Duration.ofMillis(100));
                for (ConsumerRecord<String, User> record : records)
                    System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
        }
    }
}
