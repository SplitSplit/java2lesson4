package ru.ponomaryov.se.linkiterator;

public class LinkIteratorApp {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);
        itr.insertBefore("Alexandr", 22);
        itr.insertBefore("Yuri", 29);

        list.display();

        itr.reset();

        while(!itr.atEnd()) {
            System.out.println(itr.getCurrent().name);
            itr.nextLink();
        }
        System.out.println(itr.getCurrent().name);

        itr.insertAfter("Nikolay", 18);

        itr.reset();

        while(!itr.atEnd()) {
            if(itr.getCurrent().name.equals("Sergey")) {
                itr.deleteCurrent();
                break;
            }
            itr.nextLink();
        }

        list.display();

    }

}

