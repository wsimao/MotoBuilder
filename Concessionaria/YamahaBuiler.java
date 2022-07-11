package Concessionaria;
import Builder.MotoBuilder;
import Concessionaria.YamahaBuiler;

public class YamahaBuiler extends MotoBuilder {

    @Override
    public void BuildPreco() {
        moto.preco = 31000;
        
    }

    @Override
    public void BuildModelo() {
        moto.modelo = "XT 660";
        
    }

    @Override
    public void BuildDscModelo() {
        moto.dscModelo = "O Yamaha XT660 é um motociclo de dupla finalidade, ligado / desligado, lançado pela Yamaha Motors como um substituto para o XT600";
        
    }

    @Override
    public void BuildAnoDeFabricacao() {
        moto.anoDeFabricacao = 2022;
        
    }

    @Override
    public void BuildMontadora() {
        moto.montadora = "YAMAHA";
        
    }

    @Override
    public void BuildQtdCC() {
        moto.qtdCC = 660;
        
    }
    
}
