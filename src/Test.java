/**
 *Student Name : Hasitha Hiran Walpola
 *Student ID: 2015273
 *UOW ID : W1608478
 *
 * @author hasil
 */
public class Test {

    /**
     * This method calculates the heuristic values according to the destination node
     * @param nodes The Array of nodes are passed here
     */
    String metric;

    public Test(String metric){
        this.metric = metric;

    }

    public void printH(Node[][] nodes){

        System.out.println("\n Node H vales according to " + metric +  " distance \n " );
        for(Node[] node : nodes){
            for(int i =0;i<nodes.length;i++) {

                if (node[i].isNotBlocked() == true) {

                    double h = node[i].getH();

                    if (h < 10)
                        System.out.print(" 0" + node[i].getH() + " ");
                    else
                        System.out.print(" " + node[i].getH() + " ");
                }else {
                    System.out.print(" " + "----" + " ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * This method calculates the heuristic values according to the destination node
     * @param nodes The Array of nodes are passed here
     */
    public void printG(Node[][] nodes){

        System.out.println("\n Node G vales \n " );
        for(Node[] node : nodes){
            for(int i =0;i<nodes.length;i++) {

                if (node[i].isNotBlocked() == true) {

                    double g = node[i].getG();

                    if (g < 10)
                        System.out.print(" 0" + g + " ");
                    else
                        System.out.print(" " + g + " ");
                }else {
                    System.out.print(" " + "----" + " ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * This method calculates the heuristic values according to the destination node
     * @param nodes The Array of nodes are passed here
     */
    public void printF(Node[][] nodes){

        System.out.println("\n Node F vales \n " );
        for(Node[] node : nodes){
            for(int i =0;i<nodes.length;i++) {

                if (node[i].isNotBlocked() == true) {

                    double f = node[i].getF();

                    if (f < 10)
                        System.out.print(" 0" + f + " ");
                    else
                        System.out.print(" " + f + " ");
                }else {
                    System.out.print(" " + "----" + " ");
                }
            }
            System.out.println("");
        }
    }

}
