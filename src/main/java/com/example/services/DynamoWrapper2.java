package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableResult;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

@Component
@Service
public class DynamoWrapper2 {

    // @SuppressWarnings("removal")
    // public void createTable(String table_name) {
        

    //     System.out.format(
    //             "Creating table \"%s\" with a simple primary key: \"Name\".\n",
    //             table_name);

    //     CreateTableRequest request = new CreateTableRequest()
    //             .withAttributeDefinitions(new AttributeDefinition(
    //                     "Name", ScalarAttributeType.S))
    //             .withKeySchema(new KeySchemaElement("Name", KeyType.HASH))
    //             .withProvisionedThroughput(new ProvisionedThroughput(
    //                     new Long(10), new Long(10)))
    //             .withTableName(table_name);

    //     final AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.defaultClient();

    //     try {
    //         CreateTableResult result = ddb.createTable(request);
    //         System.out.println(result.getTableDescription().getTableName());
    //     } catch (AmazonServiceException e) {
    //         System.err.println(e.getErrorMessage());
    //         System.exit(1);
    //     }
    //     System.out.println("Done!");
    // }
}
