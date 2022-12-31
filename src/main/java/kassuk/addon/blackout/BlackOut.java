package kassuk.addon.blackout;

import com.mojang.logging.LogUtils;
import kassuk.addon.blackout.commands.BlackoutGit;
import kassuk.addon.blackout.commands.GearInfo;
import kassuk.addon.blackout.commands.Kick;
import kassuk.addon.blackout.commands.Panic;
import kassuk.addon.blackout.hud.*;
import kassuk.addon.blackout.modules.*;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class BlackOut extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    public static final Category BLACKOUT = new Category("BlackOut");

    public static final HudGroup HUD_BLACKOUT = new HudGroup("BlackOut");
    public static final String BLACKOUT_NAME = "BlackOut";
    public static final String BLACKOUT_VERSION = "0.2.1";


    @Override
    public void onInitialize() {
        LOG.info("Initializing Blackout");

        // Modules
        Modules.get().add(new AnteroTaateli());
        Modules.get().add(new AntiAim());
        Modules.get().add(new AutoCraftingTable());
        Modules.get().add(new AutoCrystalPlus());
        Modules.get().add(new AutoCrystalRewrite());
        Modules.get().add(new AutoEz());
        Modules.get().add(new AutoMine());
        Modules.get().add(new AutoPearl());
        Modules.get().add(new AutoTravel());
        Modules.get().add(new BedBomb());
        Modules.get().add(new ButtonAura());
        Modules.get().add(new CustomFOV());
        Modules.get().add(new Disabler());
        Modules.get().add(new FastXP());
        Modules.get().add(new FeetESP());
        Modules.get().add(new FlightPlus());
        Modules.get().add(new HoleFill());
        Modules.get().add(new HoleSnap());
        Modules.get().add(new KassuKAura());
        Modules.get().add(new LegitScaffold());
        Modules.get().add(new JumpModify());
        Modules.get().add(new OffHandPlus());
        Modules.get().add(new PacketCrash());
        Modules.get().add(new PacketFly());
        Modules.get().add(new PurpleSpinnyThingBlowerUpererAndPlacer());
        Modules.get().add(new ResetVL());
        Modules.get().add(new RPC());
        Modules.get().add(new ScaffoldPlus());
        Modules.get().add(new SelfTrapPlus());
        Modules.get().add(new SprintPlus());
        Modules.get().add(new Strafe());
        Modules.get().add(new SurroundPlus());
        Modules.get().add(new WeakAlert());


        // Commands
        Commands.get().add(new BlackoutGit());
        Commands.get().add(new GearInfo());
        Commands.get().add(new Kick());
        Commands.get().add(new Panic());

        // HUD
        Hud.get().register(BlackoutArray.INFO);
        Hud.get().register(GearHud.INFO);
        Hud.get().register(HudWaterMark.INFO);
        Hud.get().register(Keys.INFO);
        Hud.get().register(PacketCounter.INFO);
        Hud.get().register(TargetHud.INFO);

        // Theme
        // add a fucking theme
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(BLACKOUT);
    }

    @Override
    public String getWebsite() {
        return "https://bigrat.monster";
    }//what the fuck is this it is not even funny

    @Override
    public String getPackage() {
        return "kassuk.addon.blackout";
    }
}
