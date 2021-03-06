package com.teamacronymcoders.contenttweaker.modules.materials.parts;

import com.teamacronymcoders.base.materialsystem.MaterialException;
import com.teamacronymcoders.contenttweaker.modules.materials.parttypes.IPartType;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.contenttweaker.PartBuilder")
public interface IPartBuilder {
    @ZenMethod
    IPartBuilder setName(String name);

    @ZenMethod
    IPartBuilder setPartType(IPartType partType);

    @ZenMethod
    IPartBuilder setOreDictName(String prefix);

    @ZenMethod
    IPartBuilder setAdditionalOreDictNames(String... prefixes);

    @ZenMethod
    IPart build() throws MaterialException;
}
