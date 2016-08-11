import com.pokegoapi.api.PokemonGo;
import com.pokegoapi.auth.GoogleUserCredentialProvider;
import com.pokegoapi.auth.PtcCredentialProvider;
import com.pokegoapi.exceptions.LoginFailedException;
import com.pokegoapi.exceptions.RemoteServerException;
import okhttp3.OkHttpClient;

import javax.swing.*;
import java.io.Console;


public class Main
{
    private static boolean noGoog = true;

    public static void main(String[] args)
    {

        OkHttpClient httpClient = new OkHttpClient();

        String PokeTrainerUser;
        String PokeTrainerPass;
        String GoogleAuthUser;

        Console console = System.console();

        if(console == null)
        {
            System.out.println("Console not detected! Something is wrong!");
            System.exit(0);
        }
        else
        {
            System.out.println("Enter PTC username (If using Google Auth enter 0) : ");
            PokeTrainerUser = console.readLine();
            if(PokeTrainerUser.equals("0"))
            {
                try
                {
                    GoogleUserCredentialProvider provider = new GoogleUserCredentialProvider(httpClient);
                    System.out.println("Go to " + GoogleUserCredentialProvider.LOGIN_URL + " For auth code.");
                    System.out.println("Enter auth code :");

                    GoogleAuthUser = console.readLine();

                    provider.login(GoogleAuthUser);

                    //System.out.println("FUCKED1");
                    CountingClass.countMonsGoogle(provider, httpClient);
                    noGoog = false;
                    //System.out.println("FUCKED3");

                } catch(LoginFailedException e)
                {
                    System.out.println("Login Failed in Google Auth Main");
                    e.printStackTrace();
                } catch(RemoteServerException e)
                {
                    System.out.println("Server returned exception in Google Auth Main");
                    e.printStackTrace();
                }
            }
            //System.out.println("FUCKED7");
            if(noGoog)
            {
                System.out.println("Enter password:");
                char[] password = console.readPassword();
                PokeTrainerPass = String.valueOf(password);


                try
                {
                    PokemonGo go = new PokemonGo(new PtcCredentialProvider(httpClient, PokeTrainerUser, PokeTrainerPass), httpClient);
                    CountingClass.countMonsPTC(httpClient, PokeTrainerUser, PokeTrainerPass);

                } catch(LoginFailedException e)
                {
                    e.printStackTrace();
                } catch(RemoteServerException e)
                {
                    e.printStackTrace();
                }
            }
        }
        //System.out.println("FUCKED5");

        /*
        String m = "oh boy I love memes";
        String me = "meme too";
        String mei = "you should post this to me_irl";
        String meir = "but this is a string in a Java IDE";
        String meirl = "don't worry they'll upvote anything";
        */

        Table gui = new Table();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(720, 480);
        gui.setVisible(true);
        gui.setTitle("PokeGo Candy Calculator");
        System.out.println("FUCKED6");
    }
}
