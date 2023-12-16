package AssignPaternProgram;
//Write a program to print triangle using star pattern logic.
public class que2 {
    public static void main(String[] args){
           int n=10;
        for(int i=0;i<=n;i++){
           for(int j=0;j<=n;j++){
                if(i+j >=n/2 && j-i<= n/2  && i<=n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
           }
           System.out.println("");
          
        } 
    }
}
