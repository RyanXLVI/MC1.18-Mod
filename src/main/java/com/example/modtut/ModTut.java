package com.example.modtut;

import com.example.modtut.setup.ClientSetup;
import com.example.modtut.setup.ModSetup;
import com.example.modtut.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModTut.MODID)
public class ModTut {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "modtut";

    public ModTut() {

        Registration.init();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
