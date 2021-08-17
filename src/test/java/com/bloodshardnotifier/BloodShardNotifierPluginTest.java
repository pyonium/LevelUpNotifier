package com.bloodshardnotifier;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BloodShardNotifierPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BloodShardNotifierPlugin.class);
		RuneLite.main(args);
	}
}