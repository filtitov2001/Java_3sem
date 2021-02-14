package Lab23;

import java.util.ArrayList;
import java.util.Arrays;

public class Convertation {
    public <Array> ArrayList toList(Array[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
