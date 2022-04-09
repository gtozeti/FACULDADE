public class Produto {
    
private String marca;
private String categoria;
private int id;
private double preco;



public Produto(String marca, String categoria, int id, double preco) {
    this.marca = marca;
    this.categoria = categoria;
    this.id = id;
    this.preco = preco;
}

public Produto(){
    
}

public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public double getPreco() {
    return preco;
}
public void setPreco(double preco) {
    this.preco = preco;
}
@Override
public String toString() {
    return "Produto [categoria=" + categoria + ", id=" + id + ", marca=" + marca + ", preco=" + preco + "]";
}



}
