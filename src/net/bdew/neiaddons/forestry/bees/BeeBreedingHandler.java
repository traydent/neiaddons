/*
 * Copyright (c) bdew, 2013 - 2014
 * https://github.com/bdew/neiaddons
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://raw.github.com/bdew/neiaddons/master/MMPL-1.0.txt
 */

package net.bdew.neiaddons.forestry.bees;

import net.bdew.neiaddons.forestry.BaseBreedingRecipeHandler;

public class BeeBreedingHandler extends BaseBreedingRecipeHandler {

    public BeeBreedingHandler() {
        super(BeeHelper.root);
    }

    @Override
    public String getRecipeName() {
        return "Bee Breeding";
    }

    @Override
    public String getRecipeIdent() {
        return "beebreeding";
    }
}
