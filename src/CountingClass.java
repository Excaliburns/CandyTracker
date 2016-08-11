import POGOProtos.Enums.PokemonFamilyIdOuterClass;
import com.pokegoapi.api.PokemonGo;
import com.pokegoapi.auth.GoogleAuthJson;
import com.pokegoapi.auth.GoogleUserCredentialProvider;
import com.pokegoapi.auth.PtcCredentialProvider;
import com.pokegoapi.exceptions.LoginFailedException;
import com.pokegoapi.exceptions.RemoteServerException;
import okhttp3.OkHttpClient;

/**
 * Created by Tut on 8/8/2016.
 */

public class CountingClass
{
    static int Bulbasaur = 0;
    static int Charmander = 0;
    static int Squirtle = 0;
    static int Caterpie = 0;
    static int Weedle = 0;
    static int Pidgey = 0;
    static int Rattata = 0;
    static int Spearow = 0;
    static int Ekans = 0;
    static int Pikachu = 0;
    static int Sandshrew = 0;
    static int NidoFemale = 0;
    static int NidoMale = 0;
    static int Clefairy = 0;
    static int Vulpix = 0;
    static int Jugglypuff = 0;
    static int Zubat = 0;
    static int Oddish = 0;
    static int Paras = 0;
    static int Venonat = 0;
    static int Diglett = 0;
    static int Meowth = 0;
    static int Psyduck = 0;
    static int Mankey = 0;
    static int Growlithe = 0;
    static int Poliwag = 0;
    static int Abra = 0;
    static int Machop = 0;
    static int Bellsprout = 0;
    static int Tentacool = 0;
    static int Geodude = 0;
    static int Ponyta = 0;
    static int Slowpoke = 0;
    static int Magnemite = 0;
    static int Doduo = 0;
    static int Seel = 0;
    static int Grimer = 0;
    static int Shellder = 0;
    static int Gastly = 0;
    static int Drowzee = 0;
    static int Krabby = 0;
    static int Voltorb = 0;
    static int Exeggcute = 0;
    static int Cubone = 0;
    static int Koffing = 0;
    static int Rhyhorn = 0;
    static int Horsea = 0;
    static int Goldeen = 0;
    static int Staryu = 0;
    static int Magikarp = 0;
    static int Eevee = 0;
    static int Omanyte = 0;
    static int Kabuto = 0;
    static int Dratini = 0;

    public static void countMonsGoogle(GoogleUserCredentialProvider provider, OkHttpClient httpClient)
    {
        try
        {
            //System.out.println("FUCKED2");
            PokemonGo go = new PokemonGo(provider, httpClient);
            //System.out.println("FUCKED4");

            CountingClass.Bulbasaur = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BULBASAUR);
            CountingClass.Charmander = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CHARMANDER);
            CountingClass.Caterpie = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CATERPIE);
            CountingClass.Weedle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_WEEDLE);
            CountingClass.Squirtle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SQUIRTLE);
            CountingClass.Pidgey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIDGEY);
            CountingClass.Rattata = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RATTATA);
            CountingClass.Spearow = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SPEAROW);
            CountingClass.Ekans = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EKANS);
            CountingClass.Pikachu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIKACHU);
            CountingClass.Sandshrew = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SANDSHREW);
            CountingClass.NidoFemale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_FEMALE);
            CountingClass.NidoMale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_MALE);
            CountingClass.Clefairy = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CLEFAIRY);
            CountingClass.Vulpix = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VULPIX);
            CountingClass.Jugglypuff = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_JIGGLYPUFF);
            CountingClass.Zubat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ZUBAT);
            CountingClass.Oddish = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ODDISH);
            CountingClass.Paras = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PARAS);
            CountingClass.Venonat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VENONAT);
            CountingClass.Diglett = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DIGLETT);
            CountingClass.Meowth = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MEOWTH);
            CountingClass.Psyduck = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PSYDUCK);
            CountingClass.Mankey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MANKEY);
            CountingClass.Growlithe = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GROWLITHE);
            CountingClass.Poliwag = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_POLIWAG);
            CountingClass.Abra = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ABRA);
            CountingClass.Machop = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MACHOP);
            CountingClass.Bellsprout = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BELLSPROUT);
            CountingClass.Tentacool = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_TENTACOOL);
            CountingClass.Geodude = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GEODUDE);
            CountingClass.Ponyta = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PONYTA);
            CountingClass.Slowpoke = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SLOWPOKE);
            CountingClass.Magnemite = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGNEMITE);
            CountingClass.Doduo = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DODUO);
            CountingClass.Seel = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SEEL);
            CountingClass.Grimer = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GRIMER);
            CountingClass.Shellder = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SHELLDER);
            CountingClass.Gastly = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GASTLY);
            CountingClass.Drowzee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DROWZEE);
            CountingClass.Krabby = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KRABBY);
            CountingClass.Voltorb = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VOLTORB);
            CountingClass.Exeggcute = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EXEGGCUTE);
            CountingClass.Cubone = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CUBONE);
            CountingClass.Koffing = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KOFFING);
            CountingClass.Rhyhorn = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RHYHORN);
            CountingClass.Horsea = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_HORSEA);
            CountingClass.Goldeen = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GOLDEEN);
            CountingClass.Staryu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_STARYU);
            CountingClass.Magikarp = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGIKARP);
            CountingClass.Eevee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EEVEE);
            CountingClass.Omanyte = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_OMANYTE);
            CountingClass.Kabuto = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KABUTO);
            CountingClass.Dratini = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DRATINI);

        } catch(LoginFailedException e)
        {
            System.out.println("This should never be reached! Something is wrong!");
            e.printStackTrace();
        } catch(RemoteServerException e)
        {
            System.out.println("This should never be reached! Something is wrong!");
            e.printStackTrace();
        }

    }
    public static void countMonsPTC(OkHttpClient httpClient, String PokeTrainerUser, String PokeTrainerPass)
    {

        try
        {
            PokemonGo go = new PokemonGo(new PtcCredentialProvider(httpClient, PokeTrainerUser, PokeTrainerPass), httpClient);

            CountingClass.Bulbasaur = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BULBASAUR);
            CountingClass.Charmander = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CHARMANDER);
            CountingClass.Caterpie = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CATERPIE);
            CountingClass.Weedle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_WEEDLE);
            CountingClass.Squirtle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SQUIRTLE);
            CountingClass.Pidgey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIDGEY);
            CountingClass.Rattata = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RATTATA);
            CountingClass.Spearow = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SPEAROW);
            CountingClass.Ekans = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EKANS);
            CountingClass.Pikachu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIKACHU);
            CountingClass.Sandshrew = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SANDSHREW);
            CountingClass.NidoFemale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_FEMALE);
            CountingClass.NidoMale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_MALE);
            CountingClass.Clefairy = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CLEFAIRY);
            CountingClass.Vulpix = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VULPIX);
            CountingClass.Jugglypuff = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_JIGGLYPUFF);
            CountingClass.Zubat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ZUBAT);
            CountingClass.Oddish = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ODDISH);
            CountingClass.Paras = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PARAS);
            CountingClass.Venonat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VENONAT);
            CountingClass.Diglett = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DIGLETT);
            CountingClass.Meowth = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MEOWTH);
            CountingClass.Psyduck = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PSYDUCK);
            CountingClass.Mankey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MANKEY);
            CountingClass.Growlithe = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GROWLITHE);
            CountingClass.Poliwag = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_POLIWAG);
            CountingClass.Abra = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ABRA);
            CountingClass.Machop = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MACHOP);
            CountingClass.Bellsprout = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BELLSPROUT);
            CountingClass.Tentacool = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_TENTACOOL);
            CountingClass.Geodude = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GEODUDE);
            CountingClass.Ponyta = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PONYTA);
            CountingClass.Slowpoke = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SLOWPOKE);
            CountingClass.Magnemite = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGNEMITE);
            CountingClass.Doduo = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DODUO);
            CountingClass.Seel = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SEEL);
            CountingClass.Grimer = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GRIMER);
            CountingClass.Shellder = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SHELLDER);
            CountingClass.Gastly = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GASTLY);
            CountingClass.Drowzee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DROWZEE);
            CountingClass.Krabby = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KRABBY);
            CountingClass.Voltorb = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VOLTORB);
            CountingClass.Exeggcute = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EXEGGCUTE);
            CountingClass.Cubone = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CUBONE);
            CountingClass.Koffing = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KOFFING);
            CountingClass.Rhyhorn = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RHYHORN);
            CountingClass.Horsea = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_HORSEA);
            CountingClass.Goldeen = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GOLDEEN);
            CountingClass.Staryu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_STARYU);
            CountingClass.Magikarp = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGIKARP);
            CountingClass.Eevee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EEVEE);
            CountingClass.Omanyte = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_OMANYTE);
            CountingClass.Kabuto = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KABUTO);
            CountingClass.Dratini = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DRATINI);

        } catch(LoginFailedException e)
        {
            System.out.println("Login failed in PTC Auth CountingClass");
            e.printStackTrace();
        } catch(RemoteServerException e)
        {
            System.out.println("Server returned exception in PTC Auth CountingClass");
            e.printStackTrace();
        }

    }
}
