import java.util.HashMap;
import java.util.Map;

public class PetMap {//this method creates a singleton ** insuring we are always accessing the same instance of the Map

    private static final PetMap instance = new PetMap();

    public PetMap() {
        Map<Integer, Pet> petMap = new HashMap<Integer, Pet>();
        this.referenceData = (HashMap<Integer, Pet>) petMap;
    }

    public HashMap<Integer, Pet> referenceData;

    public static PetMap getInstance() {
        return instance;
    }
}
