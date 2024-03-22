public class Planeta extends CuerpoCeleste{


    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);
        tipoCuerpo=TipoCuerpoCeleste.Planeta;

        new CuerpoCeleste(nombre, periodoOrbital, tipoCuerpo);

    }

    @Override
    public boolean addSatelite(CuerpoCeleste cuerpoCeleste) {
        if (cuerpoCeleste.getTipoCuerpo()==TipoCuerpoCeleste.Luna){

        return super.addSatelite(cuerpoCeleste);

        }
        return false;
    }
}
