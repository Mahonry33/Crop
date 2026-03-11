package com.harvestindicator;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HarvestIndicatorMod implements ModInitializer {

    public static final String MOD_ID = "harvestindicator";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[HarvestIndicator] Mod initialized!");
    }
}
