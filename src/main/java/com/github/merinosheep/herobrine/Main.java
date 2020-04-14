package com.github.merinosheep.herobrine;

import com.github.merinosheep.herobrine.proxy.IProxy;
import com.github.merinosheep.herobrine.proxy.ServerProxy;
import com.github.merinosheep.herobrine.proxy.ClientProxy;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


@Mod(Main.MOD_ID)

public class Main {
    public static final String MOD_ID = "herobrine";
    public static final Logger LOGGER = LogManager.getLogger(Main.MOD_ID);
    
    public static final IProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        LOGGER.debug("Herobrine loading...");
       
    }
    private void commonSetup(final FMLCommonSetupEvent event){

    }
    private void clientSetup(final FMLClientSetupEvent event){
        
    }
    private void serverSetup(final FMLDedicatedServerSetupEvent event){
        
    }
}
