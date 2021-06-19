package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class BulgarianFlag implements Flag{
    @Override
    public List<Color> getColors() {
        return Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
    }
}
