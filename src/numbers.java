class numbers {
    String number;
    numbers(String value){//constructor eke parameter eka object eke argument ekata galapenna hadanava
        number= value;//number ekai value ekai dekam string nisa asign karanna puluvn una
        System.out.println("number is "+number);// number=value nis parameter eke value variable eka call una eka nisa object eke value ek print venva
    }
    public static void main(String[] args) {
        numbers num=new numbers("1");// object eke parameter ekata galapena type ekaka argument value ekak denva

    }
}
