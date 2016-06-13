
/**
 * Write a description of class Values here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Values
{
    // the blank array, since gson expects an array
    private finalValues finalData;
   
    public finalValues getFinalData(){
        return finalData;
    }
    /* @Override
    public String toString(){
        return finalData.toString();
    }*/
    @Override
    public String toString(){
        return finalData.getDate() + ": " + finalData.getValue();
    }
    /* @Override
    public String toString(){
        System.out.println("Transaction deficit for Bitcoins");
        for(int i = 0; i < finalData.length; i++){
            System.out.println(finalData[i].toString());
        }
        return "end";
    }*/
}
