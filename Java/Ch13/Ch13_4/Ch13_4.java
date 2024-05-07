public class Ch13_4{
    public static void main(String args[]){      
        int[] arr={18,29,13,38,15,62};
        int den=5;
        
        try {
            for(int i=0;i<10;i++){
                System.out.print(arr[i]+"/"+den+"="); 
                arr[i]/=den;
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        }
                   
        System.out.println("end of main() method !!");
    }
}
