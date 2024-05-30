package longParameterList;

/*
 * Dada una clase TransactionProcessor con un método processTransaction que toma una larga lista
 * de parámetros para procesar una transacción bancaria, debes refactorizar el código para reducir 
 * la cantidad de parámetros pasados al método. 
 * En lugar de utilizar una lista extensa de parámetros, encapsula estos datos en una clase TransactionDetails. 
 * Esto ayudará a mejorar la encapsulación y la manejabilidad del código.
 */

/**
 * @param processTransaction
 * Iguala las variables al valor del atributo en concreto de la clase TransactionDetails.
 * 
 * @see TransactionDetails
 * Llama a la clase para usarlo como parametro en la clase processTransaction.
 * 
 */

public class TransactionProcessor {
    public void processTransaction(TransactionDetails transactionDetails) {
        // Transaction processing logic
    	String transactionId = transactionDetails.getTransactionId();
    	String accountNumber = transactionDetails.getAccountNumber();
    	double amount = transactionDetails.getAmount();
    	String transactionType = transactionDetails.getTransactionType();
    	String currency = transactionDetails.getCurrency();
    	String transactionDate = transactionDetails.getTransactionDate();
    	String status = transactionDetails.getStatus();
    	String description = transactionDetails.getDescription();
    }
}
