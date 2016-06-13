
/**
 * Write a description of class Fact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BitCoinData
{
    // This is the dataset [
    private int id;
    private String dataset_code;
    private String database_code;
    private String name;
    private String description;
    private String refreshed_at;
    private String newest_available_date;
    private String oldest_available_date;
    private String[] column_names;
    private String frequency;
    private String type;
    private boolean premium;
    private Object limit;
    private Object transform;
    private Object column_index;
    private String start_date;
    private String end_date;
    private Values[] data; //data contains an array of arrays
    private Object collapse;
    private String order;
    private int database_id;
    
    public String getNewDate() {
        return newest_available_date;
    }
    public Values[] getValues() {
        return data;
    }
    
    /*@Override
    public String toString(){
        return data.toString();
    }*/
    @Override
    public String toString(){
        System.out.println("Transaction deficit for Bitcoins");
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i].toString());
        }
        return "end";
    }
    /**
     * Constructor for objects of class Fact
     */
    public BitCoinData()
    {
    }
}
  