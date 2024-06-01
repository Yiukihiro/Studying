

public class ElementsList extends Thread {

    Integer i;

    public ElementsList(Integer typed) {
        this.i = typed;
    }

    @Override
    public void run(){
        for (i = i; i <= 10; i++) {
            System.out.println("Элемент номер" + " " + i);
        }
    }





}
