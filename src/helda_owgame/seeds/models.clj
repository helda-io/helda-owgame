(ns helda-owgame.seeds.models
  (:require
    [helda-owgame.client.models :refer [save-model save-model-listener]]
    )
  )

(defn seed-models []

  (save-model :owgame :BattleUnit {
    :description "BattleUnit entity"
    :fields {
      :name "String"
      :xp "Integer"
      :initiative "Integer"
      :ac "Integer"
      :hp "Integer"
      :speed "Integer"
      :attack-chk "Integer"
      :attack-dmg "String"
      :ranged-attack-chk "Integer"
      :ranged-attack-dmg "String"
      }
    :actions {
      :fight {
        :source-model "owgame.BattleUnit"
        :module-id "battle"
        }
      }
    })
  )
