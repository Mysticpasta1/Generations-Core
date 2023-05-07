package generations.gg.generations.core.generationscore.forge.datagen.generators.lang;

public class SkinLang {
    public static void addSkins(GeneralLang lang) {
        addSkin(lang, "thunderclap", "Thunderclap");
        addSkin(lang, "captainamerica", "Captain America");
        addSkin(lang, "radioactive", "Radioactive");
        addSkin(lang, "shadow", "Shadow");
        addSkin(lang, "husky", "Husky");
        addSkin(lang, "rocket", "Rocket");
        addSkin(lang, "bowtie", "Bowtie");
        addSkin(lang, "magma", "Magma");
        addSkin(lang, "none", "");
        addSkin(lang, "patch", "Patch");
        addSkin(lang, "supernova", "Supernova");
        addSkin(lang, "golden", "Golden");
        addSkin(lang, "nerf", "Nerf");
        addSkin(lang, "ganonblade", "Ganon Blade");
        addSkin(lang, "drawn", "Drawn");
        addSkin(lang, "cosmic", "Cosmic");
        addSkin(lang, "seaturtle", "Sea Turtle");
        addSkin(lang, "cowboy", "Cowboy");
        addSkin(lang, "robodisco", "Robo Disco");
        addSkin(lang, "gooperblooper", "Gooper Blooper");
        addSkin(lang, "zelda", "Zelda");
        addSkin(lang, "dawn", "Dawn");
        addSkin(lang, "silver", "Silver");
        addSkin(lang, "kirby", "Kirby");
        addSkin(lang, "poolparty", "Pool Party");
        addSkin(lang, "cocktiel", "Cocktiel");
        addSkin(lang, "pink", "Pink");
        addSkin(lang, "crystal", "Crystal");
        addSkin(lang, "yellowpurple", "Yellow Purple");
        addSkin(lang, "rubberduck", "Rubber Duck");
        addSkin(lang, "decorakei", "Decorakei");
        addSkin(lang, "koopatroopa", "Koopa Troopa");
        addSkin(lang, "summer", "Summer");
        addSkin(lang, "nutcracker", "Nutcracker");
        addSkin(lang, "palehat", "Pale Hat");
        addSkin(lang, "gold", "Gold");
        addSkin(lang, "kurama", "Kurama");
        addSkin(lang, "gyorg", "Gyorg");
        addSkin(lang, "valentines", "Valentines");
        addSkin(lang, "zombie", "Zombie");
        addSkin(lang, "galaxy", "Galaxy");
        addSkin(lang, "hana", "Hana");
        addSkin(lang, "tophat", "Top Hat");
        addSkin(lang, "cartoon", "Cartoon");
        addSkin(lang, "minty", "Minty");
        addSkin(lang, "pirahnaplant", "Pirahna Plant");
        addSkin(lang, "lantern", "Lantern");
        addSkin(lang, "cny", "Cyn");
        addSkin(lang, "flower", "Flower");
        addSkin(lang, "tropical", "Tropical");
        addSkin(lang, "classic", "Classic");
        addSkin(lang, "police", "Police");
        addSkin(lang, "cheongsam", "Cheongsam");
        addSkin(lang, "donaldduck", "Donald Duck");
        addSkin(lang, "redshell", "Red Shell");
        addSkin(lang, "carbonsteel", "Carbonsteel");
        addSkin(lang, "god", "God");
        addSkin(lang, "saddle", "Saddled");
        addSkin(lang, "officer", "Officer");
        addSkin(lang, "darkhat", "Dark Hat");
        addSkin(lang, "space", "Space");
        addSkin(lang, "spring", "Spring");
        addSkin(lang, "crystalforge", "Crystal Forge");
        addSkin(lang, "nursejoy", "Nurse Joy");
        addSkin(lang, "halloween", "Halloween");
        addSkin(lang, "dragonbone", "Dragon Bone");
        addSkin(lang, "chocolatecherry", "Chocolate Cherry");
        addSkin(lang, "schoolbus", "School Bus");
        addSkin(lang, "foursword", "Four Sword");
        addSkin(lang, "bugcatcher", "Bug Catcher");
        addSkin(lang, "heart", "Heart");
        addSkin(lang, "luciddream", "Lucid Dream");
        addSkin(lang, "flamingo", "Flamingo");
        addSkin(lang, "brassforge", "Brass Forge");
        addSkin(lang, "detective", "Detective");
        addSkin(lang, "tails", "Tails");
        addSkin(lang, "armor", "Armored");
        addSkin(lang, "ninja", "Ninja");
        addSkin(lang, "snow", "Snow");
        addSkin(lang, "scales", "Scales");
        addSkin(lang, "eagle", "Eagle");
        addSkin(lang, "classicshadow", "Classic Shadow");
        addSkin(lang, "elephant", "Elephant");
        addSkin(lang, "candy", "Candy");
        addSkin(lang, "tropicalsea", "Tropical Sea");
        addSkin(lang, "gohma", "Gohma");
        addSkin(lang, "captain", "Captain");
        addSkin(lang, "santa", "Santa");
        addSkin(lang, "scrapforge", "Scrap Forge");
        addSkin(lang, "flowerbud", "Flowerbud");
        addSkin(lang, "octorock", "Octorock");
        addSkin(lang, "lunar", "Lunar");
        addSkin(lang, "greenshell", "Green Shell");
        addSkin(lang, "lighthat", "Light Hat");
        addSkin(lang, "retro", "Retro");
        addSkin(lang, "batman", "Batman");
        addSkin(lang, "minecraftfox", "Minecraft Fox");
        addSkin(lang, "blooming", "Blooming");
        addSkin(lang, "roasted", "Roasted");
        addSkin(lang, "snoppy", "Snoppy");
        addSkin(lang, "morgana", "Morgana");
        addSkin(lang, "agedcopper", "Aged Copper");

    }

    public static void addSkin(GeneralLang lang, String skin, String name) {
        lang.add("skin.%s".formatted(skin), (!skin.equals("none") ? name + " " : "") + "%s");
    }
}
