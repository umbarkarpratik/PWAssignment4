//write a program to print alphabets a,b,c,d,e,f,g,h using pattern programming logic.
package AssignPaternProgram;
class que1{
    
    public static void main(String[] args){
       int n=8;
        for(int i=0;i<n;i++){
           char alph='A';
           

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<n-i;k++){
                 System.out.print(alph + " ");
                 alph++;

                 
            }
            System.out.println();
        }
    }
}