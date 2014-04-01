package kaynenl.extratools.tools;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemHoe;

public class ToolFlorianHoe extends ItemHoe {
	public ToolFlorianHoe() {
	super(ExtraToolsMaterials.florianShovel);
	setCreativeTab(ExtraTools.ExtraToolsTab);
	setTextureName(ExtraTools.MODID + ":toolFlorianHoe" );
	setUnlocalizedName(ExtraTools.MODID + ".florianHoe");
	}
}
