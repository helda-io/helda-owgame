(ns helda-owgame.seeds.entities
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    [helda-owgame.client.tiles :as tiles]
    [helda-owgame.client.maps :as maps]
    )
  )

(defn seed-tiles []
  (tiles/save-legend :world-map "Common World Map Legend" {
    :green "::"
    :desert "__"
    :forest "^^"
    :water "~~"
    :mountain "OO"
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
    :sign-east "SE"
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
  (tiles/single-tile :green "Grass basic tile" :world 2 1)
  (tiles/single-tile :desert "Desert basic tile" :world 5 5)
  (tiles/single-tile :water "Water basic tile" :world 2 15)

  (tiles/foreground-tile :forest "Forest foreground tile" :worldB 5 12)
  (tiles/foreground-tile :house-inn "House Inn foreground tile" :worldB 6 2)
  (tiles/foreground-tile :house1 "House I foreground tile" :worldB 6 1)
  (tiles/foreground-tile :house2 "House II foreground tile" :worldB 7 1)
  (tiles/foreground-tile :house3 "House III foreground tile" :worldB 8 1)
  (tiles/foreground-tile :house4 "House IV foreground tile" :worldB 6 2)
  (tiles/foreground-tile :house5 "House V foreground tile" :worldB 7 2)
  (tiles/foreground-tile :sign-inn "INN sign foreground tile" :worldB 2 1)

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
    [[1 7] [2 7] [3 7]]
    [[1 8] [2 8] [3 8]]
    [[1 8] [2 8] [3 8]]
    [[1 9] [2 9] [3 9]]
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

(defn seed-world [world]
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

      ":: :: V1 V1 V1 :: :: ^^ ^^ ^^ ^^ :: :: HH HH HH ::"
      ":: :: V1 V1 V1 rr == == == == == == == HH HH HH ::"
      ":: :: V1 V1 V1 || :: :: :: :: :: :: :: HH HH HH ::"
      ":: :: rr ST == // |- ~- ~- ~- ~- ~- -| HH HH HH ::"
      ":: :: || ^^ ^^ :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: ::"
      "^^ ^^ || ^^ ^^ :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: H2"
      "~- ~- ~- ~- ~- ~- ~~ ~~ _| :: |_ ~~ ~| :: || :: H1"
      "~~ ~~ BB ~~ ~~ ~~ ~~ ~~ :: H3 ^^ ~~ ~| :: || :: ::"
      "~_ ~_ ~_ ~_ ~_ ~_ ~~ ~~ -| :: |- ~~ ~| :: || :: ::"
      "^^ ^^ || :: :: :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: ::"
      ":: :: || :: :: :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || :: ::"
      ":: :: || :: :: :: |~ ~~ ~~ ~~ ~~ ~~ ~| :: || TT TT"
      ":: :: LL == == \\ |_ ~_ ~_ ~_ ~_ ~_ _| :: || TT TT"
      "MM MM MM MM MM || V2 V2 :: :: SI HI :: :: || TT TT"
      "MM MM MM MM MM || V2 V2 rr == == == == == ST == =="
      "MM MM MM MM MM || V2 V2 || :: :: :: :: :: :: :: ::"
      "MM MM MM MM MM LL == == // :: :: ^^ ^^ :: :: :: ::"
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
      :w 3 :h 4
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
