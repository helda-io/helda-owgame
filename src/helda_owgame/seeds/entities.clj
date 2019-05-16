(ns helda-owgame.seeds.entities
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    )
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
  (save-entity world :helda.RoomMap {
    :description "RoomMap"
    :attrs {
      :name :room1
      :tiles [
        "^^ ^^ .. C1 C1 C1 C1 ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"
        "^^ ^^ .. C1 C1 C1 C1 H1 ~~ ~~ ~~ ^^ V1 V1 V1 ^^ ^^"
        "^^ ^^ .. C1 C1 C1 C1 H2 ~~ ~~ ~~ ^^ V1 V1 V1 ^^ ^^"
        "TT TT ^^ C1 00 C1 00 H3 ~~ ~~ ~~ HV V1 00 V1 ^^ SE"
        "TT TT ^^ SX || .. .. .. .. .. rr == == == == == =="
        "== == == == XX == == == == == ET __ __ __ ^^ ^^ ^^"
        "V3 V3 V3 ^^ || ^^ __ ~~ ~~ ~~ || __ __ __ ^^ ^^ ^^"
        "V3 V3 V3 ^^ || H4 __ ~~ ~~ ~~ || OO OO __ OO OO ^^"
        "V3 V3 V3 ^^ || H5 __ ~~ ~~ ~~ || OO OO __ OO OO ^^"
        "^^ ^^ ^^ ^^ || H1 __ ~~ ~~ ~~ || oo oo oo OO OO OO"
        "^^ ^^ ^^ ^^ || ^^ __ __ __ __ || oo oo oo OO OO OO"
        "== == \\ ^^ || .. __ __ __ __ || oo 00 oo rr == =="
        "__ __ LL == ST == == == == == ST == == == // .. .."
        "__ __ __ SI HI __ ^^ V2 V2 V2 .. .. .. .. .. .. .."
        "__ __ __ __ __ __ ^^ V2 V2 V2 .. .. .. .. .. .. .."
        "oo oo __ __ __ __ ^^ V2 V2 V2 .. .. .. OO OO .. .."
        "oo oo __ __ __ __ ^^ .. .. .. .. .. .. OO OO .. .."
        ]
      :legend {
        :green ".."
        :desert "__"
        :forest "^^"
        :water "~~"
        :hill "OO"
        :cave "oo"
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
        }
      :backgrounds {
        :castle1 :green ;todo support background for complex comps
        :forest :green
        :house-inn :desert
        :sign-inn :desert
        :cave :desert
      }
      :geo-objects [
        {
          :map-tag :castle1
          :tile-id :castle1
          :entity-tag :castle1
          :x 4 :y 1
          :w 4 :h 4
          :ports {
            :main :castle1-yard
            :tower :castle1-tower1
            }
          }
        {
          :map-tag :village1
          :tile-id :village1
          :entity-tag :village1
          :x 13 :y 2
          :w 2 :h 3
          }
        {
          :map-tag :village2
          :tile-id :village2
          :entity-tag :village2
          :x 8 :y 14
          :w 3 :h 3
          }
        {
          :map-tag :village3
          :tile-id :village3
          :entity-tag :village3
          :x 1 :y 7
          :w 3 :h 3
          }
        {
          :map-tag :lake
          :tile-id :green-lake
          :entity-tag :small-lake
          :x 9 :y 2
          :w 3 :h 3
          :tiles [
            [:nw :nl :ne]
            [:wl :cr :el]
            [:sw :sl :se]
            ]
          }
        {
          :map-tag :lake
          :tile-id :desert-lake
          :entity-tag :big-lake
          :x 8 :y 7
          :w 3 :h 4
          :tiles [
            [:nw :nl :ne]
            [:wl :cr :el]
            [:wl :cr :el]
            [:sw :sl :se]
            ]
          }
        {
          :map-tag :cave
          :tile-id :small-cave
          :entity-tag :cave1
          :x 1 :y 16
          :w 2 :h 2
          }
        ]
      :transitions {
        :east :room0
        :west :room2
        }
      }
    :tags [:room1]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "Grass basic tile"
    :attrs {
      :compId :green
      :fileId :world
      :x 2
      :y 1
      }
    :tags [:green :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "Desert basic tile"
    :attrs {
      :compId :desert
      :fileId :world
      :x 5
      :y 5
      }
    :tags [:desert :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "Water basic tile"
    :attrs {
      :compId :water
      :fileId :world
      :x 1
      :y 14
      }
    :tags [:water :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :forest
      :fileId :worldB
      :x 5
      :y 12
      }
    :tags [:forest :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :house-inn
      :fileId :worldB
      :x 6
      :y 2
      }
    :tags [:house-inn :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :house1
      :fileId :worldB
      :x 6
      :y 1
      }
    :tags [:house1 :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :house2
      :fileId :worldB
      :x 7
      :y 1
      }
    :tags [:house2 :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :house3
      :fileId :worldB
      :x 8
      :y 1
      }
    :tags [:house3 :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :house4
      :fileId :worldB
      :x 6
      :y 1
      }
    :tags [:house4 :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :house5
      :fileId :worldB
      :x 7
      :y 1
      }
    :tags [:house5 :world]
    :actions {}
    })
  (save-entity world :helda.ForegroundTile {
    :description "Forest foreground tile"
    :attrs {
      :compId :sign-inn
      :fileId :worldB
      :x 2
      :y 1
      }
    :tags [:sign-inn :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "Horizontal Road tile"
    :attrs {
      :compId :h-road
      :fileId :world
      :x 1
      :y 2
      }
    :tags [:h-road :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "Horizontal Road tile"
    :attrs {
      :compId :v-road
      :fileId :world
      :x 1
      :y 3
      }
    :tags [:v-road :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "X crossroad tile"
    :attrs {
      :compId :x-crossroad
      :fileId :world
      :x 8
      :y 2
      }
    :tags [:x-crossroad :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "South-T crossroad tile"
    :attrs {
      :compId :south-t-crossroad
      :fileId :world
      :x 7
      :y 2
      }
    :tags [:south-t-crossroad :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "East-T crossroad tile"
    :attrs {
      :compId :east-t-crossroad
      :fileId :world
      :x 7
      :y 3
      }
    :tags [:east-t-crossroad :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "West-North turn tile"
    :attrs {
      :compId :west-north-turn
      :fileId :world
      :x 3
      :y 3
      }
    :tags [:west-north-turn :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "South-East turn tile"
    :attrs {
      :compId :south-east-turn
      :fileId :world
      :x 2
      :y 2
      }
    :tags [:south-east-turn :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "West-South turn tile"
    :attrs {
      :compId :west-south-turn
      :fileId :world
      :x 3
      :y 2
      }
    :tags [:west-south-turn :world]
    :actions {}
    })
  (save-entity world :helda.SingleTile {
    :description "North-East turn tile"
    :attrs {
      :compId :north-east-turn
      :fileId :world
      :x 2
      :y 3
      }
    :tags [:north-east-turn :world]
    :actions {}
    })
  ;todo define border
  (save-entity world :helda.TileSet {
    :description "Castle tileset"
    :attrs {
      :compId :castle1
      :width 4
      :height 4
      :tiles [
        [{:fileId :worldB :x 14 :y 3} {:fileId :worldB :x 15 :y 3} {:fileId :worldB :x 16 :y 3} {:fileId :empty}]
        [{:fileId :worldB :x 14 :y 4} {:fileId :worldB :x 15 :y 4} {:fileId :worldB :x 16 :y 4} {:fileId :worldB :x 8 :y 11}]
        [{:fileId :worldB :x 14 :y 5} {:fileId :worldB :x 15 :y 5} {:fileId :worldB :x 16 :y 5} {:fileId :worldB :x 8 :y 12}]
        [{:fileId :worldB :x 14 :y 6} {:fileId :worldB :x 15 :y 6} {:fileId :worldB :x 16 :y 6} {:fileId :worldB :x 8 :y 13}]
      ]
      :ports {
        :main {:x 1 :y 3 :direction :south}
        :tower {:x 3 :y 3 :direction :south}
      }
    }
    :tags [:castle1 :world]
    :actions {}
    })
  (save-entity world :helda.TileSet {
    :description "Village1 tileset"
    :attrs {
      :compId :village1
      :width 2
      :height 3
      :tiles [
        [{:fileId :worldB :x 1 :y 3} {:fileId :worldB :x 2 :y 3}]
        [{:fileId :worldB :x 1 :y 4} {:fileId :worldB :x 2 :y 4}]
        [{:fileId :worldB :x 1 :y 5} {:fileId :worldB :x 2 :y 5}]
      ]
      :ports {}
    }
    :tags [:village1 :world]
    :actions {}
    })
  (save-entity world :helda.TileSet {
    :description "Village2 tileset"
    :attrs {
      :compId :village2
      :width 2
      :height 3
      :tiles [
        [{:fileId :worldB :x 3 :y 3} {:fileId :worldB :x 4 :y 3} {:fileId :worldB :x 5 :y 3}]
        [{:fileId :worldB :x 3 :y 4} {:fileId :worldB :x 4 :y 4} {:fileId :worldB :x 5 :y 4}]
        [{:fileId :worldB :x 3 :y 5} {:fileId :worldB :x 4 :y 5} {:fileId :worldB :x 5 :y 5}]
      ]
      :ports {}
    }
    :tags [:village2 :world]
    :actions {}
    })
  (save-entity world :helda.TileSet {
    :description "Village3 tileset"
    :attrs {
      :compId :village3
      :width 2
      :height 3
      :tiles [
        [{:fileId :worldB :x 1 :y 6} {:fileId :worldB :x 2 :y 6} {:fileId :worldB :x 3 :y 6}]
        [{:fileId :worldB :x 1 :y 7} {:fileId :worldB :x 2 :y 7} {:fileId :worldB :x 3 :y 7}]
        [{:fileId :worldB :x 1 :y 8} {:fileId :worldB :x 2 :y 8} {:fileId :worldB :x 3 :y 8}]
      ]
      :ports {}
    }
    :tags [:village3 :world]
    :actions {}
    })
  (save-entity world :helda.ScalableTileSet {
    :description "Desert Lake Coast"
    :attrs {
      :comp-id :desert-lake
      :file-id :world
      :nw {:fileId :world :x 6 :y 7}
      :sw {:fileId :world :x 6 :y 9}
      :ne {:fileId :world :x 8 :y 7}
      :se {:fileId :world :x 8 :y 9}
      :nl {:fileId :world :x 7 :y 7}
      :sl {:fileId :world :x 7 :y 9}
      :wl {:fileId :world :x 6 :y 8}
      :el {:fileId :world :x 8 :y 8}
      :cr {:fileId :world :x 7 :y 8}
    }
    :tags [:desert-lake :world]
    :actions {}
    })
  (save-entity world :helda.ScalableTileSet {
    :description "Green Lake Coast"
    :attrs {
      :comp-id :green-lake
      :file-id :world
      :nw {:fileId :world :x 1 :y 4}
      :sw {:fileId :world :x 1 :y 6}
      :ne {:fileId :world :x 3 :y 4}
      :se {:fileId :world :x 3 :y 6}
      :nl {:fileId :world :x 2 :y 4}
      :sl {:fileId :world :x 2 :y 6}
      :wl {:fileId :world :x 1 :y 5}
      :el {:fileId :world :x 3 :y 5}
      :cr {:fileId :world :x 2 :y 5}
    }
    :tags [:green-lake :world]
    :actions {}
    })
  )
