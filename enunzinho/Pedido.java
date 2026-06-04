package enunzinho;

import java.util.Date;

public class Pedido {

    private int id;
    private Date data;
    private en status;

    public Pedido(){
    }

    public Pedido(int id, Date data, en status){
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public int getId(){
        return id;
    }

    public Date getData(){
        return data;
    }

    public void setData(Date data){
        this.data = data;
    }

    public en getStatus(){
        return status;
    }

    public void setStatus(en status){
        this.status = status;
    }


    public String toString(){
        return "Pedido: " + id + "\nData: " + data + "\nStatus: " + status;
    }

    
}
