// Ex13_8   
public class Ch13_8{
    public static void main(String args[]){
        int[] a={64,15,47,23,96,38};   
        int[] d={3,0,7,9,14,0};      
        int sum=0;
        for(int i=0;i<=6;i++) {
            try {
                sum+=a[i]/d[i];  
            }
            catch (ArithmeticException e) {
                System.out.println("原因" + e);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("原因" + e);
            }
        }             
            
        System.out.println("sum="+sum);         
    }
}  
