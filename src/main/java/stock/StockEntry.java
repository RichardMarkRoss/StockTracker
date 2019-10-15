package stock;

class StockEntry { // encapsulation
    private StockType stockType;
    private int qty;

    public StockEntry(StockType stockType, int qty) {// enum type and amount of stock
        this.stockType = stockType;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public StockType getStockType() {
        return stockType;
    }
}
