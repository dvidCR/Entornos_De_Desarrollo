package longMethod;

import java.util.List;

public class BankTransactions {
	
	/*
	 * Tienes un método que procesa una lista de transacciones bancarias. 
	 * Este método valida cada transacción, calcula el balance después de cada transacción, 
	 * aplica comisiones si la transacción es un retiro, y luego imprime los detalles de la transacción. 
	 * El método actual es muy largo y realiza múltiples tareas. 
	 * Refactoriza este método dividiéndolo en métodos más pequeños y específicos que se encarguen 
	 * de validar la transacción, calcular el balance, aplicar comisiones e imprimir los detalles de la transacción.
	 */

	/**
	 * 
	 * @param transactions
	 * Es una lista que llama a la clase Transaction la cual guarda las transacciones.
	 * @param initialBalance
	 * Es un double que guarda el balance inicial.
	 */
	public void processTransactions(List<Transaction> transactions, double initialBalance) {
	    double balance = initialBalance;
	    for (Transaction transaction : transactions) {
	        // Validar transacción
	    	validarTransaccion(transaction);
	        // Calcular balance
	        calcularBalance(transaction, balance);
	        // Aplicar comisión
	        aplicarComision(balance);
	        // Imprimir detalles
	        imprimirDetalles(transaction, balance);
	    }
    }
	
	/**
	 * 
	 * @param transaction
	 * Llama a la clase Transaction.
	 */
	public void validarTransaccion(Transaction transaction) {
		if (transaction.getAmount() <= 0) {
            System.out.println("Error: Invalid transaction amount.");
        }
	}
	
	/**
	 * 
	 * @param transaction
	 * Llama a la clase Transaction.
	 * @param balance
	 * Es un double que guarda el balance.
	 * @return
	 * Devuelve el balance al terminar de calcularlo.
	 */
	public double calcularBalance(Transaction transaction, double balance) {
		if (transaction.getType().equals("DEPOSIT")) {
            balance += transaction.getAmount();
        } else if (transaction.getType().equals("WITHDRAWAL")) {
        	balance -= transaction.getAmount();
        }
		return balance;
	}
	
	/**
	 * 
	 * @param balance
	 * Es un double que guarda el balance.
	 * @return
	 * Devuevlve el balance una vez aplicada la comision.
	 */
	public double aplicarComision(double balance) {
		balance -= 1.5;
		return balance;
	}
	
	/**
	 * 
	 * @param transaction
	 * Llama a la clase Transaction.
	 * @param balance
	 * Es un double que guarda el balance.
	 */
	public void imprimirDetalles(Transaction transaction, double balance) {
		System.out.println("Transaction ID: " + transaction.getId());
        System.out.println("Type: " + transaction.getType());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Balance after transaction: " + balance);
	}
}


/*
 * ----------------------
 *  CLASE TRANSACCION
 * ----------------------
 * No hay que hacer nada con esta clase (ni refactorizar ni documentar)
 * Los cambios solo se aplican en la clase BankTransaction
 */

class Transaction {

	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
