package Concessionaria;
import Builder.MotoBuilder;
import Product.MotoProduct;

public class Concessionaria {

    protected MotoBuilder montadora;

    public Concessionaria (MotoBuilder montadora) {
        this.montadora =  montadora;
    }

    public void construirMoto(){
        montadora.BuildPreco();
        montadora.BuildModelo();
        montadora.BuildDscModelo();
        montadora.BuildAnoDeFabricacao();
        montadora.BuildMontadora();
        montadora.BuildQtdCC();
    }

    public MotoProduct getMoto() {
        return montadora.getMoto();
    }
}