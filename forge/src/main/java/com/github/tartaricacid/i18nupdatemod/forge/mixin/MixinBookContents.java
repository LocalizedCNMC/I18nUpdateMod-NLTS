package com.github.tartaricacid.i18nupdatemod.forge.mixin;

import com.github.tartaricacid.i18nupdatemod.I18nUpdateMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vazkii.patchouli.client.book.BookContents;

import java.io.IOException;
import java.io.InputStream;


@Mixin(BookContents.class)
public class MixinBookContents {
    @Inject(at = @At("HEAD"), method = "loadJson", cancellable = true, remap = false)
    private void loadJson(Identifier resloc, Identifier fallback, CallbackInfoReturnable<InputStream> cir) {
        I18nUpdateMod.LOGGER.debug("loading json from {}.", resloc);
        try {
            cir.setReturnValue(MinecraftClient.getInstance().getResourceManager().getResource(resloc).getInputStream());
        } catch (IOException ignore) {
        }
    }
}
