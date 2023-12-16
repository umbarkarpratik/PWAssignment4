public class que4 {
   
        public static void main(String[] args) {
            printPWSKILLS();
        }
    
        static void printPWSKILLS() {
            String[] pattern = {
                "*****  *  *   *  *  *****",
                "*      * *    **   *     ",
                "*      **     * *  *     ",
                "*****  * *    *  * ***** ",
                "*      *  *   *  * *     ",
                "*      *   *  *  * *     ",
                "*****  *    * *  * ***** "
            };
    
            for (String line : pattern) {
                System.out.println(line);
            }
        }
    }
    
            

    
    

