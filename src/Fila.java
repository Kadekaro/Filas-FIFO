public class Fila {

    private NoFila refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(NoFila novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public boolean isEmpty(){
        return refNoEntradaFila != null;
    }

    public NoFila first() {
        if (this.isEmpty()) {
            NoFila primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }
    public NoFila dequeue() {
        if (this.isEmpty()) {
            NoFila primeiroNo = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }
    @Override
    public String toString(){
        StringBuilder stringRetorno = new StringBuilder();
        NoFila noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila !=  null){
            while(true){
                stringRetorno.append("[É o Nó que está na = {").append(noAuxiliar.getObject()).append("} posição da fila] ----->  ");
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno.append("null");
                    break;
                }
            }
        } else {
            stringRetorno = new StringBuilder("null");
        }
        return stringRetorno.toString();
    }
}
