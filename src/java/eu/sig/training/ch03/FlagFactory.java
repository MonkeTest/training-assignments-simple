package eu.sig.training.ch03;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    private static final Map<Nationality, Flag> FLAGS = new HashMap<>();
    static {
        FLAGS.put(Nationality.BELGIAN, new BelgianFlag());
        FLAGS.put(Nationality.BULGARIAN, new BulgarianFlag());
        FLAGS.put(Nationality.DUTCH, new DutchFlag());
        FLAGS.put(Nationality.FRENCH, new FrenchFlag());
        FLAGS.put(Nationality.GERMAN, new GermanFlag());
        FLAGS.put(Nationality.HUNGARIAN, new HungarianFlag());
        FLAGS.put(Nationality.IRELAND, new IrishFlag());
        FLAGS.put(Nationality.ITALIAN, new ItalianFlag());
        FLAGS.put(Nationality.ROMANIA, new RomanianFlag());
        FLAGS.put(Nationality.RUSSIA, new RussianFlag());
    }

    public List<Color> getFlagColors(Nationality nationality) {
        Flag flag = FLAGS.get(nationality);
        if (flag == null) {
            flag = new DefaultFlag();
        }
        return flag.getColors();
    }
}