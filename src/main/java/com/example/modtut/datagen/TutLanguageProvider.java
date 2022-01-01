package com.example.modtut.datagen;

import com.example.modtut.ModTut;
import com.example.modtut.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.modtut.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, ModTut.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Tutorial");

        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious Ore");
        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Nether Mysterious Ore");
        add(Registration.MYSTERIOUS_ORE_END.get(), "End Mysterious Ore");
        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Deepslate Mysterious Ore");
        add(Registration.RAW_MYSTERIOUS_CHUNK.get(), "Mysterious Raw Chunk");
        add(Registration.MYSTERIOUS_INGOT.get(), "Mysterious Ingot");
    }
}
