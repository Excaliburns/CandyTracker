import POGOProtos.Enums.PokemonFamilyIdOuterClass;
import com.pokegoapi.api.PokemonGo;
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

            Bulbasaur = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BULBASAUR);
            Charmander = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CHARMANDER);
            Caterpie = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CATERPIE);
            Weedle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_WEEDLE);
            Squirtle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SQUIRTLE);
            Pidgey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIDGEY);
            Rattata = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RATTATA);
            Spearow = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SPEAROW);
            Ekans = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EKANS);
            Pikachu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIKACHU);
            Sandshrew = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SANDSHREW);
            NidoFemale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_FEMALE);
            NidoMale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_MALE);
            Clefairy = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CLEFAIRY);
            Vulpix = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VULPIX);
            Jugglypuff = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_JIGGLYPUFF);
            Zubat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ZUBAT);
            Oddish = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ODDISH);
            Paras = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PARAS);
            Venonat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VENONAT);
            Diglett = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DIGLETT);
            Meowth = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MEOWTH);
            Psyduck = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PSYDUCK);
            Mankey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MANKEY);
            Growlithe = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GROWLITHE);
            Poliwag = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_POLIWAG);
            Abra = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ABRA);
            Machop = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MACHOP);
            Bellsprout = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BELLSPROUT);
            Tentacool = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_TENTACOOL);
            Geodude = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GEODUDE);
            Ponyta = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PONYTA);
            Slowpoke = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SLOWPOKE);
            Magnemite = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGNEMITE);
            Doduo = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DODUO);
            Seel = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SEEL);
            Grimer = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GRIMER);
            Shellder = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SHELLDER);
            Gastly = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GASTLY);
            Drowzee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DROWZEE);
            Krabby = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KRABBY);
            Voltorb = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VOLTORB);
            Exeggcute = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EXEGGCUTE);
            Cubone = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CUBONE);
            Koffing = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KOFFING);
            Rhyhorn = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RHYHORN);
            Horsea = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_HORSEA);
            Goldeen = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GOLDEEN);
            Staryu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_STARYU);
            Magikarp = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGIKARP);
            Eevee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EEVEE);
            Omanyte = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_OMANYTE);
            Kabuto = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KABUTO);
            Dratini = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DRATINI);

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

            Bulbasaur = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BULBASAUR);
            Charmander = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CHARMANDER);
            Caterpie = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CATERPIE);
            Weedle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_WEEDLE);
            Squirtle = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SQUIRTLE);
            Pidgey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIDGEY);
            Rattata = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RATTATA);
            Spearow = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SPEAROW);
            Ekans = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EKANS);
            Pikachu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PIKACHU);
            Sandshrew = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SANDSHREW);
            NidoFemale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_FEMALE);
            NidoMale = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_NIDORAN_MALE);
            Clefairy = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CLEFAIRY);
            Vulpix = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VULPIX);
            Jugglypuff = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_JIGGLYPUFF);
            Zubat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ZUBAT);
            Oddish = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ODDISH);
            Paras = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PARAS);
            Venonat = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VENONAT);
            Diglett = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DIGLETT);
            Meowth = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MEOWTH);
            Psyduck = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PSYDUCK);
            Mankey = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MANKEY);
            Growlithe = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GROWLITHE);
            Poliwag = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_POLIWAG);
            Abra = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_ABRA);
            Machop = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MACHOP);
            Bellsprout = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_BELLSPROUT);
            Tentacool = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_TENTACOOL);
            Geodude = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GEODUDE);
            Ponyta = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_PONYTA);
            Slowpoke = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SLOWPOKE);
            Magnemite = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGNEMITE);
            Doduo = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DODUO);
            Seel = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SEEL);
            Grimer = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GRIMER);
            Shellder = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_SHELLDER);
            Gastly = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GASTLY);
            Drowzee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DROWZEE);
            Krabby = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KRABBY);
            Voltorb = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_VOLTORB);
            Exeggcute = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EXEGGCUTE);
            Cubone = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_CUBONE);
            Koffing = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KOFFING);
            Rhyhorn = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_RHYHORN);
            Horsea = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_HORSEA);
            Goldeen = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_GOLDEEN);
            Staryu = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_STARYU);
            Magikarp = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_MAGIKARP);
            Eevee = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_EEVEE);
            Omanyte = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_OMANYTE);
            Kabuto = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_KABUTO);
            Dratini = go.getInventories().getCandyjar().getCandies(PokemonFamilyIdOuterClass.PokemonFamilyId.FAMILY_DRATINI);

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
