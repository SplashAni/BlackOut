package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.utils.Utils;

public class AutoClickerPlus extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();
    private final Setting<Integer> leftClickDelay = sgGeneral.add(new IntSetting.Builder()
        .name("delay")
        .description("The amount of delay between clicks in ticks.")
        .defaultValue(2)
        .min(0)
        .sliderMax(60)
        .build()
    );
    private int leftClickTimer;

    public AutoClickerPlus() {
        super(Addon.CATEGORY, "AutoClicker+", "Better AutoClicker");
    }
    @Override
    public void onActivate() {
        leftClickTimer = 0;
        mc.options.attackKey.setPressed(false);
    }

    @Override
    public void onDeactivate() {
        mc.options.attackKey.setPressed(false);
    }
    @EventHandler
    private void onTick(TickEvent.Post event) {
        if (leftClickTimer > leftClickDelay.get() && mc.options.attackKey.isPressed()){
            Utils.leftClick();
            leftClickTimer = 0;}
}
}