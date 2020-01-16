package mod.slamach.examplemod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
    TODO: Set item/block ID somewhere
    TODO: Get nice BlockItem properties
    TODO: Get nice ExamokeBlock texture properties
*/

@Mod(ExampleMod.MODID)
public class ExampleMod {
    public static final String MODID = "examplemod";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public ExampleMod() {
        LOGGER.debug("Hello from 'Example Mod' developer!");
    }
}
