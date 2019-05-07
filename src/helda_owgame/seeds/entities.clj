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
        "V3 V3 V3 ^^ || ^^ ^^ ~~ ~~ ~~ || __ __ __ ^^ ^^ ^^"
        "V3 V3 V3 ^^ || H4 __ ~~ ~~ ~~ || OO OO __ OO OO ^^"
        "V3 V3 V3 ^^ || H5 __ ~~ ~~ ~~ || OO OO __ OO OO ^^"
        "^^ ^^ ^^ ^^ || H6 __ ~~ ~~ ~~ || oo oo oo OO OO OO"
        "^^ ^^ ^^ ^^ || ^^ __ __ __ __ || oo oo oo OO OO OO"
        "== == \\ ^^ || __ __ __ __ __ || oo 00 oo rr == =="
        "__ __ LL == ST == == == == == ST == == == // .. .."
        "__ __ __ SI HI __ ^^ V2 V2 V2 .. .. .. .. .. .. .."
        "__ __ __ __ __ __ ^^ V2 V2 V2 .. .. .. .. .. .. .."
        "oo oo __ __ __ __ ^^ V2 V2 V2 .. .. .. OO OO .. .."
        "oo 00 __ __ __ __ ^^ .. .. .. .. .. .. OO OO .. .."
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
        :house6 "H6"
        :h-road "=="
        :v-road "||"
        :x-crossroad "XX"
        :south-t-crossroad "ST"
        :east-t-crossroad "ET"
        :west-north-turn "//"
        :south-east-turn "rr"
        :west-sourth-turn "\\"
        :north-east-turn "LL"
        :sign-inn "SI"
        :sign-east "SE"
        :sign-on-crossroad "SX"
        :map-port "00"
        }
      :geo-objects [
        {
          :map-tag :castle1
          :tile-id :castle1
          :entity-tag :castle1
          :x 3 :y 0
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
          :x 12 :y 1
          :w 3 :h 3
          }
        {
          :map-tag :cave
          :tile-id :small-cave
          :entity-tag :cave1
          :x 0 :y 15
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
    :description "Grass tile"
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
    :description "Road EW tile"
    :attrs {
      :compId :road-ew
      :fileId :world
      :x 32
      :y 64
      }
    :tags [:road-ew :world]
    :actions {}
    })
  ;todo define border
  (save-entity world :helda.TileSet {
    :description "Castle tileset"
    :attrs {
      :compId :castle1
      :fileId :world
      :width 4
      :height 4
      :tiles [
        [{:fileId :world :x 10 :y 10} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64}]
        [{:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64}]
        [{:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64}]
        [{:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64} {:fileId :world :x 32 :y 64}]
      ]
      :ports {
        :main {:x 1 :y 3 :direction :south}
        :tower {:x 3 :y 3 :direction :south}
      }
    }
    :tags [:castle1 :world]
    :actions {}
    })
  (save-entity world :helda.ScalableTileSet {
    :description "Lake tileset"
    :attrs {
      :comp-id :lake
      :file-id :world
      :nw-corner {:x 32 :y 64}
      :sw-corner {:x 32 :y 64}
      :ne-corner {:x 32 :y 64}
      :se-corner {:x 32 :y 64}
      :n-line {:x 32 :y 64}
      :s-line {:x 32 :y 64}
      :w-line {:x 32 :y 64}
      :e-line {:x 32 :y 64}
      :center {:x 32 :y 64}
    }
    :tags [:lake :world]
    :actions {}
    })
  )
