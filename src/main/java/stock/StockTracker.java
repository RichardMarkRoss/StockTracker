package stock;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockTracker {

    private List<StockEntry> stockList = new ArrayList<>();

    public void addStock(StockEntry entry) {
        stockList.add(entry);
    }
// public void stockEntryPredicate(StockEntry e){
//
// }
     /**
     * Get the number of entries for a given StockType
     * @param stockEntryPredicate
     * @return
     **/

    public List<StockEntry> getStockEntries(Predicate<StockEntry> stockEntryPredicate ) {
        ArrayList<StockEntry> entriesFound = new ArrayList<>();
        for(StockEntry value : stockList){
            if(stockEntryPredicate.test(value)) {
                entriesFound.add(value);
            }
        }
        return entriesFound;
    }

    /**
     * Get the number of entries for a given StockType
     * @param stockEntryPredicate
     * @return
     **/

    public int getStockLevel(Predicate<StockEntry> stockEntryPredicate ) {
        int stockLevel = 0;;
        for(StockEntry value: stockList){
            if(stockEntryPredicate.test(value)){
                stockLevel += value.getQty();
            }
        }
        return stockLevel;
    }

    public int getStockLevel() {
        int stockLevel = 0;
        for(StockEntry value: stockList){
            stockLevel += value.getQty();
        }
        return stockLevel;
    }



}
