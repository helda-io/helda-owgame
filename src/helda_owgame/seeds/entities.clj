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
        })
      )

    (println
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
        })
      )

  )
