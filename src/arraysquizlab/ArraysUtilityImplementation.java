/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquizlab;

/**
 *
 * @author ektasharma
 */
public class ArraysUtilityImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double avg = 0;
       double[] mylist = new double[10];
       ArrayUtility arrayutility = new ArrayUtility();
        arrayutility.fillArray(mylist);
        arrayutility.getAverage(mylist);
        
        arrayutility.getAboveAverage(mylist,avg );
        arrayutility.printArray(mylist);

    }
    
}
