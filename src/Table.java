import javax.swing.*;
import java.awt.*;

/**
 * Created by Tut on 8/11/2016.
 */
public class Table extends JFrame
{
    JTable table;

    public Table(){
        setLayout(new BorderLayout());

        String[] columnNames = {"POKEMON FAMILY", "CANDIES", "POSSIBLE EVOLUTIONS"};

        Object[][] data = {
                {"Bulbasaur", CountingClass.Bulbasaur, Logic.BulbasaurEvolutions},
                {"Charmander", CountingClass.Charmander, Logic.CharmanderEvolutions},
                {"Squirtle", CountingClass.Squirtle, Logic.SquirtleEvolutions},
                {"Caterpie", CountingClass.Caterpie, Logic.CaterpieEvolutions},
                {"Weedle", CountingClass.Weedle, Logic.WeedleEvolutions},
                {"Pidgey", CountingClass.Pidgey, Logic.PidgeyEvolutions},
                {"Rattata", CountingClass.Rattata, Logic.RattataEvolutions},
                {"Spearow", CountingClass.Spearow, Logic.SpearowEvolutions},
                {"Ekans", CountingClass.Ekans, Logic.EkansEvolutions},
                {"Pikachu", CountingClass.Pikachu, Logic.PikachuEvolutions},
                {"Sandshrew", CountingClass.Sandshrew, Logic.SandshrewEvolutions},
                {"Nidoran♀", CountingClass.NidoFemale, Logic.NidofEvolutions},
                {"Nidoran♂", CountingClass.NidoMale, Logic.NidomEvolutions},
                {"Clefairy", CountingClass.Clefairy, Logic.ClefairyEvolutions},
                {"Vulpix", CountingClass.Vulpix, Logic.VulpixEvolutions},
                {"Jigglypuff", CountingClass.Jugglypuff, Logic.JugglypuffEvolutions},
                {"Zubat", CountingClass.Zubat, Logic.ZubatEvolutions},
                {"Oddish", CountingClass.Oddish, Logic.OddishEvolutions},
                {"Paras", CountingClass.Paras, Logic.ParasEvolutions},
                {"Venonat", CountingClass.Venonat, Logic.VenonatEvolutions},
                {"Diglett", CountingClass.Diglett, Logic.DiglettEvolutions},
                {"Meowth", CountingClass.Meowth, Logic.MeowthEvolutions},
                {"Psyduck", CountingClass.Psyduck, Logic.PsyduckEvolutions},
                {"Mankey", CountingClass.Mankey, Logic.MankeyEvolutions},
                {"Growlithe", CountingClass.Growlithe, Logic.GrowlitheEvolutions},
                {"Poliwag", CountingClass.Poliwag, Logic.PoliwagEvolutions},
                {"Abra", CountingClass.Abra, Logic.AbraEvolutions},
                {"Machop", CountingClass.Machop, Logic.MachopEvolutions},
                {"Bellsprout", CountingClass.Bellsprout, Logic.BellsproutEvolutions},
                {"Tentacool", CountingClass.Tentacool, Logic.TentacoolEvolutions},
                {"Geodude", CountingClass.Geodude, Logic.GeodudeEvolutions},
                {"Ponyta", CountingClass.Ponyta, Logic.PonytaEvolutions},
                {"Slowpoke", CountingClass.Slowpoke, Logic.SlowpokeEvolutions},
                {"Magnemite", CountingClass.Magnemite, Logic.MagnemiteEvolutions},
                {"Doduo", CountingClass.Doduo, Logic.DoduoEvolutions},
                {"Seel", CountingClass.Seel, Logic.SeelEvolutions},
                {"Grimer", CountingClass.Grimer, Logic.GrimerEvolutions},
                {"Shellder", CountingClass.Shellder, Logic.ShellderEvolutions},
                {"Gastly", CountingClass.Gastly, Logic.GastlyEvolutions},
                {"Drowzee", CountingClass.Drowzee, Logic.DrowzeeEvolutions},
                {"Krabby", CountingClass.Krabby, Logic.KrabbyEvolutions},
                {"Voltorb", CountingClass.Voltorb, Logic.VoltorbEvolutions},
                {"Exeggcute", CountingClass.Exeggcute, Logic.ExeggcuteEvolutions},
                {"Cubone", CountingClass.Cubone, Logic.CuboneEvolutions},
                {"Koffing", CountingClass.Koffing, Logic.KoffingEvolutions},
                {"Rhyhorn", CountingClass.Rhyhorn, Logic.RyhornEvolutions},
                {"Horsea", CountingClass.Horsea, Logic.HorseaEvolutions},
                {"Goldeen", CountingClass.Goldeen, Logic.GoldeenEvolutions},
                {"Staryu", CountingClass.Staryu, Logic.StaryuEvolutions},
                {"Magikarp", CountingClass.Magikarp, Logic.MagikarpEvolutions},
                {"Eevee", CountingClass.Eevee, Logic.EveeEvolutions},
                {"Omanyte", CountingClass.Omanyte, Logic.OmanyteEvolutions},
                {"Kabuto", CountingClass.Kabuto, Logic.KabutoEvolutions},
                {"Dratini", CountingClass.Dratini, Logic.DratiniEvolutions},
        };

        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 400));
        table.setFillsViewportHeight(true);

        JLabel label = new JLabel("<html><body>This program lists how many times you can evolve your Pokemon and calculates your total candies for all of them.<br>" +
                "Currently, you can evolve all Pokemon " + Logic.TotalEvolutions() + " times.<br>" +
                " This equates to a total of " + ( Logic.TotalEvolutions()  * 500 ) + " XP. This does not include XP from new Pokedex entries.<br>" +
                " If you use a lucky egg, it will equate to a total of " + ( Logic.TotalEvolutions() * 1000 ) + " XP. This also does not include XP from new Pokedex entries.<br>" +
                "</body></html>", JLabel.CENTER);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        add(label, BorderLayout.PAGE_START);
    }
}
