public class Luna extends CuerpoCeleste{
    public Luna(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);

        tipoCuerpo=TipoCuerpoCeleste.Luna;

        new CuerpoCeleste(nombre, periodoOrbital, tipoCuerpo);
    }
}
