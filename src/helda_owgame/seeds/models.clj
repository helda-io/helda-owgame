(ns helda-owgame.seeds.models
  (:require
    [helda-owgame.client.models :refer [save-model]]
    )
  )

(defn seed-models []

  (save-model :owgame :Npc {
    :description "NPC entity"
    :fields {
      :name "String"
      :xp "Integer"
      :initiative "Integer"
      :ac "Integer"
      :hp "Integer"
      :speed "Integer"
      :attack-chk "Integer"
      :attack-dmg "String"
      }
    })
  )
