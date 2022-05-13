public class NoFila {

    private Object object;
    private NoFila refNo;

    public NoFila() {
    }

    public NoFila(Object object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoFila getRefNo() {
        return refNo;
    }

    public void setRefNo(NoFila refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoFila{" +
                "object=" + object +
                '}';
    }
}
