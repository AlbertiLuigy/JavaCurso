package ExercicioHeranca2.Entidades;

public class ProdutoImportado extends Produto {

    private double tarifaPersonaizada;

    public ProdutoImportado() {
    super();
    }

    public ProdutoImportado(String nome, double preco, double tarifaPersonaizada) {
        super(nome, preco);
        this.tarifaPersonaizada = tarifaPersonaizada;
    }

    public double getTarifaPersonaizada() {
        return tarifaPersonaizada;
    }

    public void setTarifaPersonaizada(double tarifaPersonaizada) {
        this.tarifaPersonaizada = tarifaPersonaizada;
    }

    @Override
    public String etiquetaPreco() {
        double precoTotal = getPreco() + tarifaPersonaizada;
        return getNome() + " $ " + String.format("%.2f", precoTotal) + " (Tarifa personalizada: $ " + String.format("%.2f", tarifaPersonaizada) + ")";
    }

    public double precoTotal(){
        return getPreco() + tarifaPersonaizada;
    }

    
}
