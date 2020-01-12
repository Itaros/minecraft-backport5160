package ru.itaros.backport5160;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.7.10")
@IFMLLoadingPlugin.SortingIndex(1001)
public class Forge5160Plugin implements IFMLLoadingPlugin{

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"ru.itaros.backport5160.Forge5160Transformer"};
    }

    @Override
    public String getModContainerClass() {
        return "ru.itaros.backport5160.Forge5160ModContainer";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> map) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
