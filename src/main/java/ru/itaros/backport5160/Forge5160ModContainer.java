package ru.itaros.backport5160;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;

import java.util.Collections;

@SuppressWarnings("UnstableApiUsage")
public class Forge5160ModContainer extends DummyModContainer {

    public Forge5160ModContainer()
    {
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = "forge5160";
        meta.name = "Forge 5160 Backport";
        meta.description = "Backports Forge PR 5160 for 1.7.10:\n" +
                "https://github.com/MinecraftForge/MinecraftForge/pull/5160\n" +
                "\n" +
                "Made specifically for fan of railcarts(Kane Hart) and lovers of pain(GTNH)";
        meta.version = "1.7.10";
        meta.authorList = Collections.singletonList("Itaros");
        meta.credits = "gabizou, aikar, liach, williewillus, LexManos, tterrag1098, bs2609";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller)
    {
        bus.register(this);
        return true;
    }

}
