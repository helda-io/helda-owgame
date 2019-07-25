(ns helda-owgame.seeds.entities
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    [helda-owgame.client.tiles :as tiles]
    [helda-owgame.client.maps :as maps]
    )
  )

(defn seed-tiles []
  (tiles/save-legend :town-map "Town Map Legend" {
    :stone-square "::"
    :town-house-inn "HI"
    :sign-inn "SI"

    :town-house1 "H1"
    :town-house2 "H2"

    :box-opened "BO"
    :box-closed "BC"
    :town-lawn "TL"

    :town-pond "~~"
    :n-town-pond "~-"
    :nw-town-pond "|-"
    :ne-town-pond "-|"
    :w-town-pond "|~"
    :e-town-pond "~|"
    :sw-town-pond "|_"
    :s-town-pond "~_"
    :se-town-pond "_|"
    })

  (tiles/save-legend :village-map "Village Map Legend" {
    :green "::"
    :scarecrow "SC"
    :cabbage "OO"
    :carrot "vv"
    :wheat-top "ff"
    :wheat-bottom "tt"

    :flower1 "78"
    :haystack "HH"
    :shovels "SH"

    :arrable "$$"
    :n-arrable "--"
    :nw-arrable "|-"
    :ne-arrable "-|"
    :w-arrable "|$"
    :e-arrable "$|"
    :sw-arrable "|_"
    :s-arrable "__"
    :se-arrable "_|"

    :h-village-road "=="
    :v-village-road "||"
    })

  (tiles/save-legend :outside-map "Common Outside Map Legend" {
    :green-outside "::"
    :water "~~"

    :n-coast "~-"
    :nw-coast "|-"
    :ne-coast "-|"
    :w-coast "|~"
    :e-coast "~|"
    :sw-coast "|_"
    :s-coast "~_"
    :se-coast "_|"

    :stone-road "=="
    :v-stone-road "||"
    :n-stone-road "=-"
    :w-stone-road ":|"
    :e-stone-road "|:"
    :s-stone-road "=_"
    :one-stone-road "=|"
    :ine-stone-road "=]"
    :osw-stone-road "LL"
    :isw-stone-road "\\"
    :onw-stone-road ":/"
    :inw-stone-road "/."
    :ose-stone-road "/:"
    :ise-stone-road "./"

    :large-stones1 "OO"
    :large-stones2 "oO"
    :small-stones "oo"
    :flower1 "78"
    :cane "%%"

    :log "LG"
    :stump "ST"
    :bridge "BB"

    :deep-forest "^^"

    })

  (tiles/save-legend :dungeon-map "Dungeon Map Legend" {
    :dungeon-base-tile "::"
    :dark-tile "00"

    :dungeon-road "=="
    :v-dungeon-road "||"

    :dark-cave-wall-top "TT"
    :dark-cave-wall-top-left "|T"
    :dark-cave-wall-top-right "T|"

    :dark-cave-wall "BB"
    :dark-cave-wall-left "|B"
    :dark-cave-wall-right "B|"

    :dark-cave-wall-down "UU"
    :dark-cave-wall-down-left "|U"
    :dark-cave-wall-down-right "U|"

    :dark-cave-left-wall "|I"
    :dark-cave-right-wall "I|"
    :dark-cave-entrance-top "AA"
    :dark-cave-entrance-bottom "II"

    :dark-cave-left-up-corner "|-"
    :dark-cave-right-up-corner "-|"

    :dark-cave-far-wall "--"

    :statue1 "S1"
    :statue2 "S2"

    :crystals-l "ll"
    :crystals-m "lm"
    :crystals-s "ls"

    :dark-stone-s-top "0o"
    :dark-stone-s-bottom "oo"

    :dark-stone-l-top-left "0O"
    :dark-stone-l-top-right "O0"
    :dark-stone-l-bottom-left "oO"
    :dark-stone-l-bottom-right "Oo"

    :torcher-top "YY"
    :torcher-bottom "IL"

    })

  (tiles/save-legend :world-map "Common World Map Legend" {
    :green "::"
    :desert "__"
    :forest "^^"
    :water "~~"
    :mountain "OO"
    :camp "AA"
    :cave "oo"
    :bridge "BB"
    :castle1 "C1"
    :village1 "V1"
    :village2 "V2"
    :village3 "V3"
    :house-inn "HI"
    :house1 "H1"
    :house2 "H2"
    :house3 "H3"
    :house4 "H4"
    :house5 "H5"
    :h-road "=="
    :v-road "||"
    :x-crossroad "XX"
    :south-t-crossroad "ST"
    :east-t-crossroad "ET"
    :west-north-turn "//"
    :south-east-turn "rr"
    :west-south-turn "\\"
    :north-east-turn "LL"
    :sign-inn "SI"
    :sign-white "SW"
    :sign-on-crossroad "SX"
    :map-port "00"
    :n-coast "~-"
    :nw-coast "|-"
    :ne-coast "-|"
    :w-coast "|~"
    :e-coast "~|"
    :sw-coast "|_"
    :s-coast "~_"
    :se-coast "_|"
    })
  (tiles/single-tile :green "Grass basic tile for world map" :world 2 1)
  (tiles/single-tile :green-outside "Grass basic tile for outside map" :outside 2 1)
  (tiles/single-tile :desert "Desert basic tile" :world 5 5)
  (tiles/single-tile :dungeon-base-tile "Dungeon basic tile" :dungeon 5 4)
  (tiles/single-tile :dark-tile "Dark tile" :dungeon 5 6)
  (tiles/single-tile :water "Water basic tile" :world 2 15)

  (tiles/single-tile :dungeon-road "Dungeon road" :dungeon 7 1)
  (tiles/single-tile :v-dungeon-road "Vertical Dungeon road" :dungeon 8 1)

  (tiles/single-tile :stone-square "Stone square tile" :outsideRoads 2 7)
  (tiles/single-tile :stone-road "Stone road tile" :outsideRoads 2 7)
  (tiles/single-tile :v-stone-road "Stone road tile" :outsideRoads 2 7)
  (tiles/single-tile :n-stone-road "North Stone road tile" :outsideRoads 3 1)
  (tiles/single-tile :s-stone-road "South Stone road tile" :outsideRoads 3 2)
  (tiles/single-tile :w-stone-road "West Stone road tile" :outsideRoads 1 3)
  (tiles/single-tile :e-stone-road "East Stone road tile" :outsideRoads 2 3)
  (tiles/single-tile :onw-stone-road "Outer North-West turn Stone road corner tile" :outsideRoads 1 1)
  (tiles/single-tile :inw-stone-road "Inner North-West turn Stone road corner tile" :outsideRoads 2 2)
  (tiles/single-tile :osw-stone-road "Outer South-West turn Stone road corner tile" :outsideRoads 1 5)
  (tiles/single-tile :isw-stone-road "Inner South-West turn Stone road corner tile" :outsideRoads 2 4)
  (tiles/single-tile :one-stone-road "Outer North-East turn Stone road corner tile" :outsideRoads 5 1)
  (tiles/single-tile :ine-stone-road "Inner North-East turn Stone road corner tile" :outsideRoads 4 2)
  (tiles/single-tile :ose-stone-road "Outer South-East turn Stone road corner tile" :outsideRoads 5 5)
  (tiles/single-tile :ise-stone-road "Inner South-East turn Stone road corner tile" :outsideRoads 4 4)

  (tiles/foreground-tile :forest "Forest foreground tile" :worldB 5 12)

  ;todo implement auto-variations
  (tiles/foreground-tile :flower1 "Flower1 foreground tile" :outside 6 6)
  (tiles/foreground-tile :cane "Cane foreground tile" :outside 1 6)
  (tiles/foreground-tile :large-stones1 "Large stones foreground tile" :outside 1 2)
  (tiles/foreground-tile :large-stones2 "Large stones 2 foreground tile" :outside 2 2)
  (tiles/foreground-tile :small-stones "Large stones 2 foreground tile" :outside 3 2)

  (tiles/foreground-tile :house-inn "House Inn foreground tile" :worldB 6 2)
  (tiles/foreground-tile :camp "Camp foreground tile" :worldB 5 2)
  (tiles/foreground-tile :house1 "House I foreground tile" :worldB 6 1)
  (tiles/foreground-tile :house2 "House II foreground tile" :worldB 7 1)
  (tiles/foreground-tile :house3 "House III foreground tile" :worldB 8 1)
  (tiles/foreground-tile :house4 "House IV foreground tile" :worldB 6 2)
  (tiles/foreground-tile :house5 "House V foreground tile" :worldB 7 2)
  (tiles/foreground-tile :sign-inn "INN sign foreground tile" :worldB 2 1)
  (tiles/foreground-tile :sign-white "White sign foreground tile" :worldB 4 1)
  (tiles/foreground-tile :box-opened "Box opened" :desert 2 5)
  (tiles/foreground-tile :box-closed "Box closed" :desert 2 4)

  (tiles/single-tile :h-road "Horizontal Road tile" :world 1 2)
  (tiles/single-tile :v-road "Vertical Road tile" :world 1 3)
  (tiles/single-tile :x-crossroad "X crossroad tile" :world 8 2)
  (tiles/single-tile :south-t-crossroad "South-T crossroad tile" :world 7 2)
  (tiles/single-tile :east-t-crossroad "East-T crossroad tile" :world 7 3)
  (tiles/single-tile :west-north-turn "West-North turn tile" :world 3 3)
  (tiles/single-tile :south-east-turn "South-East turn tile" :world 2 2)
  (tiles/single-tile :west-south-turn "West-South turn tile" :world 3 2)
  (tiles/single-tile :north-east-turn "North-East turn tile" :world 2 3)

  (tiles/single-tile :n-coast "North coast" :world 2 14)
  (tiles/single-tile :nw-coast "North-West coast" :world 1 14)
  (tiles/single-tile :ne-coast "North-East coast" :world 3 14)
  (tiles/single-tile :w-coast "West coast" :world 1 15)
  (tiles/single-tile :e-coast "East coast" :world 3 15)
  (tiles/single-tile :sw-coast "South-West coast" :world 1 16)
  (tiles/single-tile :s-coast "South coast" :world 2 16)
  (tiles/single-tile :se-coast "South-East coast" :world 3 16)

  (tiles/single-tile :town-pond "Town pond" :outsideRoads 7 2)
  (tiles/single-tile :n-town-pond "North town pond" :outsideRoads 7 1)
  (tiles/single-tile :nw-town-pond "North-West town pond" :outsideRoads 6 1)
  (tiles/single-tile :ne-town-pond "North-East town pond" :outsideRoads 8 1)
  (tiles/single-tile :w-town-pond "West town pond" :outsideRoads 6 2)
  (tiles/single-tile :e-town-pond "East town pond" :outsideRoads 8 2)
  (tiles/single-tile :sw-town-pond "South-West town pond" :outsideRoads 6 3)
  (tiles/single-tile :s-town-pond "South town pond" :outsideRoads 7 3)
  (tiles/single-tile :se-town-pond "South-East town pond" :outsideRoads 8 3)

  (tiles/single-tile :arrable "Arrable tile" :farmA 3 5)
  (tiles/single-tile :n-arrable "North arrable boundary" :farmA 3 4)
  (tiles/single-tile :nw-arrable "North-West arrable boundary" :farmA 2 4)
  (tiles/single-tile :ne-arrable "North-East arrable boundary" :farmA 4 4)
  (tiles/single-tile :w-arrable "West arrable boundary" :farmA 2 5)
  (tiles/single-tile :e-arrable "East arrable boundary" :farmA 4 5)
  (tiles/single-tile :sw-arrable "South-West arrable boundary" :farmA 2 6)
  (tiles/single-tile :s-arrable "South arrable boundary" :farmA 3 6)
  (tiles/single-tile :se-arrable "South-East arrable boundary" :farmA 4 6)

  (tiles/single-tile :h-village-road "Horizontal village road" :desertA5 2 1)
  (tiles/single-tile :v-village-road "Vertical village road" :desertA5 3 1)

  (tiles/single-tile :dark-cave-left-wall "Dark cave left wall" :dungeon 1 6)
  (tiles/single-tile :dark-cave-right-wall "Dark cave right wall" :dungeon 1 7)
  (tiles/single-tile :dark-cave-wall "Dark cave front wall" :dungeon 2 9)
  (tiles/single-tile :dark-cave-wall-left "Dark cave front wall left corner" :dungeon 1 9)
  (tiles/single-tile :dark-cave-wall-right "Dark cave front wall right corner" :dungeon 3 9)
  (tiles/single-tile :dark-cave-wall-down "Dark cave front wall down" :dungeon 2 10)
  (tiles/single-tile :dark-cave-wall-down-left "Dark cave front wall down left" :dungeon 1 10)
  (tiles/single-tile :dark-cave-wall-down-right "Dark cave front wall down right" :dungeon 3 10)
  (tiles/single-tile :dark-cave-wall-top "Dark cave front wall top" :dungeon 2 8)
  (tiles/single-tile :dark-cave-wall-top-left "Dark cave front wall top left" :dungeon 1 8)
  (tiles/single-tile :dark-cave-wall-top-right "Dark cave front wall top right" :dungeon 3 8)

  (tiles/foreground-tile :dark-cave-left-up-corner "Dark cave left up corner" :dungeonB 6 2)
  (tiles/foreground-tile :dark-cave-right-up-corner "Dark cave right up corner" :dungeonB 8 2)
  (tiles/single-tile :dark-cave-far-wall "Dark cave far wall" :dungeonB 7 2)

  (tiles/single-tile :dark-cave-entrance-top "Dark cave entrance top" :dungeon 4 9)
  (tiles/single-tile :dark-cave-entrance-bottom "Dark cave entrance bottom" :dungeon 4 10)

  (tiles/foreground-tile :crystals-l "Big Crystal" :dungeonB 14 12)
  (tiles/foreground-tile :crystals-m "Mid Crystal" :dungeonB 15 12)
  (tiles/foreground-tile :crystals-s "Small Crystals" :dungeonB 14 13)

  (tiles/foreground-tile :dark-stone-s-top "Small dark stone top" :dungeonB 6 6)
  (tiles/single-tile :dark-stone-s-bottom "Small dark stone bottom" :dungeonB 6 7)

  (tiles/foreground-tile :dark-stone-l-top-left "Large dark stone top left" :dungeonB 7 6)
  (tiles/foreground-tile :dark-stone-l-top-right "Large dark stone top right" :dungeonB 8 6)
  (tiles/single-tile :dark-stone-l-bottom-left "Large dark stone bottom left" :dungeonB 7 7)
  (tiles/single-tile :dark-stone-l-bottom-right "Large dark stone bottom right" :dungeonB 8 7)

  (tiles/foreground-tile :torcher-top "Torcher top" :dungeonB 4 9)
  (tiles/foreground-tile :torcher-bottom "Torcher bottom" :dungeonB 5 9)

  (tiles/foreground-tile :carrot "Grown carrot tileset" :farmA 15 3)
  (tiles/foreground-tile :cabbage "Cabbage tileset" :farmA 11 4)
  (tiles/foreground-tile :wheat-top "Wheat top tileset" :farmA 15 7)
  (tiles/foreground-tile :wheat-bottom "Wheat top tileset" :farmA 15 8)

  (tiles/tileset :v-bridge "Vertical bridge tileset"
    :world
    [[8 13]]
    [[7 14]]
    [[7 14]]
    [[7 14]]
    [[8 14]]
    )

  (tiles/tileset :castle1 "Castle tileset"
    :worldB
    [[14 3] [15 3] [16 3] [0 0 :empty]]
    [[14 4] [15 4] [16 4] [8 11]]
    [[14 5] [15 5] [16 5] [8 12]]
    [[14 6] [15 6] [16 6] [8 13]]
    )

  (tiles/tileset :wood "Grove tileset"
    :world
    [[1 7] [2 7] [2 7] [3 7]]
    [[1 8] [2 8] [2 8] [3 8]]
    [[1 8] [2 8] [2 8] [3 8]]
    [[1 9] [2 9] [2 9] [3 9]]
    )

  (tiles/tileset :village1 "Village1 tileset"
    :worldB
    [[1 3] [2 3]]
    [[1 4] [2 4]]
    [[1 5] [2 5]]
    )
  (tiles/tileset :town1 "Town1 tileset"
    :worldB
    [[1 9] [2 9] [3 9]]
    [[1 10] [2 10] [3 10]]
    [[1 11] [2 11] [3 11]]
    )
  (tiles/tileset :town2 "Town2 tileset"
    :worldB
    [[1 6] [2 6] [3 6]]
    [[1 7] [2 7] [3 7]]
    [[1 8] [2 8] [3 8]]
    )
  (tiles/tileset :tower1 "Tower1 tileset"
    :worldB
    [[7 6] [8 6]]
    [[7 7] [8 7]]
    [[7 8] [8 8]]
    )
  (tiles/tileset :village2 "Village2 tileset"
    :worldB
    [[3 3] [4 3] [5 3]]
    [[3 4] [4 4] [5 4]]
    [[3 5] [4 5] [5 5]]
    )
  (tiles/tileset :village3 "Village3 tileset"
    :worldB
    [[1 6] [2 6] [3 6]]
    [[1 7] [2 7] [3 7]]
    [[1 8] [2 8] [3 8]]
    )
  (tiles/tileset :mountain "Mountain tileset"
    :worldB
    [[11 5] [12 5]]
    [[11 6] [12 6]]
    )
  (tiles/tileset :dungeon-entrance1 "Dungeon entrance tileset"
    :worldB
    [[11 7] [12 7]]
    [[11 8] [12 8]]
    )
  (tiles/tileset :mountains "Mountains chain tileset"
    :worldB
    [[9 1] [10 1] [11 1] [12 1]]
    [[9 2] [10 2] [11 2] [12 2]]
    [[9 3] [10 3] [11 3] [12 3]]
    [[9 4] [10 4] [11 4] [12 4]]
    )

  (tiles/tileset :log "Log tileset"
    :outsideB
    (tiles/line-range 6 3 9)
    (tiles/line-range 6 3 10)
    )

  (tiles/tileset :stump "Stump tileset"
    :outsideB
    (tiles/line-range 15 2 7)
    (tiles/line-range 15 2 8)
    )

  (tiles/tileset :long-bridge-detailed "Bridge detailed tileset"
    :outsideB
    (concat
      (tiles/line-range 12 3 11)
      (tiles/line-range 13 2 11)
      (tiles/line-range 13 3 11)
      )
    (concat
      (tiles/line-range 12 3 12)
      (tiles/line-range 13 2 12)
      (tiles/line-range 13 3 12)
      )
    (concat
      (tiles/line-range 12 3 13)
      (tiles/line-range 13 2 13)
      (tiles/line-range 13 3 13)
      )
    )

  (tiles/tileset-for :tree "Tree tileset"
    :outsideB
    (tiles/tileset-range 9 4 1 4)
    )

  (def forest-tree-tile-x [
     11 12 9 10
     11 12 9 10
     11 12 9 10
     11 12 9 10
     11
    ])

  (def forest-tile-x [
     13 14 15 16
     13 14 15 16
     13 14 15 16
     13 14 15 16
     13
    ])

  (tiles/tileset :forest-south-border "Forest south border tileset"
    :outsideB
    (mapv (fn [x] [x 1]) forest-tree-tile-x)
    (mapv (fn [x] [x 2]) forest-tree-tile-x)
    (mapv (fn [x] [x 1]) forest-tile-x)
    (mapv (fn [x] [x 2]) forest-tile-x)
    (mapv (fn [x] [x 3]) forest-tile-x)
    (mapv (fn [x] [x 4]) forest-tile-x)
    )

  (tiles/tileset :red-roof "Red roof tileset"
    :redRoof
    (tiles/line-range 1 7 6)
    (tiles/line-range 1 7 7)
    (tiles/line-range 1 7 8)
    (tiles/line-range 1 7 13)
    (tiles/line-range 1 7 14)
    )

  (tiles/tileset-for :red-roof-narrow "Narrow red roof tileset"
    :redRoof
    (tiles/tileset-range 1 3 2 4)
    )

  (tiles/tileset :town-house-inn "Town House Inn tileset"
    :house
    (mapv (fn [x] [(+ x 8) 10]) [1 2 3 4 5 7 8])
    (mapv (fn [x] [(+ x 8) 11]) [1 2 3 4 5 7 8])
    (tiles/line-for [1 4 5 6 7 8 3] 3)
    (tiles/line-for [1 4 5 6 7 8 3] 4)
    )

  (tiles/tileset :town-house-narrow "Narrow town house tileset"
    :house
    (tiles/line-for [9 11 16] 10)
    (tiles/line-for [9 11 16] 11)
    [[9 10] [5 3] [16 10]]
    [[9 11] [5 4] [16 11]]
    )

  (tiles/scalable-tileset :town-lawn "Town lawn"
    {
      :nw {:fileId :castle :x 6 :y 14}
      :sw {:fileId :castle :x 6 :y 16}
      :ne {:fileId :castle :x 8 :y 14}
      :se {:fileId :castle :x 8 :y 16}
      :nl {:fileId :castle :x 7 :y 14}
      :sl {:fileId :castle :x 7 :y 16}
      :wl {:fileId :castle :x 6 :y 15}
      :el {:fileId :castle :x 8 :y 15}
      :cr {:fileId :castle :x 7 :y 15}
    })

  (tiles/tileset-for :farm-red-roof "Farm Red roof tileset"
    :farmB
    (tiles/tileset-by-vecs [13 14 15 14 14 14 16] [9 10 11])
    )

  (tiles/tileset :farm-roof2 "Farm House 2 roof tileset"
    :farmB
    (tiles/line-for [1 1 5 1 1 1 1] 1)
    (tiles/line-for [1 2 5 2 2 2 3] 2)
    (tiles/line-for [1 2 2 2 2 2 3] 3)
    )

  (tiles/tileset-for :farm-house1 "Farm house1 tileset"
    :farmB
    (tiles/tileset-by-vecs [1 3 4 5 6 7 8] [10 11])
    )

  (tiles/tileset :farm-house2 "Farm house2 tileset"
    :farmB
    [[1 6] [6 4] [7 4] [8 4] [6 6] [7 6] [8 6]]
    [[1 7] [6 5] [7 5] [8 5] [6 7] [7 7] [8 7]]
    )

  (tiles/tileset-for :scarecrow "Scarecrow tileset"
    :farmA
    (tiles/tileset-range 13 2 7 2)
    )
  (tiles/tileset-for :haystack "Haystack tileset"
    :farmA
    (tiles/tileset-range 5 2 9 2)
    )

  ;todo object variations needed
  (tiles/tileset-for :haycart "Haycart tileset"
    :farmA
    (tiles/tileset-by-vecs [3 6 8] [11 12])
    )

  (tiles/tileset-for :shovels "Shovels tileset"
    :farmA
    (tiles/tileset-range 6 1 13 2)
    )

  (tiles/tileset-for :statue1 "Statue1 tileset"
    :dungeonB
    (tiles/tileset-range 5 2 13 3)
    )

  (tiles/tileset-for :statue2 "Statue2 tileset"
    :dungeonB
    (tiles/tileset-range 7 2 13 3)
    )

  (tiles/scalable-tileset :desert-lake "Desert Lake Coast"
    {
      :nw {:fileId :world :x 6 :y 7}
      :sw {:fileId :world :x 6 :y 9}
      :ne {:fileId :world :x 8 :y 7}
      :se {:fileId :world :x 8 :y 9}
      :nl {:fileId :world :x 7 :y 7}
      :sl {:fileId :world :x 7 :y 9}
      :wl {:fileId :world :x 6 :y 8}
      :el {:fileId :world :x 8 :y 8}
      :cr {:fileId :world :x 7 :y 8}
    })

  (tiles/scalable-tileset :green-lake "Green Lake Coast"
    {
      :nw {:fileId :world :x 1 :y 4}
      :sw {:fileId :world :x 1 :y 6}
      :ne {:fileId :world :x 3 :y 4}
      :se {:fileId :world :x 3 :y 6}
      :nl {:fileId :world :x 2 :y 4}
      :sl {:fileId :world :x 2 :y 6}
      :wl {:fileId :world :x 1 :y 5}
      :el {:fileId :world :x 3 :y 5}
      :cr {:fileId :world :x 2 :y 5}
    })
  )

(defn seed-entities [world]
  (println
    (save-entity world :owgame.BattleUnit {
      :description "NPC enemy sample instance"
      :attrs {
        :name "Orc Warrior"
        :xp 135
        :initiative 0
        :ac 13
        :hp 6
        :speed 30
        :attack-chk "4"
        :attack-dmg "2d4+4"
        :ranged-attack-chk "1"
        :ranged-attack-dmg "1d6+3"
        }
      :tags [:npc]
      :actions {
        :fight "battle"
        }
      })
    (save-entity world :owgame.BattleUnit {
      :description "Hero instance"
      :attrs {
        :name "Valeros"
        :xp 0
        :initiative 2
        :ac 17
        :hp 16
        :speed 20
        :attack-chk "5"
        :attack-dmg "1d8+3"
        :ranged-attack-chk "3"
        :ranged-attack-dmg "1d6"
        }
      :tags [:hero]
      :actions {
        :fight "battle"
        }
      })
    )
  )

;todo Add validation for x,y

(defn seed-world [world]
  (->
    (maps/init-room-map "town1" "Town map" :town-map
      {
        :red-roof :stone-square
        :town-house-inn :stone-square
        :town-house1 :stone-square
        :town-house2 :stone-square
        :sign-inn :stone-square
        :town-lawn :stone-square
        :box-opened :stone-square
        :box-closed :stone-square
        }
      "HI HI HI HI HI HI HI :: :: :: :: :: :: :: :: :: ::"
      "HI HI HI HI HI HI HI :: :: :: :: :: :: :: :: :: ::"
      "HI HI HI HI HI HI HI :: :: TL TL TL TL TL TL :: ::"
      "HI HI HI HI HI HI HI :: :: TL TL TL TL TL TL :: ::"
      "HI HI HI HI HI HI HI :: :: TL TL TL TL TL TL :: ::"
      "HI HI HI HI HI HI HI :: :: TL TL TL TL TL TL :: ::"
      "HI HI HI HI HI HI HI :: :: TL TL TL TL TL TL :: ::"
      "HI HI HI HI HI HI HI :: :: :: :: :: :: :: :: :: ::"
      "HI HI HI HI HI HI HI :: :: :: :: :: :: :: :: :: ::"
      ":: SI :: :: BO BC BC :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: :: :: :: :: :: :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: |- ~- ~- ~- -| :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: |~ ~~ ~~ ~~ ~| :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: |~ ~~ ~~ ~~ ~| :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: |~ ~~ ~~ ~~ ~| :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: |_ ~_ ~_ ~_ _| :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      ":: :: :: :: :: :: :: :: H2 H2 H2 :: :: :: H1 H1 H1"
      )
    (maps/add-geo-object {
      :entity-tag :red-roof
      :tile-id :red-roof
      :map-tag :red-roof
      :x 1 :y 1
      :w 7 :h 5
      })
    (maps/add-geo-object {
      :entity-tag :town-house-inn
      :tile-id :town-house-inn
      :map-tag :town-house-inn
      :x 1 :y 6
      :w 7 :h 4
      })
    (maps/add-geo-object {
      :entity-tag :red-roof-narrow1
      :tile-id :red-roof-narrow
      :map-tag :red-roof-narrow
      :x 9 :y 10
      :w 3 :h 4
      })
    (maps/add-geo-object {
      :entity-tag :town-house-narrow1
      :tile-id :town-house-narrow
      :map-tag :town-house-narrow
      :x 9 :y 14
      :w 3 :h 4
      })
    (maps/add-geo-object {
      :entity-tag :red-roof-narrow2
      :tile-id :red-roof-narrow
      :map-tag :red-roof-narrow
      :x 14 :y 10
      :w 3 :h 4
      })
    (maps/add-geo-object {
      :entity-tag :town-house-narrow2
      :tile-id :town-house-narrow
      :map-tag :town-house-narrow
      :x 14 :y 14
      :w 3 :h 4
      })
    (maps/add-geo-object {
      :entity-tag :town-lawn
      :tile-id :town-lawn
      :map-tag :town-lawn
      :x 10 :y 3
      :w 6 :h 5
      :tiles [
        [:nw :nl :nl :nl :nl :ne]
        [:wl :cr :cr :cr :cr :el]
        [:wl :cr :cr :cr :cr :el]
        [:wl :cr :cr :cr :cr :el]
        [:sw :sl :sl :sl :sl :se]
        ]
      })
    (maps/save-room-map world)
    )

  (->
    (maps/init-room-map "village1" "Village map" :village-map
      {
        :cabbage :arrable
        :carrot :arrable
        :scarecrow :arrable
        :wheat-top :arrable
        :wheat-bottom :arrable
        }
      ":: :: :: :: :: :: :: :: :: UU UU UU UU UU UU UU ::"
      ":: UU UU UU UU UU UU UU :: UU UU UU UU UU UU UU ::"
      ":: UU UU UU UU UU UU UU :: UU UU UU UU UU UU UU ::"
      ":: UU UU UU UU UU UU UU :: H2 H2 H2 H2 H2 H2 H2 ::"
      ":: H1 H1 H1 H1 H1 H1 H1 :: H2 H2 || H2 H2 H2 H2 ::"
      ":: H1 H1 H1 H1 || H1 H1 :: :: :: || :: :: :: :: ::"
      ":: :: :: :: :: || 78 78 HC HC HC || :: :: HH HH ::"
      ":: :: :: :: :: || :: :: HC HC HC || :: :: HH HH ::"
      "== == == == == == == == == == == == == == == == =="
      "ff ff ff ff ff ff ff ff || SH :: :: :: :: :: :: ::"
      "tt tt tt tt tt tt tt tt || SH :: :: 78 78 78 78 78"
      "== == == == == == == == || :: :: 78 78 78 78 78 78"
      "OO OO OO OO OO OO OO OO || :: $$ vv vv vv vv vv vv"
      "OO OO OO OO OO SC SC OO || :: $$ vv vv vv vv vv $$"
      "OO OO OO OO OO SC SC OO || :: vv vv vv vv vv vv $$"
      "$$ OO OO OO OO OO OO OO || :: $$ vv vv vv vv vv $$"
      "|_ __ __ __ __ __ __ _| || :: $$ vv vv vv vv vv $$"
      )

    (maps/add-geo-object {
      :entity-tag :farm-red-roof
      :tile-id :farm-red-roof
      :map-tag :farm-red-roof
      :x 2 :y 2
      :w 7 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :farm-house1
      :tile-id :farm-house1
      :map-tag :farm-house1
      :x 2 :y 5
      :w 7 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :farm-roof2
      :tile-id :farm-roof2
      :map-tag :farm-roof2
      :x 10 :y 1
      :w 7 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :farm-house2
      :tile-id :farm-house2
      :map-tag :farm-house2
      :x 10 :y 4
      :w 7 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :scarecrow
      :tile-id :scarecrow
      :map-tag :scarecrow
      :x 6 :y 14
      :w 2 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :haystack
      :tile-id :haystack
      :map-tag :haystack
      :x 15 :y 7
      :w 2 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :haycart
      :tile-id :haycart
      :map-tag :haycart
      :x 9 :y 7
      :w 3 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :shovels
      :tile-id :shovels
      :map-tag :shovels
      :x 10 :y 10
      :w 1 :h 2
      })

    (maps/save-room-map world)
    )

  (->
    (maps/init-room-map "dungeon1" "Dungeon map" :dungeon-map
      {
        :dark-cave-left-up-corner :dark-tile
        :dark-cave-right-up-corner :dark-tile
        :crystals-l :dark-tile
        :crystals-m :dark-tile
        :crystals-s :dark-tile

        :dark-stone-l-top-left :dark-tile
        :dark-stone-l-top-right :dark-tile
        :dark-stone-s-top :dark-tile

        :statue1 :dungeon-base-tile
        :statue2 :dungeon-base-tile

        :torcher-top :dungeon-base-tile
        :torcher-bottom :dungeon-base-tile
        }
      "00 00 00 00 00 ll 00 || lm 00 00 00 00 00 00 00 00"
      "00 00 00 00 00 00 00 || 00 00 00 00 00 00 00 ls 00"
      "00 00 00 |- -- -- -- || -- -- -- -- -- -| 00 00 00"
      "00 00 00 |I :: :: :: || :: :: :: :: :: I| 00 00 00"
      "00 ll 00 |I :: :: :: || :: :: YY :: :: I| 00 lm 00"
      "00 00 00 |I :: :: :: || :: :: IL :: :: I| 0o 00 00"
      "00 00 00 |I :: :: :: || :: :: :: :: :: I| oo 00 00"
      "0O O0 00 |I :: :: :: || == == == == == == == == =="
      "oO Oo :: |I :: :: :: || == == == == == == == == =="
      ":: :: :: |I :: S1 S1 || S2 S2 :: :: :: I| :: :: ::"
      ":: :: :: |I :: S1 S1 || S2 S2 :: :: :: I| :: :: ::"
      ":: :: :: |I :: S1 S1 || S2 S2 :: :: :: I| :: :: ::"
      ":: :: :: |T TT TT TT TT TT TT TT TT TT T| :: :: ::"
      ":: :: :: |B BB BB BB AA BB BB BB BB BB B| :: :: ::"
      ":: :: :: |U UU UU UU II UU UU UU UU UU U| :: :: ::"
      ":: :: :: :: :: :: || || || :: :: :: :: :: :: :: ::"
      ":: :: :: :: :: :: || || || :: :: :: :: :: :: :: ::"
      )
    (maps/add-geo-object {
      :entity-tag :statue1
      :tile-id :statue1
      :map-tag :statue1
      :x 6 :y 10
      :w 2 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :statue2
      :tile-id :statue2
      :map-tag :statue2
      :x 9 :y 10
      :w 2 :h 3
      })
    (maps/save-room-map world)
    )

  (->
    (maps/init-room-map "battle1" "Battle bridge map" :outside-map
      {
        :bridge :water
        }
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~| %% %% %% :: :: :: ::"
      ":: ^^ ^^ ^^ ^^ |~ ~~ ~~ ~~ ~| %% %% %% :: :: :: ::"
      ":: ^^ ^^ ^^ ^^ |~ ~~ ~~ ~~ ~| %% %% %% %% :: :: ::"
      ":: ^^ ^^ ^^ ^^ |~ ~~ ~~ ~~ ~| %% %% %% :: :: :: ::"
      ":: ^^ ^^ ^^ ^^ |~ ~~ ~~ ~~ ~| %% :: :: :: :: :: ::"
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~| :: :: :: :: :: :: ::"
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~| :: :: LG LG LG :: ::"
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~| :: :: LG LG LG :: ::"
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~| :: :: :: :: :: :: ::"
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~~ -| :: :: :: :: :: ::"
      ":: :: :: :: :: |~ ~~ ~~ ~~ ~~ ~| :: :: :: :: :: ::"
      "=- =- =- =- :: |~ BB BB BB BB ~| :: =- =- =- =- =-"
      "== == == == :: |~ BB BB BB BB ~| :: == == == == =="
      "=_ =_ =_ =_ :: |~ BB BB BB BB ~| :: =_ =_ =_ =_ =_"
      ":: ST ST :: :: |~ ~~ ~~ ~~ ~~ ~| :: :: :: Oo oo ::"
      ":: ST ST 78 78 |~ ~~ ~~ ~~ ~~ ~| :: :: OO :: :: ::"
      "78 :: :: :: :: |~ ~~ ~~ ~~ ~~ ~| :: :: :: :: :: ::"
      )
    (maps/add-geo-object {
      :entity-tag :long-bridge-detailed
      :tile-id :long-bridge-detailed
      :map-tag :bridge
      :x 5 :y 12
      :w 8 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :log
      :tile-id :log
      :map-tag :log
      :x 13 :y 7
      :w 3 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :stump
      :tile-id :stump
      :map-tag :stump
      :x 2 :y 15
      :w 2 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :tree1
      :tile-id :tree
      :map-tag :forest
      :x 2 :y 2
      :w 4 :h 4
      })
    (maps/save-room-map world)
    )

  (->
    (maps/init-room-map "plain-battle" "Battle map" :outside-map
      {

        }

      ":: :: :: :: :: :: :: :: :: :: :: :: :: :: oO OO oo"
      ":: 78 78 78 :: :/ =- =- =- =- =- =- =- =- =- =- =-"
      ":: :: :: :: :: :| || == == == == == == == == == =="
      ":: LG LG LG :: :| || /. =_ =_ =_ =_ =_ =_ =_ =_ =_"
      ":: LG LG LG oo :| || |: :: :: :: %% %% %% %% %% %%"
      ":: :: :: :: :: :| || |: ST ST :: %% |- ~- ~- -| %%"
      "=- =- =- =- =- ./ || |: ST ST %% %% |~ ~~ ~~ ~| %%"
      "== == == == == == == |: :: %% %% %% |~ ~~ ~~ ~| %%"
      "=_ =_ =_ =_ =_ =_ =_ /: :: %% %% %% |_ ~_ ~_ _| %%"
      ":: :: :: 78 78 :: :: :: :: %% %% %% %% %% %% %% %%"
      ":: :: :: :: :: :: oO OO :: :: %% %% %% %% %% %% %%"
      "^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      "^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      "^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      "^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      "^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      "^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      )
    (maps/add-geo-object {
      :entity-tag :forest-south-border
      :tile-id :forest-south-border
      :map-tag :deep-forest
      :x 1 :y 12
      :w 17 :h 6
      })
    (maps/add-geo-object {
      :entity-tag :log
      :tile-id :log
      :map-tag :log
      :x 2 :y 4
      :w 3 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :stump
      :tile-id :stump
      :map-tag :stump
      :x 9 :y 6
      :w 2 :h 2
      })
    (maps/save-room-map world)
    )

  (->
    (maps/init-room-map "room1" "MVP map" :world-map
      {
        :castle1 :green
        :forest :green
        :house-inn :green
        :sign-inn :green
        :cave :green
        :bridge :water
        }

      ":: :: V1 V1 V1 :: :: ^^ ^^ ^^ ^^ :: :: HH HH HH HH"
      ":: :: V1 V1 V1 rr == == == == == == == HH HH HH HH"
      ":: :: V1 V1 V1 || ^^ ^^ ^^ .. AA AA AA HH HH HH HH"
      ":: :: rr ST == // |- ~- ~- ~- ~- ~- -| HH HH HH HH"
      ":: :: || ^^ ^^ :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: ::"
      "^^ ^^ || ^^ ^^ :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || H2 ::"
      "~- ~- ~- ~- ~- ~- ~~ ~~ _| :: |_ ~~ ~| :: || H1 ::"
      "~~ ~~ BB ~~ ~~ ~~ ~~ ~~ :: H3 ^^ ~~ ~| :: || :: ::"
      "~_ ~_ ~_ ~_ ~_ ~_ ~~ ~~ -| :: |- ~~ ~| :: || :: ::"
      "^^ ^^ || :: MM MM |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: ::"
      ":: :: || :: MM MM |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: ::"
      ":: :: || :: SW :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || TT TT"
      ":: :: LL == == \\ |_ ~_ ~_ ~_ ~_ ~_ _| :: || TT TT"
      "MM MM MM MM ^^ || V2 V2 :: :: SI HI :: :: || TT TT"
      "MM MM MM MM ^^ || V2 V2 rr == == == == == ST == =="
      "MM MM MM MM ^^ || V2 V2 || ^^ ^^ ^^ ^^ :: :: :: SW"
      "MM MM MM MM ^^ LL == == // :: :: ^^ ^^ :: :: :: ::"
      )
    (maps/add-geo-object {
      :entity-tag :v-bridge
      :tile-id :v-bridge
      :map-tag :bridge
      :x 3 :y 6
      :w 1 :h 5
      })
    (maps/add-geo-object {
      :entity-tag :town1
      :tile-id :town1
      :map-tag :town1
      :x 3 :y 1
      :w 3 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :village1
      :tile-id :village1
      :map-tag :village1
      :x 7 :y 14
      :w 2 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :wood1
      :tile-id :wood
      :map-tag :wood
      :x 14 :y 1
      :w 4 :h 4
      })
    (maps/add-geo-object {
      :entity-tag :tower1
      :tile-id :tower1
      :map-tag :tower
      :x 16 :y 12
      :w 2 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :dungeon-entrance1
      :tile-id :dungeon-entrance1
      :map-tag :mountain
      :x 5 :y 10
      :w 2 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :mountains
      :tile-id :mountains
      :map-tag :mountains
      :x 1 :y 14
      :w 4 :h 4
      })
    (maps/save-room-map world)
    )

  (->
    (maps/init-room-map "mega" "Mega map" :world-map
      {
        :castle1 :green
        :forest :green
        :house-inn :desert
        :sign-inn :desert
        :cave :desert
        }

      "^^ ^^ :: C1 C1 C1 C1 ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
      "^^ ^^ :: C1 C1 C1 C1 H1 ~~ ~~ ~~ ^^ V1 V1 V1 ^^ ^^"
      "^^ ^^ :: C1 C1 C1 C1 H2 ~~ ~~ ~~ ^^ V1 V1 V1 ^^ ^^"
      "TT TT ^^ C1 00 C1 00 H3 ~~ ~~ ~~ HV V1 00 V1 ^^ SE"
      "TT TT ^^ SX || :: :: :: :: :: rr == == == == == =="
      "== == == == XX == == == == == ET __ __ __ ^^ ^^ ^^"
      "V3 V3 V3 ^^ || ^^ __ __ __ __ || __ __ __ ^^ ^^ ^^"
      "V3 V3 V3 ^^ || H4 ~~ ~~ ~~ __ || OO OO __ OO OO ^^"
      "V3 V3 V3 ^^ || H5 ~~ ~~ ~~ __ || OO OO __ OO OO ^^"
      "^^ ^^ ^^ ^^ || H1 ~~ ~~ ~~ __ || oo oo oo OO OO OO"
      "^^ ^^ ^^ ^^ || ^^ ~~ ~~ ~~ __ || oo oo oo OO OO OO"
      "== == \\ ^^ || :: __ __ __ __ || oo 00 oo rr == =="
      "__ __ LL == ST == == == == == ST == == == // :: ::"
      "__ __ __ SI HI __ ^^ V2 V2 V2 :: :: :: :: :: :: ::"
      "__ __ __ __ __ __ ^^ V2 V2 V2 :: :: :: :: :: :: ::"
      "oo oo __ __ __ __ ^^ V2 V2 V2 :: :: :: OO OO :: ::"
      "oo oo __ __ __ __ ^^ :: :: :: :: :: :: OO OO :: ::"
      )
    (maps/add-geo-object {
      :entity-tag :castle1
      :tile-id :castle1 ;to lookup component
      :map-tag :castle1 ;legend
      :x 4 :y 1
      :w 4 :h 4
      :ports {
        :main :castle1-yard
        :tower :castle1-tower1
        }
      })
    (maps/add-geo-object {
      :entity-tag :village1
      :tile-id :village1
      :map-tag :village1
      :x 13 :y 2
      :w 2 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :village2
      :tile-id :village2
      :map-tag :village2
      :x 8 :y 14
      :w 3 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :village3
      :tile-id :village3
      :map-tag :village3
      :x 1 :y 7
      :w 3 :h 3
      })
    (maps/add-geo-object {
      :entity-tag :mountain
      :tile-id :mountain
      :map-tag :mountain
      :x 1 :y 16
      :w 2 :h 2
      })
    (maps/add-geo-object {
      :entity-tag :small-lake
      :tile-id :green-lake
      :map-tag :lake
      :x 9 :y 2
      :w 3 :h 3
      :tiles [
        [:nw :nl :ne]
        [:wl :cr :el]
        [:sw :sl :se]
        ]
      })
    (maps/add-geo-object {
      :entity-tag :big-lake
      :tile-id :desert-lake
      :map-tag :lake
      :x 7 :y 8
      :w 3 :h 4
      :tiles [
        [:nw :nl :ne]
        [:wl :cr :el]
        [:wl :cr :el]
        [:sw :sl :se]
        ]
      })
    (maps/save-room-map world)
    )
  )
