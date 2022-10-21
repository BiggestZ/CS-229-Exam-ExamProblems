public class test {
    public static void main (String []args){
        DLinkedList test = new DLinkedList();
        //Exam1 dud = new Exam1();
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.insert(4);
        test.insert(5);
        test.insert(6);
        //test.insert(7);

        DLinkedList test2 = new DLinkedList();
        test2.insert(2);
        //test2.insert(4);
        test2.insert(6);
        test2.insert(8);

        DLinkedList test3 = new DLinkedList();
        test3.insert(2);
        test3.insert(7);
        test3.insert(9);
        test3.insert(8);
        test3.insert(10);

        //System.out.println(Exam1.hasTwoCommon(test, test2));

        Exam1.deleteMiddle(test);
     
        System.out.println(test);

        //Exam1.nextGreaterNodes(test3);
        
        //Exam1.moveToLast(test, 2);
        //System.out.println(test);

        /*System.out.println("APPLE");
        System.out.println(test3); */

        //System.out.println(Exam1.nextGreaterNodes(test));

    }
}
