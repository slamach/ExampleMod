package mod.slamach.examplemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class ExampleBlock extends Block {
    public static final String BLOCKID = "exampleblock";

    public ExampleBlock() {
        super(Properties.create(Material.ROCK)
            .sound(SoundType.STONE)
            .hardnessAndResistance(3.0F, 3.0F)
        );
    }
}
