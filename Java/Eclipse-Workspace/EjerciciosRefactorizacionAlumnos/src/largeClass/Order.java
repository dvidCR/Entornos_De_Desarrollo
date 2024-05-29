package largeClass;

import java.util.List;

/*
 * Dada una clase Order que contiene múltiples responsabilidades y métodos relacionados con la gestión de pedidos, 
 * debes refactorizar el código dividiendo esta clase en varias clases más pequeñas y bien delimitadas. 
 * La clase original tiene atributos como el ID del pedido, el nombre del cliente, la dirección del cliente, 
 * una lista de artículos, el monto total, el método de pago, el método de envío y la fecha de entrega, 
 * además de métodos para procesar el pedido, validar el pedido, calcular el total, 
 * procesar el pago y enviar el pedido. 
 * Refactoriza el código para que cada responsabilidad se maneje en una clase separada, 
 * asegurando que cada clase tenga una única responsabilidad.
 */

public class Order {
    private String orderId;
    private String customerName;
    private String customerAddress;
    private List<String> items;
    private double totalAmount;
    private String paymentMethod;
    private String shippingMethod;
    private String deliveryDate;

    public Order(String orderId, String customerName, String customerAddress, List<String> items, double totalAmount, String paymentMethod, String shippingMethod, String deliveryDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.items = items;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.shippingMethod = shippingMethod;
        this.deliveryDate = deliveryDate;
    }

    public void processOrder(ValidateOrder validateOrder, CalculateTotal calculateTotal, ProcessPayment processPayment, ShipOrder shipOrder) {
        validateOrder.validateOrder();
        calculateTotal.calculateTotal();
        processPayment.processPayment();
        shipOrder.shipOrder();
    }
    
}

