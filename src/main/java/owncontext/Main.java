package owncontext;

import quoters.Quoter;

public class Main {
    public static void main(String[] args) {
       PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
       context.getBean(Quoter.class).sayQuote();
    }
}
