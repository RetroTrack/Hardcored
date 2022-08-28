package net.retrotrack.hardcored.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.retrotrack.hardcored.HardCored;
import net.retrotrack.hardcored.networking.packets.CloseScreenS2CPacket;
import net.retrotrack.hardcored.networking.packets.ReviveC2SPacket;
import net.retrotrack.hardcored.networking.packets.ScreenC2SPacket;
import net.retrotrack.hardcored.networking.packets.ScreenS2CPacket;

public class ModMessages {
    public static final Identifier USEITEM_ID = new Identifier(HardCored.MOD_ID, "useitem");
    public static final Identifier SCREEN_ID = new Identifier(HardCored.MOD_ID, "openscreen");
    public static final Identifier CLOSE_SCREEN = new Identifier(HardCored.MOD_ID, "closescreen");
    public static final Identifier PLAYER_1 = new Identifier(HardCored.MOD_ID, "player1");
    public static final Identifier PLAYER_2 = new Identifier(HardCored.MOD_ID, "player2");
    public static final Identifier PLAYER_3 = new Identifier(HardCored.MOD_ID, "player3");
    public static final Identifier PLAYER_4 = new Identifier(HardCored.MOD_ID, "player4");
    public static final Identifier PLAYER_5 = new Identifier(HardCored.MOD_ID, "player5");
    public static final Identifier PLAYER_6 = new Identifier(HardCored.MOD_ID, "player6");
    public static final Identifier PLAYER_7 = new Identifier(HardCored.MOD_ID, "player7");
    public static final Identifier PLAYER_8 = new Identifier(HardCored.MOD_ID, "player8");
    public static final Identifier PLAYER_9 = new Identifier(HardCored.MOD_ID, "player9");
    public static final Identifier PLAYER_10 = new Identifier(HardCored.MOD_ID, "player10");
    public static final Identifier PLAYER_11 = new Identifier(HardCored.MOD_ID, "player11");
    public static final Identifier PLAYER_12 = new Identifier(HardCored.MOD_ID, "player12");
    public static final Identifier PLAYER_13 = new Identifier(HardCored.MOD_ID, "player13");
    public static final Identifier PLAYER_14 = new Identifier(HardCored.MOD_ID, "player14");
    public static final Identifier PLAYER_15 = new Identifier(HardCored.MOD_ID, "player15");
    public static final Identifier PLAYER_16 = new Identifier(HardCored.MOD_ID, "player16");
    public static final Identifier PLAYER_17 = new Identifier(HardCored.MOD_ID, "player17");
    public static final Identifier PLAYER_18 = new Identifier(HardCored.MOD_ID, "player18");
    public static final Identifier PLAYER_19 = new Identifier(HardCored.MOD_ID, "player19");
    public static final Identifier PLAYER_20 = new Identifier(HardCored.MOD_ID, "player20");


    public static void registerC2SPackets() {
        //Client -> Server
        ServerPlayNetworking.registerGlobalReceiver(USEITEM_ID, ScreenC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_1, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_2, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_3, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_4, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_5, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_6, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_7, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_8, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_9, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_10, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_11, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_12, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_13, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_14, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_15, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_16, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_17, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_18, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_19, ReviveC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(PLAYER_20, ReviveC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        //Server -> Client
        ClientPlayNetworking.registerGlobalReceiver(SCREEN_ID, ScreenS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(CLOSE_SCREEN, CloseScreenS2CPacket::receive);
    }
}
