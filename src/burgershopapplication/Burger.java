package burgershopapplication;

public class Burger {

    public static final int burgerPrice = 500;
    public static final int PREPARING = 0;
    public static final int DELIVERED = 1;
    public static final int CANCEL = 2;

    private String orderID;
    private String customerID;
    private String name;
    private int quantity;
    private double total;
    private int status;

    Burger() {

    }

    Burger(String orderID, String customerID, String name, int quantity, double total, int status) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.name = name;
        this.quantity = quantity;
        this.total = total;
        this.status = status;
    }

    public void setOrderID(String orderID){
		this.orderID = orderID;
	}
	public String getOrderID(){
		return orderID;
	}
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	public String getCustomerID(){
		return customerID;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setTotal(double total){
		this.total = total;
	}
	public double getTotal(){
		return total;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
        }
}
