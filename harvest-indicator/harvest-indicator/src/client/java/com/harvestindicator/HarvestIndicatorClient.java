package com.harvestindicator;

import net.fabricmc.api.ClientModInitializer;

public class HarvestIndicatorClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HarvestIndicatorMod.LOGGER.info("[HarvestIndicator] Client initialized!");
        HarvestIconRenderer.register();
    }
}
