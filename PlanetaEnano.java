public class PlanetaEnano extends CuerpoCeleste{
    public PlanetaEnano(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);

        tipoCuerpo=TipoCuerpoCeleste.Planeta_Enano;
        new CuerpoCeleste(nombre, periodoOrbital, tipoCuerpo);

    }
}
