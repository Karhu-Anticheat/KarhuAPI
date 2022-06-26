package me.liwk.karhu.api.data;

import lombok.Getter;

public enum SubCategory {
    //Combat
    REACH(me.liwk.karhu.api.data.Category.COMBAT, 10), KILLAURA(me.liwk.karhu.api.data.Category.COMBAT, 11), AIM(me.liwk.karhu.api.data.Category.COMBAT, 13), AUTOCLICKER(me.liwk.karhu.api.data.Category.COMBAT, 15), VELOCITY(me.liwk.karhu.api.data.Category.COMBAT, 16),

    //Movement
    FLY(me.liwk.karhu.api.data.Category.MOVEMENT, 10), SPEED(me.liwk.karhu.api.data.Category.MOVEMENT, 11),
    JESUS(me.liwk.karhu.api.data.Category.MOVEMENT, 12), MOTION(me.liwk.karhu.api.data.Category.MOVEMENT,14),
    INVENTORY(me.liwk.karhu.api.data.Category.MOVEMENT, 16),

    //WORLD
    SCAFFOLD(me.liwk.karhu.api.data.Category.WORLD, 10),
    NOFALL(me.liwk.karhu.api.data.Category.WORLD, 14), BLOCK(me.liwk.karhu.api.data.Category.WORLD, 16),

    //PACKET
    BADPACKETS(me.liwk.karhu.api.data.Category.PACKET, 11), TIMER(me.liwk.karhu.api.data.Category.PACKET, 13),;

    @Getter private final me.liwk.karhu.api.data.Category category;
    @Getter private final int slot;

    SubCategory(final Category category, int slot) {
        this.category = category;
        this.slot = slot;
    }

}
