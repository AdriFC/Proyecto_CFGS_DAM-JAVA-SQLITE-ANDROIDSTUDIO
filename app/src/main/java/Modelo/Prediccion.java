
package Modelo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prediccion implements Serializable {

    @SerializedName("dia")
    @Expose
    private List<Dium> dia = null;

    public List<Dium> getDia() {
        return dia;
    }

    public void setDia(List<Dium> dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Prediccion{" +
                "dia=" + dia +
                '}';
    }
}
