package longParameterList;

public class TransactionDetails {
	private String transactionId;
	private String accountNumber;
	private double amount;
	private String transactionType;
	private String currency;
	private String transactionDate;
	private String status;
	private String description;
	
	public TransactionDetails(String transactionId, String accountNumber, double amount, String transactionType, String currency, String transactionDate, String status, String description) {
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transactionType = transactionType;
		this.currency = currency;
		this.transactionDate = transactionDate;
		this.status = status;
		this.description = description;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
