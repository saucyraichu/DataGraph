
/**
 * Write a description of class Database here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BitCoinDataSet
{
    // instance variables - replace the example below with your own
    private BitCoinData dataset;
    public BitCoinData getDataset(){
        return dataset;
    }
    
            
    @Override
    public String toString(){
        return dataset.toString();
    }
    public BitCoinDataSet()
    {
    }
}
