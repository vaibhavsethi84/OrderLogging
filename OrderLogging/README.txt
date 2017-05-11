How to test:
After deploying on any web server, use the following URL to test:
http://localhost:8080/OrderLogging/subscribe?name=[SubscriptionName]&description=[SubscriptionDescription]
Change the port number (8080) based on your web server configuration.
Replace [SubscriptionName] and [SubscriptionDescription] with text of your choice.
The result will be found in the server log file.

Explaination for the code:
1. The required truncate method is within "com.utils.LoggerUtils" class the controller class is "com.order.SubscriptionController".
2. I have kept the truncate and log method within separate class so that it can be reused elsewhere in the application.
3. I have not added any unit test cases as it was not a part of the question but ideally there should be test cases to avoid issues due to any modifications in the future.
4. Further, it is a good practice to use AOP for such requirements so that all the code for cross cutting concerns such as logging remain at one place.
