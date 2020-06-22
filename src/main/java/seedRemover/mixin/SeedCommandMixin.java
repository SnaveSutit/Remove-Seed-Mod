package seedRemover.mixin;

import net.minecraft.server.command.SeedCommand;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SeedCommand.class)
public class SeedCommandMixin {
    @Inject(at = @At("HEAD"), method = "register", cancellable = true)
    private static void SeedCommand(CallbackInfo ci) {
        ci.cancel();
    }
}
