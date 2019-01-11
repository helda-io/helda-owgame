(ns helda-owgame.seeds.entities
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    )
  )

(defn seed-entities [world]
    (save-entity world :owgame.Npc {
      :description "NPC enemy sample instance"
      :attrs {
        :name "Dark Stalker"
        :xp 1200
        :initiative 4
        :ac 18
        :hp 39
        :speed 30
        :attack-chk "12"
        :attack-dmg "1d6+2"
        }
      })
  )
