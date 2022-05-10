package com.company.q7;

public class Run_Q7 {
    public static void main(String[] args) {
        PairOfNums pair1 = new PairOfNums(103, 201);
        System.out.println(pair1.sumPrime());
        System.out.println(pair1.getNum1());

        Node<PairOfNums> lst = new Node<PairOfNums>(new PairOfNums(21, 3001),
                new Node<PairOfNums>(new PairOfNums(211,341),
                        new Node<PairOfNums>(new PairOfNums(55,781),
                                new Node<PairOfNums>(new PairOfNums(8,401)))));

        Stack<PairOfNums> resultStk = builsStk(lst);
        printStack(resultStk);
    }

    public static Stack<PairOfNums> builsStk(Node<PairOfNums> lst) {
        Stack<PairOfNums> stk = new Stack<>();
        Node<PairOfNums> tmp = lst;
        while(tmp != null){
            if(tmp.getValue().sumPrime())
                stk.push(tmp.getValue());
            tmp = tmp.getNext();
        }
        return stk;
    }

    public static void printStack(Stack<PairOfNums> s){
        Stack<PairOfNums> tmpS = new Stack<>();
        while (!s.isEmpty()){
            PairOfNums p = s.pop();
            System.out.println(p.getNum1() +" "+ p.getNum2());
            tmpS.push(p);
        }
        while (!tmpS.isEmpty())
            s.push(tmpS.pop());
    }
}
