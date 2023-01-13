package com.github.tartaricacid.i18nupdatemod.fabric;

import com.github.tartaricacid.i18nupdatemod.I18nUpdateMod;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = I18nUpdateMod.MOD_ID)
public class I18nModConfigFabric implements ConfigData {
    public static String downloadLink = "https://ghproxy.com/https://raw.githubusercontent.com/zkitefly/TranslationPackConvert/main/files";
    public static String resourcePackName = "Minecraft-Mod-Language-Modpack-1-18-FabricT1-19-1o2-Fabric";
    public static String md5Name = "1.18-fabrict1.19.1o2-fabric";
}
