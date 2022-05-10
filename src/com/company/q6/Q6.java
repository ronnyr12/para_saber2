package com.company.q6;

public class Q6 {
    public static void main(String[] args) {
        Node<Character> list1 = new Node<>('A',
                new Node<>('B',
                        new Node<>('C',
                                new Node<>('B',
                                        new Node<>('A')))));
        Node<Character> list2 = new Node<>('Z',
                new Node<>('O',
                        new Node<>('O',
                                new Node<>('Z'))));
        printChain(list1);
        System.out.println(charInpos(list1, countList(list1)));
        System.out.println(polyCharList(list2));
        printChain(list1);
    }


    /**
     * q6-solution
     * @param list1
     * @return
     */
    private static boolean polyCharList(Node<Character> list1) {
        boolean isPoli = true;
        Node<Character> tmp = list1;
        int size = countList(list1);
        for (int i = 1, j=size; i < j; i++, j--) {
            char left = charInpos(tmp, i);
            char right = charInpos(tmp, j);
            if(left != right)
                isPoli = false;
        }
        return isPoli;
    }

    /**
     *
     * @param lst
     * @param pos
     * @return
     */
    private static char charInpos(Node<Character>lst, int pos){
        for (int i = 1; i <pos; i++) {
            lst = lst.getNext();
        }
        if(lst!=null)
            return lst.getValue();
        return ' ';
    }

    /**
     *
     * @param list1
     * @return
     */
    private static int countList(Node<Character> list1) {
        Node<Character> tmp = list1;
        int count = 0;
        while (tmp != null){
            count++;
            tmp = tmp.getNext();
        }
        return  count;
    }

    public static void printChain(Node<Character> list) {

        while(list != null){
            System.out.print(list.getValue()+"->");
            list = list.getNext();
        }
        System.out.println();
    }
}
