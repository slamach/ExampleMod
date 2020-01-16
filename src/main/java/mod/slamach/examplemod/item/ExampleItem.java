package mod.slamach.examplemod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ExampleItem extends Item {
    public ExampleItem() {
        super(new Properties()
                .maxStackSize(16)
                .group(ItemGroup.MISC));
    }
}
