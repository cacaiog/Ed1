package AtividadeSenhaBanco.Desenvolvimento;



public class QueueComQtd<T> {

    private QueueNode<T> primeiro;
    private QueueNode<T> ultimo;
    private int qtd;
    private int limite;



    public QueueComQtd(int limite) {
        this.limite = limite;
    }


    public void enQueue(T valor){
        QueueNode<T> novo = new QueueNode(valor);
        if(isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;

        } else {
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        }

    }

    public T deQueue(){
        QueueNode<T> aux = primeiro;
        if( this.primeiro == this.ultimo){
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            
        } else {
            primeiro = primeiro.getProx();
        }
        return aux.getInfo();

    } 

    public T head(){
        return this.primeiro.getInfo();

    }

    public boolean isEmpty(){
        
        return this.primeiro == null;
    }

    public boolean isFull(){
       
        return this.qtd == limite;
    }

    
    
}
