package Queue.Desenvolvimento;

public class Queue<T> {

    private QueueNode<T> inicio;
    private QueueNode<T> fim;



public void enQueue (T valor){

    QueueNode<T> novo = new QueueNode<>(valor);
    if (isEmpty()){
        this.inicio = novo;
        this.fim = novo;
    } else {
        this.fim.setProx(novo);
        fim = novo;
    }

}

public T deQueue() {
    QueueNode <T> aux = inicio;
    if(inicio == fim){
        inicio = null;
        fim = null;
    } else {
        inicio = inicio.getProx();
    }
    return aux.getInfo();

}

public T head() {

    return inicio.getInfo();

}

public boolean isEmpty() {
    return inicio == null;
}

public boolean isFull( ) {
    return false;
}







    








}