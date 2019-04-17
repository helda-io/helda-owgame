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
      :room-tiles [
        ["^^ ^^ .. .. .. .. .. ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^"]
        ["^^ ^^ .. C1 C1 C1 .. H1 ~~ ~~ ~~ ^^ V1 V1 V1 ^^ ^^"]
        ["^^ ^^ .. C1 C1 C1 .. H2 ~~ ~~ ~~ ^^ V1 V1 V1 ^^ ^^"]
        ["TT TT ^^ C1 C1 C1 .. H3 ~~ ~~ ~~ HV V1 V1 V1 ^^ SE"]
        ["TT TT ^^ SX || .. .. .. .. .. rr == == == == == =="]
        ["== == == == XX == == == == == ET __ __ __ ^^ ^^ ^^"]
        ["V3 V3 V3 ^^ || ^^ ^^ ~~ ~~ ~~ || __ __ __ ^^ ^^ ^^"]
        ["V3 V3 V3 ^^ || H4 __ ~~ ~~ ~~ || OO OO __ OO OO ^^"]
        ["V3 V3 V3 ^^ || H5 __ ~~ ~~ ~~ || OO OO __ OO OO ^^"]
        ["^^ ^^ ^^ ^^ || H6 __ ~~ ~~ ~~ || oo oo oo OO OO OO"]
        ["^^ ^^ ^^ ^^ || ^^ __ __ __ __ || oo oo oo OO OO OO"]
        ["== == \\ ^^ || __ __ __ __ __ || oo oo oo rr == =="]
        ["__ __ LL == ST == == == == == ST == == == // .. .."]
        ["__ __ __ SI HI __ ^^ V2 V2 V2 .. .. .. .. .. .. .."]
        ["__ __ __ __ __ __ ^^ V2 V2 V2 .. .. .. .. .. .. .."]
        ["oo oo __ __ __ __ ^^ V2 V2 V2 .. .. .. OO OO .. .."]
        ["oo oo __ __ __ __ ^^ .. .. .. .. .. .. OO OO .. .."]
        ]
      :room-legend {
        ".." :green
        "__" :desert
        "^^" :forest
        "~~" :water
        "OO" :hill
        "oo" :cave
        "C1" :castle1
        "V1" :village1
        "V2" :village2
        "V3" :village3
        "HI" :house-inn
        "H1" :house1
        "H2" :house2
        "H3" :house3
        "H4" :house4
        "H5" :house5
        "H6" :house6
        "==" :h-road
        "||" :v-road
        "XX" :x-crossroad
        "ST" :south-t-crossroad
        "ET" :east-t-crossroad
        "//" :west-north-turn
        "rr" :south-east-turn
        "\\" :west-sourth-turn
        "LL" :north-east-turn
        "SI" :sign-inn
        "SE" :sign-east
        "SX" :sign-on-crossroad
      }
      :rooms-dict {:room1 {:sound :wroom-wroom :hero-kind "Cool"}}
    }
    :tags [:room1]
    :actions {}
    })
  )
