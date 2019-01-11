(ns helda-owgame.seeds.models
  (:require
    [helda-owgame.client.models :refer [save-model]]
    )
  )

(defn seed-models []

  (save-model :owgame :NpcTemplate {
    :description "Template to generate NPC"
    :attrs {
      :name "String"
      :xp "Integer"
      :hp-dices "String"
    })

  (save-model :owgame :Npc {
    :description "NPC entity"
    :attrs {
      :name "String"
      :xp "Integer"
      :initiative "Integer"
      :ac "Integer"
      :hp "Integer"
      :speed "Integer"
      :reach-distance "Integer"
      :attack-chk "Integer"
      :attack-dmg "String"
      }
    })
  )
