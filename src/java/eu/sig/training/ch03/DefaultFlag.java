package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class DefaultFlag implements Flag{
    @Override
    public List<Color> getColors() {
        return Arrays.asList(Color.GRAY, Color.GRAY, Color.GRAY);
    }
}
