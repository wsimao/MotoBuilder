package Builder;
import Product.MotoProduct;

public abstract class MotoBuilder {

    protected MotoProduct moto;
    
    public MotoBuilder() {
        moto = new MotoProduct();
    }

    public abstract void BuildPreco();
    public abstract void BuildModelo();
    public abstract void BuildDscModelo();
    public abstract void BuildAnoDeFabricacao();
    public abstract void BuildMontadora();
    public abstract void BuildQtdCC();

    public MotoProduct getMoto() {
        return moto;
    }
    
}
