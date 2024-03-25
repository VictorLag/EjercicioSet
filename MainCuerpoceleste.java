import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainCuerpoceleste {


    public static HashMap<String,CuerpoCeleste> sistemaSolar= new HashMap<>();
    public static HashSet<CuerpoCeleste> conjuntoPlanetas = new HashSet<>();

    public static void main(String[] args) {

    CuerpoCeleste mercurio= new CuerpoCeleste("Mercurio",88, CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(mercurio);
        sistemaSolar.put("Me",mercurio);

    CuerpoCeleste venus= new CuerpoCeleste("Venus",255,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(venus);
        sistemaSolar.put("Ve",venus);

    CuerpoCeleste tierra= new CuerpoCeleste("La Tierra", 365,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(tierra);
        sistemaSolar.put("Ti",tierra);

    CuerpoCeleste marte= new CuerpoCeleste("Marte",687,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(marte);
        sistemaSolar.put("Ma",marte);

    CuerpoCeleste jupiter= new CuerpoCeleste("Jupiter",4332,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(jupiter);
        sistemaSolar.put("Ju",jupiter);

    CuerpoCeleste saturno= new CuerpoCeleste("Saturno",10759,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(saturno);
        sistemaSolar.put("Sa",saturno);

    CuerpoCeleste urano= new CuerpoCeleste("Urano",30660,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(urano);
        sistemaSolar.put("Ur",urano);

    CuerpoCeleste neptuno= new CuerpoCeleste("Neptuno",165,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(neptuno);
        sistemaSolar.put("Ne",neptuno);

    CuerpoCeleste pluton= new CuerpoCeleste("Pluton",248,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        conjuntoPlanetas.add(pluton);
        sistemaSolar.put("Pl",pluton);

    CuerpoCeleste luna= new CuerpoCeleste("Luna", 27, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        conjuntoPlanetas.add(luna);
        sistemaSolar.put("Lu",luna);

    CuerpoCeleste deimos= new CuerpoCeleste("Deimos", 1.8, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        sistemaSolar.put("De",deimos);
        marte.addSatelite(deimos);

    CuerpoCeleste phobos= new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        sistemaSolar.put("Ph",phobos);
        marte.addSatelite(phobos);

    CuerpoCeleste io= new CuerpoCeleste("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        sistemaSolar.put("Io",io);
        jupiter.addSatelite(io);

    CuerpoCeleste europa= new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        sistemaSolar.put("Eu",europa);
        jupiter.addSatelite(europa);

    CuerpoCeleste ganymede= new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        sistemaSolar.put("Ga",ganymede);
        jupiter.addSatelite(ganymede);

    CuerpoCeleste callisto= new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.Luna);
        sistemaSolar.put("Ca",callisto);
        jupiter.addSatelite(callisto);


        for (CuerpoCeleste cuerpoCeleste: conjuntoPlanetas) {     //Imprimir planetas de conjunto

            System.out.println(cuerpoCeleste.getNombre());

        }

        System.out.println("Satelites de "+sistemaSolar.get("Ma").getNombre()+": "+ sistemaSolar.get("Ma").getSatelites()); //Marte y sus lunas


        HashSet<CuerpoCeleste> lunasSet =new HashSet<>();

        for (CuerpoCeleste cuerpCel: conjuntoPlanetas) { // union satelites

            lunasSet.addAll(cuerpCel.getSatelites());
        }

        System.out.println(lunasSet); //Todos los satelites de la coleccion


        CuerpoCeleste plut0n= new CuerpoCeleste("Pluton",884,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        System.out.println( conjuntoPlanetas.add(plut0n));
        sistemaSolar.put("Pl",plut0n);

        CuerpoCeleste plutonEnano= new CuerpoCeleste("Pluton",884,CuerpoCeleste.TipoCuerpoCeleste.Planeta_Enano);
        System.out.println( conjuntoPlanetas.add(plutonEnano));
        sistemaSolar.put("Pl",plutonEnano);


        HashSet<CuerpoCeleste> planetasnuevos =new HashSet<>();

        CuerpoCeleste murcia = new CuerpoCeleste("Murcia", 177, CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        planetasnuevos.add(murcia);

        CuerpoCeleste marte2= new CuerpoCeleste("Marte",687,CuerpoCeleste.TipoCuerpoCeleste.Planeta);
        planetasnuevos.add(marte2);



        System.out.println( planetasnuevos.retainAll(conjuntoPlanetas));
        System.out.println(planetasnuevos);

       // Solo devuelve Marte por que es el unico planeta que existe en las dos


        planetasnuevos.add(murcia); //Añado de nuevo murcia

        System.out.println(planetasnuevos.removeAll(conjuntoPlanetas));
        System.out.println(planetasnuevos);
       // Solo devuelve Murcia por que solo existe en planetasnuevos



    }
}
