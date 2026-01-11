package com.cargovalue;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("cargovalue")
public interface CargoValueConfig extends Config
{
	/*
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}

	*/
	@ConfigItem(
			keyName = "showGE",
			name = "Show Grand Exchange price",
			description = "Show Grand Exchange price total (GE).",
			position = 1
	)
	default boolean showGE()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showHA",
			name = "Show high alchemy price",
			description = "Show high alchemy price total (HA).",
			position = 2
	)
	default boolean showHA()
	{
		return false;
	}

	@ConfigItem(
			keyName = "showExact",
			name = "Show exact bank value",
			description = "Show exact bank value.",
			position = 3
	)
	default boolean showExact()
	{
		return false;
	}

}
