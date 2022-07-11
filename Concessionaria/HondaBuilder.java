package Concessionaria;
import Builder.MotoBuilder;
import Concessionaria.HondaBuilder;

public class HondaBuilder extends MotoBuilder {

    @Override
    public void BuildPreco() {
        moto.preco = 24000;
        
    }

    @Override
    public void BuildModelo() {
        moto.modelo = "XRE 300";
        
    }

    @Override
    public void BuildDscModelo() {
        moto.dscModelo = "A XRE 300 é uma motocicleta on-off-road fabricada pela Honda";
        
    }

    @Override
    public void BuildAnoDeFabricacao() {
        moto.anoDeFabricacao = 2019;
        
    }

    @Override
    public void BuildMontadora() {
        moto.montadora = "HONDA";
        
    }

    @Override
    public void BuildQtdCC() {
        moto.qtdCC = 300;
        
    }    
}
