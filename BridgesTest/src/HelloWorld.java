
import bridges.connect.Bridges;
import bridges.base.SLelement;
public class HelloWorld {

     public static void main(String[] args) throws Exception{

             //create the Bridges object and set title for the project

         Bridges bridges = new Bridges(0, "ewegner22", "732737780094");

         bridges.setTitle("Hello World");

             //create two singly-linked elements
         SLelement < String > sle0 = new SLelement < String > ("Hello", "");
         SLelement < String > sle1 = new SLelement < String >("World", "");

             // create a singly-linked list
             // by adding sle1 as sle0's next element
         sle0.setNext(sle1);

             //edit some visual properties of the two elements
         sle0.getVisualizer().setColor("black");
         sle0.getVisualizer().setOpacity(0.5f);
         sle1.getVisualizer().setColor("green");

             //pass the first element of the list
        bridges.setDataStructure(sle0);

             // visualize the list
         bridges.visualize();

        }
    }