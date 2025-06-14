package crm.model;

public enum OrderStatus {
    NEW("Новый заказ"),
    IN_PROGRESS("В работе"),
    COMPLETED("Заказ выполнен"),
    CANCELLED("Отменен");

    private final String description;
    OrderStatus(String description) {
        this.description = description;
    }
    public String getDescription(){
        return description;
    }



}
