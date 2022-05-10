package com.company.q5;

public class Q5 {
    public static void main(String[] args) {
        Node<Integer> list1 = new Node<>(80, 
                new Node<>(70, 
                        new Node<>(60, 
                                new Node<>(30, 
                                        new Node<>(50)))));
        Node<Integer> result = what(list1);
        printChain(result);
    }

    private static Node<Integer> what(Node<Integer> lst1) {
        if(lst1.getNext() == null)
            return lst1;
        Node<Integer> lst2 = what(lst1.getNext());
        if (lst1.getValue()< lst2.getValue())
            return lst1;
        return lst2;
    }

    /**
     *
     * @param list - nodes of integers
     * @return - string that represent the whole chain
     */
    public static void printChain(Node<Integer> list) {

        while(list != null){
            System.out.print(list.getValue()+"->");
            list = list.getNext();
        }
        System.out.println();
    }
}
