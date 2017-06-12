package com.kamesuta.mc.signpic.gui.config;

import java.util.Set;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class ConfigGuiFactory implements IModGuiFactory {
	@Override
	public void initialize(final @Nullable Minecraft minecraftInstance) {

	}

	@SuppressWarnings("deprecation")
	@Override
	public @Nullable Class<? extends GuiScreen> mainConfigGuiClass() {
		return ConfigGui.class;
	}

	@Override
	public @Nullable Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public @Nullable RuntimeOptionGuiHandler getHandlerFor(final @Nullable RuntimeOptionCategoryElement element) {
		return null;
	}

	@Override
	public boolean hasConfigGui() {
		return true;
	}

	@Override
	public GuiScreen createConfigGui(final @Nullable GuiScreen parentScreen) {
		return new ConfigGui(parentScreen);
	}
}