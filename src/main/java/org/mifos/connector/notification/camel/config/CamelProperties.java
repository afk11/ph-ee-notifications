package org.mifos.connector.notification.camel.config;

/**
 * Central Definition of all the Camel Exchange Properties
 */
public class CamelProperties {

	private CamelProperties() {}

    public static final String CORRELATION_ID = "correlationId";
    public static final String TRANSACTION_BODY = "transactionBody";
    public static final String TRANSACTION_TYPE = "transactionType";
    public static final String ERROR_INFORMATION = "errorInformation";
    public static final String TRANSACTION_ID = "transactionId";
    public static final String INTERNAL_ID = "internalId";
    public static final String MOBILE_NUMBER = "mobileNumber";
    public static final int PROVIDER_ID = 1;
    public static  String DELIVERY_STATUS = "deliveryStatus";
    public static String DELIVERY_MESSAGE = "deliveryMessage";
    public static final String DATE = "originDate";
    public static final String ACCOUNT_ID = "accountId";
    public static final String TRANSACTION_AMOUNT = "amount";

}
