package com.uguraltintas.periodictable

object Elements {
    fun getElementData(): ArrayList<Element> {
        val elementList = arrayListOf<Element>()
        // Period 1
        elementList.add(
            Element(
                "Hydrogen",
                "H",
                1,
                1,
                "https://upload.wikimedia.org/wikipedia/commons/1/1a/Electron_shell_001_Hydrogen.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(
            Element(
                "Helium",
                "He",
                2,
                1,
                "https://upload.wikimedia.org/wikipedia/commons/4/46/Electron_shell_002_Helium.svg",
                backgroundColor = "#FFE3B8"
            )
        )
        // Period 2
        elementList.add(
            Element(
                "Lithium",
                "Li",
                3,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/4/48/Electron_shell_003_Lithium.svg",
                backgroundColor = "#FFC0C0"
            )
        )
        elementList.add(
            Element(
                "Beryllium",
                "Be",
                4,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/5/51/Electron_shell_004_Beryllium.svg",
                backgroundColor = "#D2D2FF"
            )
        )
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(
            Element(
                "Boron",
                "B",
                5,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/8/85/Electron_shell_005_Boron.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Carbon",
                "C",
                6,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/2/29/Electron_shell_006_Carbon.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Nitrogen",
                "N",
                7,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/0/05/Electron_shell_007_Nitrogen.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Oxygen",
                "O",
                8,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/0/09/Electron_shell_008_Oxygen.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Fluorine",
                "F",
                9,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/2/2d/Electron_shell_009_Fluorine.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Neon",
                "H",
                10,
                2,
                "https://upload.wikimedia.org/wikipedia/commons/c/c0/Electron_shell_010_Neon_sl.svg",
                backgroundColor = "#FFE3B8"
            )
        )
        // Period 3
        elementList.add(
            Element(
                "Sodium",
                "Na",
                11,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/7/76/Electron_shell_011_Sodium.svg",
                backgroundColor = "#FFC0C0"
            )
        )
        elementList.add(
            Element(
                "Magnesium",
                "Mg",
                12,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/3/3f/Electron_shell_012_Magnesium.svg",
                backgroundColor = "#D2D2FF"
            )
        )
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(
            Element(
                "Aluminium",
                "Al",
                13,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/4/41/Electron_shell_013_Aluminium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Silicon",
                "Si",
                14,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/c/ca/Electron_shell_014_Silicon.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Phosphorus",
                "P",
                15,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/d/d9/Electron_shell_015_Phosphorus.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Sulfur",
                "S",
                16,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/1/11/Electron_shell_016_Sulfur.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Chlorine",
                "Cl",
                17,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/9/96/Electron_shell_017_Chlorine.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Argon",
                "Ar",
                18,
                3,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Electron_shell_018_Argon.svg/558px-Electron_shell_018_Argon.svg.png",
                backgroundColor = "#FFE3B8"
            )
        )
        // Period 4
        elementList.add(
            Element(
                "Potassium",
                "K",
                19,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/d/db/Electron_shell_019_Potassium.svg",
                backgroundColor = "#FFC0C0"
            )
        )
        elementList.add(
            Element(
                "Calcium",
                "Ca",
                20,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/9/91/Electron_shell_020_Calcium.svg",
                backgroundColor = "#D2D2FF"
            )
        )
        elementList.add(
            Element(
                "Scandium",
                "Sc",
                21,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/c/cd/Electron_shell_021_Scandium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Titanium",
                "Ti",
                22,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/d/d4/Electron_shell_022_Titanium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Vanadium",
                "V",
                23,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/3/3e/Electron_shell_023_Vanadium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Chromium",
                "Cr",
                24,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/5/5a/Electron_shell_024_Chromium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Manganese",
                "Mn",
                25,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/3/34/Electron_shell_025_Manganese.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Iron",
                "Fe",
                26,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/b/b9/Electron_shell_026_Iron.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Cobalt",
                "Co",
                27,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/9/93/Electron_shell_027_Cobalt.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Nickel",
                "Ni",
                28,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/2/22/Electron_shell_028_Nickel.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Copper",
                "Cu",
                29,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/f/f9/Electron_shell_029_Copper.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Zinc",
                "Zn",
                30,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/f/f5/Electron_shell_030_Zinc.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Gallium",
                "Ga",
                31,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/8/84/Electron_shell_031_Gallium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Germanium",
                "Ge",
                32,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/4/4b/Electron_shell_032_Germanium.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Arsenic",
                "As",
                33,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/8/8d/Electron_shell_033_Arsenic.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Selenium",
                "Se",
                34,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/d/d0/Electron_shell_034_Selenium.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Bromine",
                "Br",
                35,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/2/22/Electron_shell_035_Bromine.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Krypton",
                "Kr",
                36,
                4,
                "https://upload.wikimedia.org/wikipedia/commons/9/94/Electron_shell_036_Krypton.svg",
                backgroundColor = "#FFE3B8"
            )
        )
        // Period 5
        elementList.add(
            Element(
                "Rubidium",
                "Rb",
                37,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/9/97/Electron_shell_037_Rubidium.svg",
                backgroundColor = "#FFC0C0"
            )
        )
        elementList.add(
            Element(
                "Strontium",
                "Sr",
                38,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Electron_shell_038_Strontium.svg",
                backgroundColor = "#D2D2FF"
            )
        )
        elementList.add(
            Element(
                "Yttrium",
                "Y",
                39,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/e/e1/Electron_shell_039_Yttrium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Zirconium",
                "Zr",
                40,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/8/88/Electron_shell_040_Zirconium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Niobium",
                "Nb",
                41,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/6/65/Electron_shell_041_Niobium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Molybdenum",
                "Mo",
                42,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/e/eb/Electron_shell_042_Molybdenum.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Technetium",
                "Tc",
                43,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/f/f7/Electron_shell_043_Technetium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Ruthenium",
                "Ru",
                44,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/c/c3/Electron_shell_044_Ruthenium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Rhodium",
                "Rh",
                45,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/2/2f/Electron_shell_045_Rhodium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Palladium",
                "Pd",
                46,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/c/c5/Electron_shell_046_Palladium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Silver",
                "Ag",
                47,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/c/ce/Electron_shell_047_Silver.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Cadmium",
                "Cd",
                48,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/e/ea/Electron_shell_048_Cadmium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Indium",
                "In",
                49,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/8/82/Electron_shell_049_Indium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Tin",
                "Sn",
                50,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/8/8c/Electron_shell_050_Tin.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Antimony",
                "Sb",
                51,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/e/e1/Electron_shell_051_Antimony.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Tellurium",
                "Te",
                52,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/9/98/Electron_shell_052_Tellurium.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Iodine",
                "I",
                53,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/a/aa/Electron_shell_053_Iodine.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Xenon",
                "Xe",
                54,
                5,
                "https://upload.wikimedia.org/wikipedia/commons/7/7d/Electron_shell_054_Xenon.svg",
                backgroundColor = "#FFE3B8"
            )
        )
        // Period 6
        elementList.add(
            Element(
                "Caesium",
                "Cs",
                55,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/2/2f/Electron_shell_055_Caesium.svg",
                backgroundColor = "#FFC0C0"
            )
        )
        elementList.add(
            Element(
                "Barium",
                "Ba",
                56,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/3/3d/Electron_shell_056_Barium.svg",
                backgroundColor = "#D2D2FF"
            )
        )
        elementList.add(Element("", "", 57, 6, "", true, backgroundColor = "#A9FFFF"))
        elementList.add(
            Element(
                "Hafnium",
                "Hf",
                72,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/d/d9/Electron_shell_072_Hafnium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Tantalum",
                "Ta",
                73,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/3/32/Electron_shell_073_Tantalum.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Tungsten",
                "W",
                74,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/d/dd/Electron_shell_074_Tungsten.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Rhenium",
                "Re",
                75,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/6/69/Electron_shell_075_Rhenium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Osmium",
                "Os",
                76,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/c/c9/Electron_shell_076_Osmium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Iridium",
                "Ir",
                77,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/5/58/Electron_shell_077_Iridium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Platinum",
                "Pt",
                78,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/c/c7/Electron_shell_078_Platinum.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Gold",
                "Au",
                79,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/c/c9/Electron_shell_079_Gold.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Mercury",
                "Hg",
                80,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/7/7b/Electron_shell_080_Mercury.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Thallium",
                "Tl",
                81,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/c/c3/Electron_shell_081_Thallium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Lead",
                "Pb",
                82,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Electron_shell_082_Lead.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Bismuth",
                "Bi",
                83,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/e/eb/Electron_shell_083_Bismuth.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Polonium",
                "Po",
                84,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/2/27/Electron_shell_084_Polonium.svg",
                backgroundColor = "#DEECB5"
            )
        )
        elementList.add(
            Element(
                "Astatine",
                "At",
                85,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/9/99/Electron_shell_085_Astatine.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Radon",
                "Rn",
                86,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/7/74/Electron_shell_086_Radon.svg",
                backgroundColor = "#FFE3B8"
            )
        )
        // Period 7
        elementList.add(
            Element(
                "Francium",
                "Fr",
                87,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/f/f2/Electron_shell_087_Francium.svg",
                backgroundColor = "#FFC0C0"
            )
        )
        elementList.add(
            Element(
                "Radium",
                "Ra",
                88,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/1/13/Electron_shell_088_Radium.svg",
                backgroundColor = "#D2D2FF"
            )
        )
        elementList.add(Element("", "", 89, 7, "", true, backgroundColor = "#BDFFE9"))
        elementList.add(
            Element(
                "Rutherfordium",
                "Rf",
                104,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/6/6d/Electron_shell_104_Rutherfordium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Dubnium",
                "Db",
                105,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/9/93/Electron_shell_105_Dubnium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Seaborgium",
                "Sg",
                106,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/c/c0/Electron_shell_106_Seaborgium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Bohrium",
                "Bh",
                107,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/7/7e/Electron_shell_107_Bohrium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Hassium",
                "Hs",
                108,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/3/30/Electron_shell_108_Hassium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Meitnerium",
                "Mt",
                109,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/6/62/Electron_shell_109_Meitnerium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Darmstadtium",
                "Ds",
                110,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/e/e5/Electron_shell_110_Darmstadtium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Roentgenium",
                "Rg",
                111,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/c/ce/Electron_shell_111_Roentgenium_17_2.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Copernicium",
                "Cn",
                112,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/6/69/Electron_shell_112_Copernicium.svg",
                backgroundColor = "#B9DCFF"
            )
        )
        elementList.add(
            Element(
                "Nihonium",
                "Nh",
                113,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/7/76/Electron_shell_113_Nihonium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Flerovium",
                "Fl",
                114,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/2/2c/Electron_shell_114_Flerovium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Moscovium",
                "Mc",
                115,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/d/d2/Electron_shell_115_Moscovium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Livermorium",
                "Lv",
                116,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/6/69/Electron_shell_116_Livermorium.svg",
                backgroundColor = "#B9FFB9"
            )
        )
        elementList.add(
            Element(
                "Tennessine",
                "Ts",
                117,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Electron_shell_117_Tennessine.svg",
                backgroundColor = "#FFFFB5"
            )
        )
        elementList.add(
            Element(
                "Oganesson",
                "Og",
                118,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/f/f3/Electron_shell_118_Oganesson.svg",
                backgroundColor = "#FFE3B8"
            )
        )

        // Period 6 57..71
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(
            Element(
                "Lanthanum",
                "La",
                57,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/a/a5/Electron_shell_057_Lanthanum.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Cerium",
                "Ce",
                58,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/e/e5/Electron_shell_058_Cerium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Praseodymium",
                "Pr",
                59,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/8/8c/Electron_shell_059_Praseodymium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Neodymium",
                "Nd",
                60,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/0/0b/Electron_shell_060_Neodymium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Promethium",
                "Pm",
                61,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/6/68/Electron_shell_061_Promethium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Samarium",
                "Sm",
                62,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/0/06/Electron_shell_062_Samarium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Europium",
                "Eu",
                63,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/c/ce/Electron_shell_063_Europium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Gadolinium",
                "Gd",
                64,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/b/b1/Electron_shell_064_Gadolinium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Terbium",
                "Tb",
                65,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/4/46/Electron_shell_065_Terbium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Dysprosium",
                "Dy",
                66,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/e/ef/Electron_shell_066_Dysprosium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Holmium",
                "Ho",
                67,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/0/04/Electron_shell_067_Holmium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Erbium",
                "Er",
                68,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/0/09/Electron_shell_068_Erbium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Thulium",
                "Tm",
                69,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/2/29/Electron_shell_069_Thulium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Ytterbium",
                "Yb",
                70,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/7/7e/Electron_shell_070_Ytterbium.svg",
                backgroundColor = "#A9FFFF"
            )
        )
        elementList.add(
            Element(
                "Lutetium",
                "Lu",
                71,
                6,
                "https://upload.wikimedia.org/wikipedia/commons/a/a1/Electron_shell_071_Lutetium.svg",
                backgroundColor = "#A9FFFF"
            )
        )

        // Period 7 89..103
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(Element("Blank", "B", 1, 1, "", false))
        elementList.add(
            Element(
                "Actinium",
                "Ac",
                89,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Electron_shell_089_Actinium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Thorium",
                "Th",
                90,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/6/68/Electron_shell_090_Thorium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Protactinium",
                "Pa",
                91,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/9/9c/Electron_shell_091_Protactinium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Uranium",
                "U",
                92,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/c/ca/Electron_shell_092_Uranium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Neptunium",
                "Np",
                93,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/2/2e/Electron_shell_093_Neptunium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Plutonium",
                "Pu",
                94,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/3/3d/Electron_shell_094_Plutonium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Americium",
                "Am",
                95,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/1/15/Electron_shell_095_Americium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Curium",
                "Cm",
                96,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/8/81/Electron_shell_096_Curium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Berkelium",
                "Bk",
                97,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/7/77/Electron_shell_097_Berkelium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Californium",
                "Cf",
                98,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/f/fa/Electron_shell_098_Californium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Einsteinium",
                "Es",
                99,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/5/5a/Electron_shell_099_Einsteinium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Fermium",
                "Fm",
                100,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/9/9f/Electron_shell_100_Fermium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Mendelevium",
                "Md",
                101,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/d/dc/Electron_shell_101_Mendelevium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Nobelium",
                "No",
                102,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/3/3f/Electron_shell_102_Nobelium.svg",
                backgroundColor = "#BDFFE9"
            )
        )
        elementList.add(
            Element(
                "Lawrencium",
                "Lr",
                103,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/0/02/Electron_shell_103_Lawrencium.svg",
                backgroundColor = "#BDFFE9"
            )
        )


        return elementList

    }
}