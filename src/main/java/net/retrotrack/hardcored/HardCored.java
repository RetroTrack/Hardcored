package net.retrotrack.hardcored;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.GameMode;
import net.retrotrack.hardcored.item.ModItems;
import net.retrotrack.hardcored.gui.MenuItems;
import net.retrotrack.hardcored.networking.ModMessages;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class HardCored implements ModInitializer {
	public static final String MOD_ID = "hardcored";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	static public final MutableObject<MinecraftServer> serverReference = new MutableObject<>();


	@Override
	public void onInitialize() {
		ServerLifecycleEvents.SERVER_STARTED.register(serverReference::setValue);
		ServerLifecycleEvents.SERVER_STARTED.register(minecraftServer -> SetTeams());
		ModItems.registerModItems();
		ModMessages.registerC2SPackets();
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			ServerPlayerEntity joinedPlayer = handler.getPlayer();
			if(joinedPlayer.getScoreboardTeam() == joinedPlayer.getScoreboard().getTeam("ALIVE")) {
				joinedPlayer.changeGameMode(GameMode.SURVIVAL);
			}
			if(joinedPlayer.getScoreboardTeam() == joinedPlayer.getScoreboard().getTeam("REVIVED")) {
				joinedPlayer.changeGameMode(GameMode.SURVIVAL);
			}
			else if(joinedPlayer.getScoreboardTeam() != joinedPlayer.getScoreboard().getTeam("REVIVED") && joinedPlayer.getScoreboardTeam() != joinedPlayer.getScoreboard().getTeam("DEAD")) {
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team join ALIVE " + joinedPlayer.getName().getString());
			}
		});
	}

	public static void SetTeams() {
		if (serverReference.getValue().getScoreboard().getTeam("ALIVE") == null) {
			HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team add ALIVE");
			HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team modify ALIVE seeFriendlyInvisibles false");
			HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team modify ALIVE color green");
			if (serverReference.getValue().getScoreboard().getTeam("REVIVED") == null) {
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team add REVIVED");
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team modify REVIVED seeFriendlyInvisibles false");
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team modify REVIVED color yellow");
			}
			if (serverReference.getValue().getScoreboard().getTeam("DEAD") == null) {
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team add DEAD");
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team modify DEAD seeFriendlyInvisibles false");
				HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team modify DEAD color red");
			}
		}
	}
}
