package net.mcreator.noiframes.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class NoIFrameConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> IFRAMELENGTH;
	static {
		BUILDER.push("I Frames Length in Ticks (Default:0)");
		IFRAMELENGTH = BUILDER.define("I Frame Length", (double) 0);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
